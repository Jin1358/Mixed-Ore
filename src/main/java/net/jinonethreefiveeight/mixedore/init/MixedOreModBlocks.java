
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.jinonethreefiveeight.mixedore.init;

import net.jinonethreefiveeight.mixedore.block.OreCrusherBlock;
import net.jinonethreefiveeight.mixedore.block.MixedOreBlockBlock;
import net.jinonethreefiveeight.mixedore.block.MixedOreBlock;
import net.jinonethreefiveeight.mixedore.block.DeepslateMixedOreBlock;
import net.jinonethreefiveeight.mixedore.MixedOreMod;

public class MixedOreModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MixedOreMod.MODID);
	public static final RegistryObject<Block> MIXED_ORE = REGISTRY.register("mixed_ore", () -> new MixedOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_MIXED_ORE = REGISTRY.register("deepslate_mixed_ore", () -> new DeepslateMixedOreBlock());
	public static final RegistryObject<Block> MIXED_ORE_BLOCK = REGISTRY.register("mixed_ore_block", () -> new MixedOreBlockBlock());
	public static final RegistryObject<Block> ORE_CRUSHER = REGISTRY.register("ore_crusher", () -> new OreCrusherBlock());
}
