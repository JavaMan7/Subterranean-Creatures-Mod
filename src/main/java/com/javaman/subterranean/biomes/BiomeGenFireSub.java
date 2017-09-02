package com.javaman.subterranean.biomes;

import com.google.common.base.Optional;
import com.javaman.subterranean.SubterraneanCreaturesMod;
import com.javaman.subterranean.entity.EntityFireToad;
import com.javaman.subterranean.entity.EntityFlailSnail;


import net.minecraft.world.biome.Biome;

import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenFireSub extends Biome{
	//protected static Optional<? extends BiomeManager> instance            = Optional.absent();
	public BiomeGenFireSub(BiomeProperties Properties){
		super(Properties);
		setRegistryName(SubterraneanCreaturesMod.MODID, "BiomeGenFireSub");
		//this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityFireToad.class, 1, 1, 2));
		//this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityFlailSnail.class, 1, 1, 2));
		
		this.decorator.treesPerChunk = -100;
        this.decorator.flowersPerChunk = -100;
        this.decorator.grassPerChunk = -100;
        this.decorator.mushroomsPerChunk = 20;
        this.decorator.bigMushroomsPerChunk = 20;
      
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityFireToad.class, 4, 4, 8));
		this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityFlailSnail.class, 1, 2, 5));
		//BiomeManager.addWeightedGrassGenForBiome(this, worldGeneratorBigTree, 100);
		 
      //  this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityMooshroom.class, 8, 4, 8));
        //this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityFlumph.class, 8, 4, 8));
        
		//this.addFlower(arg0, arg1, arg2);
		
		
	
	    }
	
}