package com.metamorph.hunt.client.renderer;

import com.metamorph.hunt.MetamorphHunt;
import com.metamorph.hunt.client.model.MetamorphModel;
import com.metamorph.hunt.entity.MetamorphEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public class MetamorphRenderer
        extends MobRenderer<MetamorphEntity, MetamorphEntityRenderState, MetamorphModel> {
    private static final Identifier TEXTURE = MetamorphHunt.id("textures/entity/metamorph.png");

    public MetamorphRenderer(EntityRendererProvider.Context context) {
        super(context, new MetamorphModel(context.bakeLayer(MetamorphModel.LAYER)), 0.5f);
    }

    @Override
    public MetamorphEntityRenderState createRenderState() {
        return new MetamorphEntityRenderState();
    }

    @Override
    public Identifier getTextureLocation(MetamorphEntityRenderState state) {
        return TEXTURE;
    }
}
