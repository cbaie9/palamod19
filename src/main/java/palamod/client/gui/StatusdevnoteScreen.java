
package palamod.client.gui;

import palamod.world.inventory.StatusdevnoteMenu;

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

public class StatusdevnoteScreen extends AbstractContainerScreen<StatusdevnoteMenu> {
	private final static HashMap<String, Object> guistate = StatusdevnoteMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public StatusdevnoteScreen(StatusdevnoteMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/statusdevnote.png");

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
		this.font.draw(poseStack, "Dev log #0001 build 0040  v16a1", 3, 5, -12829636);
		this.font.draw(poseStack, "Probl\uFFFDme de market", 2, 26, -12829636);
		this.font.draw(poseStack, "- Stokage de l'item en tant que nbt ", 9, 39, -12829636);
		this.font.draw(poseStack, "autre", 6, 54, -12829636);
		this.font.draw(poseStack, "Retard indermin\uFFFDe des commande type /f", 5, 65, -12829636);
		this.font.draw(poseStack, "A cause de refont, + maj moteur  arguments prochianment", 4, 76, -12829636);
		this.font.draw(poseStack, "11/04/2022", 240, 7, -12829636);
		this.font.draw(poseStack, "Info rapide : Le Market sera de 100 slots extensibles", 8, 116, -12829636);
		this.font.draw(poseStack, "Par les maj : system de copier coller relais", 6, 129, -12829636);
		this.font.draw(poseStack, "Au faite l'adminshop sortira rapidement apr\uFFFDs la snapshot", 1, 150, -12829636);
		this.font.draw(poseStack, "Du market ; system similaire", 1, 161, -12829636);
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
