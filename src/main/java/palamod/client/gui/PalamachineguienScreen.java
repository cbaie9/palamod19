
package palamod.client.gui;

import palamod.world.inventory.PalamachineguienMenu;

import palamod.network.PalamachineguienButtonMessage;

import palamod.PalamodMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PalamachineguienScreen extends AbstractContainerScreen<PalamachineguienMenu> {
	private final static HashMap<String, Object> guistate = PalamachineguienMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PalamachineguienScreen(PalamachineguienMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/palamachineguien.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/palam2.png"));
		this.blit(ms, this.leftPos + 13, this.topPos + 81, 0, 0, 148, 76, 148, 76);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Palamachine", 69, 17, -12829636);
		this.font.draw(poseStack, "palamachine is a machine for crafting", 3, 35, -12829636);
		this.font.draw(poseStack, "Sticks which allow you to have some", 3, 45, -12829636);
		this.font.draw(poseStack, "effets like heal, speed or jump ", 4, 57, -12829636);
		this.font.draw(poseStack, "The gui is like this", 1, 71, -12829636);
		this.font.draw(poseStack, "See Sticks for Crafts", 81, 183, -3394816);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 9, this.topPos + 7, 45, 20, Component.literal("back"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new PalamachineguienButtonMessage(0, x, y, z));
				PalamachineguienButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 137, this.topPos + 7, 45, 20, Component.literal("menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new PalamachineguienButtonMessage(1, x, y, z));
				PalamachineguienButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 4, this.topPos + 161, 82, 20, Component.literal("Sticks craft"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new PalamachineguienButtonMessage(2, x, y, z));
				PalamachineguienButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}
}
