package com.javaman.subterranean.client.renderer.entity;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


import com.javaman.subteranean.items.ModItems;
import com.javaman.subterranean.SubterraneanCreaturesMod;

import com.javaman.subterranean.entity.EntityFlailSnail;
import com.javaman.subterranean.entity.EntityWrath;
import com.javaman.subterranean.entity.ModEntitys;
import com.javaman.subterranean.models.ModelFailSnail;
import com.javaman.subterranean.models.ModelWrath;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT) //under construction
public final class EntityRenderRegister {
	
	public static void registerEntityRenderer(){
		
		
		register(ModEntitys.SUBTERRANEAN_MOBS);
		
		//RenderingRegistry.registerEntityRenderingHandler(EntityWrath.class, new RenderWrath(Minecraft.getMinecraft().getRenderManager(),new ModelWrath(), 0.5F));
		//RenderingRegistry.registerEntityRenderingHandler(EntityFlailSnail.class, new RenderFailSnail(Minecraft.getMinecraft().getRenderManager(),new ModelFailSnail(), 0));
		//RenderingRegistry.registerEntityRenderingHandler(EntityWrath.class, new RenderFactorySubterraneanCreatures());
		
	}
	
	
	public static void register(HashMap<String,Object[]> s){
		
		  Set set = s.entrySet();
	      Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
	         Map.Entry  item = (Map.Entry)iterator.next();
	         Object[] object = (Object[]) item.getValue();
	        System.out.println(object[1]);
	        
	        RenderFactorySubterraneanCreatures renderFactorySubterraneanCreatures = new RenderFactorySubterraneanCreatures( (ModelBase)object[1],new ResourceLocation(SubterraneanCreaturesMod.MODID + ":" + "textures/entitys/"+item.getKey()+".png"));
	        RenderingRegistry.registerEntityRenderingHandler((Class<? extends Entity>) object[0], renderFactorySubterraneanCreatures);
	        // RenderingRegistry.registerEntityRenderingHandler((Class<? extends Entity>) object[0], new RenderSubterraneanCreatures(Minecraft.getMinecraft().getRenderManager(),(ModelBase) object[1], 0,new ResourceLocation(SubterraneanCreaturesMod.MODID + ":" + "textures/entitys/"+item.getKey()+".png")));
	        // RenderingRegistry.registerEntityRenderingHandler((Class<? extends Entity>) object[0], new RenderSubterraneanCreatures2(Minecraft.getMinecraft().getRenderManager(),(ModelBase) object[1], 0,new ResourceLocation(SubterraneanCreaturesMod.MODID + ":" + "textures/entitys/"+item.getKey()+".png")));
	        renderFactorySubterraneanCreatures.createRenderFor(Minecraft.getMinecraft().getRenderManager());

		
	}
		
	
		//RenderingRegistry.registerEntityRenderingHandler(entityClass, new RenderSubterraneanCreatures(Minecraft.getMinecraft().getRenderManager(),model, 0,resourceLocation ));
		
		
		
	}
}
