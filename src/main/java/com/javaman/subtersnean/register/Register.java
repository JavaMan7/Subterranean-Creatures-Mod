package com.javaman.subtersnean.register;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.javaman.subteranean.items.ModItems;
import com.javaman.subteranean.projectiles.EntityFireShot;
import com.javaman.subterranean.SubterraneanCreaturesMod;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class Register {
	@SubscribeEvent
	public void registerItem(RegistryEvent.Register<Item> event) {
		
		
		  Set set = ModItems.SUBTERRANEAN_ITEMS.entrySet();
	      Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
	         Map.Entry  item = (Map.Entry)iterator.next();
	         
	       
	         event.getRegistry().register( (Item) item.getValue() );
	         int randomId = 5000000;
	 		EntityRegistry.registerModEntity(new ResourceLocation("minecraft", "glowstone_dust"), EntityFireShot.class, "Throwing Rock", randomId, SubterraneanCreaturesMod.MODID, 64, 10, true);

		
	}
		 
	      
		
	   
	}
	
}
