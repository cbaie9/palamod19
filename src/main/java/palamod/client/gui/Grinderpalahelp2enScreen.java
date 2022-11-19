
package palamod.client.gui;

import palamod.world.inventory.Grinderpalahelp2enMenu;

import palamod.network.Grinderpalahelp2enButtonMessage;

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

public class Grinderpalahelp2enScreen extends AbstractContainerScreen<Grinderpalahelp2enMenu> {
	private final static HashMap<String, Object> guistate = Grinderpalahelp2enMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Grinderpalahelp2enScreen(Grinderpalahelp2enMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/grinderpalahelp_2en.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/grinder_block_front.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 6, 0, 0, 32, 32, 32, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/1.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 146, 0, 0, 45, 46, 45, 46);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/2.png"));
		this.blit(ms, this.leftPos + 52, this.topPos + 146, 0, 0, 46, 46, 46, 46);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/3.png"));
		this.blit(ms, this.leftPos + 100, this.topPos + 146, 0, 0, 45, 46, 45, 46);

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
		this.font.draw(poseStack, "2/2", 178, 5, -12829636);
		this.font.draw(poseStack, "Grinder wiki", 68, 6, -12829636);
		this.font.draw(poseStack, "Knockback : add  knockback effect  -)", 4, 41, -12829636);
		this.font.draw(poseStack, "fastsword + broadsword", 3, 50, -12829636);
		this.font.draw(poseStack, "How to Craft the grinder ", 3, 62, -4385001);
		this.font.draw(poseStack, "We need for this  :", 3, 73, -12829636);
		this.font.draw(poseStack, "1 grinder block, 5 grinder casing, 20", 4, 83, -12829636);
		this.font.draw(poseStack, "grinder frame et l'asembing table", 2, 94, -12829636);
		this.font.draw(poseStack, "With this craft step 1 two time and", 3, 104, -5433600);
		this.font.draw(poseStack, "step 2 one time and craft step 3", 3, 115, -6750208);
		this.font.draw(poseStack, "step 1", 11, 135, -12829636);
		this.font.draw(poseStack, "step 2", 52, 136, -12829636);
		this.font.draw(poseStack, "step 3", 105, 135, -12829636);
		this.font.draw(poseStack, "It's done", 146, 126, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 147, this.topPos + 173, 45, 20, Component.literal("back"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Grinderpalahelp2enButtonMessage(0, x, y, z));
				Grinderpalahelp2enButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 147, this.topPos + 151, 45, 20, Component.literal("menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Grinderpalahelp2enButtonMessage(1, x, y, z));
				Grinderpalahelp2enButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
