package net.jinonethreefiveeight.mixedore.procedures;

public class Xg3Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, false, false));
	}
}
