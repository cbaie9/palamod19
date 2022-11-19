
package palamod.client.gui;

import palamod.world.inventory.PalahelporeenMenu;

import palamod.network.PalahelporeenButtonMessage;

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

public class PalahelporeenScreen extends AbstractContainerScreen<PalahelporeenMenu> {
	private final static HashMap<String, Object> guistate = PalahelporeenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PalahelporeenScreen(PalahelporeenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 280;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/palahelporeen.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/amethyst_ingot.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 141, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/paladium_ingot.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 65, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/findium.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 83, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/titane_ingot.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 109, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/paladium_green_ingot.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 47, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/endium_ingot.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 27, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "Paladium : The most powerful ore  who can be mined", 18, 73, -52480);
		this.font.draw(poseStack, "some other thing", 18, 97, -205);
		this.font.draw(poseStack, "Low cost ore, can be easily find ", 6, 157, -6750055);
		this.font.draw(poseStack, "Very good ore for your first tools in the mod", 24, 125, -12829636);
		this.font.draw(poseStack, "Am\uFFFDthyste :", 24, 145, -6750055);
		this.font.draw(poseStack, "Titane :", 23, 116, -12829636);
		this.font.draw(poseStack, "Findium : can be used for crafting cave block and", 20, 87, -205);
		this.font.draw(poseStack, "Green Paladium : Paladium but very very rare", 23, 51, -10027213);
		this.font.draw(poseStack, "Endium : The ultimate ingot", 22, 29, -13434727);
		this.font.draw(poseStack, "Obtain by Paladium crusher", 139, 37, -13434727);
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
		this.addRenderableWidget(new Button(this.leftPos + 222, this.topPos + 6, 45, 20, Component.literal("back"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new PalahelporeenButtonMessage(0, x, y, z));
				PalahelporeenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 6, this.topPos + 4, 45, 20, Component.literal("menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new PalahelporeenButtonMessage(1, x, y, z));
				PalahelporeenButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
