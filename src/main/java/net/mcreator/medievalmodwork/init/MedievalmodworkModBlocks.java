
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.medievalmodwork.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.medievalmodwork.block.TinOreBlock;
import net.mcreator.medievalmodwork.block.TinBlockBlock;
import net.mcreator.medievalmodwork.block.SteelOreBlock;
import net.mcreator.medievalmodwork.block.SteelBlockBlock;
import net.mcreator.medievalmodwork.block.LargeSteelBlockBlock;
import net.mcreator.medievalmodwork.block.BronzeBlockBlock;
import net.mcreator.medievalmodwork.MedievalmodworkMod;

public class MedievalmodworkModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MedievalmodworkMod.MODID);
	public static final RegistryObject<Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", () -> new BronzeBlockBlock());
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final RegistryObject<Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new TinBlockBlock());
	public static final RegistryObject<Block> STEEL_ORE = REGISTRY.register("steel_ore", () -> new SteelOreBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> LARGE_STEEL_BLOCK = REGISTRY.register("large_steel_block", () -> new LargeSteelBlockBlock());
}
