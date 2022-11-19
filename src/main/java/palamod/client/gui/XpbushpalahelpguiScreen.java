
package palamod.client.gui;

import palamod.world.inventory.XpbushpalahelpguiMenu;

import palamod.network.XpbushpalahelpguiButtonMessage;

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

public class XpbushpalahelpguiScreen extends AbstractContainerScreen<XpbushpalahelpguiMenu> {
	private final static HashMap<String, Object> guistate = XpbushpalahelpguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public XpbushpalahelpguiScreen(XpbushpalahelpguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/xpbushpalahelpgui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/xp_berry.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 80, 0, 0, 32, 32, 32, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/berry_xp_bush_fancy.png"));
		this.blit(ms, this.leftPos + 4, this.topPos + 119, 0, 0, 32, 32, 32, 32);

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
		this.font.draw(poseStack, "Xp bush ", 72, 6, -65536);
		this.font.draw(poseStack, "Xp bush est une plant qui fait pousser", 2, 20, -12829636);
		this.font.draw(poseStack, "des xp berries qui vous donne de xp", 2, 32, -12829636);
		this.font.draw(poseStack, "quand vous faites clique droit dessus", 3, 42, -12829636);
		this.font.draw(poseStack, "Vous pouvez les compresser en", 1, 53, -12829636);
		this.font.draw(poseStack, "compressed xp berries", 0, 65, -12829636);
		this.font.draw(poseStack, "xp berry", 38, 84, -12829636);
		this.font.draw(poseStack, "xp bush", 43, 126, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 136, this.topPos + 91, 45, 20, Component.literal("back"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new XpbushpalahelpguiButtonMessage(0, x, y, z));
				XpbushpalahelpguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 136, this.topPos + 113, 45, 20, Component.literal("menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new XpbushpalahelpguiButtonMessage(1, x, y, z));
				XpbushpalahelpguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
