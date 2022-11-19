
package palamod.client.gui;

import palamod.world.inventory.Stickgui1Menu;

import palamod.network.Stickgui1ButtonMessage;

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

public class Stickgui1Screen extends AbstractContainerScreen<Stickgui1Menu> {
	private final static HashMap<String, Object> guistate = Stickgui1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Stickgui1Screen(Stickgui1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 225;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/stickgui_1.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/1speed.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 103, 0, 0, 260, 118, 260, 118);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/1orbspeed.png"));
		this.blit(ms, this.leftPos + 255, this.topPos + 133, 0, 0, 87, 87, 87, 87);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/speedstick.png"));
		this.blit(ms, this.leftPos + 120, this.topPos + 193, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/speedstick.png"));
		this.blit(ms, this.leftPos + 334, this.topPos + 83, 0, 0, 32, 32, 32, 32);

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
		this.font.draw(poseStack, "Sticks", 173, 4, -12829636);
		this.font.draw(poseStack, "Les stick ( b\uFFFDton) de craftent dans la palamachine.Il en existe de plusieures", 8, 15, -12829636);
		this.font.draw(poseStack, "types diff\uFFFDrent", 7, 28, -12829636);
		this.font.draw(poseStack, "Speed stick : vous permet d'avoir un speed 3 pendant 10 secondes", 5, 83, -12829636);
		this.font.draw(poseStack, "Craft de la speed orb", 257, 124, -12829636);
		this.font.draw(poseStack, "(-", 343, 137, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 4, this.topPos + 57, 70, 20, Component.literal("item menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Stickgui1ButtonMessage(0, x, y, z));
				Stickgui1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 77, this.topPos + 57, 45, 20, Component.literal("menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Stickgui1ButtonMessage(1, x, y, z));
				Stickgui1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 127, this.topPos + 57, 75, 20, Component.literal("next stick"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Stickgui1ButtonMessage(2, x, y, z));
				Stickgui1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}
}
