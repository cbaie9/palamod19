package palamod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelGolem4819<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("palamod", "model_golem_4819"), "main");
	public final ModelPart brasg;
	public final ModelPart Jambed;
	public final ModelPart tete;
	public final ModelPart bb_main;
	public final ModelPart brasd;
	public final ModelPart jambeg;

	public ModelGolem4819(ModelPart root) {
		this.brasg = root.getChild("brasg");
		this.Jambed = root.getChild("Jambed");
		this.tete = root.getChild("tete");
		this.bb_main = root.getChild("bb_main");
		this.brasd = root.getChild("brasd");
		this.jambeg = root.getChild("jambeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition brasg = partdefinition.addOrReplaceChild("brasg",
				CubeListBuilder.create().texOffs(30, 29).addBox(7.0F, -21.0F, 0.0F, 2.0F, 15.0F, 3.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Jambed = partdefinition.addOrReplaceChild("Jambed",
				CubeListBuilder.create().texOffs(30, 0).addBox(-5.0F, -8.0F, 0.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition tete = partdefinition.addOrReplaceChild("tete",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -29.0F, 0.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bb_main = partdefinition
				.addOrReplaceChild("bb_main",
						CubeListBuilder.create().texOffs(1, 50).addBox(-5.0F, -22.0F, -1.0F, 10.0F, 6.0F, 6.0F, new CubeDeformation(1.0F))
								.texOffs(1, 35).addBox(-2.0F, -13.0F, 0.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(2.0F)),
						PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition brasd = partdefinition.addOrReplaceChild("brasd",
				CubeListBuilder.create().texOffs(30, 11).addBox(-9.0F, -21.0F, 0.0F, 2.0F, 15.0F, 3.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition jambeg = partdefinition.addOrReplaceChild("jambeg",
				CubeListBuilder.create().texOffs(18, 0).addBox(2.0F, -8.0F, 0.0F, 3.0F, 7.0F, 3.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		brasg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Jambed.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tete.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		brasd.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		jambeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
