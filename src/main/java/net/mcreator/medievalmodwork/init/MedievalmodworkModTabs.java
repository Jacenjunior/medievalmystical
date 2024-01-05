
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.medievalmodwork.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.medievalmodwork.MedievalmodworkMod;

public class MedievalmodworkModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MedievalmodworkMod.MODID);
	public static final RegistryObject<CreativeModeTab> MEDIEVAL_ADDS = REGISTRY.register("medieval_adds",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.medievalmodwork.medieval_adds")).icon(() -> new ItemStack(Blocks.BEDROCK)).displayItems((parameters, tabData) -> {
				tabData.accept(MedievalmodworkModItems.COOPER_SWORD.get());
				tabData.accept(MedievalmodworkModItems.COPPER_PICKAXE.get());
				tabData.accept(MedievalmodworkModItems.COPPER_AXE.get());
				tabData.accept(MedievalmodworkModItems.COPPER_HOE.get());
				tabData.accept(MedievalmodworkModItems.COPPER_SHOVEL.get());
				tabData.accept(MedievalmodworkModBlocks.BRONZE_BLOCK.get().asItem());
				tabData.accept(MedievalmodworkModItems.BRONZE_INGOT.get());
				tabData.accept(MedievalmodworkModItems.BRONZE_ARMOR_HELMET.get());
				tabData.accept(MedievalmodworkModItems.BRONZE_ARMOR_CHESTPLATE.get());
				tabData.accept(MedievalmodworkModItems.BRONZE_ARMOR_LEGGINGS.get());
				tabData.accept(MedievalmodworkModItems.BRONZE_ARMOR_BOOTS.get());
				tabData.accept(MedievalmodworkModBlocks.TIN_ORE.get().asItem());
				tabData.accept(MedievalmodworkModBlocks.TIN_BLOCK.get().asItem());
				tabData.accept(MedievalmodworkModItems.TIN_INGOT.get());
				tabData.accept(MedievalmodworkModBlocks.STEEL_ORE.get().asItem());
				tabData.accept(MedievalmodworkModBlocks.STEEL_BLOCK.get().asItem());
				tabData.accept(MedievalmodworkModItems.STEEL.get());
				tabData.accept(MedievalmodworkModItems.LARGE_STEEL.get());
				tabData.accept(MedievalmodworkModBlocks.LARGE_STEEL_BLOCK.get().asItem());
				tabData.accept(MedievalmodworkModItems.HARD_STEEL_ARMOR_HELMET.get());
				tabData.accept(MedievalmodworkModItems.HARD_STEEL_ARMOR_CHESTPLATE.get());
				tabData.accept(MedievalmodworkModItems.HARD_STEEL_ARMOR_LEGGINGS.get());
				tabData.accept(MedievalmodworkModItems.HARD_STEEL_ARMOR_BOOTS.get());
				tabData.accept(MedievalmodworkModItems.HARD_STEEL_PICKAXE.get());
				tabData.accept(MedievalmodworkModItems.HARD_STEEL_AXE.get());
				tabData.accept(MedievalmodworkModItems.HARD_STEEL_SWORD.get());
				tabData.accept(MedievalmodworkModItems.HARD_STEEL_SHOVEL.get());
				tabData.accept(MedievalmodworkModItems.HARD_STEEL_HOE.get());
				tabData.accept(MedievalmodworkModItems.STONE_SPEAR.get());
			}).withSearchBar().build());
}
