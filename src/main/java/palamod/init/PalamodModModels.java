
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package palamod.init;

import palamod.client.model.Modeldynamite_model;
import palamod.client.model.ModelGolem4819;
import palamod.client.model.ModelBIG_dynamitev2;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PalamodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldynamite_model.LAYER_LOCATION, Modeldynamite_model::createBodyLayer);
		event.registerLayerDefinition(ModelGolem4819.LAYER_LOCATION, ModelGolem4819::createBodyLayer);
		event.registerLayerDefinition(ModelBIG_dynamitev2.LAYER_LOCATION, ModelBIG_dynamitev2::createBodyLayer);
	}
}
