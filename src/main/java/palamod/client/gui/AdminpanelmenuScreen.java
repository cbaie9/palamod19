
package palamod.client.gui;

import palamod.world.inventory.AdminpanelmenuMenu;

import palamod.network.AdminpanelmenuButtonMessage;

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

public class AdminpanelmenuScreen extends AbstractContainerScreen<AdminpanelmenuMenu> {
	private final static HashMap<String, Object> guistate = AdminpanelmenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AdminpanelmenuScreen(AdminpanelmenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/adminpanelmenu.png");

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
		this.font.draw(poseStack, "Admin Panel", 52, 5, -65536);
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
		this.addRenderableWidget(new Button(this.leftPos + 30, this.topPos + 24, 108, 20, Component.literal("Hdv Stocks Panel"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new AdminpanelmenuButtonMessage(0, x, y, z));
				AdminpanelmenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 43, this.topPos + 51, 82, 20, Component.literal("Money Panel"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new AdminpanelmenuButtonMessage(1, x, y, z));
				AdminpanelmenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 43, this.topPos + 78, 82, 20, Component.literal("Spawn Panel"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new AdminpanelmenuButtonMessage(2, x, y, z));
				AdminpanelmenuButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 38, this.topPos + 108, 93, 20, Component.literal("Trixium Panel"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new AdminpanelmenuButtonMessage(3, x, y, z));
				AdminpanelmenuButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 48, this.topPos + 135, 77, 20, Component.literal("Jobs Panel"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new AdminpanelmenuButtonMessage(4, x, y, z));
				AdminpanelmenuButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
	}
}
