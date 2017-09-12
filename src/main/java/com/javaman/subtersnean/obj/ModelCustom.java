package com.javaman.subtersnean.obj;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

import javax.vecmath.Vector4f;
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
		
		
	}
	static StaticShader shader= new StaticShader();
	
	@Override
	 public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	    {
		 
		
			
			GL30.glBindVertexArray(rawmodel.getVaoID());
			GL20.glEnableVertexAttribArray(0);
			GL20.glEnableVertexAttribArray(1);
			GL20.glEnableVertexAttribArray(2);
			Vector3f v = new Vector3f();
			v.set((float)entityIn.posX,(float)entityIn.posY,(float)entityIn.posZ);
			Matrix4f transformationMatrix = Maths.createTransformationMatrix(v, entityIn.getRotationYawHead(), entityIn.getRotationYawHead(),
					entityIn.getRotationYawHead(), 1.0f);
			ModelTexture texture = model.getTexture();
			
			shader.loadTransformationMatrix(transformationMatrix);
			shader.loadShineVariables(texture. getShineDamper(), texture.getReflectiveity());
			shader.loadTransformationMatrix(transformationMatrix);
			
			GL13.glActiveTexture(GL13.GL_TEXTURE0);
			GL11.glBindTexture(GL11.GL_TEXTURE_2D, model.getTexture().getTextureID());
			GL11.glDrawElements(GL11.GL_TRIANGLES,  rawmodel.getVertexCount(),GL11.GL_UNSIGNED_INT,0);
			//GL11.glDrawArrays(GL11.GL_TRIANGLES, 0, modle.getVertexCount());
			GL20.glDisableVertexAttribArray(0);
			GL20.glDisableVertexAttribArray(1);
			GL20.glDisableVertexAttribArray(2);
			GL30.glBindVertexArray(0);
			
		 
		 
		 
		 
		 
		 
		 
	    }
	
}
