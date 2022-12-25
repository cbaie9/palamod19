
package palamod.item;

import palamod.procedures.RingprocessProcedure;

import palamod.init.PalamodModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

public class BigringItem extends Item {
	public BigringItem() {
		super(new Item.Properties().tab(PalamodModTabs.TAB_PALAMOD).durability(3200).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		RingprocessProcedure.execute(entity, itemstack);
	}
}
