
package palamod.client.gui;

import palamod.world.inventory.LegendarystoneenMenu;

import palamod.network.LegendarystoneenButtonMessage;

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

public class LegendarystoneenScreen extends AbstractContainerScreen<LegendarystoneenMenu> {
	private final static HashMap<String, Object> guistate = LegendarystoneenMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public LegendarystoneenScreen(LegendarystoneenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/legendarystoneen_palahelp.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/legend_fortune.png"));
		this.blit(ms, this.leftPos + 1, this.topPos + 27, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/legend_invisibility.png"));
		this.blit(ms, this.leftPos + 3, this.topPos + 65, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/legend_jobs.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 84, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/legend_power.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 100, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/legend_tp.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 124, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/legend_random.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 149, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "Legendary stone wiki", 50, 4, -65536);
		this.font.draw(poseStack, "Forturne : can give some random ore", 17, 30, -12829636);
		this.font.draw(poseStack, "coal, iron, diamond, amethyst titane", 1, 44, -12829636);
		this.font.draw(poseStack, "note : usable one time every two day", 8, 13, -3407872);
		this.font.draw(poseStack, "Invisible : give invisible effect", 22, 69, -12829636);
		this.font.draw(poseStack, "Jobs : Give you some xp", 21, 86, -12829636);
		this.font.draw(poseStack, "Power : You now swim in fake water", 20, 105, -12829636);
		this.font.draw(poseStack, "without taking damage", 6, 115, -12829636);
		this.font.draw(poseStack, "Teleportation : Teleport in a", 21, 126, -12829636);
		this.font.draw(poseStack, "random place on the map", 4, 138, -12829636);
		this.font.draw(poseStack, "random : Give you one of the five ", 16, 153, -12829636);
		this.font.draw(poseStack, "Legenday stone", 3, 164, -12829636);
		this.font.draw(poseStack, "and paladium", 3, 54, -12829636);
		this.font.draw(poseStack, "(  = ingame )", 4, 21, -52429);
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
		this.addRenderableWidget(new Button(this.leftPos + 21, this.topPos + 175, 45, 20, Component.literal("back"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new LegendarystoneenButtonMessage(0, x, y, z));
				LegendarystoneenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 90, this.topPos + 175, 45, 20, Component.literal("menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new LegendarystoneenButtonMessage(1, x, y, z));
				LegendarystoneenButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
