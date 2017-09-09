/*
*** MADE BY MRPONYCAPTAIN'S .SCHEMATIC TO .JAVA CONVERTING TOOL v2.0 ***
*/

package com.javaman.subterranean.WorldGen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class SubWorldGen extends WorldGenerator implements IWorldGenerator
{
	

	

	

	

	public void setBlock(World world, int x, int y, int z, Block block, int metadata)
	{
		BlockPos pos =new BlockPos(x, y, z);
		IBlockState b1 = block.getStateFromMeta(metadata);

			
			world.setBlockState(pos, b1);
		
	}
	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		//check that each corner is one of the valid spawn blocks
		
		int i,j,k;
		i = position.getX();
		j = position.getY();
		k = position.getZ();
		

		k = k - 10;
		i = i - 10;

		this.setBlock(world, i + 0, j + 3, k + 1, Blocks.STONE_BRICK_STAIRS, 6);
		this.setBlock(world, i + 0, j + 3, k + 2, Blocks.STONE_BRICK_STAIRS, 4);
		this.setBlock(world, i + 0, j + 3, k + 3, Blocks.STONE_BRICK_STAIRS, 4);
		this.setBlock(world, i + 0, j + 3, k + 4, Blocks.STONE_BRICK_STAIRS, 4);
		this.setBlock(world, i + 0, j + 3, k + 5, Blocks.STONE_BRICK_STAIRS, 4);
		this.setBlock(world, i + 0, j + 3, k + 6, Blocks.STONE_BRICK_STAIRS, 4);
		this.setBlock(world, i + 0, j + 3, k + 7, Blocks.STONE_BRICK_STAIRS, 4);
		this.setBlock(world, i + 0, j + 3, k + 8, Blocks.STONE_BRICK_STAIRS, 7);
		this.setBlock(world, i + 1, j + 3, k + 1, Blocks.STONE_BRICK_STAIRS, 6);
		this.setBlock(world, i + 1, j + 3, k + 2, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 1, j + 3, k + 3, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 1, j + 3, k + 4, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 1, j + 3, k + 5, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 1, j + 3, k + 6, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 1, j + 3, k + 7, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 1, j + 3, k + 8, Blocks.STONE_BRICK_STAIRS, 7);
		this.setBlock(world, i + 2, j + 3, k + 1, Blocks.STONE_BRICK_STAIRS, 6);
		this.setBlock(world, i + 2, j + 3, k + 2, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 2, j + 3, k + 3, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 2, j + 3, k + 4, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 2, j + 3, k + 5, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 2, j + 3, k + 6, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 2, j + 3, k + 7, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 2, j + 3, k + 8, Blocks.STONE_BRICK_STAIRS, 7);
		this.setBlock(world, i + 3, j + 3, k + 1, Blocks.STONE_BRICK_STAIRS, 6);
		this.setBlock(world, i + 3, j + 3, k + 2, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 3, j + 3, k + 3, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 3, j + 3, k + 4, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 3, j + 3, k + 5, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 3, j + 3, k + 6, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 3, j + 3, k + 7, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 3, j + 3, k + 8, Blocks.STONE_BRICK_STAIRS, 7);
		this.setBlock(world, i + 3, j + 7, k + 0, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 3, j + 7, k + 1, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 3, j + 7, k + 2, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 3, j + 7, k + 3, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 3, j + 7, k + 4, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 3, j + 7, k + 5, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 3, j + 7, k + 6, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 3, j + 7, k + 7, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 3, j + 7, k + 8, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 3, j + 7, k + 9, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 4, j + 0, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 0, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 1, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 1, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 2, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 2, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 3, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 3, k + 2, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 4, j + 3, k + 3, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 4, j + 3, k + 4, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 4, j + 3, k + 5, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 4, j + 3, k + 6, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 4, j + 3, k + 7, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 4, j + 3, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 4, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 4, k + 2, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 4, j + 4, k + 3, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 4, j + 4, k + 6, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 4, j + 4, k + 7, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 4, j + 4, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 5, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 5, k + 2, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 4, j + 5, k + 3, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 4, j + 5, k + 6, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 4, j + 5, k + 7, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 4, j + 5, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 6, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 6, k + 2, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 6, k + 3, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 6, k + 4, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 6, k + 5, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 6, k + 6, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 6, k + 7, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 6, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 7, k + 0, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 4, j + 7, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 7, k + 2, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 7, k + 3, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 7, k + 4, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 7, k + 5, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 7, k + 6, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 7, k + 7, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 7, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 4, j + 7, k + 9, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 4, j + 8, k + 1, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 4, j + 8, k + 2, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 4, j + 8, k + 3, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 4, j + 8, k + 4, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 4, j + 8, k + 5, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 4, j + 8, k + 6, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 4, j + 8, k + 7, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 4, j + 8, k + 8, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 5, j + 3, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 5, j + 3, k + 2, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 5, j + 3, k + 3, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 5, j + 3, k + 4, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 5, j + 3, k + 5, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 5, j + 3, k + 6, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 5, j + 3, k + 7, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 5, j + 3, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 5, j + 4, k + 1, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 5, j + 4, k + 8, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 5, j + 5, k + 1, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 5, j + 5, k + 8, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 5, j + 6, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 5, j + 6, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 5, j + 7, k + 0, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 5, j + 7, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 5, j + 7, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 5, j + 7, k + 9, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 5, j + 8, k + 1, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 5, j + 8, k + 2, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 5, j + 8, k + 3, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 5, j + 8, k + 4, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 5, j + 8, k + 5, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 5, j + 8, k + 6, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 5, j + 8, k + 7, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 5, j + 8, k + 8, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 5, j + 9, k + 2, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 5, j + 9, k + 3, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 5, j + 9, k + 4, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 5, j + 9, k + 5, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 5, j + 9, k + 6, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 5, j + 9, k + 7, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 6, j + 3, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 6, j + 3, k + 2, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 6, j + 3, k + 3, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 6, j + 3, k + 4, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 6, j + 3, k + 5, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 6, j + 3, k + 6, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 6, j + 3, k + 7, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 6, j + 3, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 6, j + 4, k + 1, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 6, j + 4, k + 8, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 6, j + 5, k + 1, Blocks.IRON_BARS, 0);
		this.setBlock(world, i + 6, j + 5, k + 8, Blocks.IRON_BARS, 0);
		this.setBlock(world, i + 6, j + 6, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 6, j + 6, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 6, j + 7, k + 0, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 6, j + 7, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 6, j + 7, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 6, j + 7, k + 9, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 6, j + 8, k + 1, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 6, j + 8, k + 2, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 6, j + 8, k + 7, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 6, j + 8, k + 8, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 6, j + 9, k + 2, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 6, j + 9, k + 3, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 6, j + 9, k + 4, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 6, j + 9, k + 5, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 6, j + 9, k + 6, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 6, j + 9, k + 7, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 6, j + 10, k + 3, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 6, j + 10, k + 4, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 6, j + 10, k + 5, Blocks.STONE_BRICK_STAIRS, 0);
		this.setBlock(world, i + 7, j + 3, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 7, j + 3, k + 2, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 7, j + 3, k + 3, Blocks.STONEBRICK, 2);
		
		this.setBlock(world, i + 7, j + 3, k + 6, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 7, j + 3, k + 7, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 7, j + 3, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 7, j + 4, k + 1, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 7, j + 4, k + 8, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 7, j + 5, k + 1, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 7, j + 5, k + 8, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 7, j + 6, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 7, j + 6, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 7, j + 7, k + 0, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 7, j + 7, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 7, j + 7, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 7, j + 7, k + 9, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 7, j + 8, k + 1, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 7, j + 8, k + 2, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 7, j + 8, k + 7, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 7, j + 8, k + 8, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 7, j + 9, k + 2, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 7, j + 9, k + 3, Blocks.STONEBRICK, 3);
		
		this.setBlock(world, i + 7, j + 9, k + 6, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 7, j + 9, k + 7, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 7, j + 10, k + 3, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 7, j + 10, k + 4, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 7, j + 10, k + 5, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 7, j + 10, k + 6, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 8, j + 3, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 8, j + 3, k + 2, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 8, j + 3, k + 3, Blocks.STONEBRICK, 0);
		
		this.setBlock(world, i + 8, j + 3, k + 6, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 8, j + 3, k + 7, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 8, j + 3, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 8, j + 4, k + 1, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 8, j + 4, k + 8, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 8, j + 5, k + 1, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 8, j + 5, k + 8, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 8, j + 6, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 8, j + 6, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 8, j + 7, k + 0, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 8, j + 7, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 8, j + 7, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 8, j + 7, k + 9, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 8, j + 8, k + 1, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 8, j + 8, k + 2, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 8, j + 8, k + 7, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 8, j + 8, k + 8, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 8, j + 9, k + 2, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 8, j + 9, k + 3, Blocks.STONEBRICK, 3);
		
		this.setBlock(world, i + 8, j + 9, k + 6, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 8, j + 9, k + 7, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 8, j + 10, k + 3, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 8, j + 10, k + 4, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 8, j + 10, k + 5, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 8, j + 10, k + 6, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 9, j + 3, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 9, j + 3, k + 2, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 9, j + 3, k + 3, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 9, j + 3, k + 4, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 9, j + 3, k + 5, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 9, j + 3, k + 6, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 9, j + 3, k + 7, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 9, j + 3, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 9, j + 4, k + 1, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 9, j + 4, k + 8, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 9, j + 5, k + 1, Blocks.IRON_BARS, 0);
		this.setBlock(world, i + 9, j + 5, k + 8, Blocks.IRON_BARS, 0);
		this.setBlock(world, i + 9, j + 6, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 9, j + 6, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 9, j + 7, k + 0, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 9, j + 7, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 9, j + 7, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 9, j + 7, k + 9, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 9, j + 8, k + 1, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 9, j + 8, k + 2, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 9, j + 8, k + 7, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 9, j + 8, k + 8, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 9, j + 9, k + 2, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 9, j + 9, k + 3, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 9, j + 9, k + 4, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 9, j + 9, k + 5, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 9, j + 9, k + 6, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 9, j + 9, k + 7, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 9, j + 10, k + 3, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 9, j + 10, k + 4, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 9, j + 10, k + 5, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 9, j + 10, k + 6, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 10, j + 3, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 10, j + 3, k + 2, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 10, j + 3, k + 3, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 10, j + 3, k + 4, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 10, j + 3, k + 5, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 10, j + 3, k + 6, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 10, j + 3, k + 7, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 10, j + 3, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 10, j + 4, k + 1, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 10, j + 4, k + 2, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 10, j + 4, k + 4, Blocks.CHEST, 4);
		this.setBlock(world, i + 10, j + 4, k + 5, Blocks.CHEST, 4);
		this.setBlock(world, i + 10, j + 4, k + 7, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 10, j + 4, k + 8, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 10, j + 5, k + 1, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 10, j + 5, k + 2, Blocks.BREWING_STAND, 0);
		this.setBlock(world, i + 10, j + 5, k + 7, Blocks.BREWING_STAND, 0);
		this.setBlock(world, i + 10, j + 5, k + 8, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 10, j + 6, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 10, j + 6, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 10, j + 7, k + 0, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 10, j + 7, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 10, j + 7, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 10, j + 7, k + 9, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 10, j + 8, k + 1, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 10, j + 8, k + 2, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 10, j + 8, k + 3, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 10, j + 8, k + 4, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 10, j + 8, k + 5, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 10, j + 8, k + 6, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 10, j + 8, k + 7, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 10, j + 8, k + 8, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 10, j + 9, k + 2, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 10, j + 9, k + 3, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 10, j + 9, k + 4, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 10, j + 9, k + 5, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 10, j + 9, k + 6, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 10, j + 9, k + 7, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 11, j + 0, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 0, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 1, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 1, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 2, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 2, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 3, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 3, k + 2, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 3, k + 3, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 3, k + 4, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 3, k + 5, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 3, k + 6, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 3, k + 7, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 3, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 4, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 4, k + 2, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 11, j + 4, k + 3, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 11, j + 4, k + 4, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 11, j + 4, k + 5, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 11, j + 4, k + 6, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 11, j + 4, k + 7, Blocks.STONEBRICK, 0);
		this.setBlock(world, i + 11, j + 4, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 5, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 5, k + 2, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 11, j + 5, k + 3, Blocks.IRON_BARS, 0);
		this.setBlock(world, i + 11, j + 5, k + 4, Blocks.STONEBRICK, 1);
		this.setBlock(world, i + 11, j + 5, k + 5, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 11, j + 5, k + 6, Blocks.IRON_BARS, 0);
		this.setBlock(world, i + 11, j + 5, k + 7, Blocks.STONEBRICK, 2);
		this.setBlock(world, i + 11, j + 5, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 6, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 6, k + 2, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 6, k + 3, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 6, k + 4, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 6, k + 5, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 6, k + 6, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 6, k + 7, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 6, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 7, k + 0, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 11, j + 7, k + 1, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 7, k + 2, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 7, k + 3, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 7, k + 4, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 7, k + 5, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 7, k + 6, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 7, k + 7, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 7, k + 8, Blocks.STONEBRICK, 3);
		this.setBlock(world, i + 11, j + 7, k + 9, Blocks.STONE_BRICK_STAIRS, 3);
		this.setBlock(world, i + 11, j + 8, k + 1, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 11, j + 8, k + 2, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 11, j + 8, k + 3, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 11, j + 8, k + 4, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 11, j + 8, k + 5, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 11, j + 8, k + 6, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 11, j + 8, k + 7, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 11, j + 8, k + 8, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 12, j + 7, k + 0, Blocks.STONE_BRICK_STAIRS, 2);
		this.setBlock(world, i + 12, j + 7, k + 1, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 12, j + 7, k + 2, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 12, j + 7, k + 3, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 12, j + 7, k + 4, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 12, j + 7, k + 5, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 12, j + 7, k + 6, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 12, j + 7, k + 7, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 12, j + 7, k + 8, Blocks.STONE_BRICK_STAIRS, 1);
		this.setBlock(world, i + 12, j + 7, k + 9, Blocks.STONE_BRICK_STAIRS, 1);

		return true;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		
	}

	
}