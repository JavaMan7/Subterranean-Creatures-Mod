package com.javaman.subtersnean.obj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;


import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.BufferUtils;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

public class Loader 
{

	private List <Integer> vaos = new ArrayList<Integer>();
	private List <Integer> vbos = new ArrayList<Integer>();
	private List <Integer> textures = new ArrayList<Integer>();
	public RawModel loaToVAO(float[] verticesArray,float[] uvArray,float[] normalArray,int[] indicesArray)
	{
		
		
	
		return new RawModel(verticesArray,uvArray,normalArray, indicesArray);
	}
	public int loadTexture(String fileName)
	{ 
		Texture texture = null;
		
		try {
			texture = TextureLoader.getTexture("PNG", new FileInputStream("src/res/"+fileName+".png"));
			GL30.glGenerateMipmap(GL11.GL_TEXTURE_2D);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR_MIPMAP_LINEAR);
			GL11.glTexParameterf(GL11.GL_TEXTURE_2D, GL14.GL_TEXTURE_LOD_BIAS, 0.4f);//mint map afect
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int textureID = texture.getTextureID();
		textures.add(textureID);
		return textureID;
	}
	
	
	
}
