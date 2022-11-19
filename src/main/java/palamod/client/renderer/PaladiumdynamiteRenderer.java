
package palamod.client.renderer;

import palamod.entity.PaladiumdynamiteEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class PaladiumdynamiteRenderer extends HumanoidMobRenderer<PaladiumdynamiteEntity, HumanoidModel<PaladiumdynamiteEntity>> {
	public PaladiumdynamiteRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(PaladiumdynamiteEntity entity) {
		return new ResourceLocation("palamod:textures/entities/pala_dyna.png");
	}
}
