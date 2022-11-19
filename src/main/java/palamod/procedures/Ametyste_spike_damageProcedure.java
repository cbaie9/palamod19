package palamod.procedures;

import palamod.network.PalamodModVariables;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class Ametyste_spike_damageProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (PalamodModVariables.cooltick_spike == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("spike.amethyste").bypassArmor(), 4);
			PalamodModVariables.cooltick_spike = 20;
		} else {
			PalamodModVariables.cooltick_spike = PalamodModVariables.cooltick_spike - 1;
		}
	}
}
