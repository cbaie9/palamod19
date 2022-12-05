
package palamod.block;

import palamod.procedures.TitanespikedamageProcedure;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class TitanespikeBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public TitanespikeBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(3f, 10f).requiresCorrectToolForDrops().noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(1, 1, 1, 15, 3, 15), box(2, 3, 2, 14, 4, 14), box(3, 4, 3, 13, 5, 13),
					box(4, 5, 4, 12, 7, 12), box(5, 7, 5, 11, 8, 11), box(6, 8, 6, 10, 9, 10), box(7, 9, 7, 9, 11, 9));
			case NORTH -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(1, 1, 1, 15, 3, 15), box(2, 3, 2, 14, 4, 14), box(3, 4, 3, 13, 5, 13),
					box(4, 5, 4, 12, 7, 12), box(5, 7, 5, 11, 8, 11), box(6, 8, 6, 10, 9, 10), box(7, 9, 7, 9, 11, 9));
			case EAST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(1, 1, 1, 15, 3, 15), box(2, 3, 2, 14, 4, 14), box(3, 4, 3, 13, 5, 13),
					box(4, 5, 4, 12, 7, 12), box(5, 7, 5, 11, 8, 11), box(6, 8, 6, 10, 9, 10), box(7, 9, 7, 9, 11, 9));
			case WEST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(1, 1, 1, 15, 3, 15), box(2, 3, 2, 14, 4, 14), box(3, 4, 3, 13, 5, 13),
					box(4, 5, 4, 12, 7, 12), box(5, 7, 5, 11, 8, 11), box(6, 8, 6, 10, 9, 10), box(7, 9, 7, 9, 11, 9));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 2;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		TitanespikedamageProcedure.execute(entity);
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		TitanespikedamageProcedure.execute(entity);
	}
}
