
package palamod.client.gui;

import palamod.world.inventory.CrusherpalahelpguienMenu;

import palamod.network.CrusherpalahelpguienButtonMessage;

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

public class CrusherpalahelpguienScreen extends AbstractContainerScreen<CrusherpalahelpguienMenu> {
	private final static HashMap<String, Object> guistate = CrusherpalahelpguienMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CrusherpalahelpguienScreen(CrusherpalahelpguienMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 425;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/crusherpalahelpguien.png");

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
		this.blit(ms, this.leftPos + 19, this.topPos + 6, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/4crusher1.png"));
		this.blit(ms, this.leftPos + 250, this.topPos + 1, 0, 0, 174, 100, 174, 100);

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
		this.font.draw(poseStack, "Paladium crusher wiki", 114, 3, -65485);
		this.font.draw(poseStack, "This is the crusher The machine can crusher", 15, 29, -12829636);
		this.font.draw(poseStack, "fruit for making rare item ( ore )", 14, 42, -12829636);
		this.font.draw(poseStack, "and endium, the most powerful ingot in this", 15, 54, -12829636);
		this.font.draw(poseStack, "Mod For this you will need ore mixed coal", 15, 66, -12829636);
		this.font.draw(poseStack, "for fuel. For exemple the endium need ", 14, 78, -12829636);
		this.font.draw(poseStack, "Palamixed coal, for paladium the titane", 14, 89, -12829636);
		this.font.draw(poseStack, "The titane mixed coal, for titane the amethyst mixed coal and finally for", 12, 101, -12829636);
		this.font.draw(poseStack, "amethyst the gold mixed coal Add fuel and fruits for add probabilites ", 16, 113, -12829636);
		this.font.draw(poseStack, "Fruit here", 261, 59, -256);
		this.font.draw(poseStack, "R\uFFFDsult here", 323, 60, -16776961);
		this.font.draw(poseStack, "One times you are ready to lunch the process click on \"start fusion\"", 15, 126, -12829636);
		this.font.draw(poseStack, "The endium will be creating with the previous items and the result  will appear", 5, 138, -12829636);
		this.font.draw(poseStack, "Note : It not mandatory to put 128 fruit and mixed coal but you will not have", 13, 149, -26368);
		this.font.draw(poseStack, "100% Chance and could not have the result [ Check probabilities ] and 128 is", 13, 158, -26368);
		this.font.draw(poseStack, "equal to 100%", 17, 168, -26368);
		this.font.draw(poseStack, "1/1 v1", 377, 183, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 199, this.topPos + 171, 45, 20, Component.literal("back"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new CrusherpalahelpguienButtonMessage(0, x, y, z));
				CrusherpalahelpguienButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 250, this.topPos + 171, 45, 20, Component.literal("menu"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new CrusherpalahelpguienButtonMessage(1, x, y, z));
				CrusherpalahelpguienButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
