
package palamod.client.gui;

import palamod.world.inventory.PaladumfurnaceMenu;

import palamod.network.PalamodModVariables;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PaladumfurnaceScreen extends AbstractContainerScreen<PaladumfurnaceMenu> {
	private final static HashMap<String, Object> guistate = PaladumfurnaceMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PaladumfurnaceScreen(PaladumfurnaceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 180;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/paladumfurnace.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/big_slot.png"));
		this.blit(ms, this.leftPos + 117, this.topPos + 33, 0, 0, 26, 26, 26, 26);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/fire.png"));
		this.blit(ms, this.leftPos + 58, this.topPos + 42, 0, 0, 17, 14, 17, 14);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/fire01.png"));
		this.blit(ms, this.leftPos + 58, this.topPos + 40, 0, 0, 21, 17, 21, 17);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/fire02.png"));
		this.blit(ms, this.leftPos + 61, this.topPos + 41, 0, 0, 18, 16, 18, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/fire03.png"));
		this.blit(ms, this.leftPos + 61, this.topPos + 41, 0, 0, 17, 15, 17, 15);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/fire04.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 43, 0, 0, 17, 13, 17, 13);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/fire05.png"));
		this.blit(ms, this.leftPos + 59, this.topPos + 42, 0, 0, 20, 16, 20, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/fire06.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 39, 0, 0, 19, 18, 19, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/fire07.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 41, 0, 0, 18, 17, 18, 17);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/fire08.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 43, 0, 0, 16, 14, 16, 14);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/fire09.png"));
		this.blit(ms, this.leftPos + 61, this.topPos + 41, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "Paladium Furnace", 38, 3, -12829636);
		this.font.draw(poseStack, "Inventory", 7, 73, -12829636);
		this.font.draw(poseStack, "Upgrades", 2, 16, -65536);
		this.font.draw(poseStack, "" + (int) (PalamodModVariables.g_num) + "", 89, 66, -12829636);
		this.font.draw(poseStack, "" + (PalamodModVariables.Lucky_destroy) + "", 92, 18, -12829636);
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
	}
}
