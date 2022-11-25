
package palamod.item;

import palamod.init.PalamodModTabs;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class HealorbItem extends Item {
	public HealorbItem() {
		super(new Item.Properties().tab(PalamodModTabs.TAB_PVPCREATIVETAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
