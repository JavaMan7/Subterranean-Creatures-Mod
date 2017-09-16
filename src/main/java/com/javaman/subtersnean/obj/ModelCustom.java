package com.javaman.subtersnean.obj;


import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

import com.javaman.subterranean.SubterraneanCreaturesMod;

import javax.vecmath.Vector4f;

import static org.lwjgl.opengl.GL11.GL_TRIANGLES;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@SideOnly(Side.CLIENT)
public class ModelCustom extends ModelBase {
	RawModel rawmodel;
	TextureModel model;
	public ModelCustom(RawModel rawmodel,TextureModel model){
		
		this.rawmodel = rawmodel;
		this.model = model;
		try {
			InputStream inputStream = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation(SubterraneanCreaturesMod.MODID,"s.obj")).getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	@Override
	 public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	    {
		 
		
		 Tessellator tess = Tessellator.getInstance();
		 BufferBuilder vertexBuffer = tess.getBuffer();
		 GL11.glBindTexture(GL11.GL_TEXTURE_2D, model.getTexture().getTextureID());
	        if(model.getRawModel() == null) {
	            return;
	        } vertexBuffer.begin(GL_TRIANGLES, DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL);
	      
	       
	     
	        for(int i=0;(model.getRawModel().getVertices().length/3)>i;i++) {
	          
	        	 
	        	  
	        	 float v[] = model.getRawModel().getVertices(); 
	        	 int in[] = model.getRawModel().getIndices(); 
	        	 float u[] = model.getRawModel().getUvs();
	        	//  for(int iv = 0; iv < 3; iv++) {
	        		int a= in[i];
	                vertexBuffer.pos(v[a*3+0],v[a*3+1],v[a*3+2]);
	        	 
	        	 
	       
	        	
	        	if (model.getRawModel().getUvs().length/2>i ){
	        		 vertexBuffer.tex(u[a*2+0],u[a*2+1]);
		        	 }
	                        
	                       
	        	 float n[] = model.getRawModel().getNormals(); 
	        	
	                vertexBuffer.normal(n[a*3+0],n[a*3+1],n[a*3+2]);
	        	
	                       // vertexBuffer   .normal(model.getRawModel().getNormals().get(i).x, 
	                       // 	model.getRawModel().getNormals().get(i).y, 
	                     // 		model.getRawModel().getNormals().get(i).z);
	                        
	                        //.normal(v.getFaceNormal().x, v.getFaceNormal().y, v.getFaceNormal().z)
	                        //.normal(v.getNormal().x, v.getNormal().y, v.getNormal().z)
	                        vertexBuffer.endVertex();
	        	//  }
	        }

	        tess.draw();
	     //  }catch (Exception e) {
			// TODO: handle exception
		//}
	        GlStateManager.pushMatrix();
            GlStateManager.enableAlpha();
	       
            GlStateManager.popMatrix();
		 
		 
		 
		 
		 
	    }
	
}
