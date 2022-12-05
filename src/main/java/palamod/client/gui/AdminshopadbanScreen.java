
package palamod.client.gui;

import palamod.world.inventory.AdminshopadbanMenu;

import palamod.network.AdminshopadbanButtonMessage;

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

public class AdminshopadbanScreen extends AbstractContainerScreen<AdminshopadbanMenu> {
	private final static HashMap<String, Object> guistate = AdminshopadbanMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AdminshopadbanScreen(AdminshopadbanMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 350;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/adminshopadban.png");

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
		this.font.draw(poseStack, "L'admininshop a \u00E9t\u00E9 abandonn\u00E9", 100, 10, -12829636);
		this.font.draw(poseStack, "a cause du bug du non- fonctionnement", 86, 22, -12829636);
		this.font.draw(poseStack, "du  /hdv", 87, 34, -12829636);
		this.font.draw(poseStack, "Si vous trouvez le bug https://github.com/cbaie9/palamod19", 26, 64, -12829636);
		this.font.draw(poseStack, "Vous pouvez me le report en mp ou sur le serveur discord", 25, 75, -12829636);
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
		this.addRenderableWidget(
				new Button(this.leftPos + 85, this.topPos + 134, 192, 20, Component.literal("Accèder a l'alpha de l'adminshop"), e -> {
					if (true) {
						PalamodMod.PACKET_HANDLER.sendToServer(new AdminshopadbanButtonMessage(0, x, y, z));
						AdminshopadbanButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}));
	}
}
