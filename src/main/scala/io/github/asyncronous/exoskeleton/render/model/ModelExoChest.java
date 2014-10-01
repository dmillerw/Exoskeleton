package io.github.asyncronous.exoskeleton.render.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelExoChest
extends ModelBiped{
    ModelRenderer wristR;
    ModelRenderer chest;
    ModelRenderer armJointR;
    ModelRenderer rib3;
    ModelRenderer rib2;
    ModelRenderer armR;
    ModelRenderer spineBar4;
    ModelRenderer armR2;
    ModelRenderer armJointL;
    ModelRenderer armL2;
    ModelRenderer armL;
    ModelRenderer wristL;
    ModelRenderer rib1;
    ModelRenderer spineBar3;
    ModelRenderer spineBar2;
    ModelRenderer spineBar1;
    ModelRenderer spine;
    ModelRenderer fillerR2;
    ModelRenderer fillerL2;
    ModelRenderer fillerL;
    ModelRenderer fillerR;

    public ModelExoChest(){
        textureWidth = 128;
        textureHeight = 64;

        wristR = new ModelRenderer(this, 56, 0);
        wristR.addBox(-1F, -2F, -2F, 5, 1, 5);
        wristR.setRotationPoint(-7.5F, 12F, -0.5F);
        wristR.setTextureSize(128, 64);
        wristR.mirror = true;
        setRotation(wristR, 0F, 0F, 0F);

        chest = new ModelRenderer(this, 56, 0);
        chest.addBox(0F, 0F, 0F, 2, 7, 1);
        chest.setRotationPoint(-1F, -0.5F, -2.9F);
        chest.setTextureSize(128, 64);
        chest.mirror = true;
        setRotation(chest, 0F, 0F, 0F);

        armJointR = new ModelRenderer(this, 56, 0);
        armJointR.addBox(-1F, -2F, -2F, 1, 2, 2);
        armJointR.setRotationPoint(-7.6F, 6.5F, 1F);
        armJointR.setTextureSize(128, 64);
        armJointR.mirror = true;
        setRotation(armJointR, 0F, 0F, 0F);

        rib3 = new ModelRenderer(this, 56, 0);
        rib3.addBox(-1F, -2F, -2F, 9, 1, 5);
        rib3.setRotationPoint(-3.5F, 4F, -0.5F);
        rib3.setTextureSize(128, 64);
        rib3.mirror = true;
        setRotation(rib3, 0F, 0F, 0F);

        rib2 = new ModelRenderer(this, 56, 0);
        rib2.addBox(-1F, -2F, -2F, 9, 1, 5);
        rib2.setRotationPoint(-3.5F, 6F, -0.5F);
        rib2.setTextureSize(128, 64);
        rib2.mirror = true;
        setRotation(rib2, 0F, 0F, 0F);

        armR = new ModelRenderer(this, 56, 0);
        armR.addBox(-1F, -2F, -2F, 5, 11, 1);
        armR.setRotationPoint(-7.4F, 1.8F, 1.5F);
        armR.setTextureSize(128, 64);
        armR.mirror = true;
        setRotation(armR, 0F, 0F, 0F);

        spineBar4 = new ModelRenderer(this, 56, 0);
        spineBar4.addBox(-1F, -2F, -2F, 5, 1, 1);
        spineBar4.setRotationPoint(-1.5F, 3F, 3.4F);
        spineBar4.setTextureSize(128, 64);
        spineBar4.mirror = true;
        setRotation(spineBar4, 0F, 0F, 0F);

        armR2 = new ModelRenderer(this, 56, 0);
        armR2.addBox(-1F, -2F, -2F, 5, 1, 5);
        armR2.setRotationPoint(-7.5F, 7F, -0.5F);
        armR2.setTextureSize(128, 64);
        armR2.mirror = true;
        setRotation(armR2, 0F, 0F, 0F);

        armJointL = new ModelRenderer(this, 56, 0);
        armJointL.addBox(-1F, -2F, -2F, 1, 2, 2);
        armJointL.setRotationPoint(8.6F, 6.5F, 1F);
        armJointL.setTextureSize(128, 64);
        armJointL.mirror = true;
        setRotation(armJointL, 0F, 0F, 0F);

        armL2 = new ModelRenderer(this, 56, 0);
        armL2.addBox(-1F, -2F, -2F, 5, 1, 5);
        armL2.setRotationPoint(4.5F, 7F, -0.5F);
        armL2.setTextureSize(128, 64);
        armL2.mirror = true;
        setRotation(armL2, 0F, 0F, 0F);

        armL = new ModelRenderer(this, 56, 0);
        armL.addBox(-5F, -2F, -1F, 5, 11, 1);
        armL.setRotationPoint(8.4F, 1.8F, 0.5F);
        armL.setTextureSize(128, 64);
        armL.mirror = true;
        setRotation(armL, 0F, 0F, 0F);

        wristL = new ModelRenderer(this, 56, 0);
        wristL.addBox(-1F, -2F, -2F, 5, 1, 5);
        wristL.setRotationPoint(4.5F, 12F, -0.5F);
        wristL.setTextureSize(128, 64);
        wristL.mirror = true;
        setRotation(wristL, 0F, 0F, 0F);

        rib1 = new ModelRenderer(this, 56, 0);
        rib1.addBox(-1F, -2F, -2F, 9, 1, 5);
        rib1.setRotationPoint(-3.5F, 8F, -0.5F);
        rib1.setTextureSize(128, 64);
        rib1.mirror = true;
        setRotation(rib1, 0F, 0F, 0F);

        spineBar3 = new ModelRenderer(this, 56, 0);
        spineBar3.addBox(-1F, -2F, -2F, 5, 1, 1);
        spineBar3.setRotationPoint(-1.5F, 5F, 3.4F);
        spineBar3.setTextureSize(128, 64);
        spineBar3.mirror = true;
        setRotation(spineBar3, 0F, 0F, 0F);

        spineBar2 = new ModelRenderer(this, 56, 0);
        spineBar2.addBox(-1F, -2F, -2F, 5, 1, 1);
        spineBar2.setRotationPoint(-1.5F, 7F, 3.4F);
        spineBar2.setTextureSize(128, 64);
        spineBar2.mirror = true;
        setRotation(spineBar2, 0F, 0F, 0F);

        spineBar1 = new ModelRenderer(this, 56, 0);
        spineBar1.addBox(-1F, -2F, -2F, 5, 1, 1);
        spineBar1.setRotationPoint(-1.5F, 9F, 3.4F);
        spineBar1.setTextureSize(128, 64);
        spineBar1.mirror = true;
        setRotation(spineBar1, 0F, 0F, 0F);

        spine = new ModelRenderer(this, 56, 0);
        spine.addBox(0F, 0F, 0F, 2, 12, 1);
        spine.setRotationPoint(-1F, -0.5F, 1.8F);
        spine.setTextureSize(128, 64);
        spine.mirror = true;
        setRotation(spine, 0F, 0F, 0F);

        fillerR2 = new ModelRenderer(this, 0, 32);
        fillerR2.addBox(0F, 0F, 0F, 4, 4, 3);
        fillerR2.setRotationPoint(-4.4F, 2.5F, -2.3F);
        fillerR2.setTextureSize(128, 64);
        fillerR2.mirror = true;
        setRotation(fillerR2, 0F, 0F, 0F);

        fillerL2 = new ModelRenderer(this, 0, 32);
        fillerL2.addBox(0F, 0F, 0F, 4, 4, 3);
        fillerL2.setRotationPoint(0.4F, 2.5F, -2.3F);
        fillerL2.setTextureSize(128, 64);
        fillerL2.mirror = true;
        setRotation(fillerL2, 0F, 0F, 0F);

        fillerL = new ModelRenderer(this, 0, 32);
        fillerL.addBox(0F, 0F, 0F, 4, 4, 3);
        fillerL.setRotationPoint(0.4F, 2.5F, -0.7F);
        fillerL.setTextureSize(128, 64);
        fillerL.mirror = true;
        setRotation(fillerL, 0F, 0F, 0F);

        fillerR = new ModelRenderer(this, 0, 32);
        fillerR.addBox(0F, 0F, 0F, 4, 4, 3);
        fillerR.setRotationPoint(-4.4F, 2.5F, -0.7F);
        fillerR.setTextureSize(128, 64);
        fillerR.mirror = true;
        setRotation(fillerR, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float scale){
        wristR.render(scale);
        chest.render(scale);
        armJointR.render(scale);
        rib3.render(scale);
        rib2.render(scale);
        armR.render(scale);
        spineBar4.render(scale);
        armR2.render(scale);
        armJointL.render(scale);
        armL2.render(scale);
        armL.render(scale);
        wristL.render(scale);
        rib1.render(scale);
        spineBar3.render(scale);
        spineBar2.render(scale);
        spineBar1.render(scale);
        spine.render(scale);
        fillerR2.render(scale);
        fillerL2.render(scale);
        fillerL.render(scale);
        fillerR.render(scale);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z){
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}