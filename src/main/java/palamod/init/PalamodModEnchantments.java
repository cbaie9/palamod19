
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package palamod.init;

import palamod.enchantment.SpeedEnchantment;
import palamod.enchantment.SmeltEnchantment;
import palamod.enchantment.HammerforturneEnchantment;
import palamod.enchantment.ChargedenchantEnchantment;
import palamod.enchantment.BigholeEnchantment;
import palamod.enchantment.AutosmeltpotgEnchantment;

import palamod.PalamodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

public class PalamodModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, PalamodMod.MODID);
	public static final RegistryObject<Enchantment> SMELT = REGISTRY.register("smelt", () -> new SmeltEnchantment());
	public static final RegistryObject<Enchantment> HAMMERFORTURNE = REGISTRY.register("hammerforturne", () -> new HammerforturneEnchantment());
	public static final RegistryObject<Enchantment> SPEED = REGISTRY.register("speed", () -> new SpeedEnchantment());
	public static final RegistryObject<Enchantment> BIGHOLE = REGISTRY.register("bighole", () -> new BigholeEnchantment());
	public static final RegistryObject<Enchantment> AUTOSMELTPOTG = REGISTRY.register("autosmeltpotg", () -> new AutosmeltpotgEnchantment());
	public static final RegistryObject<Enchantment> CHARGEDENCHANT = REGISTRY.register("chargedenchant", () -> new ChargedenchantEnchantment());
}
