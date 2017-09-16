package com.javaman.subtersnean.obj;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;

public class RawModel {
	
	private int VaoID;
	private int VertexCount;
	private float[] vertices;
	public float[] getVertices() {
		return vertices;
	}



	public float[] getUvs() {
		return uvs;
	}



	public float[] getNormals() {
		return normals;
	}



	public int[] getIndices() {
		return indices;
	}

	private float[] uvs;
	private float[] normals;
	private int[] indices;
	
	public RawModel(int VaoID,  int VertexCount)
	{
		this.VaoID = VaoID;
		this.VertexCount = VertexCount;
		
		
		
		
	}

	

	public RawModel( float[] verticesArray, float[] uvArray, float[] normalArray,
			int[] indicesArray) {
		
		this.vertices = verticesArray;
		this.uvs = uvArray;
		this.normals = normalArray;
		this.indices = indicesArray;
		
	}

	


	public int getVaoID() {
		return VaoID;
	}

	public int getVertexCount() {
		return VertexCount;
	}
	
	
	
	
	

}
