
package palamod.client.gui;

import palamod.world.inventory.CrusherpalahelpguiMenu;

import palamod.network.CrusherpalahelpguiButtonMessage;

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

public class CrusherpalahelpguiScreen extends AbstractContainerScreen<CrusherpalahelpguiMenu> {
	private final static HashMap<String, Object> guistate = CrusherpalahelpguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CrusherpalahelpguiScreen(CrusherpalahelpguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/crusherpalahelpgui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/crusher_front.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 6, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/4crusher1.png"));
		this.blit(ms, this.leftPos + 223, this.topPos + 1, 0, 0, 174, 100, 174, 100);

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
		this.font.draw(poseStack, "Paladium crusher wiki", 101, 3, -65485);
		this.font.draw(poseStack, "Voici le crusher, la machine permetant, avec", 2, 29, -12829636);
		this.font.draw(poseStack, "des fruit de fabriquer des minerais dont", 1, 42, -12829636);
		this.font.draw(poseStack, "l'endium entre autre. Le principe est simple", 2, 54, -12829636);
		this.font.draw(poseStack, "Il faut mettre du fuel* et des fruit dans le", 2, 66, -12829636);
		this.font.draw(poseStack, "crusher. Le fuel est soit le gold mixed coal,", 1, 78, -12829636);
		this.font.draw(poseStack, "( am\uFFFDthyste ) soit l'am\uFFFDthyste mixed coal,", 1, 89, -12829636);
		this.font.draw(poseStack, "( titane ) soit le titane mixed coal ( paladium) ou le palamixed coal pour", 0, 101, -12829636);
		this.font.draw(poseStack, "L'endium. Pour celui-ci il faudra ins\uFFFDrer 128 palamixed et 128 orangeblue puis", 3, 113, -12829636);
		this.font.draw(poseStack, "Fruit ici", 248, 59, -256);
		this.font.draw(poseStack, "R\uFFFDsultat ici", 307, 59, -16776961);
		this.font.draw(poseStack, "Appuyer sur le bouton \"start fusion\" vous donnera 1 nugget quand tout les", 2, 126, -12829636);
		this.font.draw(poseStack, "\uFFFDl\uFFFDment auront \uFFFDt\uFFFD ins\uFFFDr\uFFFDs.", 1, 138, -12829636);
		this.font.draw(poseStack, "Note : vous n'\uFFFDtes pas obliger d'ins\uFFFDr\uFFFD 128 de chaque mais il aura une chance", 3, 149, -26368);
		this.font.draw(poseStack, "que le nugget n'apparaise [ probabilit\uFFFD \uFFFDtant la chance que le nugget appairaise", 0, 158, -26368);
		this.font.draw(poseStack, "et 128 \uFFFDtant 100% de chance  ] pas", 4, 168, -26368);
		this.font.draw(poseStack, "1/1 v1", 364, 183, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 186, this.topPos + 171, 45, 20, Component.literal("back"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new CrusherpalahelpguiButtonMessage(0, x, y, z));
				CrusherpalahelpguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 237, this.topPos + 171, 45, 20, Component.literal("menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new CrusherpalahelpguiButtonMessage(1, x, y, z));
				CrusherpalahelpguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
