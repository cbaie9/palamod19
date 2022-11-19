
package palamod.client.gui;

import palamod.world.inventory.WipguiMenu;

import palamod.network.WipguiButtonMessage;

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

public class WipguiScreen extends AbstractContainerScreen<WipguiMenu> {
	private final static HashMap<String, Object> guistate = WipguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public WipguiScreen(WipguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 275;
		this.imageHeight = 225;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/wipgui.png");

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
		this.font.draw(poseStack, "Palamod - Not in working in progress", 45, 6, -3407872);
		this.font.draw(poseStack, "release\uFFFD / poisson d'avril", 5, 208, -12829636);
		this.font.draw(poseStack, "Vous croyer qu'en 1 semaine on peut cr\uFFFDer un hdv", 11, 36, -12829636);
		this.font.draw(poseStack, "BRUH", 11, 51, -12829636);
		this.font.draw(poseStack, "Ceci est un poisson d'avril ( sans blague )", 10, 64, -12829636);
		this.font.draw(poseStack, "Sinon serieux rendez-vous \uFFFD la fermeture de la ", 7, 81, -12829636);
		this.font.draw(poseStack, "v7.5", 250, 80, -26368);
		this.font.draw(poseStack, "Pour avoir une surprise ", 7, 92, -12829636);
		this.font.draw(poseStack, "Ps /palagift pour du bonus", 6, 120, -12829636);
		this.font.draw(poseStack, "Ps 2 Chercher bien pour les indices", 5, 131, -12829636);
		this.font.draw(poseStack, "Build 0031", 215, 208, -12829636);
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
		this.addRenderableWidget(
				new Button(this.leftPos + 4, this.topPos + 163, 186, 20, Component.literal("continuer pour voir les travaux -)"), e -> {
					if (true) {
						PalamodMod.PACKET_HANDLER.sendToServer(new WipguiButtonMessage(0, x, y, z));
						WipguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}));
		this.addRenderableWidget(new Button(this.leftPos + 199, this.topPos + 163, 61, 20, Component.literal("devnote"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new WipguiButtonMessage(1, x, y, z));
				WipguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
