package com.javaman.subterranean.entity;



import com.javaman.subterranean.SubterraneanCreaturesMod;
import com.javaman.subterranean.biomes.BiomeRegistry;

import net.minecraft.entity.EntityList;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;



public class ModEntitys {
	
	public static void mainRegistry(){
		registerEntity();
	}
	
	public static void registerEntity(){
		
		
		createEntity(EntityFireToad.class, "FireToad", 0xba2c26, 0x3e0f3f,2,1,1,BiomeRegistry.BiomeGenFireSub);
		createEntity(EntityWrath.class, "Wrath", 0x999999, 0xFF0000,2,1,1,BiomeGenBase.birchForest);
		createEntity(EntityFlailSnail.class, "FlailSnail", 0x4b0675, 0xf4a511,1, 2, 5,BiomeRegistry.BiomeGenFireSub);
		createEntity(EntityFlumph.class, "EntityFlumph", 0xfcfefe, 0x8ecbac, 8, 4, 8,BiomeRegistry.BiomeGenFireSub);
		
		//EntityFlumph
	}
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor,int spawnProb,int sMin,int sMax,BiomeGenBase spawnArea){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass,entityName, randomId, SubterraneanCreaturesMod.MODID , 64, 1, true);
		
		//EntityRegistry.addSpawn(entityClass, spawnProb, sMin, sMax, EnumCreatureType.creature, spawnArea);
		
		
		createEgg(randomId, solidColor, spotColor);
		
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}

}