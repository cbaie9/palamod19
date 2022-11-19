package palamod.procedures;

import palamod.init.PalamodModItems;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

public class Legendarystonefortune_processProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack item = ItemStack.EMPTY;
		double number = 0;
		if (0 == itemstack.getOrCreateTag().getDouble("cooldown") || new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance()
							.getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			if (Math.random() < 0.1) {
				item = new ItemStack(PalamodModItems.PALADIUM_INGOT.get());
			} else if (Math.random() < 0.15) {
				item = new ItemStack(PalamodModItems.TITANE_INGOT.get());
			} else if (Math.random() < 0.25) {
				item = new ItemStack(PalamodModItems.AMETHYSTE.get());
			} else if (Math.random() < 0.5) {
				item = new ItemStack(Items.DIAMOND);
			} else {
				item = new ItemStack(Items.GOLD_INGOT);
			}
			number = Math.floor(Math.random()) * 10;
			if (Math.random() < 0.15) {
				number = number * 10;
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = item;
				_setstack.setCount((int) number);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 48000);
			itemstack.getOrCreateTag().putDouble("cooldown", 48000);
		} else {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), (int) itemstack.getOrCreateTag().getDouble("cooldown"));
		}
	}
}
