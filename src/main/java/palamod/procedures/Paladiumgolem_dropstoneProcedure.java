package palamod.procedures;

import palamod.init.PalamodModItems;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class Paladiumgolem_dropstoneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level && !_level.isClientSide()) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(PalamodModItems.GUARDIANSTONE.get()));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
		(new ItemStack(PalamodModItems.GUARDIANSTONE.get())).setHoverName(
				Component.literal(("Guardian stone - Contain " + entity.getPersistentData().getDouble("Golem_level") + " level Golem")));
		new ItemStack(PalamodModItems.GUARDIANSTONE.get()).getOrCreateTag().putBoolean("golem_kac", (true));
		new ItemStack(PalamodModItems.GUARDIANSTONE.get()).getOrCreateTag().putDouble("golem_level",
				(entity.getPersistentData().getDouble("Golem_level")));
		if (true) {
			new ItemStack(PalamodModItems.GUARDIANSTONE.get()).getOrCreateTag().putBoolean("golem_whitelist", (true));
		}
		if (true) {
			new ItemStack(PalamodModItems.GUARDIANSTONE.get()).getOrCreateTag().putBoolean("golem_name", (true));
		}
		new ItemStack(PalamodModItems.GUARDIANSTONE.get()).getOrCreateTag().putBoolean("golem_name", (true));
	}
}
