package com.javaman.subterranean.dimension;

import static java.lang.Math.sin;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.javaman.subterranean.biomes.BiomeGenFireSub;
import com.javaman.subterranean.blocks.LapisCobblestone;
import com.javaman.subterranean.blocks.ModBlocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCavesHell;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.feature.WorldGenBush;
import net.minecraft.world.gen.feature.WorldGenFire;
import net.minecraft.world.gen.feature.WorldGenGlowStone1;
import net.minecraft.world.gen.feature.WorldGenGlowStone2;
import net.minecraft.world.gen.feature.WorldGenHellLava;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.MapGenNetherBridge;

public class ChunkProviderSub implements IChunkGenerator{
	  protected static final IBlockState AIR = Blocks.AIR.getDefaultState();
	    protected static final IBlockState NETHERRACK = ModBlocks.lapisCobblestone.getDefaultState();
	    protected static final IBlockState BEDROCK = Blocks.BEDROCK.getDefaultState();
	    protected static final IBlockState LAVA = Blocks.WATER.getDefaultState();
	    protected static final IBlockState GRAVEL = Blocks.GOLD_BLOCK.getDefaultState();
	    protected static final IBlockState SOUL_SAND = Blocks.SOUL_SAND.getDefaultState();
	    private final World world;
	    private final boolean generateStructures;
	    private final Random rand;
	    /** Holds the noise used to determine whether slowsand can be generated at a location */
	    private double[] slowsandNoise = new double[256];
	    private double[] gravelNoise = new double[256];
	    private double[] depthBuffer = new double[256];
	    private double[] buffer;
	    private NoiseGeneratorOctaves lperlinNoise1;
	    private NoiseGeneratorOctaves lperlinNoise2;
	    private NoiseGeneratorOctaves perlinNoise1;
	    /** Determines whether slowsand or gravel can be generated at a location */
	    private NoiseGeneratorOctaves slowsandGravelNoiseGen;
	    /** Determines whether something other than nettherack can be generated at a location */
	    private NoiseGeneratorOctaves netherrackExculsivityNoiseGen;
	    public NoiseGeneratorOctaves scaleNoise;
	    public NoiseGeneratorOctaves depthNoise;
	    private final WorldGenFire fireFeature = new WorldGenFire();
	    private final WorldGenGlowStone1 lightGemGen = new WorldGenGlowStone1();
	    private final WorldGenGlowStone2 hellPortalGen = new WorldGenGlowStone2();
	    private final WorldGenerator quartzGen = new WorldGenMinable(Blocks.QUARTZ_ORE.getDefaultState(), 14, BlockMatcher.forBlock(Blocks.NETHERRACK));
	    private final WorldGenerator magmaGen = new WorldGenMinable(Blocks.MAGMA.getDefaultState(), 33, BlockMatcher.forBlock(Blocks.NETHERRACK));
	    private final WorldGenHellLava lavaTrapGen = new WorldGenHellLava(Blocks.FLOWING_LAVA, true);
	    private final WorldGenHellLava hellSpringGen = new WorldGenHellLava(Blocks.FLOWING_LAVA, false);
	    private final WorldGenBush brownMushroomFeature = new WorldGenBush(Blocks.BROWN_MUSHROOM);
	    private final WorldGenBush redMushroomFeature = new WorldGenBush(Blocks.RED_MUSHROOM);
	    private MapGenNetherBridge genNetherBridge = new MapGenNetherBridge();
	    private MapGenBase genNetherCaves = new MapGenCavesHell();
	    double[] pnr;
	    double[] ar;
	    double[] br;
	    double[] noiseData4;
	    double[] dr;
	    private Biome[] biomesForGeneration;
		private Random random;
	    
