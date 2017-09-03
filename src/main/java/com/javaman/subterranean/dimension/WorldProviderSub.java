package com.javaman.subterranean.dimension;

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

	
    public DimensionType getDimensionType()
    {
        return DimensionType.register("sub", "_sub", 8, this.getClass(), false);
    }
	

}
