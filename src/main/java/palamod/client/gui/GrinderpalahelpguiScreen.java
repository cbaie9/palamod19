
package palamod.client.gui;

import palamod.world.inventory.GrinderpalahelpguiMenu;

import palamod.network.GrinderpalahelpguiButtonMessage;

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

public class GrinderpalahelpguiScreen extends AbstractContainerScreen<GrinderpalahelpguiMenu> {
	private final static HashMap<String, Object> guistate = GrinderpalahelpguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GrinderpalahelpguiScreen(GrinderpalahelpguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 210;
		this.imageHeight = 185;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/grinderpalahelpgui.png");

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
		this.blit(ms, this.leftPos + 6, this.topPos + 7, 0, 0, 32, 32, 32, 32);

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
		this.font.draw(poseStack, "Grinder", 85, 9, -12829636);
		this.font.draw(poseStack, "Le grinder est une machine permettant de", 3, 42, -12829636);
		this.font.draw(poseStack, "Certain outil dont le hammer,la fastsword", 0, 53, -12829636);
		this.font.draw(poseStack, "et la broadsword Vous pouvez y ajouter", 1, 66, -12829636);
		this.font.draw(poseStack, "des upgrade am\uFFFDliorent les outils", 2, 78, -12829636);
		this.font.draw(poseStack, "Fortune : permet de dupliquer les objet ", 2, 88, -256);
		this.font.draw(poseStack, "min\uFFFDs -) hammer", 3, 97, -256);
		this.font.draw(poseStack, "Smelt : cuit les minerais min\uFFFDs -) hammer", 2, 106, -8504309);
		this.font.draw(poseStack, "Speed : augmante la vitesse -) hammer", 2, 115, -816878);
		this.font.draw(poseStack, "", -5, 71, -12829636);
		this.font.draw(poseStack, "Flame : -) fire aspect pour fastsword et", 1, 125, -3335911);
		this.font.draw(poseStack, "Broadsword", 2, 133, -1826784);
		this.font.draw(poseStack, "Damage : augmante les d\uFFFDgats -) fastsword", 1, 141, -12829636);
		this.font.draw(poseStack, "+ broadsword", 1, 150, -12829636);
		this.font.draw(poseStack, "2 min 1/2", 159, 4, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 5, this.topPos + 159, 50, 20, Component.literal("next"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new GrinderpalahelpguiButtonMessage(0, x, y, z));
				GrinderpalahelpguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 63, this.topPos + 159, 45, 20, Component.literal("menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new GrinderpalahelpguiButtonMessage(1, x, y, z));
				GrinderpalahelpguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 124, this.topPos + 159, 45, 20, Component.literal("back"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new GrinderpalahelpguiButtonMessage(2, x, y, z));
				GrinderpalahelpguiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}
}
