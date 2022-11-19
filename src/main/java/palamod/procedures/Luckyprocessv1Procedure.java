package palamod.procedures;

import palamod.network.PalamodModVariables;

import palamod.init.PalamodModItems;
import palamod.init.PalamodModGameRules;
import palamod.init.PalamodModEntities;
import palamod.init.PalamodModBlocks;

import palamod.entity.PaladiumdynamiteEntity;
import palamod.entity.BigdynamiteentityEntity;

import palamod.PalamodMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.animal.horse.SkeletonHorse;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.ambient.Bat;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;

public class Luckyprocessv1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Random = 0;
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y, z), "Lucky_lock")) == false) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("Lucky_lock", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			Random = new Random().nextInt(198300 + 1);
			if (Random >= 1 && Random <= 11600) {
				PalamodModVariables.lucky_name = "0 + 0 = La t\uFFFDte \uFFFD Toto";
				PalamodMod.queueServerWork(100, () -> {
					if (entity instanceof Player _player)
						_player.giveExperienceLevels(-(10000));
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info(
								(entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "0 + 0 = La t\uFFFDte \uFFFD Toto"));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 11600 && Random <= 14700) {
				PalamodModVariables.lucky_name = "20 000 Lieux";
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModItems.WEIGHTED_BOOTS.get());
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModItems.WEIGHTED_BOOTS.get());
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModItems.WEIGHTED_BOOTS.get());
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				PalamodMod.queueServerWork(100, () -> {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PalamodModItems.WEIGHTED_BOOTS.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				});
				if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
					PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + " 20 000 Lieux"));
				}
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 11600 && Random <= 14700) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(
							"Vous avez eu un event non impl\uFFFDment\uFFFD ( Adieu Faction ) ( N\uFFFDgatif ) Vous avez le droit \uFFFD un deuxi\uFFFDme essai"),
							(true));
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("Lucky_lock", (false));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
					PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event"
							+ "Adieu Faction ( Non impl\uFFFDment\uFFFD )"));
				}
				PalamodModVariables.Lucky_destroy = 2;
			}
			if (Random >= 14700 && Random <= 26300) {
				PalamodModVariables.lucky_name = "Allumer le feu";
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.NETHERRACK);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.NETHERRACK);
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.NETHERRACK);
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "",
												Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-5 ~-1 ~5 ~5 ~-1 ~-5 minecraft:netherrack");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "",
												Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-5 ~ ~5 ~5 ~ ~-5 minecraft:fire");
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Allumer le feu"));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 26300 && Random <= 27500) {
				PalamodModVariables.lucky_name = "Amethyste beacon";
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.AMETHYSTE_BLOCK.get());
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.AMETHYSTE_BLOCK.get());
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BEACON);
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "",
												Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-3 ~-1 ~3 ~3 ~-1 ~-3 palamod:amethyste_block");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "",
												Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-2 ~1 ~2 ~2 ~1 ~-2 palamod:amethyste_block");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "",
												Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-1 ~2 ~1 ~1 ~2 ~-1 palamod:amethyste_block");
					world.setBlock(new BlockPos(x, y + 2, z), Blocks.BEACON.defaultBlockState(), 3);
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Amethyste beacon"));
					}
				});
				PalamodModVariables.Lucky_destroy = 3;
			}
			if (Random >= 27500 && Random <= 14700) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(
							"Vous avez eu un event non impl\uFFFDment\uFFFD ( Analyste ) ( N\uFFFDgatif ) Vous avez le droit \uFFFD un deuxi\uFFFDme essai"),
							(true));
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModItems.CHUNKANASLYSER.get());
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModItems.CHUNKANASLYSER.get());
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModItems.CHUNKANASLYSER.get());
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PalamodModItems.CHUNKANASLYSER.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("Lucky_lock", (false));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
					PalamodMod.LOGGER.info(
							(entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Analyste ( Non impl\uFFFDment\uFFFD )"));
				}
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 14700 && Random <= 26300) {
				PalamodModVariables.lucky_name = "Aranho trap";
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.COBWEB);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.COBWEB);
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.COBWEB);
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "",
												Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-5 ~-1 ~5 ~5 ~-1 ~-5 minecraft:cobweb");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "",
												Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-5 ~ ~5 ~5 ~ ~-5 minecraft:cobweb");
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Aracno- trap"));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 26300 && Random <= 35600) {
				PalamodModVariables.lucky_name = "Batman nerveux";
				for (int index0 = 0; index0 < (int) (3); index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new Bat(EntityType.BAT, _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.BAT_SPAWN_EGG);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.BAT_SPAWN_EGG);
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.BAT_SPAWN_EGG);
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Batman Nerveux"));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 35600 && Random <= 81900) {
				PalamodModVariables.lucky_name = "Body guard";
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.IRON_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CARVED_PUMPKIN);
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.IRON_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				for (int index1 = 0; index1 < (int) (3); index1++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new IronGolem(EntityType.IRON_GOLEM, _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Body guard"));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 81900 && Random <= 97300) {
				PalamodModVariables.lucky_name = "Boom";
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.TNT);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.TNT);
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.TNT);
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				for (int index2 = 0; index2 < (int) (3); index2++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PaladiumdynamiteEntity(PalamodModEntities.PALADIUMDYNAMITE.get(), _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Boom"));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 97300 && Random <= 120400) {
				PalamodModVariables.lucky_name = "BOOM";
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.TNT_MINECART);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.TNT_MINECART);
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.TNT_MINECART);
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				for (int index3 = 0; index3 < (int) (1); index3++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BigdynamiteentityEntity(PalamodModEntities.BIGDYNAMITEENTITY.get(), _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "BOOM"));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 120400 && Random <= 129700) {
				PalamodModVariables.lucky_name = "Boo-Ban";
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.POTTED_BAMBOO);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.POTTED_BAMBOO);
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.POTTED_BAMBOO);
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				world.setBlock(new BlockPos(x, y, z), Blocks.BAMBOO_SAPLING.defaultBlockState(), 3);
				for (int index4 = 0; index4 < (int) (5); index4++) {
					if (world instanceof Level _level) {
						BlockPos _bp = new BlockPos(x, y, z);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
								|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Boo-Ban"));
					}
				});
				PalamodModVariables.Lucky_destroy = 3;
			}
			if (Random >= 129700 && Random <= 139000) {
				PalamodModVariables.lucky_name = "Bunny life";
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.RABBIT_FOOT);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.RABBIT_FOOT);
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.RABBIT_FOOT);
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				for (int index5 = 0; index5 < (int) (100); index5++) {
					PalamodMod.queueServerWork(20, () -> {
						{
							Entity _ent = entity;
							_ent.teleportTo(x, (y + 1), z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, (y + 1), z, _ent.getYRot(), _ent.getXRot());
						}
					});
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Bunny life"));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 139000 && Random <= 143600) {
				PalamodModVariables.lucky_name = "C'est pas pass\uFFFD loin";
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(1);
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CREEPER_HEAD);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CREEPER_HEAD);
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.CREEPER_HEAD);
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER
								.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "\"C'est pas pass\uFFFD loin\""));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 143600 && Random <= 145100) {
				PalamodModVariables.lucky_name = "C'est tr\uFFFDs haut non ?";
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.ENDER_PEARL);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.ENDER_PEARL);
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.ENDER_PEARL);
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 256, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 256, z, _ent.getYRot(), _ent.getXRot());
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info(
								(entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "\"C'est tr\uFFFDs haut non ?\""));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 145100 && Random <= 143600) {
				PalamodModVariables.lucky_name = "Caballo de la muerte";
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.BAT_SPAWN_EGG);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.BAT_SPAWN_EGG);
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.BAT_SPAWN_EGG);
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				for (int index6 = 0; index6 < (int) (5); index6++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new SkeletonHorse(EntityType.SKELETON_HORSE, _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Caballo de la muerte"));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 145100 && Random <= 147400) {
				PalamodModVariables.lucky_name = "Carte au tr\uFFFDsor";
				world.setBlock(new BlockPos(21000, 255, 100), PalamodModBlocks.TRUETRESURE.get().defaultBlockState(), 3);
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.FALSETRESURE.get());
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.FALSETRESURE.get());
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.FALSETRESURE.get());
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""),
											_level.getServer(), null).withSuppressedOutput(),
									"msg @s Le coffre au tr\uFFFDsor est a X:21000 Y:255 Z:100");
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event"
								+ "carte au tr\uFFFDsor (\uFFFD$\uFFFD$"));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 147400 && Random <= 149700) {
				PalamodModVariables.lucky_name = "Carte au tr\uFFFDsor";
				world.setBlock(new BlockPos(21000, 255, 100), PalamodModBlocks.FALSETRESURE.get().defaultBlockState(), 3);
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.FALSETRESURE.get());
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.FALSETRESURE.get());
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.FALSETRESURE.get());
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""),
											_level.getServer(), null).withSuppressedOutput(),
									"msg @s Le coffre au tr\uFFFDsor est a X:21000 Y:255 Z:100");
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER
								.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "carte au tr\uFFFDsor $\uFFFD$"));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 149700 && Random <= 151200) {
				PalamodModVariables.lucky_name = "Au voleur";
				world.setBlock(new BlockPos(x, y, z), PalamodModBlocks.ALARM.get().defaultBlockState(), 3);
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.ALARM.get());
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.ALARM.get());
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.ALARM.get());
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Au voleur"));
					}
					PalamodModVariables.Lucky_destroy = 1;
				});
			}
			if (Random >= 151200 && Random <= 152100) {
				PalamodModVariables.lucky_name = "Coffre fort ";
				world.setBlock(new BlockPos(x, y, z), PalamodModBlocks.MEGASAFECHEST.get().defaultBlockState(), 3);
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.MEGASAFECHEST.get());
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.MEGASAFECHEST.get());
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.MEGASAFECHEST.get());
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Coffre fort"));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 152100 && Random <= 156700) {
				PalamodModVariables.lucky_name = "Colorful lamp";
				world.setBlock(new BlockPos(x, y, z), PalamodModBlocks.COLOREDLAMP.get().defaultBlockState(), 3);
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.COLOFULLAMP.get());
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.COLOFULLAMP.get());
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModBlocks.COLOFULLAMP.get());
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Colorful lamp"));
					}
				});
				PalamodModVariables.Lucky_destroy = 2;
			}
			if (Random >= 156700 && Random <= 157200) {
				PalamodModVariables.lucky_name = " Comment t'a eu \uFFFDa";
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PalamodModItems.ORANGEBLUESEED.get());
					_setstack.setCount(12);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModItems.ORANGEBLUESEED.get());
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModItems.ORANGEBLUESEED.get());
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModItems.ORANGEBLUESEED.get());
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER
								.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Comment t'a eu \uFFFDa"));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 157200 && Random <= 161700) {
				PalamodModVariables.lucky_name = "Consolation";
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PALADIUM_INGOT.get());
					_setstack.setCount(64);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PALADIUM_INGOT.get());
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PALADIUM_INGOT.get());
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(PalamodModItems.PALADIUM_INGOT.get());
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.fall")),
								SoundSource.MASTER, 2, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.fall")),
								SoundSource.MASTER, 2, 1, false);
					}
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Consolation"));
					}
				});
				PalamodModVariables.Lucky_destroy = 1;
			}
			if (Random >= 161700 && Random <= 164000) {
				PalamodModVariables.lucky_name = "Diamond beacon";
				PalamodMod.queueServerWork(100, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "",
												Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-3 ~-1 ~3 ~3 ~-1 ~-3 minecraft:diamond_block");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "",
												Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-2 ~1 ~2 ~2 ~1 ~-2 minecraft:diamond_block");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "",
												Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-1 ~2 ~1 ~1 ~2 ~-1 minecraft:diamond_block");
					world.setBlock(new BlockPos(x, y + 2, z), Blocks.BEACON.defaultBlockState(), 3);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK);
						_setstack.setCount(1);
						((Slot) _slots.get(3)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK);
						_setstack.setCount(1);
						((Slot) _slots.get(4)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK);
						_setstack.setCount(1);
						((Slot) _slots.get(5)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Diamond beacon"));
					}
				});
				PalamodModVariables.Lucky_destroy = 3;
			}
			if (Random >= 161700 && Random <= 164000) {
				PalamodModVariables.lucky_name = "Diamond beacon";
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				PalamodMod.queueServerWork(100, () -> {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "",
												Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-3 ~-1 ~3 ~3 ~-1 ~-3 minecraft:diamond_block");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "",
												Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-2 ~1 ~2 ~2 ~1 ~-2 minecraft:diamond_block");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 1), z), Vec2.ZERO, _level, 4, "",
												Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-1 ~2 ~1 ~1 ~2 ~-1 minecraft:diamond_block");
					world.setBlock(new BlockPos(x, y + 2, z), Blocks.BEACON.defaultBlockState(), 3);
					if (world.getLevelData().getGameRules().getBoolean(PalamodModGameRules.LOGSALL)) {
						PalamodMod.LOGGER.info((entity.getDisplayName().getString() + " \uFFFD eu aux lucky block l'event" + "Diamond beacon"));
					}
				});
				PalamodModVariables.Lucky_destroy = 3;
			}
			if (Random > 164000) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("Random_lucky", Random);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				Luckyprocessv2Procedure.execute(world, x, y, z, entity);
			} else {
				if (PalamodModVariables.Lucky_destroy == 1) {
					PalamodMod.queueServerWork(40, () -> {
						{
							BlockPos _bp = new BlockPos(x, y, z);
							BlockState _bs = Blocks.AIR.defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							BlockEntity _be = world.getBlockEntity(_bp);
							CompoundTag _bnbt = null;
							if (_be != null) {
								_bnbt = _be.saveWithFullMetadata();
								_be.setRemoved();
							}
							world.setBlock(_bp, _bs, 3);
							if (_bnbt != null) {
								_be = world.getBlockEntity(_bp);
								if (_be != null) {
									try {
										_be.load(_bnbt);
									} catch (Exception ignored) {
									}
								}
							}
						}
						if (entity instanceof Player _player)
							_player.closeContainer();
					});
				} else if (PalamodModVariables.Lucky_destroy == 0 || PalamodModVariables.Lucky_destroy == 2
						|| PalamodModVariables.Lucky_destroy == 3) {
					if (entity instanceof Player _player)
						_player.closeContainer();
				}
			}
		}
	}
}
