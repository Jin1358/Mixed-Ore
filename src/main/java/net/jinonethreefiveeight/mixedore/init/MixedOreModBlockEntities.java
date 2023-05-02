
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.jinonethreefiveeight.mixedore.init;

import net.jinonethreefiveeight.mixedore.block.entity.OreCrusherBlockEntity;
import net.jinonethreefiveeight.mixedore.MixedOreMod;

public class MixedOreModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MixedOreMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ORE_CRUSHER = register("ore_crusher", MixedOreModBlocks.ORE_CRUSHER, OreCrusherBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
