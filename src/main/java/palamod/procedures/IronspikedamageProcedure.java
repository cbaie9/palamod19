package palamod.procedures;

import palamod.network.PalamodModVariables;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class IronspikedamageProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (PalamodModVariables.cooltick_spike == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("spike.iron").bypassArmor(), 1);
			PalamodModVariables.crusher_num_var = 70;
		}
	}
}
