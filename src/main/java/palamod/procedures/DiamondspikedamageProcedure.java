package palamod.procedures;

import palamod.network.PalamodModVariables;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class DiamondspikedamageProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (PalamodModVariables.cooltick_spike == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("spike.diamond").bypassArmor(), 3);
			PalamodModVariables.cooltick_spike = 50;
		} else {
			PalamodModVariables.cooltick_spike = PalamodModVariables.alchemy - 1;
		}
	}
}
