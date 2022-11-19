
package palamod.enchantment;

import palamod.init.PalamodModItems;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;

public class ChargedenchantEnchantment extends Enchantment {
	public ChargedenchantEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return List.of(PalamodModItems.LEGENDARYSTONEFORTUNE.get(), PalamodModItems.LEGENDARYSTONEINVISIBLE.get(),
				PalamodModItems.LEGENDARYSTONEPOWER.get(), PalamodModItems.LEGENDARYSTONEJOBS.get(),
				PalamodModItems.LEGENDARYSTONETELEPORTATION.get()).contains(item);
	}

	@Override
	public boolean isAllowedOnBooks() {
		return false;
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
