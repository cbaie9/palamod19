package palamod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.Screen;

public class Elevator_processProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double add_num = 0;
		double y_pos = 0;
		if (Screen.hasShiftDown()) {
			y_pos = y;
			add_num = 1;
			for (int index0 = 0; index0 < (int) (320); index0++) {
				if ((world.getBlockState(new BlockPos(x, y_pos - add_num, z))).is(BlockTags.create(new ResourceLocation("palamod:elevator")))) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, (y_pos - add_num + 1), z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, (y_pos - add_num + 1), z, _ent.getYRot(), _ent.getXRot());
					}
					entity.getPersistentData().putDouble("elevator_cooldown", 10);
					break;
				} else {
					add_num = add_num + 1;
					continue;
				}
			}
		} else if (Screen.hasControlDown()) {
			y_pos = y;
			add_num = 1;
			for (int index1 = 0; index1 < (int) (320); index1++) {
				if ((world.getBlockState(new BlockPos(x, y_pos + add_num, z))).is(BlockTags.create(new ResourceLocation("palamod:elevator")))) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, (y_pos + add_num + 1), z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, (y_pos + add_num + 1), z, _ent.getYRot(), _ent.getXRot());
					}
					entity.getPersistentData().putDouble("elevator_cooldown", 10);
					break;
				} else {
					add_num = add_num + 1;
					continue;
				}
			}
		} else {
			entity.getPersistentData().putDouble("elevator_cooldown", (entity.getPersistentData().getDouble("elevator_cooldown") - 1));
		}
	}
}
