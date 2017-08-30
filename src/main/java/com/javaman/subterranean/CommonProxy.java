package com.javaman.subterranean;

//import com.javaman.subteranean.items.ModItems;
//import com.javaman.subteranean.projectiles.MakeProjectile;
//import com.javaman.subterranean.biomes.BiomeRegistry;
//import com.javaman.subterranean.blocks.ModBlocks;
//import com.javaman.subterranean.crafting.ModCrafting;
//import com.javaman.subterranean.dimension.DimensionRegister;
//import com.javaman.subterranean.entity.ModEntitys;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		//ModItems.createItems();
		//ModBlocks.createBlocks();
		//ModEntitys.mainRegistry();
		//MakeProjectile.registerEntity();
		//ModItems.registerTtem();
		
	}
	@EventHandler
	public void init(FMLInitializationEvent e) {
		//ModCrafting.initCrafting();
		//BiomeRegistry.mainRegsitry();
		//BiomeRegistry.mainRegsitry();
		//DimensionRegister.mainRegistry();
		//MinecraftForge.EVENT_BUS.register(new SubEventHandler());
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
