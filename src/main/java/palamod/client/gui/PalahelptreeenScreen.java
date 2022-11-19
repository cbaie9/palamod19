
package palamod.client.gui;

import palamod.world.inventory.PalahelptreeenMenu;

import palamod.network.PalahelptreeenButtonMessage;

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

public class PalahelptreeenScreen extends AbstractContainerScreen<PalahelptreeenMenu> {
	private final static HashMap<String, Object> guistate = PalahelptreeenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PalahelptreeenScreen(PalahelptreeenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 190;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/palahelptreeen.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/erable_log.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 6, 0, 0, 32, 32, 32, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/jacaranda_log.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 37, 0, 0, 32, 32, 32, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/judeecercis_log.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 69, 0, 0, 32, 32, 32, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/ostrya_log.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 100, 0, 0, 32, 32, 32, 32);

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
		this.font.draw(poseStack, "Erable : Can be used for", 39, 4, -52480);
		this.font.draw(poseStack, "crafting the paladium portal", 39, 15, -52480);
		this.font.draw(poseStack, "Jacaranda : Can be used for", 38, 37, -6750055);
		this.font.draw(poseStack, "crafting the amethyst portal", 39, 48, -6750055);
		this.font.draw(poseStack, "Judeecercis : can be used for", 37, 71, -12829636);
		this.font.draw(poseStack, "Crafting the titane portal", 38, 84, -12829636);
		this.font.draw(poseStack, "Ostrya : Can be used for", 39, 101, -13434727);
		this.font.draw(poseStack, "Crafting the endium portal", 40, 111, -13434727);
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
		this.addRenderableWidget(new Button(this.leftPos + 9, this.topPos + 134, 45, 20, Component.literal("back"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new PalahelptreeenButtonMessage(0, x, y, z));
				PalahelptreeenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 69, this.topPos + 134, 45, 20, Component.literal("menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new PalahelptreeenButtonMessage(1, x, y, z));
				PalahelptreeenButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
