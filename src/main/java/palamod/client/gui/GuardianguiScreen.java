
package palamod.client.gui;

import palamod.world.inventory.GuardianguiMenu;

import palamod.network.PalamodModVariables;

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

public class GuardianguiScreen extends AbstractContainerScreen<GuardianguiMenu> {
	private final static HashMap<String, Object> guistate = GuardianguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GuardianguiScreen(GuardianguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 310;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/guardiangui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/golem_blackground.png"));
		this.blit(ms, this.leftPos + 21, this.topPos + 6, 0, 0, 64, 128, 64, 128);

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
		this.font.draw(poseStack, "D\u00E9gats", 215, 67, -12829636);
		this.font.draw(poseStack, "Pv", 273, 67, -12829636);
		this.font.draw(poseStack, "Golem", 140, 8, -12829636);
		this.font.draw(poseStack, "Level ", 125, 29, -12829636);
		this.font.draw(poseStack, "Renommer", 112, 69, -256);
		this.font.draw(poseStack, "Whitelist", 158, 70, -65536);
		this.font.draw(poseStack, "" + (PalamodModVariables.Golem_level) + "", 156, 29, -65485);
		this.font.draw(poseStack, "" + (PalamodModVariables.Golem_pv) + "", 258, 86, -65434);
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
		this.addRenderableWidget(new Button(this.leftPos + 4, this.topPos + 139, 124, 20, Component.literal("Arbre de compétance"), e -> {
		}));
	}
}
