package palamod.procedures;

import palamod.init.PalamodModItems;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;

public class Upgradepotg1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.STONE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRANITE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DIORITE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.NETHERRACK) {
			entity.getPersistentData().putDouble("Pickaxe_stone", (entity.getPersistentData().getDouble("Pickaxe_stone") + 1));
			if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 100 && !entity.getPersistentData().getBoolean("Pickaxe_stone_a1")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a1", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_2.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 250 && !entity.getPersistentData().getBoolean("Pickaxe_stone_a2")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a2", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_3.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 500 && !entity.getPersistentData().getBoolean("Pickaxe_stone_a3")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a3", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_4.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 1000 && !entity.getPersistentData().getBoolean("Pickaxe_stone_a4")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a4", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_5.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 2000 && !entity.getPersistentData().getBoolean("Pickaxe_stone_a5")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a5", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_6.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 5000 && !entity.getPersistentData().getBoolean("Pickaxe_stone_a6")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a6", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_7.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 10000 && !entity.getPersistentData().getBoolean("Pickaxe_stone_a7")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a7", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_8.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 25000 && !entity.getPersistentData().getBoolean("Pickaxe_stone_a8")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a8", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_9.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 50000 && !entity.getPersistentData().getBoolean("Pickaxe_stone_a9")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a9", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_10.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 100000
					&& !entity.getPersistentData().getBoolean("Pickaxe_stone_a10")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a10", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_11.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 150000
					&& !entity.getPersistentData().getBoolean("Pickaxe_stone_a11")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a11", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_12.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") == 250000
					&& !entity.getPersistentData().getBoolean("Pickaxe_stone_a12")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a12", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_13.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") == 400000
					&& !entity.getPersistentData().getBoolean("Pickaxe_stone_a13")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a13", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_14.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") == 500000
					&& !entity.getPersistentData().getBoolean("Pickaxe_stone_a14")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a14", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_15.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") == 600000
					&& !entity.getPersistentData().getBoolean("Pickaxe_stone_a15")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a15", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_16.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") == 700000
					&& !entity.getPersistentData().getBoolean("Pickaxe_stone_a16")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a16", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_17.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") == 800000
					&& !entity.getPersistentData().getBoolean("Pickaxe_stone_a17")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a17", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_18.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") == 1000000
					&& !entity.getPersistentData().getBoolean("Pickaxe_stone_a18")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a18", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_19.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") == 2000000
					&& !entity.getPersistentData().getBoolean("Pickaxe_stone_a19")) {
				entity.getPersistentData().putBoolean("Pickaxe_stone_a19", (true));
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_20.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}
