package com.javaman.subterranean;

import com.javaman.subteranean.items.ModItems;
import com.javaman.subterranean.WorldGen.ModWorldGenerator;
import com.javaman.subterranean.biomes.BiomeRegistry;
import com.javaman.subterranean.blocks.ModBlocks;
import com.javaman.subterranean.dimension.DimensionRegister;
import com.javaman.subterranean.entity.ModEntitys;
import com.javaman.subterranean.loottable.LootRegister;
import com.javaman.subtersnean.register.Register;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

//import com.javaman.subteranean.items.ModItems;
//import com.javaman.subteranean.projectiles.MakeProjectile;
//import com.javaman.subterranean.biomes.BiomeRegistry;
//import com.javaman.subterranean.blocks.ModBlocks;
//import com.javaman.subterranean.crafting.ModCrafting;
//import com.javaman.subterranean.dimension.DimensionRegister;
//import com.javaman.subterranean.entity.ModEntitys;



public class CommonProxy {
	
	public void preInit(FMLCommonSetupEvent event) {
	//	GameRegistry.findRegistry( ModWorldGenerator.class);//(new ModWorldGenerator(), 0);
		
		ModBlocks.addItem();

		ModItems.addItem();
		//GameRegistry.registerWorldGenerator(new SubWorldGen(), 1);
		DimensionRegister.mainRegistry();
		BiomeRegistry.initializeBiome();
		//ModItems.createItems();
		//ModBlocks.createBlocks();
		ModEntitys.mainRegistry();
		LootRegister.mainRegister();
		//MakeProjectile.registerEntity();
		MinecraftForge.EVENT_BUS.register(new Register());
		
		
	}
	
	public void init() {
		//ModCrafting.initCrafting();
		//BiomeRegistry.mainRegsitry();
		//BiomeRegistry.mainRegsitry();
		DimensionRegister.mainRegistry();
		
		MinecraftForge.EVENT_BUS.register(new SubEventHandler());
	}
	
	
}