	    public ChunkProviderSub(World worldIn, boolean p_i45637_2_, long seed)
	    {
	    	
	        this.random = new Random((seed + 516) * 314);
	        this.world = worldIn;
	        this.generateStructures = p_i45637_2_;
	        this.rand = new Random(seed);
	        this.lperlinNoise1 = new NoiseGeneratorOctaves(this.rand, 16);
	        this.lperlinNoise2 = new NoiseGeneratorOctaves(this.rand, 16);
	        this.perlinNoise1 = new NoiseGeneratorOctaves(this.rand, 8);
	        this.slowsandGravelNoiseGen = new NoiseGeneratorOctaves(this.rand, 4);
	        this.netherrackExculsivityNoiseGen = new NoiseGeneratorOctaves(this.rand, 4);
	        this.scaleNoise = new NoiseGeneratorOctaves(this.rand, 10);
	        this.depthNoise = new NoiseGeneratorOctaves(this.rand, 16);
	        worldIn.setSeaLevel(63);

	        net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextHell ctx =
	                new net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextHell(lperlinNoise1, lperlinNoise2, perlinNoise1, slowsandGravelNoiseGen, netherrackExculsivityNoiseGen, scaleNoise, depthNoise);
	        ctx = net.minecraftforge.event.terraingen.TerrainGen.getModdedNoiseGenerators(worldIn, this.rand, ctx);
	        this.lperlinNoise1 = ctx.getLPerlin1();
	        this.lperlinNoise2 = ctx.getLPerlin2();
	        this.perlinNoise1 = ctx.getPerlin();
	        this.slowsandGravelNoiseGen = ctx.getPerlin2();
	        this.netherrackExculsivityNoiseGen = ctx.getPerlin3();
	        this.scaleNoise = ctx.getScale();
	        this.depthNoise = ctx.getDepth();
	        this.genNetherBridge = (MapGenNetherBridge)net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(genNetherBridge, net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.NETHER_BRIDGE);
	        this.genNetherCaves = net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(genNetherCaves, net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.NETHER_CAVE);
	    }

	    public void prepareHeights(int p_185936_1_, int p_185936_2_, ChunkPrimer primer)
	    {
	        int i = 4;
	        int j = this.world.getSeaLevel() / 2 + 1;
	        int k = 5;
	        int l = 17;
	        int i1 = 5;
	        this.buffer = this.getHeights(this.buffer, p_185936_1_ * 4, 0, p_185936_2_ * 4, 5, 17, 5);

	        for (int j1 = 0; j1 < 4; ++j1)
	        {
	            for (int k1 = 0; k1 < 4; ++k1)
	            {
	                for (int l1 = 0; l1 < 16; ++l1)
	                {
	                    double d0 = 0.125D;
	                    double d1 = this.buffer[((j1 + 0) * 5 + k1 + 0) * 17 + l1 + 0];
	                    double d2 = this.buffer[((j1 + 0) * 5 + k1 + 1) * 17 + l1 + 0];
	                    double d3 = this.buffer[((j1 + 1) * 5 + k1 + 0) * 17 + l1 + 0];
	                    double d4 = this.buffer[((j1 + 1) * 5 + k1 + 1) * 17 + l1 + 0];
	                    double d5 = (this.buffer[((j1 + 0) * 5 + k1 + 0) * 17 + l1 + 1] - d1) * 0.125D;
	                    double d6 = (this.buffer[((j1 + 0) * 5 + k1 + 1) * 17 + l1 + 1] - d2) * 0.125D;
	                    double d7 = (this.buffer[((j1 + 1) * 5 + k1 + 0) * 17 + l1 + 1] - d3) * 0.125D;
	                    double d8 = (this.buffer[((j1 + 1) * 5 + k1 + 1) * 17 + l1 + 1] - d4) * 0.125D;

	                    for (int i2 = 0; i2 < 8; ++i2)
	                    {
	                        double d9 = 0.25D;
	                        double d10 = d1;
	                        double d11 = d2;
	                        double d12 = (d3 - d1) * 0.25D;
	                        double d13 = (d4 - d2) * 0.25D;

	                        for (int j2 = 0; j2 < 4; ++j2)
	                        {
	                            double d14 = 0.25D;
	                            double d15 = d10;
	                            double d16 = (d11 - d10) * 0.25D;

	                            for (int k2 = 0; k2 < 4; ++k2)
	                            {
	                                IBlockState iblockstate = null;

	                                if (l1 * 8 + i2 < j)
	                                {
	                                    iblockstate = LAVA;
	                                }

	                                if (d15 > 0.0D)
	                                {
	                                    iblockstate = NETHERRACK;
	                                }

	                                int l2 = j2 + j1 * 4;
	                                int i3 = i2 + l1 * 8;
	                                int j3 = k2 + k1 * 4;
	                                primer.setBlockState(l2, i3, j3, iblockstate);
	                                d15 += d16;
	                            }

	                            d10 += d12;
	                            d11 += d13;
	                        }

	                        d1 += d5;
	                        d2 += d6;
	                        d3 += d7;
	                        d4 += d8;
	                    }
	                }
	            }
	        }
	    }

