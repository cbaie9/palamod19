
package palamod.client.gui;

import palamod.world.inventory.PhoneguiMenu;

import palamod.network.PhoneguiButtonMessage;

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

public class PhoneguiScreen extends AbstractContainerScreen<PhoneguiMenu> {
	private final static HashMap<String, Object> guistate = PhoneguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox cheat_code_secret;

	public PhoneguiScreen(PhoneguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/phonegui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		cheat_code_secret.render(ms, mouseX, mouseY, partialTicks);
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
		if (cheat_code_secret.isFocused())
			return cheat_code_secret.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		cheat_code_secret.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Enter your secret code", 4, 7, -12829636);
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
		cheat_code_secret = new EditBox(this.font, this.leftPos + 4, this.topPos + 20, 120, 20, Component.literal("enter code")) {
			{
				setSuggestion("enter code");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("enter code");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("enter code");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:cheat_code_secret", cheat_code_secret);
		cheat_code_secret.setMaxLength(32767);
		this.addWidget(this.cheat_code_secret);
		this.addRenderableWidget(new Button(this.leftPos + 98, this.topPos + 57, 72, 20, Component.literal("test code"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new PhoneguiButtonMessage(0, x, y, z));
				PhoneguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
