package palamod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class HomelistProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double cycle_loop = 0;
		cycle_loop = cycle_loop + 1;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("------------------------------"), (false));
		for (int index0 = 0; index0 < (int) (entity.getPersistentData().getDouble("number_home")); index0++) {
			if (("home_name_" + cycle_loop).equals("[deleted_home_open]") || ("home_name_" + cycle_loop).equals("[deleted_home_request]")) {
				cycle_loop = cycle_loop + 1;
				continue;
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(
						("home n\u00B0" + Math.round(cycle_loop) + " - " + entity.getPersistentData().getString(("home_name_" + cycle_loop)))),
						(false));
			cycle_loop = cycle_loop + 1;
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("------------------------------"), (false));
	}
}
