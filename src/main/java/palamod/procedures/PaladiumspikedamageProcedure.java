package palamod.procedures;

import palamod.network.PalamodModVariables;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class PaladiumspikedamageProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (PalamodModVariables.cooltick_spike == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("spike.paladium").bypassArmor(), 8);
			PalamodModVariables.cooltick_spike = 20;
		} else {
			PalamodModVariables.cooltick_spike = PalamodModVariables.cooltick_spike - 1;
		}
	}
}
