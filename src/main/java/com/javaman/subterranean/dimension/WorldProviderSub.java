package com.javaman.subterranean.dimension;

import com.javaman.subterranean.biomes.BiomeRegistry;

import net.minecraft.init.Biomes;
import net.minecraft.util.math.Vec3d;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.world.gen.ChunkGeneratorHell;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderSub extends WorldProvider //WorldProviderSurface
{
	protected int dimensionId=8;

	 @Override
	    public IChunkGenerator createChunkGenerator() {
	       return new ChunkProviderSub(world, false,  this.world.getSeed());
		 //return new TestChunkGenerator(world);
	    }
	 @Override
    public DimensionType getDimensionType()
    {
        return DimensionRegister.dimensionType;
    }
	 public void init()
	    {
		 	this.hasSkyLight = false;
	        this.biomeProvider = new BiomeProviderSingle(BiomeRegistry.BiomeGenFireSub);
	       // this.doesWaterVaporize = true;
	       // this.nether = true;
	    }
	 @Override
	 public boolean canRespawnHere()
	    {
	        return false;
	    }

}
