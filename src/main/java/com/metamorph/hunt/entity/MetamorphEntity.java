package com.metamorph.hunt.entity;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class MetamorphEntity extends PathfinderMob {
    public MetamorphEntity(EntityType<? extends MetamorphEntity> type, Level level) {
        super(type, level);
    }
    @Override
    public boolean hurtServer(ServerLevel level, DamageSource source, float amount) {
        boolean hurt = super.hurtServer(level, source, amount);
        if (hurt && source.getEntity() instanceof Player player) {
            player.sendSystemMessage(Component.literal("Ви вдарили Метаморфа!"));
        }
        return hurt;
    }

    public static AttributeSupplier.Builder createMetamorphAttributes() {
        return PathfinderMob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 200)
                .add(Attributes.MOVEMENT_SPEED, 0.25);
    }
}