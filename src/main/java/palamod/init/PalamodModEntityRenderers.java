
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package palamod.init;

import palamod.client.renderer.PaladiumgolemRenderer;
import palamod.client.renderer.PaladiumdynamiteRenderer;
import palamod.client.renderer.EndiumdynamiteRenderer;
import palamod.client.renderer.ElephantlittleRenderer;
import palamod.client.renderer.BigdynamiteentityRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PalamodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PalamodModEntities.WITHERARROW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PalamodModEntities.ELEPHANTLITTLE.get(), ElephantlittleRenderer::new);
		event.registerEntityRenderer(PalamodModEntities.PALADIUMGOLEM.get(), PaladiumgolemRenderer::new);
		event.registerEntityRenderer(PalamodModEntities.PALADIUMDYNAMITE.get(), PaladiumdynamiteRenderer::new);
		event.registerEntityRenderer(PalamodModEntities.ENDIUMDYNAMITE.get(), EndiumdynamiteRenderer::new);
		event.registerEntityRenderer(PalamodModEntities.BIGDYNAMITEENTITY.get(), BigdynamiteentityRenderer::new);
	}
}
