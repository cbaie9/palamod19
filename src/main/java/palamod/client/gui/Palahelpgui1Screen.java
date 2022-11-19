
package palamod.client.gui;

import palamod.world.inventory.Palahelpgui1Menu;

import palamod.network.Palahelpgui1ButtonMessage;

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

public class Palahelpgui1Screen extends AbstractContainerScreen<Palahelpgui1Menu> {
	private final static HashMap<String, Object> guistate = Palahelpgui1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Palahelpgui1Screen(Palahelpgui1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/palahelpgui_1.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/palablock_palahelp1-removebg-preview.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 19, 0, 0, 100, 100, 100, 100);

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
		this.font.draw(poseStack, "Palahelp", 6, 5, -52429);
		this.font.draw(poseStack, "1/2", 6, 147, -16750951);
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
		this.addRenderableWidget(new Button(this.leftPos + 111, this.topPos + 14, 50, 20, Component.literal("Blocks"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Palahelpgui1ButtonMessage(0, x, y, z));
				Palahelpgui1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 111, this.topPos + 45, 50, 20, Component.literal("Items"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Palahelpgui1ButtonMessage(1, x, y, z));
				Palahelpgui1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 111, this.topPos + 74, 40, 20, Component.literal("Gui"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Palahelpgui1ButtonMessage(2, x, y, z));
				Palahelpgui1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 123, 45, 20, Component.literal("Next"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Palahelpgui1ButtonMessage(3, x, y, z));
				Palahelpgui1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 76, this.topPos + 134, 85, 20, Component.literal("Lucky blocks"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 111, this.topPos + 103, 55, 20, Component.literal("Metiers ( soon "), e -> {
		}));
	}
}
