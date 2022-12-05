
package palamod.client.renderer;

import palamod.entity.BigdynamiteentityEntity;

import palamod.client.model.ModelBIG_dynamitev2;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class BigdynamiteentityRenderer extends MobRenderer<BigdynamiteentityEntity, ModelBIG_dynamitev2<BigdynamiteentityEntity>> {
	public BigdynamiteentityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBIG_dynamitev2(context.bakeLayer(ModelBIG_dynamitev2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigdynamiteentityEntity entity) {
		return new ResourceLocation("palamod:textures/entities/pala_dyna.png");
	}
}