	    public void buildSurfaces(int p_185937_1_, int p_185937_2_, ChunkPrimer primer)
	    {
	        if (!net.minecraftforge.event.ForgeEventFactory.onReplaceBiomeBlocks(this, p_185937_1_, p_185937_2_, primer, this.world)) return;
	        int i = this.world.getSeaLevel() + 1;
	        double d0 = 0.03125D;
	        this.slowsandNoise = this.slowsandGravelNoiseGen.generateNoiseOctaves(this.slowsandNoise, p_185937_1_ * 16, p_185937_2_ * 16, 0, 16, 16, 1, 0.03125D, 0.03125D, 1.0D);
	        this.gravelNoise = this.slowsandGravelNoiseGen.generateNoiseOctaves(this.gravelNoise, p_185937_1_ * 16, 109, p_185937_2_ * 16, 16, 1, 16, 0.03125D, 1.0D, 0.03125D);
	        this.depthBuffer = this.netherrackExculsivityNoiseGen.generateNoiseOctaves(this.depthBuffer, p_185937_1_ * 16, p_185937_2_ * 16, 0, 16, 16, 1, 0.0625D, 0.0625D, 0.0625D);

	        for (int j = 0; j < 16; ++j)
	        {
	            for (int k = 0; k < 16; ++k)
	            {
	                boolean flag = this.slowsandNoise[j + k * 16] + this.rand.nextDouble() * 0.2D > 0.0D;
	                boolean flag1 = this.gravelNoise[j + k * 16] + this.rand.nextDouble() * 0.2D > 0.0D;
	                int l = (int)(this.depthBuffer[j + k * 16] / 3.0D + 3.0D + this.rand.nextDouble() * 0.25D);
	                int i1 = -1;
	                IBlockState iblockstate = NETHERRACK;
	                IBlockState iblockstate1 = NETHERRACK;

	                for (int j1 = 127; j1 >= 0; --j1)
	                {
	                    if (j1 < 127 - this.rand.nextInt(5) && j1 > this.rand.nextInt(5))
	                    {
	                        IBlockState iblockstate2 = primer.getBlockState(k, j1, j);

	                        if (iblockstate2.getBlock() != null && iblockstate2.getMaterial() != Material.AIR)
	                        {
	                            if (iblockstate2.getBlock() == Blocks.NETHERRACK)
	                            {
	                                if (i1 == -1)
	                                {
	                                    if (l <= 0)
	                                    {
	                                        iblockstate = AIR;
	                                        iblockstate1 = NETHERRACK;
	                                    }
	                                    else if (j1 >= i - 4 && j1 <= i + 1)
	                                    {
	                                        iblockstate = NETHERRACK;
	                                        iblockstate1 = NETHERRACK;

	                                        if (flag1)
	                                        {
	                                            iblockstate = GRAVEL;
	                                            iblockstate1 = NETHERRACK;
	                                        }

	                                        if (flag)
	                                        {
	                                            iblockstate = SOUL_SAND;
	                                            iblockstate1 = SOUL_SAND;
	                                        }
	                                    }

	                                    if (j1 < i && (iblockstate == null || iblockstate.getMaterial() == Material.AIR))
	                                    {
	                                        iblockstate = LAVA;
	                                    }

	                                    i1 = l;

	                                    if (j1 >= i - 1)
	                                    {
	                                        primer.setBlockState(k, j1, j, iblockstate);
	                                    }
	                                    else
	                                    {
	                                        primer.setBlockState(k, j1, j, iblockstate1);
	                                    }
	                                }
	                                else if (i1 > 0)
	                                {
	                                    --i1;
	                                    primer.setBlockState(k, j1, j, iblockstate1);
	                                }
	                            }
	                        }
	                        else
	                        {
	                            i1 = -1;
	                        }
	                    }
	                    else
	                    {
	                        primer.setBlockState(k, j1, j, BEDROCK);
	                    }
	                }
	            }
	        }
	    }

