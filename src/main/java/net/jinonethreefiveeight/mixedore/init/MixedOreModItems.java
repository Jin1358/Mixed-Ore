
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.jinonethreefiveeight.mixedore.init;

import net.jinonethreefiveeight.mixedore.item.RedStoneDustItem;
import net.jinonethreefiveeight.mixedore.item.NetheriteDustItem;
import net.jinonethreefiveeight.mixedore.item.MixedorehoeItem;
import net.jinonethreefiveeight.mixedore.item.MixedOreaItem;
import net.jinonethreefiveeight.mixedore.item.MixedOreSwordItem;
import net.jinonethreefiveeight.mixedore.item.MixedOreShovelItem;
import net.jinonethreefiveeight.mixedore.item.MixedOrePickAxeItem;
import net.jinonethreefiveeight.mixedore.item.MixedOreMeatIngotItem;
import net.jinonethreefiveeight.mixedore.item.MixedOreIngotItem;
import net.jinonethreefiveeight.mixedore.item.MixedOreBowItem;
import net.jinonethreefiveeight.mixedore.item.MixedOreAxeItem;
import net.jinonethreefiveeight.mixedore.item.MeatdustItem;
import net.jinonethreefiveeight.mixedore.item.LapisDustItem;
import net.jinonethreefiveeight.mixedore.item.IronDustItem;
import net.jinonethreefiveeight.mixedore.item.GoldDustItem;
import net.jinonethreefiveeight.mixedore.item.EmeraldDustItem;
import net.jinonethreefiveeight.mixedore.item.DiamondDustItem;
import net.jinonethreefiveeight.mixedore.item.CopperDustItem;
import net.jinonethreefiveeight.mixedore.item.CoalDustItem;
import net.jinonethreefiveeight.mixedore.MixedOreMod;

public class MixedOreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MixedOreMod.MODID);
	public static final RegistryObject<Item> COAL_DUST = REGISTRY.register("coal_dust", () -> new CoalDustItem());
	public static final RegistryObject<Item> COPPER_DUST = REGISTRY.register("copper_dust", () -> new CopperDustItem());
	public static final RegistryObject<Item> IRON_DUST = REGISTRY.register("iron_dust", () -> new IronDustItem());
	public static final RegistryObject<Item> GOLD_DUST = REGISTRY.register("gold_dust", () -> new GoldDustItem());
	public static final RegistryObject<Item> DIAMOND_DUST = REGISTRY.register("diamond_dust", () -> new DiamondDustItem());
	public static final RegistryObject<Item> RED_STONE_DUST = REGISTRY.register("red_stone_dust", () -> new RedStoneDustItem());
	public static final RegistryObject<Item> LAPIS_DUST = REGISTRY.register("lapis_dust", () -> new LapisDustItem());
	public static final RegistryObject<Item> EMERALD_DUST = REGISTRY.register("emerald_dust", () -> new EmeraldDustItem());
	public static final RegistryObject<Item> NETHERITE_DUST = REGISTRY.register("netherite_dust", () -> new NetheriteDustItem());
	public static final RegistryObject<Item> MEATDUST = REGISTRY.register("meatdust", () -> new MeatdustItem());
	public static final RegistryObject<Item> MIXED_ORE_INGOT = REGISTRY.register("mixed_ore_ingot", () -> new MixedOreIngotItem());
	public static final RegistryObject<Item> MIXED_ORE = block(MixedOreModBlocks.MIXED_ORE);
	public static final RegistryObject<Item> DEEPSLATE_MIXED_ORE = block(MixedOreModBlocks.DEEPSLATE_MIXED_ORE);
	public static final RegistryObject<Item> MIXED_ORE_BLOCK = block(MixedOreModBlocks.MIXED_ORE_BLOCK);
	public static final RegistryObject<Item> ORE_CRUSHER = block(MixedOreModBlocks.ORE_CRUSHER);
	public static final RegistryObject<Item> MIXED_OREA_HELMET = REGISTRY.register("mixed_orea_helmet", () -> new MixedOreaItem.Helmet());
	public static final RegistryObject<Item> MIXED_OREA_CHESTPLATE = REGISTRY.register("mixed_orea_chestplate", () -> new MixedOreaItem.Chestplate());
	public static final RegistryObject<Item> MIXED_OREA_LEGGINGS = REGISTRY.register("mixed_orea_leggings", () -> new MixedOreaItem.Leggings());
	public static final RegistryObject<Item> MIXED_OREA_BOOTS = REGISTRY.register("mixed_orea_boots", () -> new MixedOreaItem.Boots());
	public static final RegistryObject<Item> MIXED_ORE_SWORD = REGISTRY.register("mixed_ore_sword", () -> new MixedOreSwordItem());
	public static final RegistryObject<Item> MIXED_ORE_PICK_AXE = REGISTRY.register("mixed_ore_pick_axe", () -> new MixedOrePickAxeItem());
	public static final RegistryObject<Item> MIXED_ORE_AXE = REGISTRY.register("mixed_ore_axe", () -> new MixedOreAxeItem());
	public static final RegistryObject<Item> MIXED_ORE_SHOVEL = REGISTRY.register("mixed_ore_shovel", () -> new MixedOreShovelItem());
	public static final RegistryObject<Item> MIXEDOREHOE = REGISTRY.register("mixedorehoe", () -> new MixedorehoeItem());
	public static final RegistryObject<Item> MIXED_ORE_BOW = REGISTRY.register("mixed_ore_bow", () -> new MixedOreBowItem());
	public static final RegistryObject<Item> MIXED_ORE_MEAT_INGOT = REGISTRY.register("mixed_ore_meat_ingot", () -> new MixedOreMeatIngotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
