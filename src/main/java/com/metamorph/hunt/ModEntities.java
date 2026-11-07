package com.metamorph.hunt;

import com.metamorph.hunt.entity.MetamorphEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntities {
    public static final ResourceKey<EntityType<?>> METAMORPH_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, MetamorphHunt.id("metamorph"));

    public static final EntityType<MetamorphEntity> METAMORPH = Registry.register(
            BuiltInRegistries.ENTITY_TYPE, METAMORPH_KEY,
            EntityType.Builder.<MetamorphEntity>of(MetamorphEntity::new, MobCategory.MISC)
                    .sized(1.0f, 2.2f)
                    .build(METAMORPH_KEY));

    public static void initialize() {
        FabricDefaultAttributeRegistry.register(METAMORPH, MetamorphEntity.createMetamorphAttributes());
    }
}