	    /**
	     * Generates the chunk at the specified position, from scratch
	     */
	    public Chunk generateChunk(int x, int z)
	    {
	    	this.rand.setSeed((long)x * 341873128712L + (long)z * 132897987541L);
	        ChunkPrimer chunkprimer = new ChunkPrimer();
	        this.prepareHeights(x, z, chunkprimer);
	        this.buildSurfaces(x, z, chunkprimer);
	        this.genNetherCaves.generate(this.world, x, z, chunkprimer);
	        BiomeGenFireSub.generateBiomeGenFireSubTerrain(chunkprimer);
	        this.biomesForGeneration = this.world.getBiomeProvider().getBiomes(this.biomesForGeneration, x * 16, z * 16, 16, 16);
	        Chunk chunk = new Chunk(this.world, chunkprimer, x, z);
	        Biome[] abiome = this.world.getBiomeProvider().getBiomes((Biome[])null, x * 16, z * 16, 16, 16);
	        byte[] abyte = chunk.getBiomeArray();

	        for (int i = 0; i < abyte.length; ++i)
	        {
	            abyte[i] = (byte)Biome.getIdForBiome(abiome[i]);
	        }
	       
	         

	        //chunk.resetRelightChecks();
	        
	        return chunk;
	       /*this.rand.setSeed((long)x * 341873128712L + (long)z * 132897987541L);
	        ChunkPrimer chunkprimer = new ChunkPrimer();
	       // this.prepareHeights(x, z, chunkprimer);
	      //  this.buildSurfaces(x, z, chunkprimer);
	       // this.genNetherCaves.generate(this.world, x, z, chunkprimer);
	        
	        int[] last= new int[2]; 
	        for (int j = 0; j < 16; ++j)
	        {
	            for (int k = 0; k < 16; ++k)
	            {
	                for (int l = 0; l < 256; ++l)
	                { 	//	z = (int) Math.cos(Math.sqrt(j* 2+l*2));
	                	
	                	
	                	double y2 = 1* sin(j*(3.1415926/180));
	                	//System.out.println(y2);
	                	
	                    chunkprimer.setBlockState(j,(int)y2,k,Blocks.GRASS.getDefaultState());
	                	last[0]= j;
	                	last[1]= (int) y2;
	                	//int slope = (int) ((j-last[0])/(last[1]-y2));
	                	 for (int h = 0; h < j-last[0]; ++h) {
	                		 
	                		chunkprimer.setBlockState(j,(int) (last[1]-y2),k,Blocks.GRASS.getDefaultState());
	                	 	}
	          	       
	                    }
	                }
	            }
	        
	       

	        Chunk chunk = new Chunk(this.world, chunkprimer, x, z);
	        Biome[] abiome = this.world.getBiomeProvider().getBiomes((Biome[])null, x * 16, z * 16, 16, 16);
	        byte[] abyte = chunk.getBiomeArray();

	        for (int i = 0; i < abyte.length; ++i)
	        {
	            abyte[i] = (byte)Biome.getIdForBiome(abiome[i]);
	        }

	        chunk.resetRelightChecks();
	        return chunk;*/
	    }

	    private double[] getHeights(double[] p_185938_1_, int p_185938_2_, int p_185938_3_, int p_185938_4_, int p_185938_5_, int p_185938_6_, int p_185938_7_)
	    {
	        if (p_185938_1_ == null)
	        {
	            p_185938_1_ = new double[p_185938_5_ * p_185938_6_ * p_185938_7_];
	        }

	        net.minecraftforge.event.terraingen.ChunkGeneratorEvent.InitNoiseField event = new net.minecraftforge.event.terraingen.ChunkGeneratorEvent.InitNoiseField(this, p_185938_1_, p_185938_2_, p_185938_3_, p_185938_4_, p_185938_5_, p_185938_6_, p_185938_7_);
	        net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event);
	        if (event.getResult() == net.minecraftforge.fml.common.eventhandler.Event.Result.DENY) return event.getNoisefield();

	        double d0 = 684.412D;
	        double d1 = 2053.236D;
	        this.noiseData4 = this.scaleNoise.generateNoiseOctaves(this.noiseData4, p_185938_2_, p_185938_3_, p_185938_4_, p_185938_5_, 1, p_185938_7_, 1.0D, 0.0D, 1.0D);
	        this.dr = this.depthNoise.generateNoiseOctaves(this.dr, p_185938_2_, p_185938_3_, p_185938_4_, p_185938_5_, 1, p_185938_7_, 100.0D, 0.0D, 100.0D);
	        this.pnr = this.perlinNoise1.generateNoiseOctaves(this.pnr, p_185938_2_, p_185938_3_, p_185938_4_, p_185938_5_, p_185938_6_, p_185938_7_, 8.555150000000001D, 34.2206D, 8.555150000000001D);
	        this.ar = this.lperlinNoise1.generateNoiseOctaves(this.ar, p_185938_2_, p_185938_3_, p_185938_4_, p_185938_5_, p_185938_6_, p_185938_7_, 684.412D, 2053.236D, 684.412D);
	        this.br = this.lperlinNoise2.generateNoiseOctaves(this.br, p_185938_2_, p_185938_3_, p_185938_4_, p_185938_5_, p_185938_6_, p_185938_7_, 684.412D, 2053.236D, 684.412D);
	        int i = 0;
	        double[] adouble = new double[p_185938_6_];

