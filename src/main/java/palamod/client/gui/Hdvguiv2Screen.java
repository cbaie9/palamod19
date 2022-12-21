
package palamod.client.gui;

import palamod.world.inventory.Hdvguiv2Menu;

import palamod.network.PalamodModVariables;
import palamod.network.Hdvguiv2ButtonMessage;

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

public class Hdvguiv2Screen extends AbstractContainerScreen<Hdvguiv2Menu> {
	private final static HashMap<String, Object> guistate = Hdvguiv2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox bdr_hdv;

	public Hdvguiv2Screen(Hdvguiv2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/hdvguiv_2.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		bdr_hdv.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("palamod:textures/screens/beta_block.png"));
		this.blit(ms, this.leftPos + 276, this.topPos + 4, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (bdr_hdv.isFocused())
			return bdr_hdv.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		bdr_hdv.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Hdv v2 build 170038", 5, 6, -12829636);
		this.font.draw(poseStack, "" + (int) (PalamodModVariables.MapVariables.get(world).hdv_price1) + "", 31, 21, -12829636);
		this.font.draw(poseStack, "" + (int) (PalamodModVariables.MapVariables.get(world).hdv_price2) + "", 28, 63, -12829636);
		this.font.draw(poseStack, "" + (int) (PalamodModVariables.MapVariables.get(world).hdv_price3) + "", 176, 19, -12829636);
		this.font.draw(poseStack, "" + (int) (PalamodModVariables.MapVariables.get(world).hdv_price4) + "", 173, 66, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 9, this.topPos + 40, 61, 20, Component.literal("Acheter"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Hdvguiv2ButtonMessage(0, x, y, z));
				Hdvguiv2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 153, this.topPos + 39, 61, 20, Component.literal("Acheter"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Hdvguiv2ButtonMessage(1, x, y, z));
				Hdvguiv2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		bdr_hdv = new EditBox(this.font, this.leftPos + 4, this.topPos + 154, 120, 20, Component.literal("Search in Hdv")) {
			{
				setSuggestion("Search in Hdv");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("Search in Hdv");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("Search in Hdv");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:bdr_hdv", bdr_hdv);
		bdr_hdv.setMaxLength(32767);
		this.addWidget(this.bdr_hdv);
		this.addRenderableWidget(new Button(this.leftPos + 22, this.topPos + 175, 77, 20, Component.literal("Rechercher"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 10, this.topPos + 131, 46, 20, Component.literal("Vendre"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Hdvguiv2ButtonMessage(3, x, y, z));
				Hdvguiv2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 68, this.topPos + 131, 46, 20, Component.literal("Aide"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new Hdvguiv2ButtonMessage(4, x, y, z));
				Hdvguiv2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 9, this.topPos + 81, 61, 20, Component.literal("acheter"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 153, this.topPos + 81, 61, 20, Component.literal("acheter"), e -> {
		}));
	}
}
