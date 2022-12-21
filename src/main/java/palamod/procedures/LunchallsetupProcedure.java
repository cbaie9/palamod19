package palamod.procedures;

import net.minecraft.world.level.LevelAccessor;

public class LunchallsetupProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Hdvsetup_processProcedure.execute(world);
		FactionsetupProcedure.execute(world);
		AdminshoppricesetupProcedure.execute(world, x, y, z);
	}
}
