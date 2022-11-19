package palamod.procedures;

import palamod.init.PalamodModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MvprocesspickaxeverProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < (int) (1000); index0++) {
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.STONE)) : false)
					&& (entity instanceof Player _playerHasItem
							? _playerHasItem.getInventory().contains(new ItemStack(PalamodModItems.MINAGEVOIDSTONE.get()))
							: false)) {
				entity.getPersistentData().putDouble("voidstone_count", (entity.getPersistentData().getDouble("voidstone_count") + 1));
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
				entity.getPersistentData().putDouble("voidstone_count", (entity.getPersistentData().getDouble("voidstone_count") + 1));
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
				entity.getPersistentData().putDouble("voidstone_count", (entity.getPersistentData().getDouble("voidstone_count") + 1));
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
				entity.getPersistentData().putDouble("voidstone_count", (entity.getPersistentData().getDouble("voidstone_count") + 1));
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
				entity.getPersistentData().putDouble("voidstone_count", (entity.getPersistentData().getDouble("voidstone_count") + 1));
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
				entity.getPersistentData().putDouble("voidstone_count", (entity.getPersistentData().getDouble("voidstone_count") + 1));
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
				entity.getPersistentData().putDouble("voidstone_count", (entity.getPersistentData().getDouble("voidstone_count") + 1));
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
				entity.getPersistentData().putDouble("voidstone_count", (entity.getPersistentData().getDouble("voidstone_count") + 1));
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Blocks.NETHERRACK);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
			}
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.STONE)) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.COBBLESTONE)) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.GRANITE)) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.DIORITE)) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.ANDESITE)) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.BLACKSTONE)) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.BASALT)) : false)
					|| (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Blocks.NETHERRACK)) : false)) {
				continue;
			} else {
				break;
			}
		}
	}
}
