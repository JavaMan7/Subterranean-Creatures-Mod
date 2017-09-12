package com.javaman.subtersnean.obj;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;



public class OBJLoader {
	
	
	
	public static RawModel loadObjModel(String fileName, Loader loader)
	{	Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		System.out.println("Current relative path is: " + s);
		FileReader fr = null;
		try {
			fr = new FileReader(new File("src/res/"+fileName+".obj"));
		} catch (FileNotFoundException e) {
			System.err.println("Could not load file!");
			e.printStackTrace();
		}
	
		BufferedReader reader = new BufferedReader(fr);
		
		String line = "";
		List<Vector3f> vertices =new ArrayList<Vector3f>();
		List<Vector2f> uvs =new ArrayList<Vector2f>();
		List<Vector3f> normals =new ArrayList<Vector3f>();
		List<Integer> indices =new ArrayList<Integer>();
		
		float[] verticesArray = null;
		float[] normalArray = null;
		float[] uvArray = null;
		int[] indicesArray = null;
		try {
			while(true){
				line = reader.readLine();
				String[] currentLine = line.split(" ");
				if(line.startsWith("v "))
				{
					
					Vector3f vertex = new Vector3f(Float.parseFloat(currentLine[1]),Float.parseFloat(currentLine[2]),Float.parseFloat(currentLine[3]));
					
					vertices.add(vertex);
					
					
				}else if(line.startsWith("vt ")){
					Vector2f uv = new Vector2f(Float.parseFloat(currentLine[1]),Float.parseFloat(currentLine[2]));
					uvs.add(uv);
					
				}else if(line.startsWith("vn ")){
					Vector3f normal = new Vector3f(Float.parseFloat(currentLine[1]),Float.parseFloat(currentLine[2]),Float.parseFloat(currentLine[3]));
					
					normals.add(normal);
					
					
					
				}else if(line.startsWith("f ")){
					
					
					uvArray = new float[vertices.size()*2] ;
					normalArray = new float[vertices.size()*3] ;
					break;
					
					
					
					
					
					
				}
			}
				
					while (line!= null) {
						if(!line.startsWith("f ")){
							
							line = reader.readLine();
							continue;
						}
						
					
					String[] currentLine = line.split(" ");
					String[] vertex1 = currentLine[1].split("/");
					String[] vertex2 = currentLine[2].split("/");
					String[] vertex3 = currentLine[3].split("/");
					ProcessVertex(vertex1,indices,uvs,normals,uvArray,normalArray);
					ProcessVertex(vertex2,indices,uvs,normals,uvArray,normalArray);
					ProcessVertex(vertex3,indices,uvs,normals,uvArray,normalArray);
					line = reader.readLine();
					
					}
					
				reader.close();
				
				
				
			
		} catch (Exception e) {
			System.err.println("Could not load file!");
			e.printStackTrace();
		}
		verticesArray = new float[vertices.size()*3] ;
		indicesArray = new int[indices.size()] ;
		int vertexPointer = 0;
		for(Vector3f vertex:vertices)
		{
			verticesArray[vertexPointer++]= vertex.x;
			verticesArray[vertexPointer++]= vertex.y;
			verticesArray[vertexPointer++]= vertex.z;
			
			
		}
		for(int i =0; i<indices.size();i++)
		{
			
			indicesArray[i] = indices.get(i);
			
		}
		return loader.loaToVAO(verticesArray, uvArray,normalArray, indicesArray);
		
	}
	private static void ProcessVertex(String[] vertexData, List<Integer> indices,List<Vector2f>textureUvs,List<Vector3f> normals
			,float[] uvArray,float[] normalArray )
	{
		
		int currentVertexPoiter = Integer.parseInt(vertexData[0]) - 1;
		indices.add(currentVertexPoiter);
		Vector2f currentuv = textureUvs.get(Integer.parseInt(vertexData[1])-1);
		uvArray[currentVertexPoiter*2] = currentuv.x;
		uvArray[currentVertexPoiter*2+1] = 1- currentuv.y;
		Vector3f currentNorm = normals.get(Integer.parseInt(vertexData[2])-1);
		normalArray[currentVertexPoiter*3] = currentNorm.x;
		normalArray[currentVertexPoiter*3+1] = currentNorm.y;
		normalArray[currentVertexPoiter*3+2] = currentNorm.z;
		
		
		
		
		
		
	}
	
	
	
	

}
