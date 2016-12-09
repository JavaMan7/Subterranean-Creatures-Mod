package com.javaman.subteranean.client.render.items;

import com.javaman.subterranean.SubterraneanCreaturesMod;
import com.javaman.subterranean.entity.EntityWrath;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderWrath extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(SubterraneanCreaturesMod.MODID + ":" + "textures/entitys/wrath.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderWrath(RenderManager renderManager,ModelBase par1ModelBase, float par2) {
		super(renderManager, par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityWrath entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityWrath)entity);
	}

}