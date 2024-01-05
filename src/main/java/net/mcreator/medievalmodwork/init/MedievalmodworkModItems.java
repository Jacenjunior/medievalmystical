
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.medievalmodwork.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.medievalmodwork.item.TinIngotItem;
import net.mcreator.medievalmodwork.item.StoneSpearItem;
import net.mcreator.medievalmodwork.item.SteelItem;
import net.mcreator.medievalmodwork.item.LargeSteelItem;
import net.mcreator.medievalmodwork.item.HardSteelSwordItem;
import net.mcreator.medievalmodwork.item.HardSteelShovelItem;
import net.mcreator.medievalmodwork.item.HardSteelPickaxeItem;
import net.mcreator.medievalmodwork.item.HardSteelHoeItem;
import net.mcreator.medievalmodwork.item.HardSteelAxeItem;
import net.mcreator.medievalmodwork.item.HardSteelArmorItem;
import net.mcreator.medievalmodwork.item.CopperShovelItem;
import net.mcreator.medievalmodwork.item.CopperPickaxeItem;
import net.mcreator.medievalmodwork.item.CopperHoeItem;
import net.mcreator.medievalmodwork.item.CopperAxeItem;
import net.mcreator.medievalmodwork.item.CooperSwordItem;
import net.mcreator.medievalmodwork.item.BronzeIngotItem;
import net.mcreator.medievalmodwork.item.BronzeArmorItem;
import net.mcreator.medievalmodwork.MedievalmodworkMod;

public class MedievalmodworkModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MedievalmodworkMod.MODID);
	public static final RegistryObject<Item> COOPER_SWORD = REGISTRY.register("cooper_sword", () -> new CooperSwordItem());
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final RegistryObject<Item> BRONZE_BLOCK = block(MedievalmodworkModBlocks.BRONZE_BLOCK);
	public static final RegistryObject<Item> BRONZE_INGOT = REGISTRY.register("bronze_ingot", () -> new BronzeIngotItem());
	public static final RegistryObject<Item> BRONZE_ARMOR_HELMET = REGISTRY.register("bronze_armor_helmet", () -> new BronzeArmorItem.Helmet());
	public static final RegistryObject<Item> BRONZE_ARMOR_CHESTPLATE = REGISTRY.register("bronze_armor_chestplate", () -> new BronzeArmorItem.Chestplate());
	public static final RegistryObject<Item> BRONZE_ARMOR_LEGGINGS = REGISTRY.register("bronze_armor_leggings", () -> new BronzeArmorItem.Leggings());
	public static final RegistryObject<Item> BRONZE_ARMOR_BOOTS = REGISTRY.register("bronze_armor_boots", () -> new BronzeArmorItem.Boots());
	public static final RegistryObject<Item> TIN_ORE = block(MedievalmodworkModBlocks.TIN_ORE);
	public static final RegistryObject<Item> TIN_BLOCK = block(MedievalmodworkModBlocks.TIN_BLOCK);
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
	public static final RegistryObject<Item> STEEL_ORE = block(MedievalmodworkModBlocks.STEEL_ORE);
	public static final RegistryObject<Item> STEEL_BLOCK = block(MedievalmodworkModBlocks.STEEL_BLOCK);
	public static final RegistryObject<Item> STEEL = REGISTRY.register("steel", () -> new SteelItem());
	public static final RegistryObject<Item> LARGE_STEEL = REGISTRY.register("large_steel", () -> new LargeSteelItem());
	public static final RegistryObject<Item> LARGE_STEEL_BLOCK = block(MedievalmodworkModBlocks.LARGE_STEEL_BLOCK);
	public static final RegistryObject<Item> HARD_STEEL_ARMOR_HELMET = REGISTRY.register("hard_steel_armor_helmet", () -> new HardSteelArmorItem.Helmet());
	public static final RegistryObject<Item> HARD_STEEL_ARMOR_CHESTPLATE = REGISTRY.register("hard_steel_armor_chestplate", () -> new HardSteelArmorItem.Chestplate());
	public static final RegistryObject<Item> HARD_STEEL_ARMOR_LEGGINGS = REGISTRY.register("hard_steel_armor_leggings", () -> new HardSteelArmorItem.Leggings());
	public static final RegistryObject<Item> HARD_STEEL_ARMOR_BOOTS = REGISTRY.register("hard_steel_armor_boots", () -> new HardSteelArmorItem.Boots());
	public static final RegistryObject<Item> HARD_STEEL_PICKAXE = REGISTRY.register("hard_steel_pickaxe", () -> new HardSteelPickaxeItem());
	public static final RegistryObject<Item> HARD_STEEL_AXE = REGISTRY.register("hard_steel_axe", () -> new HardSteelAxeItem());
	public static final RegistryObject<Item> HARD_STEEL_SWORD = REGISTRY.register("hard_steel_sword", () -> new HardSteelSwordItem());
	public static final RegistryObject<Item> HARD_STEEL_SHOVEL = REGISTRY.register("hard_steel_shovel", () -> new HardSteelShovelItem());
	public static final RegistryObject<Item> HARD_STEEL_HOE = REGISTRY.register("hard_steel_hoe", () -> new HardSteelHoeItem());
	public static final RegistryObject<Item> STONE_SPEAR = REGISTRY.register("stone_spear", () -> new StoneSpearItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
