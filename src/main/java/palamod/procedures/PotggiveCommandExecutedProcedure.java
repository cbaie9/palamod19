package palamod.procedures;

import net.minecraft.world.entity.Entity;

public class PotggiveCommandExecutedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("Pickaxe_stone", 20000000);
	}
}
