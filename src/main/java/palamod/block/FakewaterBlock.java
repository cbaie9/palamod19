
package palamod.block;

import palamod.procedures.FakewaterMobplayerCollidesBlockProcedure;

import palamod.init.PalamodModFluids;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class FakewaterBlock extends LiquidBlock {
	public FakewaterBlock() {
		super(() -> PalamodModFluids.FAKEWATER.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		FakewaterMobplayerCollidesBlockProcedure.execute(entity);
	}
}
