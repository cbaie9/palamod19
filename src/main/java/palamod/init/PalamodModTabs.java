
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package palamod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PalamodModTabs {
	public static CreativeModeTab TAB_PALAMOD;
	public static CreativeModeTab TAB_PICKAXEOFGODSTAB;
	public static CreativeModeTab TAB_GRINDERCREATIVETAB;
	public static CreativeModeTab TAB_DECORATIONCREATIVETAB;
	public static CreativeModeTab TAB_PVPCREATIVETAB;
	public static CreativeModeTab TAB_LUCKYBLOCKCREATIVETAB;

	public static void load() {
		TAB_PALAMOD = new CreativeModeTab("tabpalamod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PalamodModItems.PALADIUM_INGOT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_PICKAXEOFGODSTAB = new CreativeModeTab("tabpickaxeofgodstab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_1.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_GRINDERCREATIVETAB = new CreativeModeTab("tabgrindercreativetab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PalamodModBlocks.TCV_2.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DECORATIONCREATIVETAB = new CreativeModeTab("tabdecorationcreativetab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PalamodModBlocks.OSTRYA_WOOD_PLANKS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_PVPCREATIVETAB = new CreativeModeTab("tabpvpcreativetab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PalamodModItems.STICKOFGODS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_LUCKYBLOCKCREATIVETAB = new CreativeModeTab("tabluckyblockcreativetab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PalamodModBlocks.LUCKYBLOCK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
