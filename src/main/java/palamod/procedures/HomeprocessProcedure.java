package palamod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class HomeprocessProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		double cycle_loop = 0;
		if (entity.getPersistentData().getBoolean((StringArgumentType.getString(arguments, "home_name"))) == true) {
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getPersistentData().getDouble(("home_" + StringArgumentType.getString(arguments, "home_name") + "x"))),
						(entity.getPersistentData().getDouble(("home_" + StringArgumentType.getString(arguments, "home_name") + "y"))),
						(entity.getPersistentData().getDouble(("home_" + StringArgumentType.getString(arguments, "home_name") + "z"))));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(
							(entity.getPersistentData().getDouble(("home_" + StringArgumentType.getString(arguments, "home_name") + "x"))),
							(entity.getPersistentData().getDouble(("home_" + StringArgumentType.getString(arguments, "home_name") + "y"))),
							(entity.getPersistentData().getDouble(("home_" + StringArgumentType.getString(arguments, "home_name") + "z"))),
							_ent.getYRot(), _ent.getXRot());
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("[ Palamod ] Vous avez \u00E9t\u00E9 t\u00E9l\u00E9port\u00E9 \u00E0 votre home "
						+ StringArgumentType.getString(arguments, "home_name"))), (false));
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("[ Palamod ] Le home \"" + "" + StringArgumentType.getString(arguments, "home_name")
						+ "\" auquel vous voulez vous t\u00E9l\u00E9port\u00E9( e ) n'exste pas ou \u00E9t\u00E9 supprim\u00E9.")), (false));
		}
	}
}
