
package palamod.item;

import palamod.procedures.LegendarystonestickProcedure;
import palamod.procedures.Legendarystoneinvisible_processProcedure;

import palamod.init.PalamodModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class LegendarystoneinvisibleItem extends Item {
	public LegendarystoneinvisibleItem() {
		super(new Item.Properties().tab(PalamodModTabs.TAB_LUCKYBLOCKCREATIVETAB).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		Legendarystoneinvisible_processProcedure.execute(entity, itemstack);
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		LegendarystonestickProcedure.execute(itemstack);
	}
}
