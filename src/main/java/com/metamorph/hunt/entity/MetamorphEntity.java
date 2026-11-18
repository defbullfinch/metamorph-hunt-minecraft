package com.metamorph.hunt.entity;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class MetamorphEntity extends PathfinderMob {
    public MetamorphEntity(EntityType<? extends MetamorphEntity> type, Level level) {
        super(type, level);
    }

    private static final float START_HP = 200f;
    private static final float ESCAPE_LIMIT = 6f;
    private static final boolean SHOW_HIT_COUNTER = false;

    private float hiddenHp = START_HP;
    private int hits = 0;
    private int firstHitTick = -1;
    private boolean finished = false;

    private static final float REGEN_TICKS = 200f;
    private int attempt = 1;
    private boolean fleeing = false;
    private boolean aggressive = false;

    public static AttributeSupplier.Builder createMetamorphAttributes() {
        return PathfinderMob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 200)
                .add(Attributes.MOVEMENT_SPEED, 0.25)
                .add(Attributes.ATTACK_DAMAGE, 15)   // как базовый урон железного голема
                .add(Attributes.FOLLOW_RANGE, 32);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Player.class, 24f, 1.2, 1.6) {
            @Override
            public boolean canUse() {
                return fleeing && super.canUse();
            }

            @Override
            public boolean canContinueToUse() {
                return fleeing && super.canContinueToUse();
            }
        });
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2, true) {
            @Override
            public boolean canUse() {
                return aggressive && !fleeing && super.canUse();
            }
        });
        this.goalSelector.addGoal(3, new WaterAvoidingRandomStrollGoal(this, 0.8));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true) {
            @Override
            public boolean canUse() {
                return aggressive && !fleeing && super.canUse();
            }
        });
    }

    @Override
    public void tick() {
        super.tick();
        if (!fleeing || !(level() instanceof ServerLevel serverLevel)) {
            return;
        }
        hiddenHp = Math.min(START_HP, hiddenHp + START_HP / REGEN_TICKS);
        if (hiddenHp >= START_HP) {
            fleeing = false;
            aggressive = true;
            attempt++;
            hits = 0;
            firstHitTick = -1;
            for (ServerPlayer p : serverLevel.players()) {
                p.sendSystemMessage(Component.literal("attempt №" + attempt));
            }
        }
    }

    @Override
    public boolean hurtServer(ServerLevel level, DamageSource source, float amount) {
        if (!(source.getEntity() instanceof Player player)) {
            return super.hurtServer(level, source, amount);
        }
        if (fleeing) {
            return false;   // під час втечі й регенерації невразливий
        }

        float damage = amount;
        hits++;
        if (hits == 1) {
            firstHitTick = tickCount;
        }
        hiddenHp -= damage;
        int seconds = (tickCount - firstHitTick) / 20;

        if (hiddenHp <= 0) {
            player.sendSystemMessage(Component.literal("Victory! Hits: " + hits + ", time: " + seconds + " sec"));
            this.kill(level);
        } else if (hiddenHp <= ESCAPE_LIMIT) {
            player.sendSystemMessage(Component.literal("Metamorph fled. Attempt №" + attempt + ", Hits: " + hits + ", time: " + seconds + " sec"));
            fleeing = true;
            aggressive = false;
            this.setTarget(null);
        } else {
            super.hurtServer(level, source, 0.1f);
            if (SHOW_HIT_COUNTER) {
                player.sendSystemMessage(Component.literal("hit №" + hits));
            }
        }
        return true;
    }
}