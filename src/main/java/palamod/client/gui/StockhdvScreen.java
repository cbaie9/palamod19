
package palamod.client.gui;

import palamod.world.inventory.StockhdvMenu;

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

public class StockhdvScreen extends AbstractContainerScreen<StockhdvMenu> {
	private final static HashMap<String, Object> guistate = StockhdvMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public StockhdvScreen(StockhdvMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 425;
		this.imageHeight = 240;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/stockhdv.png");

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
		this.font.draw(poseStack, "0  1   2   3  4   5   6   7  8  9  10  11 12  13 14  15 16  17  18  19  20 21 22", 4, 4, -12829636);
		this.font.draw(poseStack, "23 24  25  26 27  28  29 30 31  32  33 34 35  36 37  38 39  40 41  42  43 44 45", 4, 32, -12829636);
		this.font.draw(poseStack, "46 47 48  49  50 51  52 53  54  55 56 57  58 59  60  61 62 63 64  65 66  67  68", 8, 59, -12829636);
		this.font.draw(poseStack, "Inventory ", 246, 142, -12829636);
		this.font.draw(poseStack, "Stocks hdv items - 0 10 0 ", 248, 131, -12829636);
		this.font.draw(poseStack, "69 70 71  72  73  74  75 76 77 78 79  80  81  82 83  84 85  86 87  88  89 90 91", 7, 87, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 115, this.topPos + 213, 134, 20, Component.literal("Return to Admin Panel"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 4, this.topPos + 213, 108, 20, Component.literal("Quit Admin Panel"), e -> {
		}));
	}
}
