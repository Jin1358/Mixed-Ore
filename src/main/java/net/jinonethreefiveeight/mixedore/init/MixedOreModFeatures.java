
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.jinonethreefiveeight.mixedore.init;

import net.jinonethreefiveeight.mixedore.world.features.ores.MixedOreFeature;
import net.jinonethreefiveeight.mixedore.world.features.ores.DeepslateMixedOreFeature;
import net.jinonethreefiveeight.mixedore.MixedOreMod;

@Mod.EventBusSubscriber
public class MixedOreModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MixedOreMod.MODID);
	public static final RegistryObject<Feature<?>> MIXED_ORE = REGISTRY.register("mixed_ore", MixedOreFeature::new);
	public static final RegistryObject<Feature<?>> DEEPSLATE_MIXED_ORE = REGISTRY.register("deepslate_mixed_ore", DeepslateMixedOreFeature::new);
}
