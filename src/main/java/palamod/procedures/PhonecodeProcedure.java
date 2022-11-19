package palamod.procedures;

import palamod.init.PalamodModItems;
import palamod.init.PalamodModBlocks;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class PhonecodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "").contains("cbaie9")
				|| (guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
						.contains("cb9")
				|| (guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
						.contains("4009")) {
			world.setBlock(new BlockPos(x, y, z), PalamodModBlocks.FAKEPALADIUMORE.get().defaultBlockState(), 3);
			entity.hurt(DamageSource.GENERIC, 1);
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if ((guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
				.contains("Combocircle")
				|| (guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
						.contains("CombocircleZ")
				|| (guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
						.contains("Combocircle123")
				|| (guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
						.contains("CombocircleZ123")) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.ADVENTURE);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("msg @s an cheater has been detected"), (true));
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if ((guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
				.contains("reset.gamemode")) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.SURVIVAL);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("msg @s reset.gamemode has been succesful executed You now in gamemode survival"),
						(true));
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if ((guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
				.contains("Wolfen")
				|| (guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
						.contains("wolfen")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.LEAD);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("msg @p No suicide today please. Suicide is bad :{"), (true));
			if (entity instanceof Player _player)
				_player.closeContainer();
		} else if ((guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
				.contains("jojo")
				|| (guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
						.contains("wlf")
				|| (guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
						.contains("jojo_xd30")) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PalamodModItems.PALADIUM_SWORD.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("msg @p Jojo veut la mort de quelqu'un ici"), (true));
		} else if ((guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
				.contains("fufu")
				|| (guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
						.contains("faction")
				|| (guistate.containsKey("text:cheat_code_secret") ? ((EditBox) guistate.get("text:cheat_code_secret")).getValue() : "")
						.contains("fumix")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Rejoins la faction sur paladium https://discord.gg/q2hNSq8GD6"), (true));
		}
	}
}
