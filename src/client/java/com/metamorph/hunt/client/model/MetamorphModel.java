package com.metamorph.hunt.client.model;

import com.metamorph.hunt.MetamorphHunt;
import com.metamorph.hunt.client.renderer.MetamorphEntityRenderState;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

// Model made in Blockbench, converted to Mojang names (Fabric 26.x)
public class MetamorphModel extends EntityModel<MetamorphEntityRenderState> {
	public static final ModelLayerLocation LAYER =
			new ModelLayerLocation(MetamorphHunt.id("metamorph"), "main");

	public MetamorphModel(ModelPart root) {
		super(root);
	}

	public static LayerDefinition getTexturedModelData() {
		MeshDefinition meshDefinition = new MeshDefinition();
		PartDefinition root = meshDefinition.getRoot();
		PartDefinition head_with_eyes = root.addOrReplaceChild("head_with_eyes", CubeListBuilder.create().texOffs(33, 11).addBox(2.15F, -1.0F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(32, 0).addBox(2.15F, -2.0F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(22, 16).addBox(2.15F, -3.0F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(22, 2).addBox(2.15F, -4.0F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(30, 25).addBox(2.15F, -5.0F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(3.75F, -6.2F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(4.95F, -7.1F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(2.15F, -6.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(4.45F, -6.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(2.15F, -6.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(-0.55F, -9.5F, 3.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(2.15F, -6.7F, 5.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(2.15F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(2.15F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(2.15F, -7.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(2.15F, -7.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(4.05F, -8.1F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(7.65F, -7.4F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(2.15F, -9.7F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(2.15F, -9.7F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(3.95F, -6.2F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(2.15F, -8.0F, -3.0F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(2.85F, -9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(4.45F, -9.3F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(3.15F, -8.0F, -3.0F, 0.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(2.15F, -8.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(3.35F, -9.9F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(2.15F, -8.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(3.35F, -8.3F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(4.45F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(2.15F, -6.0F, -3.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(2.15F, -7.0F, -3.0F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 21).addBox(-4.85F, -7.0F, -3.0F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(6, 11).addBox(1.15F, -8.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(-10, -6).addBox(0.95F, -10.2F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(-10, -6).addBox(1.15F, -8.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(-10, -6).addBox(1.15F, -8.0F, -3.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(12, 0).addBox(0.15F, -8.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(-10, -6).addBox(0.15F, -8.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(-10, -6).addBox(-0.65F, -10.1F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 11).addBox(-4.85F, -8.0F, -3.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 6).addBox(-4.85F, -8.0F, 1.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.25F, -10.0F, 0.25F));

		PartDefinition torse = root.addOrReplaceChild("torse", CubeListBuilder.create().texOffs(91, 107).addBox(-5.4693F, -33.5963F, -1.0F, 12.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(1, 102).addBox(-4.4693F, -27.1963F, 0.0F, 10.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(104, 124).addBox(-1.4693F, -26.6963F, 1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(105, 30).addBox(-3.5F, -32.1F, -1.7F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(104, 30).addBox(-5.0F, -33.1F, -1.2F, 11.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(105, 30).addBox(-4.0F, -32.6F, -1.3F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(37, 119).addBox(-0.6F, -27.6F, 2.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.7807F, 23.0963F, 0.0F));

		PartDefinition hrebet_r1 = torse.addOrReplaceChild("hrebet_r1", CubeListBuilder.create().texOffs(19, 114).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5193F, -21.4963F, 0.4F, -0.0807F, -0.0334F, -0.3914F));

		PartDefinition hrebet_r2 = torse.addOrReplaceChild("hrebet_r2", CubeListBuilder.create().texOffs(19, 114).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2807F, -21.8963F, 0.4F, -0.0807F, 0.0334F, 0.3914F));

		PartDefinition hrebet_r3 = torse.addOrReplaceChild("hrebet_r3", CubeListBuilder.create().texOffs(21, 85).addBox(-5.0F, -1.0F, -1.0F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(38, 76).addBox(2.9F, -1.0F, -1.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -19.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition hrebet_r4 = torse.addOrReplaceChild("hrebet_r4", CubeListBuilder.create().texOffs(51, 4).addBox(-4.0F, -1.0F, -1.0F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8307F, -19.9963F, 0.1F, -0.0873F, 0.0F, 0.0F));

		PartDefinition blood_r1 = torse.addOrReplaceChild("blood_r1", CubeListBuilder.create().texOffs(7, 15).mirror().addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2193F, -24.8963F, 1.7F, 0.0F, 0.0F, -0.6458F));

		PartDefinition blood_r2 = torse.addOrReplaceChild("blood_r2", CubeListBuilder.create().texOffs(9, 15).addBox(1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9193F, -26.1963F, 2.1F, 0.0F, 0.0F, 0.9948F));

		PartDefinition blood_r3 = torse.addOrReplaceChild("blood_r3", CubeListBuilder.create().texOffs(8, 15).addBox(0.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6193F, -26.9963F, 1.7F, 0.0F, 0.0F, 1.8239F));

		PartDefinition blood_r4 = torse.addOrReplaceChild("blood_r4", CubeListBuilder.create().texOffs(7, 15).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7807F, -24.9963F, 1.7F, 0.0F, 0.0F, 0.6021F));

		PartDefinition blood_r5 = torse.addOrReplaceChild("blood_r5", CubeListBuilder.create().texOffs(65, 71).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(65, 71).addBox(7.2F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9F, -19.0F, 1.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition blood_r6 = torse.addOrReplaceChild("blood_r6", CubeListBuilder.create().texOffs(66, 72).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(66, 72).addBox(6.0F, -1.0F, -1.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -19.2F, 1.4F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_hand = root.addOrReplaceChild("right_hand", CubeListBuilder.create(), PartPose.offset(-10.7129F, 8.5764F, 0.0F));

		PartDefinition right_hand_r1 = right_hand.addOrReplaceChild("right_hand_r1", CubeListBuilder.create().texOffs(111, 47).addBox(-1.0F, -18.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_hand_r2 = right_hand.addOrReplaceChild("right_hand_r2", CubeListBuilder.create().texOffs(115, 51).addBox(-1.0F, -17.0F, 3.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0F, 0.4F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_hand_r3 = right_hand.addOrReplaceChild("right_hand_r3", CubeListBuilder.create().texOffs(115, 51).addBox(-1.0F, -17.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, -0.4F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_hand_r4 = right_hand.addOrReplaceChild("right_hand_r4", CubeListBuilder.create().texOffs(111, 47).addBox(-1.0F, -17.0F, -1.0F, 3.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_hand_r5 = right_hand.addOrReplaceChild("right_hand_r5", CubeListBuilder.create().texOffs(124, 79).addBox(1.0F, -19.0F, 1.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition right_hand_r6 = right_hand.addOrReplaceChild("right_hand_r6", CubeListBuilder.create().texOffs(83, 81).addBox(-1.0F, -9.0F, -1.0F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.051F, -9.8871F, -0.0435F, 0.0F, 0.0F, 0.1658F));

		PartDefinition right_hand_r7 = right_hand.addOrReplaceChild("right_hand_r7", CubeListBuilder.create().texOffs(111, 47).addBox(-1.0F, -13.0F, -1.0F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.051F, -0.3871F, -0.9435F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition left_hand = root.addOrReplaceChild("left_hand", CubeListBuilder.create().texOffs(19, 0).addBox(4.2894F, 14.436F, -0.0996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 0).addBox(2.8894F, 14.436F, -1.0996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 0).addBox(4.7894F, 15.136F, -1.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 0).addBox(4.2894F, 15.436F, -2.0996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(19, 0).addBox(2.6894F, 16.136F, -1.0996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.7106F, -10.136F, 0.7996F));

		PartDefinition blood_r7 = left_hand.addOrReplaceChild("blood_r7", CubeListBuilder.create().texOffs(71, 116).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(63, 110).addBox(-2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(64, 123).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 110).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 13.0F, 0.5F, -0.1745F, 0.0F, 0.0F));

		PartDefinition blood_r8 = left_hand.addOrReplaceChild("blood_r8", CubeListBuilder.create().texOffs(63, 110).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.7F, 13.8F, 0.8F, -0.1745F, 0.0F, 0.0F));

		PartDefinition blood_r9 = left_hand.addOrReplaceChild("blood_r9", CubeListBuilder.create().texOffs(64, 123).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 13.0F, -0.3F, -0.1745F, 0.0F, 0.0F));

		PartDefinition blood_r10 = left_hand.addOrReplaceChild("blood_r10", CubeListBuilder.create().texOffs(63, 110).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 11.8F, -0.3F, -0.1745F, 0.0F, 0.0F));

		PartDefinition blood_r11 = left_hand.addOrReplaceChild("blood_r11", CubeListBuilder.create().texOffs(63, 110).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 13.8F, -0.3F, -0.1745F, 0.0F, 0.0F));

		PartDefinition left_hand_r1 = left_hand.addOrReplaceChild("left_hand_r1", CubeListBuilder.create().texOffs(86, 20).mirror().addBox(-2.0F, -17.0F, 3.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.9023F, 18.7124F, -0.3996F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_hand_r2 = left_hand.addOrReplaceChild("left_hand_r2", CubeListBuilder.create().texOffs(105, 94).mirror().addBox(0.0F, -18.0F, -1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.3023F, 18.7124F, -0.7996F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_hand_r3 = left_hand.addOrReplaceChild("left_hand_r3", CubeListBuilder.create().texOffs(60, 29).mirror().addBox(-2.0F, -17.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.6023F, 18.7124F, -1.1996F, 0.0F, 0.0F, -0.1309F));

		PartDefinition left_hand_r4 = left_hand.addOrReplaceChild("left_hand_r4", CubeListBuilder.create().texOffs(111, 73).addBox(-2.0F, -12.0F, 3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 0.0873F, 0.0F, 2.9671F));

		PartDefinition left_hand_r5 = left_hand.addOrReplaceChild("left_hand_r5", CubeListBuilder.create().texOffs(72, 95).addBox(-4.0F, -9.0F, -1.0F, 3.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0546F, 0.3096F, -0.7996F, 0.0F, 0.0F, 2.9671F));

		PartDefinition right_leg = root.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(2, 90).addBox(-1.2F, 0.0F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(2, 90).addBox(0.0F, -0.1F, -1.8F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.35F, 14.6676F, 0.8296F));

		PartDefinition bone_r1 = right_leg.addOrReplaceChild("bone_r1", CubeListBuilder.create().texOffs(2, 1).addBox(0.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0F, 1.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition blood_r12 = right_leg.addOrReplaceChild("blood_r12", CubeListBuilder.create().texOffs(0, 88).addBox(-2.0F, -1.0F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 0.9F, -0.1F, 0.0436F, 0.0F, 0.0F));

		PartDefinition right_leg_r1 = right_leg.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(77, 40).addBox(-3.0F, -23.0F, 1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 12.2321F, -2.838F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_leg_r2 = right_leg.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(87, 30).addBox(-4.0F, -11.0F, -1.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(87, 30).addBox(-1.0F, -11.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(88, 31).addBox(-1.0F, -10.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(87, 30).addBox(-1.0F, -9.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(88, 30).addBox(-3.0F, -8.0F, -1.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(89, 31).addBox(-3.0F, -8.0F, -1.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(87, 30).addBox(-4.0F, -7.0F, -1.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(87, 30).addBox(-4.0F, -5.0F, -1.0F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(88, 31).addBox(-4.0F, -5.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(89, 30).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 11.1327F, -1.3966F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leg_cuts = right_leg.addOrReplaceChild("leg_cuts", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(1, 1).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(1, 1).addBox(2.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(1, 1).addBox(0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(1, 1).addBox(2.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(1, 1).addBox(3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 9.0F, -1.0F));

		PartDefinition blood_r13 = leg_cuts.addOrReplaceChild("blood_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, 2.0F, 0.0436F, 0.0F, 1.1781F));

		PartDefinition blood_r14 = leg_cuts.addOrReplaceChild("blood_r14", CubeListBuilder.create().texOffs(-2, -2).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition left_leg = root.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.05F, 25.9F, -0.5F));

		PartDefinition left_leg_r1 = left_leg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(108, 0).addBox(0.0F, -11.0F, -1.0F, 4.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition left_leg_r2 = left_leg.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(86, 0).addBox(0.0F, -23.0F, -1.0F, 4.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 1.0994F, -1.4414F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head_with_eyes2 = root.addOrReplaceChild("head_with_eyes2", CubeListBuilder.create(), PartPose.offset(-0.25F, -10.0F, 0.25F));

		PartDefinition right_arm = root.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition arm_r1 = right_arm.addOrReplaceChild("arm_r1", CubeListBuilder.create().texOffs(-2, -3).addBox(0.0F, -3.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -35.0F, 0.0F, 0.0F, 0.0F, 1.7453F));

		PartDefinition arm_r2 = right_arm.addOrReplaceChild("arm_r2", CubeListBuilder.create().texOffs(0, -1).addBox(0.0F, -3.0F, 1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, -35.0F, 0.0F, 0.0F, 0.0F, 1.7453F));

		PartDefinition arm_r3 = right_arm.addOrReplaceChild("arm_r3", CubeListBuilder.create().texOffs(1, -1).addBox(1.0F, -4.0F, 1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, -31.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition arm_r4 = right_arm.addOrReplaceChild("arm_r4", CubeListBuilder.create().texOffs(3, 2).addBox(0.0F, -5.0F, -7.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -29.0F, 6.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition stomach = root.addOrReplaceChild("stomach", CubeListBuilder.create().texOffs(2, 1).addBox(-3.0F, -28.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(-2.0F, -28.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(-4.0F, -28.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(-4.0F, -25.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(-1.0F, -26.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(1.0F, -28.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(2.0F, -25.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(3.0F, -28.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(-6.0F, -28.0F, 3.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(-5.0F, -28.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(-6.0F, -28.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(-6.0F, -28.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(-5.0F, -28.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(-5.0F, -23.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(-6.0F, -28.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(0.0F, -28.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(2.0F, -28.0F, 3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(0.0F, -24.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(3.0F, -28.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(4.0F, -28.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bb_main = root.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(2, 1).addBox(-3.0F, -25.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(3.0F, -23.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(-5.0F, -22.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(2, 1).addBox(4.0F, -28.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshDefinition, 128, 128);
	}
}
