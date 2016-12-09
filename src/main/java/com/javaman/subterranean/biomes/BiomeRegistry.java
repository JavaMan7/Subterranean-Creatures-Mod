package com.javaman.subterranean.biomes;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void mainRegsitry(){
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase BiomeGenFireSub;
	
	public static void initializeBiome(){
		
		BiomeGenFireSub = new BiomeGenFireSub(137).setBiomeName("sub").setTemperatureRainfall(-1.2F, 0.9F);
		
	}
	
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(BiomeGenFireSub, Type.FOREST);
		BiomeManager.addSpawnBiome(BiomeGenFireSub);
		
		
	}

}
