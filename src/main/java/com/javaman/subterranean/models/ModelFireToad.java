package com.javaman.subterranean.models;

//Date: 2015-03-02 10:00:33 PM
//Template version 1.1
//Java generated by Techne
//Keep in mind that you still need to fill in some blanks
//- ZeuX






// Date: 2015-03-03 6:09:48 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class ModelFireToad extends ModelBase
{
  //fields
    ModelRenderer uperB;
    ModelRenderer wart1;
    ModelRenderer wart2;
    ModelRenderer wart3;
    ModelRenderer wart4;
    ModelRenderer wart5;
    ModelRenderer wart6;
    ModelRenderer wart7;
    ModelRenderer underside;
    ModelRenderer backleg1;
    ModelRenderer backleg2;
    ModelRenderer frontlegsec1;
    ModelRenderer frontlegsec2;
    ModelRenderer fls1;
    ModelRenderer fls2;
    ModelRenderer head;
    ModelRenderer jaw;
    ModelRenderer eye_1;
    ModelRenderer eye_2;
    float headYRot;
    float headXRot;
  public ModelFireToad()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      uperB = new ModelRenderer(this, 0, 0);
      uperB.addBox(0F, 0F, 0F, 12, 1, 16);
      uperB.setRotationPoint(-8F, 15F, -6F);
      uperB.setTextureSize(128, 64);
      uperB.mirror = true;
      setRotation(uperB, -0.3141593F, 0F, 0F);
      wart1 = new ModelRenderer(this, 0, 0);
      wart1.addBox(1F, -2F, 6F, 3, 2, 3);
      wart1.setRotationPoint(-8F, 15F, -6F);
      wart1.setTextureSize(128, 64);
      wart1.mirror = true;
      setRotation(wart1, -0.3141593F, 0F, 0F);
      wart2 = new ModelRenderer(this, 0, 0);
      wart2.addBox(9F, -1F, 7F, 2, 1, 2);
      wart2.setRotationPoint(-8F, 15F, -6F);
      wart2.setTextureSize(128, 64);
      wart2.mirror = true;
      setRotation(wart2, -0.3141593F, 0F, 0F);
      wart3 = new ModelRenderer(this, 0, 0);
      wart3.addBox(8F, -1F, 3F, 1, 1, 1);
      wart3.setRotationPoint(-8F, 15F, -6F);
      wart3.setTextureSize(128, 64);
      wart3.mirror = true;
      setRotation(wart3, -0.3141593F, 0F, 0F);
      wart4 = new ModelRenderer(this, 0, 0);
      wart4.addBox(6F, -1F, 9F, 2, 1, 2);
      wart4.setRotationPoint(-8F, 15F, -6F);
      wart4.setTextureSize(128, 64);
      wart4.mirror = true;
      setRotation(wart4, -0.3141593F, 0F, 0F);
      wart5 = new ModelRenderer(this, 0, 0);
      wart5.addBox(3F, -1F, 12F, 2, 1, 2);
      wart5.setRotationPoint(-8F, 15F, -6F);
      wart5.setTextureSize(128, 64);
      wart5.mirror = true;
      setRotation(wart5, -0.3141593F, 0F, 0F);
      wart6 = new ModelRenderer(this, 0, 0);
      wart6.addBox(2F, -1F, 2F, 2, 1, 2);
      wart6.setRotationPoint(-8F, 15F, -6F);
      wart6.setTextureSize(128, 64);
      wart6.mirror = true;
      setRotation(wart6, -0.3141593F, 0F, 0F);
      wart7 = new ModelRenderer(this, 0, 0);
      wart7.addBox(8F, -2F, 13F, 2, 2, 2);
      wart7.setRotationPoint(-8F, 15F, -6F);
      wart7.setTextureSize(128, 64);
      wart7.mirror = true;
      setRotation(wart7, -0.3141593F, 0F, 0F);
      underside = new ModelRenderer(this, 0, 0);
      underside.addBox(1F, 1F, 0F, 10, 2, 15);
      underside.setRotationPoint(-8F, 15F, -6F);
      underside.setTextureSize(128, 64);
      underside.mirror = true;
      setRotation(underside, -0.3141593F, 0F, 0F);
      backleg1 = new ModelRenderer(this, 30, 25);
      backleg1.addBox(2F, 6.4F, 11F, 2, 2, 2);
      backleg1.setRotationPoint(-8F, 15F, -6F);
      backleg1.setTextureSize(128, 64);
      backleg1.mirror = true;
      setRotation(backleg1, 0F, 0F, 0F);
      backleg2 = new ModelRenderer(this, 30, 25);
      backleg2.addBox(8F, 6.4F, 11F, 2, 2, 2);
      backleg2.setRotationPoint(-8F, 15F, -6F);
      backleg2.setTextureSize(128, 64);
      backleg2.mirror = true;
      setRotation(backleg2, 0F, 0F, 0F);
      frontlegsec1 = new ModelRenderer(this, 22, 24);
      frontlegsec1.addBox(2F, 3F, 0F, 2, 3, 2);
      frontlegsec1.setRotationPoint(-8F, 15F, -6F);
      frontlegsec1.setTextureSize(128, 64);
      frontlegsec1.mirror = true;
      setRotation(frontlegsec1, 0F, 0F, 0F);
      frontlegsec2 = new ModelRenderer(this, 22, 24);
      frontlegsec2.addBox(8F, 3F, 0F, 2, 3, 2);
      frontlegsec2.setRotationPoint(-8F, 15F, -6F);
      frontlegsec2.setTextureSize(128, 64);
      frontlegsec2.mirror = true;
      setRotation(frontlegsec2, 0F, 0F, 0F);
      fls1 = new ModelRenderer(this, 28, 29);
      fls1.addBox(0F, 0F, 0F, 2, 4, 2);
      fls1.setRotationPoint(-6F, 20F, -6F);
      fls1.setTextureSize(128, 64);
      fls1.mirror = true;
      setRotation(fls1, -0.296706F, 0F, 0F);
      fls2 = new ModelRenderer(this, 28, 29);
      fls2.addBox(0F, 0F, 0F, 2, 4, 2);
      fls2.setRotationPoint(0F, 20F, -6F);
      fls2.setTextureSize(128, 64);
      fls2.mirror = true;
      setRotation(fls2, -0.296706F, 0F, 0F);
      head = new ModelRenderer(this, 0, 21);
      head.addBox(-3F, -1.5F, -5F, 6, 3, 5);
      head.setRotationPoint(-2F, 14.5F, -6F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      jaw = new ModelRenderer(this, 8, 29);
      jaw.addBox(-3F, 0.5F, -6F, 6, 1, 4);
      jaw.setRotationPoint(-2F, 14.5F, -6F);
      jaw.setTextureSize(128, 64);
      jaw.mirror = true;
      setRotation(jaw, 0.6632251F, 0F, 0F);
      eye_1 = new ModelRenderer(this, 0, 33);
      eye_1.addBox(-2.5F, -3F, -4.5F, 2, 2, 2);
      eye_1.setRotationPoint(-2F, 14.5F, -6F);
      eye_1.setTextureSize(128, 64);
      eye_1.mirror = true;
      setRotation(eye_1, 0F, 0F, 0F);
      eye_2 = new ModelRenderer(this, 0, 29);
      eye_2.addBox(0.5F, -3F, -4.5F, 2, 2, 2);
      eye_2.setRotationPoint(-2F, 14.5F, -6F);
      eye_2.setTextureSize(128, 64);
      eye_2.mirror = true;
      setRotation(eye_2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    uperB.render(f5);
    wart1.render(f5);
    wart2.render(f5);
    wart3.render(f5);
    wart4.render(f5);
    wart5.render(f5);
    wart6.render(f5);
    wart7.render(f5);
    underside.render(f5);
    backleg1.render(f5);
    backleg2.render(f5);
    frontlegsec1.render(f5);
    frontlegsec2.render(f5);
    fls1.render(f5);
    fls2.render(f5);
    head.render(f5);
    jaw.render(f5);
    eye_1.render(f5);
    eye_2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float time, float limbSwingDistance, float p_78087_3_, float headYRot, float headXRot, float p_78087_6_, Entity entity)
  {
	  this.headXRot = headXRot;
	  this.headYRot = headYRot;
	  this.head.rotateAngleX = headXRot / (180F / (float)Math.PI);
	  this.head.rotateAngleY = headYRot / (180F / (float)Math.PI);
	  this.jaw.rotateAngleX = headXRot / (180F +80F/ (float)Math.PI);
	  this.jaw.rotateAngleY = headYRot / (180F / (float)Math.PI);
	  this.eye_1.rotateAngleX = headXRot / (180F / (float)Math.PI);
	  this.eye_1.rotateAngleY = headYRot / (180F / (float)Math.PI);
	  this.eye_2.rotateAngleX = headXRot / (180F / (float)Math.PI);
	  this.eye_2.rotateAngleY = headYRot / (180F / (float)Math.PI);
		 
		 //this.body.rotateAngleX = ((float)Math.PI / 2F);
		 
		 //this.frontlegsec1.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * limbSwingDistance;
		 this.fls1.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * limbSwingDistance;
		 //this.backleg1.rotateAngleX = MathHelper.cos(time * 0.6662F + (float)Math.PI) * 1.4F * limbSwingDistance;
		 //this.backleg2.rotateAngleX = MathHelper.cos(time * 0.6662F + (float)Math.PI) * 1.4F * limbSwingDistance;
		 //this.frontlegsec2.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * limbSwingDistance;
		 this.fls2.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * limbSwingDistance;
  }
  /*public void setRotationAnglesFight()
  {
	  System.out.println("fire");
	  
	  this.jaw.rotateAngleX = headXRot / (180F -360F/ (float)Math.PI);
	  //this.jaw.rotateAngleY = headYRot / (180F / (float)Math.PI);
	 
		 
  }*/

}