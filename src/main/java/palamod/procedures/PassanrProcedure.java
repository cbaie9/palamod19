package palamod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class PassanrProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal((entity.getPersistentData().getDouble("analy_endstone") + ""
					+ entity.getPersistentData().getDouble("analy_air") + entity.getPersistentData().getDouble("analy_bedrock")
					+ entity.getPersistentData().getDouble("analy_grass") + entity.getPersistentData().getDouble("analy_dirt"))), (false));
	}
}
