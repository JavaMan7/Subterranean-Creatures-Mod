package com.javaman.subtersnean.obj;

public class ModelTexture {
	private float shineDamper = 1;
	private float reflectivity = 0;
	private boolean hasTransparency = false;
	private boolean useFakeLighting = false;
	
	public ModelTexture(int textureID) {
		super();
		this.textureID = textureID;
	}
	public void setReflectivity(float reflectivity) {
		this.reflectivity = reflectivity;
	}
	public void setShineDamper(float shineDamper) {
		this.shineDamper = shineDamper;
	}
	public float getShineDamper() {
		return shineDamper;
	}
	public float getReflectiveity() {
		return reflectivity;
	}
	private int textureID;

	public int getTextureID() {
		return textureID;
	}

	public void ModleTexture(int textureID) {
		this.textureID = textureID;
	}
	public boolean isHasTransparency() {
		return hasTransparency;
	}
	public void setHasTransparency(boolean hasTransparency) {
		this.hasTransparency = hasTransparency;
	}
	public boolean isUseFakeLighting() {
		return useFakeLighting;
	}
	public void setUseFakeLighting(boolean useFakeLighting) {
		this.useFakeLighting = useFakeLighting;
	}
	

}
