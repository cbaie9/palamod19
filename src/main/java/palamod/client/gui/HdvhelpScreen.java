
package palamod.client.gui;

import palamod.world.inventory.HdvhelpMenu;

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

public class HdvhelpScreen extends AbstractContainerScreen<HdvhelpMenu> {
	private final static HashMap<String, Object> guistate = HdvhelpMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public HdvhelpScreen(HdvhelpMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 280;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/hdvhelp.png");

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
		this.font.draw(poseStack, "H\u00F4tel de vente - aide", 19, 4, -12829636);
		this.font.draw(poseStack, "L'h\u00F4tel de vente est un endroit o\u00F9 les joueurs", 18, 27, -10066330);
		this.font.draw(poseStack, "vendent et s'ach\u00E8tent  des items de diff\u00E9rente", 19, 37, -10066330);
		this.font.draw(poseStack, "valeur de fa\u00E7on s\u00E9curis\u00E9 sans interaction direct", 16, 47, -10066330);
		this.font.draw(poseStack, "entre les joueurs", 17, 57, -10066330);
		this.font.draw(poseStack, "Pour mettre en vente un objet cliquez sur ", 18, 77, -12829636);
		this.font.draw(poseStack, "l'onglet correspondant mettez l'item \u00E0 vendre ", 18, 88, -12829636);
		this.font.draw(poseStack, "dans le slot puis s\u00E9l\u00E8ctionn\u00E9 le prix et le", 18, 98, -12829636);
		this.font.draw(poseStack, "nom qui sera affich\u00E9", 18, 109, -12829636);
		this.font.draw(poseStack, "Pour acheter, trouvez un item interessant puis,", 17, 135, -12829636);
		this.font.draw(poseStack, "appuyer le bouton 'buy' puis confimer votre", 17, 144, -12829636);
		this.font.draw(poseStack, "choix", 18, 155, -12829636);
		this.font.draw(poseStack, "Vente", 17, 67, -16751104);
		this.font.draw(poseStack, "Achat", 16, 125, -3407821);
		this.font.draw(poseStack, "Toute anarque n'est pas de notre faute sauf si  ", 16, 168, -16777012);
		this.font.draw(poseStack, "Bug Les exploit sont souvent des mods ou hack non", 16, 176, -16777012);
		this.font.draw(poseStack, "pr\u00E9vue Soyez prudent", 17, 185, -16777012);
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
