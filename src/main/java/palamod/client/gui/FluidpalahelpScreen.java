
package palamod.client.gui;

import palamod.world.inventory.FluidpalahelpMenu;

import palamod.network.FluidpalahelpButtonMessage;

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

public class FluidpalahelpScreen extends AbstractContainerScreen<FluidpalahelpMenu> {
	private final static HashMap<String, Object> guistate = FluidpalahelpMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FluidpalahelpScreen(FluidpalahelpMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/fluidpalahelp.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/6_fluid.png"));
		this.blit(ms, this.leftPos + 7, this.topPos + 37, 0, 0, 22, 21, 22, 21);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/7angel.png"));
		this.blit(ms, this.leftPos + 5, this.topPos + 96, 0, 0, 21, 21, 21, 21);

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
		this.font.draw(poseStack, "Fluid", 85, 5, -13369345);
		this.font.draw(poseStack, "fake water: un type d'eau invisible qui", 2, 63, -12829636);
		this.font.draw(poseStack, "vous fait des d\uFFFDgats Peut peut \uFFFDtre", 2, 76, -12829636);
		this.font.draw(poseStack, "\uFFFDmpecher la legendary stone de power", 4, 86, -12829636);
		this.font.draw(poseStack, "Angelique water : type d'eau qui vous", 4, 122, -12829636);
		this.font.draw(poseStack, "soigne", 3, 132, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 8, this.topPos + 165, 45, 20, Component.literal("back"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new FluidpalahelpButtonMessage(0, x, y, z));
				FluidpalahelpButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 57, this.topPos + 165, 45, 20, Component.literal("menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new FluidpalahelpButtonMessage(1, x, y, z));
				FluidpalahelpButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
