
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
		this.font.draw(poseStack, "Beta 2 : build T1 0026", 153, 209, -12829636);
		this.font.draw(poseStack, "l'hotel des vente ou hdv a ete abandonne ", 30, 41, -12829636);
		this.font.draw(poseStack, "a cause d'un bug de stockage d'item", 30, 52, -12829636);
		this.font.draw(poseStack, "le projet etant en open- source vous pouvez nous", 5, 86, -12829636);
		this.font.draw(poseStack, "aider : conctacter les devloppeurs sur github", 8, 96, -12829636);
		this.font.draw(poseStack, "https://github.com/cbaie9/palamod19", 9, 113, -12829636);
		this.font.draw(poseStack, "le hdv ses processus ont ete retirer en partie", 6, 136, -65485);
		this.font.draw(poseStack, "de lag et de compilation ( code trop long )", 7, 145, -65485);
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
		this.addRenderableWidget(new Button(this.leftPos + 38, this.topPos + 179, 186, 20, Component.literal("acces hdv"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new WipguiButtonMessage(0, x, y, z));
				WipguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
