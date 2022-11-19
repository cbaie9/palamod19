
package palamod.client.gui;

import palamod.world.inventory.Palaerror0003Menu;

import palamod.network.Palaerror0003ButtonMessage;

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

public class Palaerror0003Screen extends AbstractContainerScreen<Palaerror0003Menu> {
	private final static HashMap<String, Object> guistate = Palaerror0003Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Palaerror0003Screen(Palaerror0003Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 70;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/palaerror_0003.png");

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
		this.font.draw(poseStack, "Err0r 0003 - Hdv", 39, 3, -12829636);
		this.font.draw(poseStack, "You don't have the required", 6, 14, -12829636);
		this.font.draw(poseStack, "Money for buying this Item", 4, 25, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 40, this.topPos + 41, 92, 20, Component.literal("Return to Hdv"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Palaerror0003ButtonMessage(0, x, y, z));
				Palaerror0003ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
