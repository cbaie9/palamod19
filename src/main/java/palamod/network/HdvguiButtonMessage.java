
package palamod.network;

import palamod.world.inventory.HdvguiMenu;

import palamod.procedures.OpenhdvsellProcedure;
import palamod.procedures.HdvbuyProcedure;
import palamod.procedures.Hdvbuy3Procedure;
import palamod.procedures.Hdvbuy2Procedure;
import palamod.procedures.Hdvbuy1Procedure;
import palamod.procedures.HdvaideProcedure;

import palamod.PalamodMod;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HdvguiButtonMessage {
	private final int buttonID, x, y, z;

	public HdvguiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public HdvguiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(HdvguiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(HdvguiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = HdvguiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 1) {

			HdvaideProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			HdvbuyProcedure.execute(world, x, z, entity);
		}
		if (buttonID == 3) {

			OpenhdvsellProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			Hdvbuy1Procedure.execute(world, x, z, entity);
		}
		if (buttonID == 5) {

			Hdvbuy2Procedure.execute(world, x, z, entity);
		}
		if (buttonID == 6) {

			Hdvbuy3Procedure.execute(world, x, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PalamodMod.addNetworkMessage(HdvguiButtonMessage.class, HdvguiButtonMessage::buffer, HdvguiButtonMessage::new, HdvguiButtonMessage::handler);
	}
}
