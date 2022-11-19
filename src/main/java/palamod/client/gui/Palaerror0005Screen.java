
package palamod.client.gui;

import palamod.world.inventory.Palaerror0005Menu;

import palamod.network.Palaerror0005ButtonMessage;

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

public class Palaerror0005Screen extends AbstractContainerScreen<Palaerror0005Menu> {
	private final static HashMap<String, Object> guistate = Palaerror0005Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Palaerror0005Screen(Palaerror0005Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 180;
		this.imageHeight = 80;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/palaerror_0005.png");

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
		this.font.draw(poseStack, "Pala Err0r 0005", 47, 4, -12829636);
		this.font.draw(poseStack, "You don't have the permission to", 5, 26, -12829636);
		this.font.draw(poseStack, "do that action ", 5, 36, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 68, this.topPos + 53, 46, 20, Component.literal("quit"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Palaerror0005ButtonMessage(0, x, y, z));
				Palaerror0005ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
