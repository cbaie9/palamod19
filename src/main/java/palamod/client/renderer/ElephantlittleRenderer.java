
package palamod.client.renderer;

import palamod.entity.ElephantlittleEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

public class ElephantlittleRenderer extends MobRenderer<ElephantlittleEntity, PigModel<ElephantlittleEntity>> {
	public ElephantlittleRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ElephantlittleEntity entity) {
		return new ResourceLocation("palamod:textures/entities/elephant_0.png");
	}
}
