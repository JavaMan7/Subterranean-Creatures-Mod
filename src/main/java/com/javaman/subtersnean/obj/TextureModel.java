package com.javaman.subtersnean.obj;

public class TextureModel {
	private RawModel rawModel;
	private ModelTexture texture;
	
	
	
	
	public TextureModel(RawModel rawModel, ModelTexture texture) {
		super();
		this.rawModel = rawModel;
		this.texture = texture;
	}
	public RawModel getRawModel() {
		return rawModel;
	}
	public ModelTexture getTexture() {
		return texture;
	}
	
	

}
