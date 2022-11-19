
package palamod.block;

import palamod.procedures.DiamondspikedamageProcedure;

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

public class DiamondspikeBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public DiamondspikeBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion()
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
			default -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(2, 1, 2, 15, 2, 15), box(4, 2, 4, 14, 3, 14), box(6, 3, 6, 13, 4, 13),
					box(8, 4, 8, 12, 5, 12), box(10, 5, 10, 11, 6, 11), box(10, 6, 10, 12, 7, 12), box(9, 7, 9, 14, 8, 14));
			case NORTH -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(1, 1, 1, 14, 2, 14), box(2, 2, 2, 12, 3, 12), box(3, 3, 3, 10, 4, 10),
					box(4, 4, 4, 8, 5, 8), box(5, 5, 5, 6, 6, 6), box(4, 6, 4, 6, 7, 6), box(2, 7, 2, 7, 8, 7));
			case EAST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(2, 1, 1, 15, 2, 14), box(4, 2, 2, 14, 3, 12), box(6, 3, 3, 13, 4, 10),
					box(8, 4, 4, 12, 5, 8), box(10, 5, 5, 11, 6, 6), box(10, 6, 4, 12, 7, 6), box(9, 7, 2, 14, 8, 7));
			case WEST -> Shapes.or(box(0, 0, 0, 16, 1, 16), box(1, 1, 2, 14, 2, 15), box(2, 2, 4, 12, 3, 14), box(3, 3, 6, 10, 4, 13),
					box(4, 4, 8, 8, 5, 12), box(5, 5, 10, 6, 6, 11), box(4, 6, 10, 6, 7, 12), box(2, 7, 9, 7, 8, 14));
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
			return tieredItem.getTier().getLevel() >= 1;
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
		DiamondspikedamageProcedure.execute(entity);
	}
}
