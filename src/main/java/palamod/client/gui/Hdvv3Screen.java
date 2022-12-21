
package palamod.client.gui;

import palamod.world.inventory.Hdvv3Menu;

import palamod.network.Hdvv3ButtonMessage;

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

public class Hdvv3Screen extends AbstractContainerScreen<Hdvv3Menu> {
	private final static HashMap<String, Object> guistate = Hdvv3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Hdvv3Screen(Hdvv3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 230;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/hdvv_3.png");

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
		this.addRenderableWidget(new Button(this.leftPos + 43, this.topPos + 16, 61, 20, Component.literal("acheter"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Hdvv3ButtonMessage(0, x, y, z));
				Hdvv3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 46, this.topPos + 54, 61, 20, Component.literal("acheter"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Hdvv3ButtonMessage(1, x, y, z));
				Hdvv3ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 44, this.topPos + 97, 61, 20, Component.literal("acheter"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Hdvv3ButtonMessage(2, x, y, z));
				Hdvv3ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 173, this.topPos + 196, 46, 20, Component.literal("sell"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Hdvv3ButtonMessage(3, x, y, z));
				Hdvv3ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 114, this.topPos + 198, 46, 20, Component.literal("help"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Hdvv3ButtonMessage(4, x, y, z));
				Hdvv3ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
	}
}
