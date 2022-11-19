
package palamod.item;

import palamod.init.PalamodModTabs;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class SwordpaternItem extends Item {
	public SwordpaternItem() {
		super(new Item.Properties().tab(PalamodModTabs.TAB_GRINDERCREATIVETAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
