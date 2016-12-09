package com.javaman.subterranean.dimension;

import com.javaman.subterranean.biomes.BiomeRegistry;

import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderSub extends WorldProviderSurface{

	@Override
	public String getDimensionName() {
		
		return "Sub";	
		}

	@Override
	protected void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.BiomeGenFireSub, -100.5f);
		this.dimensionId = DimensionRegister.dimensionId;
		this.generateLightBrightnessTable();
		
		  
	}
	
	@Override
	public boolean canRespawnHere() {
		
		return false;
	}

	@Override
	public IChunkProvider createChunkGenerator() {
		//return new  ChunkProviderSub(this.worldObj, this.worldObj.getSeed(), false);
				return new ChunkProviderSub(this.worldObj, true, this.worldObj.getSeed());
				
	}
	@Override
	protected void generateLightBrightnessTable()
    {
        float var1 = 0.1F;

        for (int var2 = 0; var2 <= 15; ++var2)
        {
            float var3 = 1.0F - (float)var2 / 15.0F;
            this.lightBrightnessTable[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
        }
    }
	
	
	

}
