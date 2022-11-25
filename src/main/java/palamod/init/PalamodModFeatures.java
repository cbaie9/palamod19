
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package palamod.init;

import palamod.world.features.ores.XpbushFeature;
import palamod.world.features.ores.TrxiumoreFeature;
import palamod.world.features.ores.TitaneOreFeature;
import palamod.world.features.ores.PaladiumOreFeature;
import palamod.world.features.ores.PaladiumGreenoreFeature;
import palamod.world.features.ores.FindiumOreFeature;
import palamod.world.features.ores.EndiumnuggetoreFeature;
import palamod.world.features.ores.AmethysteOreFeature;
import palamod.world.features.lakes.AngelicwaterFeature;
import palamod.world.features.IgloodestrFeature;
import palamod.world.features.IglooFeature;
import palamod.world.features.IcepicsFeature;
import palamod.world.features.Icepics2Feature;
import palamod.world.features.DonjonbiblFeature;
import palamod.world.features.DonjonbibiFeature;
import palamod.world.features.DesertcreeperFeature;
import palamod.world.features.DesertabandonnedhouseFeature;
import palamod.world.features.CustomtempleFeature;

import palamod.PalamodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class PalamodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PalamodMod.MODID);
	public static final RegistryObject<Feature<?>> PALADIUM_ORE = REGISTRY.register("paladium_ore", PaladiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> TITANE_ORE = REGISTRY.register("titane_ore", TitaneOreFeature::feature);
	public static final RegistryObject<Feature<?>> AMETHYSTE_ORE = REGISTRY.register("amethyste_ore", AmethysteOreFeature::feature);
	public static final RegistryObject<Feature<?>> PALADIUM_GREENORE = REGISTRY.register("paladium_greenore", PaladiumGreenoreFeature::feature);
	public static final RegistryObject<Feature<?>> FINDIUM_ORE = REGISTRY.register("findium_ore", FindiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> TRXIUMORE = REGISTRY.register("trxiumore", TrxiumoreFeature::feature);
	public static final RegistryObject<Feature<?>> XPBUSH = REGISTRY.register("xpbush", XpbushFeature::feature);
	public static final RegistryObject<Feature<?>> ANGELICWATER = REGISTRY.register("angelicwater", AngelicwaterFeature::feature);
	public static final RegistryObject<Feature<?>> DONJONBIBL = REGISTRY.register("donjonbibl", DonjonbiblFeature::feature);
	public static final RegistryObject<Feature<?>> DONJONBIBI = REGISTRY.register("donjonbibi", DonjonbibiFeature::feature);
	public static final RegistryObject<Feature<?>> DESERTCREEPER = REGISTRY.register("desertcreeper", DesertcreeperFeature::feature);
	public static final RegistryObject<Feature<?>> ICEPICS = REGISTRY.register("icepics", IcepicsFeature::feature);
	public static final RegistryObject<Feature<?>> ICEPICS_2 = REGISTRY.register("icepics_2", Icepics2Feature::feature);
	public static final RegistryObject<Feature<?>> DESERTABANDONNEDHOUSE = REGISTRY.register("desertabandonnedhouse",
			DesertabandonnedhouseFeature::feature);
	public static final RegistryObject<Feature<?>> IGLOO = REGISTRY.register("igloo", IglooFeature::feature);
	public static final RegistryObject<Feature<?>> IGLOODESTR = REGISTRY.register("igloodestr", IgloodestrFeature::feature);
	public static final RegistryObject<Feature<?>> CUSTOMTEMPLE = REGISTRY.register("customtemple", CustomtempleFeature::feature);
	public static final RegistryObject<Feature<?>> ENDIUMNUGGETORE = REGISTRY.register("endiumnuggetore", EndiumnuggetoreFeature::feature);
}