	        for (int j = 0; j < p_185938_6_; ++j)
	        {
	            adouble[j] = Math.cos((double)j * Math.PI * 6.0D / (double)p_185938_6_) * 2.0D;
	            double d2 = (double)j;

	            if (j > p_185938_6_ / 2)
	            {
	                d2 = (double)(p_185938_6_ - 1 - j);
	            }

	            if (d2 < 4.0D)
	            {
	                d2 = 4.0D - d2;
	                adouble[j] -= d2 * d2 * d2 * 10.0D;
	            }
	        }

	        for (int l = 0; l < p_185938_5_; ++l)
	        {
	            for (int i1 = 0; i1 < p_185938_7_; ++i1)
	            {
	                double d3 = 0.0D;

	                for (int k = 0; k < p_185938_6_; ++k)
	                {
	                    double d4 = adouble[k];
	                    double d5 = this.ar[i] / 512.0D;
	                    double d6 = this.br[i] / 512.0D;
	                    double d7 = (this.pnr[i] / 10.0D + 1.0D) / 2.0D;
	                    double d8;

	                    if (d7 < 0.0D)
	                    {
	                        d8 = d5;
	                    }
	                    else if (d7 > 1.0D)
	                    {
	                        d8 = d6;
	                    }
	                    else
	                    {
	                        d8 = d5 + (d6 - d5) * d7;
	                    }

	                    d8 = d8 - d4;

	                    if (k > p_185938_6_ - 4)
	                    {
	                        double d9 = (double)((float)(k - (p_185938_6_ - 4)) / 3.0F);
	                        d8 = d8 * (1.0D - d9) + -10.0D * d9;
	                    }

	                    if ((double)k < 0.0D)
	                    {
	                        double d10 = (0.0D - (double)k) / 4.0D;
	                        d10 = MathHelper.clamp(d10, 0.0D, 1.0D);
	                        d8 = d8 * (1.0D - d10) + -10.0D * d10;
	                    }

	                    p_185938_1_[i] = d8;
	                    ++i;
	                }
	            }
	        }

	        return p_185938_1_;
	    }

	    /**
	     * Generate initial structures in this chunk, e.g. mineshafts, temples, lakes, and dungeons
	     */
	    @Override
	    public void populate(int x, int z) {
	        int i = x * 16;
	        int j = z * 16;
	        BlockPos blockpos = new BlockPos(i, 0, j);
	        Biome biome = this.world.getBiome(blockpos.add(16, 0, 16));

	        // Add biome decorations (like flowers, grass, trees, ...)
	        biome.decorate(this.world, this.random, blockpos);

	        // Make sure animals appropriate to the biome spawn here when the chunk is generated
	        WorldEntitySpawner.performWorldGenSpawning(this.world, biome, i + 8, j + 8, 16, 16, this.random);
	    }

	    /**
	     * Called to generate additional structures after initial worldgen, used by ocean monuments
	     */
	    public boolean generateStructures(Chunk chunkIn, int x, int z)
	    {
	        return false;
	    }

	    public List<Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos)
	    {
	      
	    	Biome biome = this.world.getBiome(pos);
	    	return biome.getSpawnableList(EnumCreatureType.MONSTER);

	    }

	    @Nullable
	    public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position, boolean findUnexplored)
	    {
	        return "Fortress".equals(structureName) && this.genNetherBridge != null ? this.genNetherBridge.getNearestStructurePos(worldIn, position, findUnexplored) : null;
	    }

	    public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos)
	    {
	        return "Fortress".equals(structureName) && this.genNetherBridge != null ? this.genNetherBridge.isInsideStructure(pos) : false;
	    }

	    /**
	     * Recreates data about structures intersecting given chunk (used for example by getPossibleCreatures), without
	     * placing any blocks. When called for the first time before any chunk is generated - also initializes the internal
	     * state needed by getPossibleCreatures.
	     */
	    public void recreateStructures(Chunk chunkIn, int x, int z)
	    {
	       // this.genNetherBridge.generate(this.world, x, z, (ChunkPrimer)null);
	    }
	
	
}

   