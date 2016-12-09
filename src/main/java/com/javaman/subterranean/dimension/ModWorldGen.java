package com.javaman.subterranean.dimension;



import java.util.Random;

import com.javaman.subterranean.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;



public class ModWorldGen extends WorldGenerator implements IWorldGenerator {
    

@Override
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
    switch (world.provider.getDimensionId()) {
    case 8: //Overworld
    	this.gen_tutorial_ore = new WorldGenMinable(Blocks.glowstone.getDefaultState(), 16, BlockHelper.forBlock(ModBlocks.SUBTERRANEAN_BLOCKS));
    
    	this.runGenerator(this.gen_tutorial_ore, world, random, chunkX, chunkZ, 20, 0, 36);
        break;
    case -1: //Nether

        break;
    case 1: //End

        break;
    }
}
private WorldGenerator gen_tutorial_ore; //Generates Tutorial Ore (used in Overworld)

public void TutorialWorldGen() {
    this.gen_tutorial_ore = new WorldGenMinable(ModBlocks.PORTAL.getDefaultState(), 8);
    
    
}
private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

    int heightDiff = maxHeight - minHeight + 1;
    for (int i = 0; i < chancesToSpawn; i ++) {
        int x = chunk_X * 16 + rand.nextInt(16);
        int y = minHeight + rand.nextInt(heightDiff);
        int z = chunk_Z * 16 + rand.nextInt(16);
        generator.generate(world, rand, new BlockPos(x, y, z));
    }
}
@Override
public boolean generate(World worldIn, Random p_180709_2_, BlockPos p_180709_3_) {
	// TODO Auto-generated method stub
	return false;
}

}
