package palamod.procedures;

import palamod.init.PalamodModItems;
import palamod.init.PalamodModEnchantments;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class Upgradepotgv2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean auto_smelt = false;
		double big_hole = 0;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.STONE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRANITE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DIORITE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.ANDESITE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COBBLESTONE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.BLACKSTONE
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.NETHERRACK
				|| (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:stone")))) {
			entity.getPersistentData().putDouble("Pickaxe_stone", (entity.getPersistentData().getDouble("Pickaxe_stone") + 1));
			if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 2000000) {
				if (EnchantmentHelper.getItemEnchantmentLevel(PalamodModEnchantments.AUTOSMELTPOTG.get(), itemstack) != 0) {
					auto_smelt = true;
				} else if (EnchantmentHelper.getItemEnchantmentLevel(PalamodModEnchantments.BIGHOLE.get(), itemstack) != 0) {
					big_hole = EnchantmentHelper.getItemEnchantmentLevel(PalamodModEnchantments.BIGHOLE.get(), itemstack);
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_20.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 5);
				(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 3);
				if (auto_smelt) {
					(itemstack).enchant(PalamodModEnchantments.AUTOSMELTPOTG.get(), 1);
				} else if (0 < big_hole) {
					(itemstack).enchant(PalamodModEnchantments.BIGHOLE.get(), (int) big_hole);
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 1000000) {
				if (EnchantmentHelper.getItemEnchantmentLevel(PalamodModEnchantments.AUTOSMELTPOTG.get(), itemstack) != 0) {
					auto_smelt = true;
				} else if (EnchantmentHelper.getItemEnchantmentLevel(PalamodModEnchantments.BIGHOLE.get(), itemstack) != 0) {
					big_hole = EnchantmentHelper.getItemEnchantmentLevel(PalamodModEnchantments.BIGHOLE.get(), itemstack);
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_19.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 5);
				(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 3);
				if (auto_smelt) {
					(itemstack).enchant(PalamodModEnchantments.AUTOSMELTPOTG.get(), 1);
				} else if (0 < big_hole) {
					(itemstack).enchant(PalamodModEnchantments.BIGHOLE.get(), (int) big_hole);
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 800000) {
				if (EnchantmentHelper.getItemEnchantmentLevel(PalamodModEnchantments.AUTOSMELTPOTG.get(), itemstack) != 0) {
					auto_smelt = true;
				} else if (EnchantmentHelper.getItemEnchantmentLevel(PalamodModEnchantments.BIGHOLE.get(), itemstack) != 0) {
					big_hole = EnchantmentHelper.getItemEnchantmentLevel(PalamodModEnchantments.BIGHOLE.get(), itemstack);
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_18.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 5);
				(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 3);
				if (auto_smelt) {
					(itemstack).enchant(PalamodModEnchantments.AUTOSMELTPOTG.get(), 1);
				} else if (0 < big_hole) {
					(itemstack).enchant(PalamodModEnchantments.BIGHOLE.get(), (int) big_hole);
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 700000) {
				if (EnchantmentHelper.getItemEnchantmentLevel(PalamodModEnchantments.AUTOSMELTPOTG.get(), itemstack) != 0) {
					auto_smelt = true;
				} else if (EnchantmentHelper.getItemEnchantmentLevel(PalamodModEnchantments.BIGHOLE.get(), itemstack) != 0) {
					big_hole = EnchantmentHelper.getItemEnchantmentLevel(PalamodModEnchantments.BIGHOLE.get(), itemstack);
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_17.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 5);
				(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 3);
				if (auto_smelt) {
					(itemstack).enchant(PalamodModEnchantments.AUTOSMELTPOTG.get(), 1);
				} else if (0 < big_hole) {
					(itemstack).enchant(PalamodModEnchantments.BIGHOLE.get(), (int) big_hole);
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 600000) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_16.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 5);
				(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 3);
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 7440) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_15.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 5);
				(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 2);
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 6750) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_14.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 5);
				(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 1);
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 5150) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_13.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 5);
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 4563) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_12.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 4);
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 5000) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_11.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 3);
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 5000) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_10.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 2);
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 8684) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_9.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 1);
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 2616) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_8.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 5000) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_7.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 1370) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_6.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 1172) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_5.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 757) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_4.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 250) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_3.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 100) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PICKAXEOFTHEGODSLV_2.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(PalamodModEnchantments.BIGHOLE.get(), itemstack) != 0
				&& ((entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(PalamodModItems.PALAMIXEDCHAROAL.get()))
						: false) || 0 < itemstack.getOrCreateTag().getDouble("potg_fuel"))) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, y, z, 5, 3, 3, 3, 1);
			HammernormalProcedure.execute(world, x, y, z, entity);
			if (0 < itemstack.getOrCreateTag().getDouble("potg_fuel")) {
				itemstack.getOrCreateTag().putDouble("potg_fuel", (itemstack.getOrCreateTag().getDouble("potg_fuel") - 1));
			} else {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PalamodModItems.PALAMIXEDCHAROAL.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				itemstack.getOrCreateTag().putDouble("potg_fuel", (itemstack.getOrCreateTag().getDouble("potg_fuel") + 2500));
			}
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(PalamodModEnchantments.AUTOSMELTPOTG.get(), itemstack) != 0
				&& (world instanceof Level _lvlCanSmelt
						? _lvlCanSmelt.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(itemstack), _lvlCanSmelt).isPresent()
						: false)) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
						((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
								new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))), _lvlSmeltResult)
								.isPresent())
										? _lvlSmeltResult.getRecipeManager()
												.getRecipeFor(RecipeType.SMELTING,
														new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
														_lvlSmeltResult)
												.get().getResultItem().copy()
										: ItemStack.EMPTY));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
