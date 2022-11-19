
package palamod.item;

import palamod.procedures.ExcavatorprocessamethystProcedure;

import palamod.init.PalamodModTabs;
import palamod.init.PalamodModItems;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

public class TitaneexcavatorItem extends ShovelItem {
	public TitaneexcavatorItem() {
		super(new Tier() {
			public int getUses() {
				return 3999;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PalamodModItems.TITANE_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(PalamodModTabs.TAB_PALAMOD));
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		ExcavatorprocessamethystProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}
}
