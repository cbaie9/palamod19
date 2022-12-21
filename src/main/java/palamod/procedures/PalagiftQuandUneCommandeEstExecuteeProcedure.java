package palamod.procedures;

import palamod.init.PalamodModBlocks;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class PalagiftQuandUneCommandeEstExecuteeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("ap4f_9ed3")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PalamodModBlocks.FAKEPALADIUMORE.get());
				_setstack.setCount(64);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			entity.getPersistentData().putBoolean("ap4f_9ed3", (true));
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("msg @p Serieux tu en prend que 1"), (false));
		}
	}
}
