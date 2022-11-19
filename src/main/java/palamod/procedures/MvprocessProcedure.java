package palamod.procedures;

import palamod.world.inventory.VoidstoneminerconfigMenu;

import palamod.init.PalamodModItems;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.Screen;

import io.netty.buffer.Unpooled;

public class MvprocessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (Screen.hasShiftDown()) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Voidstoneminerconfig");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new VoidstoneminerconfigMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		} else {
			for (int index0 = 0; index0 < (int) (64); index0++) {
				if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.STONE)) : false)
						&& (entity instanceof Player _playerHasItem
								? _playerHasItem.getInventory().contains(new ItemStack(PalamodModItems.MINAGEVOIDSTONE.get()))
								: false)) {
					itemstack.getOrCreateTag().putDouble("voidstone_count", (itemstack.getOrCreateTag().getDouble("voidstone_count") + 1));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.STONE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
				if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.COBBLESTONE)) : false)
						&& (entity instanceof Player _playerHasItem
								? _playerHasItem.getInventory().contains(new ItemStack(PalamodModItems.MINAGEVOIDSTONE.get()))
								: false)) {
					itemstack.getOrCreateTag().putDouble("voidstone_count", (itemstack.getOrCreateTag().getDouble("voidstone_count") + 1));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.COBBLESTONE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
				if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.GRANITE)) : false)
						&& (entity instanceof Player _playerHasItem
								? _playerHasItem.getInventory().contains(new ItemStack(PalamodModItems.MINAGEVOIDSTONE.get()))
								: false)) {
					itemstack.getOrCreateTag().putDouble("voidstone_count", (itemstack.getOrCreateTag().getDouble("voidstone_count") + 1));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.GRANITE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
				if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.DIORITE)) : false)
						&& (entity instanceof Player _playerHasItem
								? _playerHasItem.getInventory().contains(new ItemStack(PalamodModItems.MINAGEVOIDSTONE.get()))
								: false)) {
					itemstack.getOrCreateTag().putDouble("voidstone_count", (itemstack.getOrCreateTag().getDouble("voidstone_count") + 1));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.DIORITE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
				if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.ANDESITE)) : false)
						&& (entity instanceof Player _playerHasItem
								? _playerHasItem.getInventory().contains(new ItemStack(PalamodModItems.MINAGEVOIDSTONE.get()))
								: false)) {
					itemstack.getOrCreateTag().putDouble("voidstone_count", (itemstack.getOrCreateTag().getDouble("voidstone_count") + 1));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.ANDESITE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
				if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.BLACKSTONE)) : false)
						&& (entity instanceof Player _playerHasItem
								? _playerHasItem.getInventory().contains(new ItemStack(PalamodModItems.MINAGEVOIDSTONE.get()))
								: false)) {
					itemstack.getOrCreateTag().putDouble("voidstone_count", (itemstack.getOrCreateTag().getDouble("voidstone_count") + 1));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.BLACKSTONE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
				if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.BASALT)) : false)
						&& (entity instanceof Player _playerHasItem
								? _playerHasItem.getInventory().contains(new ItemStack(PalamodModItems.MINAGEVOIDSTONE.get()))
								: false)) {
					itemstack.getOrCreateTag().putDouble("voidstone_count", (itemstack.getOrCreateTag().getDouble("voidstone_count") + 1));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.BASALT);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
				if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.NETHERRACK)) : false)
						&& (entity instanceof Player _playerHasItem
								? _playerHasItem.getInventory().contains(new ItemStack(PalamodModItems.MINAGEVOIDSTONE.get()))
								: false)) {
					itemstack.getOrCreateTag().putDouble("voidstone_count", (itemstack.getOrCreateTag().getDouble("voidstone_count") + 1));
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Blocks.NETHERRACK);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
				if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.STONE)) : false)
						|| (entity instanceof Player _playerHasItem
								? _playerHasItem.getInventory().contains(new ItemStack(Blocks.COBBLESTONE))
								: false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.GRANITE)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.DIORITE)) : false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.ANDESITE)) : false)
						|| (entity instanceof Player _playerHasItem
								? _playerHasItem.getInventory().contains(new ItemStack(Blocks.BLACKSTONE))
								: false)
						|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.BASALT)) : false)
						|| (entity instanceof Player _playerHasItem
								? _playerHasItem.getInventory().contains(new ItemStack(Blocks.NETHERRACK))
								: false)) {
					continue;
				} else {
					break;
				}
			}
			(itemstack).setHoverName(Component.literal(("Voidstone miner -" + itemstack.getOrCreateTag().getDouble("voidstone_count"))));
		}
	}
}
