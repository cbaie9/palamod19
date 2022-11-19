package palamod.procedures;

import palamod.init.PalamodModEnchantments;

import net.minecraft.world.item.ItemStack;

public class LegendarystonestickProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("cooldown", (itemstack.getOrCreateTag().getDouble("cooldown") - 1));
		if (itemstack.getOrCreateTag().getDouble("cooldown") == 0) {
			(itemstack).enchant(PalamodModEnchantments.CHARGEDENCHANT.get(), 10);
		}
	}
}
