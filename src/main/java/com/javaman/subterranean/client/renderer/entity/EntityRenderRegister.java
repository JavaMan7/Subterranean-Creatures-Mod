package com.javaman.subterranean.client.renderer.entity;

import com.javaman.subteranean.client.render.items.RenderWrath;
import com.javaman.subterranean.entity.EntityFireToad;
import com.javaman.subterranean.entity.EntityFlailSnail;
import com.javaman.subterranean.entity.EntityFlumph;
import com.javaman.subterranean.entity.EntityWrath;
import com.javaman.subterranean.models.ModelFailSnail;
import com.javaman.subterranean.models.ModelFireToad;
import com.javaman.subterranean.models.ModelFlumph;
import com.javaman.subterranean.models.ModelWrath;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT) //under construction
public final class EntityRenderRegister {
	public static ModelFireToad FireToad = new ModelFireToad();
	public static void registerEntityRenderer(){
		
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityWrath.class, new RenderWrath(Minecraft.getMinecraft().getRenderManager(),new ModelWrath(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFireToad.class, new RenderFireToad(Minecraft.getMinecraft().getRenderManager(), FireToad, 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFlailSnail.class, new RenderFailSnail(Minecraft.getMinecraft().getRenderManager(),new ModelFailSnail(), 0));
		RenderingRegistry.registerEntityRenderingHandler(EntityFlumph.class, new RenderFlumph(Minecraft.getMinecraft().getRenderManager(),new ModelFlumph(), 0));
		
		
	}
}
