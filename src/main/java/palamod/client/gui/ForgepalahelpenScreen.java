
package palamod.client.gui;

import palamod.world.inventory.ForgepalahelpenMenu;

import palamod.network.ForgepalahelpenButtonMessage;

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

public class ForgepalahelpenScreen extends AbstractContainerScreen<ForgepalahelpenMenu> {
	private final static HashMap<String, Object> guistate = ForgepalahelpenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ForgepalahelpenScreen(ForgepalahelpenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 175;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/forgepalahelpen.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/5forge.png"));
		this.blit(ms, this.leftPos + 126, this.topPos + 1, 0, 0, 171, 78, 171, 78);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/forge_front_on.png"));
		this.blit(ms, this.leftPos + 7, this.topPos + 56, 0, 0, 32, 32, 32, 32);

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
		this.font.draw(poseStack, "Paladium Forge", 5, 2, -65485);
		this.font.draw(poseStack, "The forge is a machine for recycling your tools", 2, 96, -12829636);
		this.font.draw(poseStack, "(amethyst , titane and paladium) and re-tranform in ingot", 0, 106, -12829636);
		this.font.draw(poseStack, "And for making this, you will need coal or palamixed coal", 2, 116, -12829636);
		this.font.draw(poseStack, "for better utilitie like a furnace and wait a little", 1, 126, -12829636);
		this.font.draw(poseStack, "and it done : ]", 2, 137, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 14, 45, 20, Component.literal("back"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new ForgepalahelpenButtonMessage(0, x, y, z));
				ForgepalahelpenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 2, this.topPos + 35, 45, 20, Component.literal("menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new ForgepalahelpenButtonMessage(1, x, y, z));
				ForgepalahelpenButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
