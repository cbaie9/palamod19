
package palamod.client.gui;

import palamod.world.inventory.AdminshopdirtMenu;

import palamod.network.AdminshopdirtButtonMessage;

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

public class AdminshopdirtScreen extends AbstractContainerScreen<AdminshopdirtMenu> {
	private final static HashMap<String, Object> guistate = AdminshopdirtMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AdminshopdirtScreen(AdminshopdirtMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 180;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/adminshopdirt.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/dirt50.png"));
		this.blit(ms, this.leftPos + 59, this.topPos + 41, 0, 0, 50, 50, 50, 50);

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
		this.font.draw(poseStack, "Adminshop - Dirt", 40, 6, -12829636);
		this.font.draw(poseStack, "Que voulez faire avec la dirt", 11, 23, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 27, this.topPos + 103, 40, 20, Component.literal("Buy"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 99, this.topPos + 103, 46, 20, Component.literal("sell"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 8, this.topPos + 130, 46, 20, Component.literal("(- back"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new AdminshopdirtButtonMessage(2, x, y, z));
				AdminshopdirtButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}
}
