package palamod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class SethomeprocessProcedure {
	public static void execute(double x, double y, double z, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("number_home", (entity.getPersistentData().getDouble("number_home") + 1));
		entity.getPersistentData().putDouble(("home_" + StringArgumentType.getString(arguments, "home_name") + "x"), x);
		entity.getPersistentData().putDouble(("home_" + StringArgumentType.getString(arguments, "home_name") + "y"), y);
		entity.getPersistentData().putDouble(("home_" + StringArgumentType.getString(arguments, "home_name") + "z"), z);
		entity.getPersistentData().putDouble(("home_id_" + StringArgumentType.getString(arguments, "home_name")),
				(entity.getPersistentData().getDouble("number_home")));
		entity.getPersistentData().putBoolean((StringArgumentType.getString(arguments, "home_name")), (true));
		entity.getPersistentData().putString(("home_name_" + entity.getPersistentData().getDouble("number_home")),
				(StringArgumentType.getString(arguments, "home_name")));
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("[ Palamod ] Le home \u00E0 \u00E9t\u00E9 creer a votre position actuel"), (false));
	}
}
