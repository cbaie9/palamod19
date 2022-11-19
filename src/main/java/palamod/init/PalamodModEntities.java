
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package palamod.init;

import palamod.entity.WitherarrowEntity;
import palamod.entity.PaladiumgolemEntity;
import palamod.entity.PaladiumdynamiteEntity;
import palamod.entity.EndiumdynamiteEntity;
import palamod.entity.ElephantlittleEntity;
import palamod.entity.BigdynamiteentityEntity;

import palamod.PalamodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PalamodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PalamodMod.MODID);
	public static final RegistryObject<EntityType<WitherarrowEntity>> WITHERARROW = register("projectile_witherarrow",
			EntityType.Builder.<WitherarrowEntity>of(WitherarrowEntity::new, MobCategory.MISC).setCustomClientFactory(WitherarrowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElephantlittleEntity>> ELEPHANTLITTLE = register("elephantlittle",
			EntityType.Builder.<ElephantlittleEntity>of(ElephantlittleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ElephantlittleEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<PaladiumgolemEntity>> PALADIUMGOLEM = register("paladiumgolem",
			EntityType.Builder.<PaladiumgolemEntity>of(PaladiumgolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PaladiumgolemEntity::new)

					.sized(1.2000000000000002f, 1.8f));
	public static final RegistryObject<EntityType<PaladiumdynamiteEntity>> PALADIUMDYNAMITE = register("paladiumdynamite",
			EntityType.Builder.<PaladiumdynamiteEntity>of(PaladiumdynamiteEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PaladiumdynamiteEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EndiumdynamiteEntity>> ENDIUMDYNAMITE = register("endiumdynamite",
			EntityType.Builder.<EndiumdynamiteEntity>of(EndiumdynamiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EndiumdynamiteEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BigdynamiteentityEntity>> BIGDYNAMITEENTITY = register("bigdynamiteentity",
			EntityType.Builder.<BigdynamiteentityEntity>of(BigdynamiteentityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigdynamiteentityEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ElephantlittleEntity.init();
			PaladiumgolemEntity.init();
			PaladiumdynamiteEntity.init();
			EndiumdynamiteEntity.init();
			BigdynamiteentityEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ELEPHANTLITTLE.get(), ElephantlittleEntity.createAttributes().build());
		event.put(PALADIUMGOLEM.get(), PaladiumgolemEntity.createAttributes().build());
		event.put(PALADIUMDYNAMITE.get(), PaladiumdynamiteEntity.createAttributes().build());
		event.put(ENDIUMDYNAMITE.get(), EndiumdynamiteEntity.createAttributes().build());
		event.put(BIGDYNAMITEENTITY.get(), BigdynamiteentityEntity.createAttributes().build());
	}
}
