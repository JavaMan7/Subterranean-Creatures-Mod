package com.javaman.subterranean.client.renderer.entity;



import com.javaman.subterranean.SubterraneanCreaturesMod;
import com.javaman.subterranean.entity.EntityFlumph;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderFlumph extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(SubterraneanCreaturesMod.MODID + ":" + "textures/entitys/Flumph.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderFlumph(RenderManager renderManager,ModelBase par1ModelBase, float par2) {
		super(renderManager, par1ModelBase, par2);
		
	}
	
	protected ResourceLocation getEntityTexture(EntityFlumph entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntityFlumph)entity);
	}

}