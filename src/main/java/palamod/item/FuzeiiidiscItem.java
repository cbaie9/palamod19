
package palamod.item;

import palamod.init.PalamodModTabs;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class FuzeiiidiscItem extends RecordItem {
	public FuzeiiidiscItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("palamod:fuze_record")),
				new Item.Properties().tab(PalamodModTabs.TAB_GRINDERCREATIVETAB).stacksTo(1).rarity(Rarity.RARE), 0);
	}
}
