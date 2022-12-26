
package palamod.item;

import palamod.procedures.RingprocessendiumProcedure;

import palamod.init.PalamodModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

public class EndiummediumringItem extends Item {
	public EndiummediumringItem() {
		super(new Item.Properties().tab(PalamodModTabs.TAB_PALAMOD).durability(1600).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		RingprocessendiumProcedure.execute(entity, itemstack);
	}
}
