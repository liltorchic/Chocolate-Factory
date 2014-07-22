package com.spazzy.ChocolateFactory.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelChocolateRoller extends ModelBase
{
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer roller1;
    ModelRenderer roller2;
    ModelRenderer roller3;
    ModelRenderer roller4;
    ModelRenderer roller5;
    ModelRenderer roller6;
    ModelRenderer roller7;
  
  public ModelChocolateRoller()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      Shape1 = new ModelRenderer(this, 0, 41);
      Shape1.addBox(0F, 0F, 0F, 16, 31, 2);
      Shape1.setRotationPoint(-8F, -8F, 6F);
      Shape1.setTextureSize(256, 256);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 32);
      Shape2.addBox(0F, 0F, 0F, 16, 2, 1);
      Shape2.setRotationPoint(-8F, 21F, -8F);
      Shape2.setTextureSize(256, 256);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 11);
      Shape3.addBox(0F, 0F, 0F, 16, 1, 16);
      Shape3.setRotationPoint(-8F, 23F, -8F);
      Shape3.setTextureSize(256, 256);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 70, 11);
      Shape4.addBox(0F, 0F, 0F, 16, 1, 1);
      Shape4.setRotationPoint(-8F, -8F, 5F);
      Shape4.setTextureSize(256, 256);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 74);
      Shape5.addBox(0F, 0F, 0F, 13, 30, 0);
      Shape5.setRotationPoint(-8F, -7F, 6F);
      Shape5.setTextureSize(256, 256);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 1.570796F, 0F);
      Shape6 = new ModelRenderer(this, 26, 74);
      Shape6.addBox(0F, 0F, 0F, 13, 30, 0);
      Shape6.setRotationPoint(8F, -7F, 6F);
      Shape6.setTextureSize(256, 256);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 1.570796F, 0F);
      roller1 = new ModelRenderer(this, 2, 105);
      roller1.addBox(0F, 0F, 0F, 16, 2, 2);
      roller1.setRotationPoint(-8F, 1F, 3F);
      roller1.setTextureSize(256, 256);
      roller1.mirror = true;
      setRotation(roller1, 0F, 0F, 0F);
      roller2 = new ModelRenderer(this, 2, 105);
      roller2.addBox(0F, 0F, 0F, 16, 2, 2);
      roller2.setRotationPoint(-8F, 3F, 2F);
      roller2.setTextureSize(256, 256);
      roller2.mirror = true;
      setRotation(roller2, 0F, 0F, 0F);
      roller3 = new ModelRenderer(this, 0, 105);
      roller3.addBox(0F, 0F, 0F, 16, 4, 4);
      roller3.setRotationPoint(-8F, 5F, 0F);
      roller3.setTextureSize(256, 256);
      roller3.mirror = true;
      setRotation(roller3, 0F, 0F, 0F);
      roller4 = new ModelRenderer(this, 0, 105);
      roller4.addBox(0F, 0F, 0F, 16, 4, 4);
      roller4.setRotationPoint(-8F, 9F, 1F);
      roller4.setTextureSize(256, 256);
      roller4.mirror = true;
      setRotation(roller4, 0F, 0F, 0F);
      roller5 = new ModelRenderer(this, 0, 105);
      roller5.addBox(0F, 0F, 0F, 16, 4, 4);
      roller5.setRotationPoint(-8F, 13F, -2F);
      roller5.setTextureSize(256, 256);
      roller5.mirror = true;
      setRotation(roller5, 0F, 0F, 0F);
      roller6 = new ModelRenderer(this, 2, 105);
      roller6.addBox(0F, 0F, 0F, 16, 2, 2);
      roller6.setRotationPoint(-8F, 17F, -4F);
      roller6.setTextureSize(256, 256);
      roller6.mirror = true;
      setRotation(roller6, 0F, 0F, 0F);
      roller7 = new ModelRenderer(this, 0, 105);
      roller7.addBox(0F, 0F, 0F, 16, 4, 4);
      roller7.setRotationPoint(-8F, 19F, -6F);
      roller7.setTextureSize(256, 256);
      roller7.mirror = true;
      setRotation(roller7, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    roller1.render(f5);
    roller2.render(f5);
    roller3.render(f5);
    roller4.render(f5);
    roller5.render(f5);
    roller6.render(f5);
    roller7.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
