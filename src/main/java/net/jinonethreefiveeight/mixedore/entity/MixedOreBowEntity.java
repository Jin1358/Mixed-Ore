
package net.jinonethreefiveeight.mixedore.entity;

import net.jinonethreefiveeight.mixedore.procedures.Xg2Procedure;
import net.jinonethreefiveeight.mixedore.init.MixedOreModItems;
import net.jinonethreefiveeight.mixedore.init.MixedOreModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class MixedOreBowEntity extends AbstractArrow implements ItemSupplier {
	public MixedOreBowEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(MixedOreModEntities.MIXED_ORE_BOW.get(), world);
	}

	public MixedOreBowEntity(EntityType<? extends MixedOreBowEntity> type, Level world) {
		super(type, world);
	}

	public MixedOreBowEntity(EntityType<? extends MixedOreBowEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public MixedOreBowEntity(EntityType<? extends MixedOreBowEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(MixedOreModItems.MIXED_ORE_INGOT.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(MixedOreModItems.MIXED_ORE_INGOT.get());
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		Xg2Procedure.execute(entityHitResult.getEntity());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static MixedOreBowEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		MixedOreBowEntity entityarrow = new MixedOreBowEntity(MixedOreModEntities.MIXED_ORE_BOW.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static MixedOreBowEntity shoot(LivingEntity entity, LivingEntity target) {
		MixedOreBowEntity entityarrow = new MixedOreBowEntity(MixedOreModEntities.MIXED_ORE_BOW.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 2.91f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(7.199000000000001);
		entityarrow.setKnockback(6);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
