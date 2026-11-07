package com.metamorph.hunt.client;

import com.metamorph.hunt.ModEntities;
import com.metamorph.hunt.client.model.MetamorphModel;
import com.metamorph.hunt.client.renderer.MetamorphRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.renderer.entity.EntityRenderers;

public class MetamorphHuntClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModelLayerRegistry.registerModelLayer(MetamorphModel.LAYER, MetamorphModel::getTexturedModelData);
		EntityRenderers.register(ModEntities.METAMORPH, MetamorphRenderer::new);
	}
}