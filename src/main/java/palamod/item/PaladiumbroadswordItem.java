
package palamod.item;

import palamod.init.PalamodModTabs;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

public class PaladiumbroadswordItem extends SwordItem {
	public PaladiumbroadswordItem() {
		super(new Tier() {
			public int getUses() {
				return 3999;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3.5f, new Item.Properties().tab(PalamodModTabs.TAB_PALAMOD));
	}
}
