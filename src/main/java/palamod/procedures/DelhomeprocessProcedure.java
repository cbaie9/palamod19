package palamod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class DelhomeprocessProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		double id = 0;
		if (entity.getPersistentData().getBoolean((StringArgumentType.getString(arguments, "home_name"))) == true) {
			entity.getPersistentData().putDouble(("home_" + StringArgumentType.getString(arguments, "home_name") + "x"), 0);
			entity.getPersistentData().putDouble(("home_" + StringArgumentType.getString(arguments, "home_name") + "y"), 256);
			entity.getPersistentData().putDouble(("home_" + StringArgumentType.getString(arguments, "home_name") + "z"), 0);
			entity.getPersistentData().putBoolean((StringArgumentType.getString(arguments, "home_name")), (false));
			if (entity.getPersistentData().getDouble(("number_id_" + StringArgumentType.getString(arguments, "home_name"))) == entity
					.getPersistentData().getDouble("number_home")) {
				entity.getPersistentData().putString(
						("home_name_" + entity.getPersistentData().getDouble(("number_id_" + StringArgumentType.getString(arguments, "home_name")))),
						"[deleted_home_open]");
				entity.getPersistentData().putDouble("number_home", (entity.getPersistentData().getDouble("number_home") - 1));
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("[ Palamod ] Le home a \u00E9t\u00E9 supprim\u00E9"), (false));
			} else {
				entity.getPersistentData().putString(
						("home_name_" + entity.getPersistentData().getDouble(("number_id_" + StringArgumentType.getString(arguments, "home_name")))),
						"[deleted_home_request]");
				entity.getPersistentData().putDouble(("home_id_" + StringArgumentType.getString(arguments, "home_name")), (-1));
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("[ Palamod ] Le home a \u00E9t\u00E9 supprim\u00E9"), (false));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("[ Palamod ] Le home que vous essayer de supprim\u00E9 n'existe pas"), (false));
		}
	}
}
