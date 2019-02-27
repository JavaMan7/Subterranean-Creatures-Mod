package com.javaman.subterranean.biomes;

import java.util.List;
import java.util.Map;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.javaman.subterranean.SubterraneanCreaturesMod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;


public class BiomeGenFireSub extends Biome{
	//protected static Optional<? extends BiomeManager> instance            = Optional.absent();
	public static IBlockState topBlock = Blocks.GRASS.getDefaultState();
	/** The block to fill spots in when not on the top */
	public static IBlockState fillerBlock = Blocks.DIRT.getDefaultState();
	private final Map<EnumCreatureType, List<Biome.SpawnListEntry>> spawns = Maps.newHashMap();
	public BiomeGenFireSub(BiomeBuilder Properties){
		super(Properties);
		
		
		
		setRegistryName(SubterraneanCreaturesMod.MODID, "BiomeGenFireSub");
		//this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityFireToad.class, 1, 1, 2));
		//this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityFlailSnail.class, 1, 1, 2));
		//Properties.
		this.topBlock = Blocks.MYCELIUM.getDefaultState();

		//this.spawnableMonsterList.clear();
		//this.spawnableMonsterList.add(new SpawnListEntry(EntityFireToad.class, 1, 1, 1));
		//this.spawnableMonsterList.add(new SpawnListEntry(EntityFlailSnail.class, 1, 1, 1));
		

		//BiomeManager.addWeightedGrassGenForBiome(this, worldGeneratorBigTree, 100);

		//  this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityMooshroom.class, 8, 4, 8));
		//this.spawnableCaveCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityFlumph.class, 8, 4, 8));

		//this.addFlower(arg0, arg1, arg2);



	}
	
	public List<Biome.SpawnListEntry> getSpawns(EnumCreatureType creatureType) {
	      return this.spawns.computeIfAbsent(creatureType, k -> Lists.newArrayList());
	   }
	public static void generateBiomeGenFireSubTerrain(ChunkPrimer chunkPrimerIn)
	{


		BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

		for (int j = 15; j >= 0; --j)
		{

			for (int k = 15; k >= 0; --k)
			{
				for (int l = 254; l >= 0; --l)
				{

					if(chunkPrimerIn.getBlockState(new BlockPos(j, l, k)).getBlockState() == STONE&&
							
							chunkPrimerIn.getBlockState(new BlockPos(j, l-1, k)).getBlockState() != Blocks.BEDROCK.getDefaultState()
							) {


						chunkPrimerIn.setBlockState(new BlockPos(j, l-1, k), topBlock,true);



					}




				}





			}




		}





	}


	



}