package com.javaman.subtersnean.obj;

import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;



public class StaticShader extends ShaderProgram{
	
	
	private static final String   VERTEX_FILE = "src/shaders/vertexShader.txt"; 
	private static final String FRAGMENT_FILE = "src/shaders/fragmentShader.txt"; 
	private int location_transformationMatrix;
	private int location_projectionMatrix;
	private int location_ViewMatrix;
	private int location_lightPosition;
	private int location_lightColour;
	private int location_shineDamper;
	private int location_reflectivity;
	private int location_useFakeLighting;
	private int location_skyColour;
	
	public StaticShader() {
		super(VERTEX_FILE, FRAGMENT_FILE);
	}


	


	@Override
	protected void bindAttributtes() {
		super.bindAttributtes(0,"position");
		super.bindAttributtes(1,"textueUV");
		super.bindAttributtes(2,"normal");
	
		
	}





	@Override
	protected void getAllUniformLocation() {
		location_transformationMatrix = super.getUniformLocation("transformationMatrix");
		location_projectionMatrix = super.getUniformLocation("projectionMatrix");
		location_ViewMatrix = super.getUniformLocation("ViewMatrix");
		location_lightPosition = super.getUniformLocation("lightPosition");
		location_lightColour = super.getUniformLocation("lightColour");
		location_shineDamper = super.getUniformLocation("shineDamp");
		location_reflectivity = super.getUniformLocation("reflectivity");
		location_useFakeLighting = super.getUniformLocation("useFakeLighting");
		location_skyColour = super.getUniformLocation("skyColour");
	}
	public  void loadSkyColour(float r,float g,float b) {
		super.loadVector(location_skyColour, new Vector3f(r,g,b));
		
		
	}

	public  void loadFakeLightin(boolean useFakeLighing) {
		super.loadBoolean(location_useFakeLighting, useFakeLighing);
		
		
	}
	public  void loadShineVariables(float damper,float reflectivity) {
		super.loadFloat(location_shineDamper, damper);
		super.loadFloat(location_reflectivity,reflectivity);
		
		
	}

	public  void loadLight(Light light) {
		super.loadVector(location_lightPosition, light.getPosition());
		super.loadVector(location_lightColour, light.getColour());
		
		
	}


	
	public  void loadTransformationMatrix(Matrix4f matrix) {
		super.loadMatrix(location_transformationMatrix, matrix);
		
		
	}
	
	public  void loadprojectionMatrix(Matrix4f matrix) {
		super.loadMatrix(location_projectionMatrix, matrix);
		
		
	}
	
	
	
	

}
