
package palamod.client.gui;

import palamod.world.inventory.AuthsafeguiMenu;

import palamod.network.AuthsafeguiButtonMessage;

import palamod.PalamodMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AuthsafeguiScreen extends AbstractContainerScreen<AuthsafeguiMenu> {
	private final static HashMap<String, Object> guistate = AuthsafeguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox code_check;

	public AuthsafeguiScreen(AuthsafeguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 150;
		this.imageHeight = 60;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/authsafegui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		code_check.render(ms, mouseX, mouseY, partialTicks);
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
		if (code_check.isFocused())
			return code_check.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		code_check.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Enter code", 3, 6, -12829636);
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
		code_check = new EditBox(this.font, this.leftPos + 3, this.topPos + 15, 120, 20, Component.literal(""));
		guistate.put("text:code_check", code_check);
		code_check.setMaxLength(32767);
		this.addWidget(this.code_check);
		this.addRenderableWidget(new Button(this.leftPos + 3, this.topPos + 36, 46, 20, Component.literal("open"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new AuthsafeguiButtonMessage(0, x, y, z));
				AuthsafeguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
