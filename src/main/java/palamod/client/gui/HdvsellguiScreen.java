
package palamod.client.gui;

import palamod.world.inventory.HdvsellguiMenu;

import palamod.network.HdvsellguiButtonMessage;

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

public class HdvsellguiScreen extends AbstractContainerScreen<HdvsellguiMenu> {
	private final static HashMap<String, Object> guistate = HdvsellguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox market_price;

	public HdvsellguiScreen(HdvsellguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 180;
		this.imageHeight = 180;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/hdvsellgui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		market_price.render(ms, mouseX, mouseY, partialTicks);
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
		if (market_price.isFocused())
			return market_price.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		market_price.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Beta", 151, 3, -1);
		this.font.draw(poseStack, "Prix de vente", 5, 6, -1);
		this.font.draw(poseStack, "Item", 134, 21, -10066330);
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
		market_price = new EditBox(this.font, this.leftPos + 5, this.topPos + 17, 120, 20, Component.literal("prix")) {
			{
				setSuggestion("prix");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("prix");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("prix");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:market_price", market_price);
		market_price.setMaxLength(32767);
		this.addWidget(this.market_price);
		this.addRenderableWidget(new Button(this.leftPos + 5, this.topPos + 39, 56, 20, Component.literal("vendre"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new HdvsellguiButtonMessage(0, x, y, z));
				HdvsellguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
