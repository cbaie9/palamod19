package palamod.procedures;

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

public class Hamsf3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getXRot() > 40 || entity.getXRot() < -40) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
						.getRecipeFor(RecipeType.SMELTING,
								new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING,
																new SimpleContainer(
																		(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.2) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x + 1, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x + 1, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
						.getRecipeFor(RecipeType.SMELTING,
								new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING,
																new SimpleContainer(
																		(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.2) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
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
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x - 1, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x - 1, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.2) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x + 1, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x + 1, y, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x + 1, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x + 1, y, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x - 1, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x - 1, y, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x - 1, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x - 1, y, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x, y + 0, z + 1), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x, y, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z - 1))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z - 1))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z - 1))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z - 1))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z - 1))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x, y + 0, z - 1), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x, y, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		} else if ((entity.getDirection()) == Direction.NORTH || (entity.getDirection()) == Direction.SOUTH) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 0, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x + 1, y + 0, z), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x + 1, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 0, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x - 1, y + 0, z), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x - 1, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x + 1, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x + 1, y + 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x + 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x + 1, y - 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x - 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x - 1, y - 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x - 1, y + 0, z), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x - 1, y + 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
						.getRecipeFor(RecipeType.SMELTING,
								new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING,
																new SimpleContainer(
																		(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x, y + 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
						.getRecipeFor(RecipeType.SMELTING,
								new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING,
																new SimpleContainer(
																		(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x, y - 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		} else if ((entity.getDirection()) == Direction.WEST || (entity.getDirection()) == Direction.EAST) {
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x, y + 0, z + 1), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x, y, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z - 1))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z - 1))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z - 1))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z - 1))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z - 1))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 0, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x, y + 0, z - 1), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x, y, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x, y + 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x, y + 1, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x, y - 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x, y - 1, z + 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x, y - 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x, y - 1, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
						new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING,
											new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
											_lvlSmeltResult).isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x, y + 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x, y + 1, z - 1);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
						.getRecipeFor(RecipeType.SMELTING,
								new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING,
																new SimpleContainer(
																		(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x, y + 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
						.getRecipeFor(RecipeType.SMELTING,
								new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))), _lvlSmeltResult)
						.isPresent())
								? _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
												_lvlSmeltResult)
										.get().getResultItem().copy()
								: ItemStack.EMPTY)
						.getItem() == (new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock())).getItem())) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
										.getRecipeFor(RecipeType.SMELTING,
												new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
												_lvlSmeltResult)
										.isPresent())
												? _lvlSmeltResult.getRecipeManager()
														.getRecipeFor(RecipeType.SMELTING,
																new SimpleContainer(
																		(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
																_lvlSmeltResult)
														.get().getResultItem().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
					if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									((world instanceof Level _lvlSmeltResult && _lvlSmeltResult.getRecipeManager()
											.getRecipeFor(RecipeType.SMELTING,
													new SimpleContainer((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
													_lvlSmeltResult)
											.isPresent())
													? _lvlSmeltResult.getRecipeManager()
															.getRecipeFor(RecipeType.SMELTING, new SimpleContainer(
																	(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
																	_lvlSmeltResult)
															.get().getResultItem().copy()
													: ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(0);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
				}
				{
					BlockPos _pos = new BlockPos(x, y - 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
		}
	}
}
