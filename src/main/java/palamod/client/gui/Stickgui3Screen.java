
package palamod.client.gui;

import palamod.world.inventory.Stickgui3Menu;

import palamod.network.Stickgui3ButtonMessage;

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

public class Stickgui3Screen extends AbstractContainerScreen<Stickgui3Menu> {
	private final static HashMap<String, Object> guistate = Stickgui3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Stickgui3Screen(Stickgui3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/stickgui_3.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/1jump.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 45, 0, 0, 262, 118, 262, 118);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/1jumporb.png"));
		this.blit(ms, this.leftPos + 253, this.topPos + 77, 0, 0, 88, 86, 88, 86);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/jumpstick.png"));
		this.blit(ms, this.leftPos + 294, this.topPos + 30, 0, 0, 32, 32, 32, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/jumpstick.png"));
		this.blit(ms, this.leftPos + 122, this.topPos + 135, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "Jump stick : vous donne saut/jump 3 pendant 40 secondes", 3, 33, -12829636);
		this.font.draw(poseStack, "craft de la jump orb", 261, 62, -12829636);
		this.font.draw(poseStack, "(--", 341, 76, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 8, 100, 20, Component.literal("stick pr???c???dant"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Stickgui3ButtonMessage(0, x, y, z));
				Stickgui3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 112, this.topPos + 8, 90, 20, Component.literal("stick suivant"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Stickgui3ButtonMessage(1, x, y, z));
				Stickgui3ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 207, this.topPos + 8, 70, 20, Component.literal("item menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Stickgui3ButtonMessage(2, x, y, z));
				Stickgui3ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 282, this.topPos + 8, 45, 20, Component.literal("menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Stickgui3ButtonMessage(3, x, y, z));
				Stickgui3ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
