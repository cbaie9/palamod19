
package palamod.client.gui;

import palamod.world.inventory.PalahelporeMenu;

import palamod.network.PalahelporeButtonMessage;

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

public class PalahelporeScreen extends AbstractContainerScreen<PalahelporeMenu> {
	private final static HashMap<String, Object> guistate = PalahelporeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PalahelporeScreen(PalahelporeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 240;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/palahelpore.png");

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
		this.blit(ms, this.leftPos + 17, this.topPos + 151, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/paladium_ingot.png"));
		this.blit(ms, this.leftPos + 13, this.topPos + 66, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/findium.png"));
		this.blit(ms, this.leftPos + 14, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/titane_ingot.png"));
		this.blit(ms, this.leftPos + 15, this.topPos + 122, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/paladium_green_ingot.png"));
		this.blit(ms, this.leftPos + 13, this.topPos + 47, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/endium_ingot.png"));
		this.blit(ms, this.leftPos + 13, this.topPos + 26, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "Paladium :Le minerais le plus puissant", 33, 66, -52480);
		this.font.draw(poseStack, "minable", 35, 76, -52480);
		this.font.draw(poseStack, "Tres rare sert a quelque craft", 28, 99, -205);
		this.font.draw(poseStack, "dont le cave block et le spawn finder", 15, 110, -205);
		this.font.draw(poseStack, "Minerais de bas niveau trouvable assez", 17, 168, -6750055);
		this.font.draw(poseStack, "facilement", 16, 178, -6750055);
		this.font.draw(poseStack, "Resitant,tres bon pour ses premiers", 34, 131, -12829636);
		this.font.draw(poseStack, "outils", 14, 140, -12829636);
		this.font.draw(poseStack, "Am\uFFFDthyste :", 36, 153, -6750055);
		this.font.draw(poseStack, "Titane :", 34, 121, -12829636);
		this.font.draw(poseStack, "Findium :", 31, 89, -205);
		this.font.draw(poseStack, "Paladium vert : equivalent en plus rare", 32, 52, -10027213);
		this.font.draw(poseStack, "Endium : Le materiau ultime obtenable", 34, 27, -13434727);
		this.font.draw(poseStack, "via le paladium crusher ( voir machine)", 29, 39, -13434727);
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
		this.addRenderableWidget(new Button(this.leftPos + 105, this.topPos + 5, 45, 20, Component.literal("back"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new PalahelporeButtonMessage(0, x, y, z));
				PalahelporeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 40, this.topPos + 5, 45, 20, Component.literal("menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new PalahelporeButtonMessage(1, x, y, z));
				PalahelporeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
