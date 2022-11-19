
package palamod.client.gui;

import palamod.world.inventory.MegasafechestfirstsetupMenu;

import palamod.network.MegasafechestfirstsetupButtonMessage;

import palamod.PalamodMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MegasafechestfirstsetupScreen extends AbstractContainerScreen<MegasafechestfirstsetupMenu> {
	private final static HashMap<String, Object> guistate = MegasafechestfirstsetupMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox safe_code;
	Checkbox safe_link;

	public MegasafechestfirstsetupScreen(MegasafechestfirstsetupMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("palamod:textures/screens/megasafechestfirstsetup.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		safe_code.render(ms, mouseX, mouseY, partialTicks);
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
		if (safe_code.isFocused())
			return safe_code.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		safe_code.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Safe setup", 55, 6, -13434625);
		this.font.draw(poseStack, "1. enter future code of the safe", 4, 25, -12829636);
		this.font.draw(poseStack, "2.Do you want link safe with", 3, 64, -12829636);
		this.font.draw(poseStack, "this account ( bypass the code ", 2, 75, -12829636);
		this.font.draw(poseStack, "it you )", 3, 85, -12829636);
		this.font.draw(poseStack, "3. Save ", 5, 122, -12829636);
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
		safe_code = new EditBox(this.font, this.leftPos + 8, this.topPos + 42, 120, 20,
				Component.literal("insert code ( chose something wou will not forget )")) {
			{
				setSuggestion("insert code ( chose something wou will not forget )");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("insert code ( chose something wou will not forget )");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("insert code ( chose something wou will not forget )");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:safe_code", safe_code);
		safe_code.setMaxLength(32767);
		this.addWidget(this.safe_code);
		safe_link = new Checkbox(this.leftPos + 5, this.topPos + 100, 20, 20, Component.literal("link account"), false);
		guistate.put("checkbox:safe_link", safe_link);
		this.addRenderableWidget(safe_link);
		this.addRenderableWidget(new Button(this.leftPos + 26, this.topPos + 135, 46, 20, Component.literal("save"), e -> {
			if (true) {
				PalamodMod.PACKET_HANDLER.sendToServer(new MegasafechestfirstsetupButtonMessage(0, x, y, z));
				MegasafechestfirstsetupButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
