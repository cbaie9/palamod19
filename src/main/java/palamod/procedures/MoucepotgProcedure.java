package palamod.procedures;

import palamod.PalamodMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class MoucepotgProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 2000000) {
			(itemstack).setHoverName(Component.literal("Fully upgraded - Level 20"));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 1000000) {
			(itemstack).setHoverName(Component.literal(((2000000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 19")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 800000) {
			(itemstack).setHoverName(Component.literal(((1000000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 18")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 700000) {
			(itemstack).setHoverName(Component.literal(((800000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 17")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 600000) {
			(itemstack).setHoverName(Component.literal(((700000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 16")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 500000) {
			(itemstack).setHoverName(Component.literal(((600000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 15")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 400000) {
			(itemstack).setHoverName(Component.literal(((500000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 14")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 250000) {
			(itemstack).setHoverName(Component.literal(((400000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 13")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 150000) {
			(itemstack).setHoverName(Component.literal(((250000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 12")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 100000) {
			(itemstack).setHoverName(Component.literal(((150000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 11")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 50000) {
			(itemstack).setHoverName(Component.literal(((100000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 10")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 25000) {
			(itemstack).setHoverName(Component.literal(((50000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 9")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 10000) {
			(itemstack).setHoverName(Component.literal(((25000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 8")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 5000) {
			(itemstack).setHoverName(Component.literal(((10000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 7")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 2000) {
			(itemstack).setHoverName(Component.literal(((5000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 6")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 1000) {
			(itemstack).setHoverName(Component.literal(((2000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 5")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 500) {
			(itemstack).setHoverName(Component.literal(((1000 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 4")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 250) {
			(itemstack).setHoverName(Component.literal(((500 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 3")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 100) {
			(itemstack).setHoverName(Component.literal(((250 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 2")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		} else if (entity.getPersistentData().getDouble("Pickaxe_stone") >= 1) {
			(itemstack).setHoverName(Component.literal(((100 - entity.getPersistentData().getDouble("Pickaxe_stone")) + "Left - Level 1")));
			PalamodMod.queueServerWork(20, () -> {
				(itemstack).setHoverName(Component.literal("Pickaxe of the gods"));
			});
		}
	}
}
