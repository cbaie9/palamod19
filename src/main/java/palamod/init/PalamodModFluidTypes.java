
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package palamod.init;

import palamod.fluid.types.PalalavaFluidType;
import palamod.fluid.types.FakewaterFluidType;
import palamod.fluid.types.AngelicwaterFluidType;

import palamod.PalamodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class PalamodModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, PalamodMod.MODID);
	public static final RegistryObject<FluidType> FAKEWATER_TYPE = REGISTRY.register("fakewater", () -> new FakewaterFluidType());
	public static final RegistryObject<FluidType> PALALAVA_TYPE = REGISTRY.register("palalava", () -> new PalalavaFluidType());
	public static final RegistryObject<FluidType> ANGELICWATER_TYPE = REGISTRY.register("angelicwater", () -> new AngelicwaterFluidType());
}
