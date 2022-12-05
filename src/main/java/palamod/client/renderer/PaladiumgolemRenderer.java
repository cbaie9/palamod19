
package palamod.client.renderer;

import palamod.entity.PaladiumgolemEntity;

import palamod.client.model.ModelGolem4819;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class PaladiumgolemRenderer extends MobRenderer<PaladiumgolemEntity, ModelGolem4819<PaladiumgolemEntity>> {
	public PaladiumgolemRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGolem4819(context.bakeLayer(ModelGolem4819.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PaladiumgolemEntity entity) {
		return new ResourceLocation("palamod:textures/entities/2golem.png");
	}
}
