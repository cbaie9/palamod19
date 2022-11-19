package palamod.procedures;

import palamod.init.PalamodModItems;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.SimpleContainer;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class HammersmeltProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean removeBlock = false;
		if (entity.getXRot() > 40 || entity.getXRot() < -40) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x + 1, y, z)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x + 1, y, z), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x + 1, y, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 1, y, z)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 1, y, z), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 1, y, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 1, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x + 1, y, z + 1)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x + 1, y, z + 1), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x + 1, y, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y, z + 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x + 1, y, z - 1)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x + 1, y, z - 1), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x + 1, y, z - 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y, z - 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 1, y, z - 1)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 1, y, z - 1), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 1, y, z - 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 1, y, z - 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 1, y, z + 1)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 1, y, z + 1), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 1, y, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 1, y, z + 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 0, y, z + 1)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 0, y, z + 1), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 0, y, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 0, y, z + 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 0, y, z + 1)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 0, y, z + 1), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 0, y, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 0, y, z + 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 0, y, z + 1)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 0, y, z + 1), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 0, y, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 0, y, z + 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 0, y, z - 1)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z - 1))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z - 1))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 0, y, z - 1), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 0, y, z - 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 0, y, z - 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
		} else if ((entity.getDirection()) == Direction.NORTH || (entity.getDirection()) == Direction.SOUTH) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x + 1, y, z)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x + 1, y, z), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x + 1, y, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 1, y, z)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 1, y, z), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 1, y, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 1, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x + 1, y + 1, z)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x + 1, y + 1, z), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x + 1, y + 1, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y + 1, z), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x + 1, y - 1, z - 0))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x + 1, y - 1, z)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x + 1, y - 1, z - 0), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x + 1, y - 1, z - 0);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y - 1, z - 0), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 0, y + 1, z - 0))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 0, y + 1, z - 0))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 0, y + 1, z - 0)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
							.getRecipeFor(RecipeType.SMELTING,
									new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y + 1, z - 0))).getBlock()))),
									_lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 0, y + 1, z - 0))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y + 1, z - 0))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 0, y + 1, z - 0))).getBlock()))),
															_lvlSmeltResult).get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 0, y + 1, z - 0), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 0, y + 1, z - 0);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 0, y + 1, z - 0), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z + 0))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 1, y, z + 0)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 0))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 0))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 0))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 0))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 1, y + 1, z + 0), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 1, y + 1, z + 0);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 1, y + 1, z + 0), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 1, y + 1, z - 0))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 1, y + 1, z)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 1, y + 1, z - 0), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 1, y + 1, z - 0);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 1, y + 1, z - 0), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y - 1, z + 0))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 1, y - 1, z + 0))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 1, y - 1, z + 0)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
							.getRecipeFor(RecipeType.SMELTING,
									new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z + 0))).getBlock()))),
									_lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z + 0))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z + 0))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z + 0))).getBlock()))),
															_lvlSmeltResult).get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 1, y - 1, z), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 1, y - 1, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 0, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 0, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 0, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 0, y - 1, z)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y - 1, z))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 0, y - 1, z))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y - 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 0, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 0, y - 1, z), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 0, y - 1, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 0, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 0, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 1, y - 1, z)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 1, y - 1, z), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 1, y - 1, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 0, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
		} else if ((entity.getDirection()) == Direction.WEST || (entity.getDirection()) == Direction.EAST) {
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 0, y, z + 1)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 0, y, z + 1), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 0, y, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 0, y, z + 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 0, y, z - 1)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
							new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z - 1))).getBlock()))), _lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z - 1))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 0, y, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 0, y, z - 1), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 0, y, z - 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 0, y, z - 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 0, y + 1, z + 1)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
							.getRecipeFor(RecipeType.SMELTING,
									new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 0, y + 1, z + 1))).getBlock()))),
									_lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x + 0, y + 1, z + 1))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 0, y + 1, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x + 0, y + 1, z + 1))).getBlock()))),
															_lvlSmeltResult).get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x + 0, y + 1, z + 1), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 0, y + 1, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 0, y + 1, z + 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x + 0, y - 1, z + 1)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
							.getRecipeFor(RecipeType.SMELTING,
									new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 0, y - 1, z + 1))).getBlock()))),
									_lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x + 0, y - 1, z + 1))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 0, y - 1, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x + 0, y - 1, z + 1))).getBlock()))),
															_lvlSmeltResult).get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x + 0, y - 1, z + 1), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x + 0, y - 1, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y - 1, z + 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x - 0, y - 1, z - 1)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
							.getRecipeFor(RecipeType.SMELTING,
									new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y - 1, z - 1))).getBlock()))),
									_lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 0, y - 1, z - 1))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 0, y - 1, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x - 0, y - 1, z - 1))).getBlock()))),
															_lvlSmeltResult).get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x - 0, y - 1, z - 1), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x - 0, y - 1, z - 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 0, y - 1, z - 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x + 0, y + 1, z - 1)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
							.getRecipeFor(RecipeType.SMELTING,
									new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 0, y + 1, z - 1))).getBlock()))),
									_lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x + 0, y + 1, z - 1))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 0, y + 1, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x + 0, y + 1, z - 1))).getBlock()))),
															_lvlSmeltResult).get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x + 0, y + 1, z - 1), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x + 0, y + 1, z - 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y + 1, z - 1), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x + 0, y + 1, z - 0)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
							.getRecipeFor(RecipeType.SMELTING,
									new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 0, y + 1, z - 0))).getBlock()))),
									_lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x + 0, y + 1, z - 0))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 0, y + 1, z - 0))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x + 0, y + 1, z - 0))).getBlock()))),
															_lvlSmeltResult).get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x + 0, y + 1, z - 0), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x + 0, y + 1, z - 0);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y + 1, z - 0), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (PalamodModItems.PALADIUMHAMMER.get().isCorrectToolForDrops((world.getBlockState(new BlockPos(x + 0, y - 1, z - 0)))) == true) {
					if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
							.getRecipeFor(RecipeType.SMELTING,
									new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 0, y - 1, z - 0))).getBlock()))),
									_lvlSmeltResult)
							.isPresent())
									? _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x + 0, y - 1, z - 0))).getBlock()))),
													_lvlSmeltResult)
											.get().getResultItem().copy()
									: ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem())) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), (y + 0.5), (z + 0.5),
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 0, y - 1, z - 0))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
															(new ItemStack((world.getBlockState(new BlockPos(x + 0, y - 1, z - 0))).getBlock()))),
															_lvlSmeltResult).get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						removeBlock = true;
					} else {
						removeBlock = false;
					}
					if (removeBlock == true) {
						world.destroyBlock(new BlockPos(x + 0, y - 1, z - 0), false);
					} else {
						{
							BlockPos _pos = new BlockPos(x + 0, y - 1, z - 0);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y - 1, z - 0), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
		}
	}
}
