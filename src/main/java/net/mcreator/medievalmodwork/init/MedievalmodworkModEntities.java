
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.medievalmodwork.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.medievalmodwork.entity.StoneSpearProjectileEntity;
import net.mcreator.medievalmodwork.MedievalmodworkMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MedievalmodworkModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MedievalmodworkMod.MODID);
	public static final RegistryObject<EntityType<StoneSpearProjectileEntity>> STONE_SPEAR_PROJECTILE = register("projectile_stone_spear_projectile", EntityType.Builder.<StoneSpearProjectileEntity>of(StoneSpearProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(StoneSpearProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
