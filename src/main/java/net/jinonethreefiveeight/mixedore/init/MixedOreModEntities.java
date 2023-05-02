
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.jinonethreefiveeight.mixedore.init;

import net.jinonethreefiveeight.mixedore.entity.MixedOreBowEntity;
import net.jinonethreefiveeight.mixedore.MixedOreMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MixedOreModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MixedOreMod.MODID);
	public static final RegistryObject<EntityType<MixedOreBowEntity>> MIXED_ORE_BOW = register("projectile_mixed_ore_bow",
			EntityType.Builder.<MixedOreBowEntity>of(MixedOreBowEntity::new, MobCategory.MISC).setCustomClientFactory(MixedOreBowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
