/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelSansho
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer HeadChild_6;
    private final ModelRenderer HeadChild_14;
    private final ModelRenderer HeadChild_3;
    private final ModelRenderer HeadChild;
    private final ModelRenderer HeadChild_5;
    private final ModelRenderer HeadChild_7;
    private final ModelRenderer HeadChild_4;
    private final ModelRenderer HeadChild_13;
    private final ModelRenderer HeadChild_12;
    private final ModelRenderer HeadChild_2;
    private final ModelRenderer HeadChild_9;
    private final ModelRenderer HeadChild_10;
    private final ModelRenderer HeadChild_1;
    private final ModelRenderer HeadChild_8;
    private final ModelRenderer HeadChild_11;
    private final ModelRenderer HeadChild_15;
    private final ModelRenderer HeadChild_16;
    private final ModelRenderer Body;
    private final ModelRenderer Cape;
    private final ModelRenderer leftarmshoulder;
    private final ModelRenderer rightarmshoulder;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer bone;
    private final ModelRenderer LLeg;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelSansho(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Head.cubeList.add(new ModelBox(this.Head, 2, 0, 4.0f, -1.0f, -4.0f, 0, 7, 1, 0.0f));
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -1.0f, -4.0f, 0, 7, 1, 0.0f));
        this.HeadChild_6 = new ModelRenderer(this);
        this.HeadChild_6.setRotationPoint(-1.0f, -10.0f, 4.0f);
        this.setRotationAngle(this.HeadChild_6, -0.3491f, 0.0f, 0.6982f);
        this.Head.addChild(this.HeadChild_6);
        this.HeadChild_14 = new ModelRenderer(this);
        this.HeadChild_14.setRotationPoint(-6.0f, -7.5f, -0.9f);
        this.setRotationAngle(this.HeadChild_14, -0.3491f, 0.0f, 0.4363f);
        this.Head.addChild(this.HeadChild_14);
        this.HeadChild_3 = new ModelRenderer(this);
        this.HeadChild_3.setRotationPoint(2.0f, -7.0f, 0.0f);
        this.setRotationAngle(this.HeadChild_3, 0.0f, 0.0873f, 0.7854f);
        this.Head.addChild(this.HeadChild_3);
        this.HeadChild = new ModelRenderer(this);
        this.HeadChild.setRotationPoint(-1.0f, -8.7f, 0.0f);
        this.setRotationAngle(this.HeadChild, -0.0873f, 0.0f, -0.6108f);
        this.Head.addChild(this.HeadChild);
        this.HeadChild_5 = new ModelRenderer(this);
        this.HeadChild_5.setRotationPoint(-5.0f, -7.0f, 4.0f);
        this.setRotationAngle(this.HeadChild_5, -0.3491f, 0.0f, -0.7854f);
        this.Head.addChild(this.HeadChild_5);
        this.HeadChild_7 = new ModelRenderer(this);
        this.HeadChild_7.setRotationPoint(-5.0f, -7.0f, 2.0f);
        this.setRotationAngle(this.HeadChild_7, 2.7925f, 0.0873f, -1.309f);
        this.Head.addChild(this.HeadChild_7);
        this.HeadChild_4 = new ModelRenderer(this);
        this.HeadChild_4.setRotationPoint(-5.0f, -6.0f, -2.0f);
        this.setRotationAngle(this.HeadChild_4, 2.7925f, 0.0873f, -1.1345f);
        this.Head.addChild(this.HeadChild_4);
        this.HeadChild_13 = new ModelRenderer(this);
        this.HeadChild_13.setRotationPoint(2.0f, -5.0f, -1.0f);
        this.setRotationAngle(this.HeadChild_13, -0.3491f, 0.0f, -0.4363f);
        this.Head.addChild(this.HeadChild_13);
        this.HeadChild_12 = new ModelRenderer(this);
        this.HeadChild_12.setRotationPoint(0.0f, -5.0f, -2.0f);
        this.setRotationAngle(this.HeadChild_12, -0.3491f, 0.0f, -0.4363f);
        this.Head.addChild(this.HeadChild_12);
        this.HeadChild_2 = new ModelRenderer(this);
        this.HeadChild_2.setRotationPoint(1.0f, -8.0f, 0.0f);
        this.setRotationAngle(this.HeadChild_2, 0.0f, 0.0f, 0.6981f);
        this.Head.addChild(this.HeadChild_2);
        this.HeadChild_9 = new ModelRenderer(this);
        this.HeadChild_9.setRotationPoint(0.0f, -2.0f, 6.0f);
        this.setRotationAngle(this.HeadChild_9, -0.5236f, 0.3491f, 0.0f);
        this.Head.addChild(this.HeadChild_9);
        this.HeadChild_10 = new ModelRenderer(this);
        this.HeadChild_10.setRotationPoint(-4.0f, -2.0f, 4.0f);
        this.setRotationAngle(this.HeadChild_10, -0.5236f, -0.2618f, 0.0f);
        this.Head.addChild(this.HeadChild_10);
        this.HeadChild_1 = new ModelRenderer(this);
        this.HeadChild_1.setRotationPoint(-3.0f, -10.0f, 0.0f);
        this.setRotationAngle(this.HeadChild_1, 0.0f, 0.0f, -0.6981f);
        this.Head.addChild(this.HeadChild_1);
        this.HeadChild_8 = new ModelRenderer(this);
        this.HeadChild_8.setRotationPoint(3.0f, -8.0f, 2.0f);
        this.setRotationAngle(this.HeadChild_8, 2.7925f, 0.0873f, 0.9599f);
        this.Head.addChild(this.HeadChild_8);
        this.HeadChild_11 = new ModelRenderer(this);
        this.HeadChild_11.setRotationPoint(-4.0f, -8.0f, -2.0f);
        this.setRotationAngle(this.HeadChild_11, -0.3491f, 0.0f, 0.3491f);
        this.Head.addChild(this.HeadChild_11);
        this.HeadChild_15 = new ModelRenderer(this);
        this.HeadChild_15.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HeadChild_15, 0.0f, 0.5236f, 0.0f);
        this.Head.addChild(this.HeadChild_15);
        this.HeadChild_15.cubeList.add(new ModelBox(this.HeadChild_15, 12, 26, 4.0f, -6.0f, -1.0f, 0, 4, 6, 0.0f));
        this.HeadChild_16 = new ModelRenderer(this);
        this.HeadChild_16.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HeadChild_16, 0.0f, -0.5236f, 0.0f);
        this.Head.addChild(this.HeadChild_16);
        this.HeadChild_16.cubeList.add(new ModelBox(this.HeadChild_16, 24, 14, -4.0f, -6.0f, -1.0f, 0, 4, 6, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.2f, 5.4f, -0.2f);
        this.Body.cubeList.add(new ModelBox(this.Body, 0, 16, -4.2f, -5.4f, -1.8f, 8, 12, 4, 0.0f));
        this.Cape = new ModelRenderer(this);
        this.Cape.setRotationPoint(0.0f, -1.0f, 0.0f);
        this.setRotationAngle(this.Cape, 0.1745f, 0.0f, 0.0f);
        this.Body.addChild(this.Cape);
        this.Cape.cubeList.add(new ModelBox(this.Cape, 24, 24, -4.2f, -5.0f, 3.0f, 8, 23, 0, 0.0f));
        this.leftarmshoulder = new ModelRenderer(this);
        this.leftarmshoulder.setRotationPoint(4.8f, -3.4f, -0.3f);
        this.setRotationAngle(this.leftarmshoulder, 0.0f, 0.0f, -0.1f);
        this.Body.addChild(this.leftarmshoulder);
        this.leftarmshoulder.cubeList.add(new ModelBox(this.leftarmshoulder, 26, 10, -1.0f, -3.0f, -3.0f, 7, 4, 6, 0.0f));
        this.leftarmshoulder.cubeList.add(new ModelBox(this.leftarmshoulder, 24, 4, 4.2745f, -5.4858f, -2.0f, 1, 3, 1, 0.0f));
        this.leftarmshoulder.cubeList.add(new ModelBox(this.leftarmshoulder, 0, 16, 1.2895f, -5.7853f, 0.0f, 1, 3, 1, 0.0f));
        this.rightarmshoulder = new ModelRenderer(this);
        this.rightarmshoulder.setRotationPoint(-5.2f, -3.4f, -0.4f);
        this.setRotationAngle(this.rightarmshoulder, 0.0f, 0.0f, 0.1f);
        this.Body.addChild(this.rightarmshoulder);
        this.rightarmshoulder.cubeList.add(new ModelBox(this.rightarmshoulder, 32, 0, -6.0f, -3.0f, -3.0f, 7, 4, 6, 0.0f));
        this.rightarmshoulder.cubeList.add(new ModelBox(this.rightarmshoulder, 4, 0, -5.2795f, -5.5857f, -2.0f, 1, 3, 1, 0.0f));
        this.rightarmshoulder.cubeList.add(new ModelBox(this.rightarmshoulder, 4, 4, -2.2945f, -5.8852f, 0.0f, 1, 3, 1, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.setRotationAngle(this.RArm, 0.0f, 0.0f, 0.0873f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 40, 40, -3.9128f, -1.0038f, -2.0f, 4, 12, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.setRotationAngle(this.LArm, 0.0f, 0.0f, -0.0873f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 12, 44, 7.9128f, -1.0038f, -2.0f, 4, 12, 4, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 32, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 32, 0, -2.5f, 0.4f, -2.4f, 4, 5, 5, 0.0f));
        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bone, 0.0f, 0.0f, 0.0873f);
        this.RLeg.addChild(this.bone);
        this.bone.cubeList.add(new ModelBox(this.bone, 24, 2, -3.091f, 8.9166f, 0.0f, 2, 1, 1, 0.0f));
        this.bone.cubeList.add(new ModelBox(this.bone, 24, 0, -3.2653f, 6.9243f, 0.0f, 2, 1, 1, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 40, 20, 2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 32, 0, 2.5f, 0.4f, -2.4f, 4, 5, 5, 0.0f));
        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.setRotationAngle(this.bone2, 0.0f, 0.0f, -0.0873f);
        this.LLeg.addChild(this.bone2);
        this.bone2.cubeList.add(new ModelBox(this.bone2, 20, 18, 4.0f, -3.0f, 0.0f, 2, 1, 1, 0.0f));
        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(2.0f, 10.0f, 0.0f);
        this.setRotationAngle(this.bone3, 0.0f, 0.0f, -0.0873f);
        this.LLeg.addChild(this.bone3);
        this.bone3.cubeList.add(new ModelBox(this.bone3, 20, 16, 4.0f, -3.0f, 0.0f, 2, 1, 1, 0.0f));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glScalef((float)this.scaleX, (float)this.scaleY, (float)this.scaleZ);
        GL11.glTranslatef((float)0.0f, (float)((float)((double)-1.04f + 5.5 / (1.0 + Math.pow(this.scaleY / 0.45f, 1.88f)))), (float)0.0f);
        this.Head.render(f5);
        this.Body.render(f5);
        GL11.glPopMatrix();
        this.Head.rotateAngleY = f3 / 57.295776f;
        this.Head.rotateAngleX = f4 / 57.295776f;
        this.RArm.rotateAngleX = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 2.0f * f1 * 0.5f;
        this.LArm.rotateAngleX = MathHelper.cos(f * 0.6662f) * 2.0f * f1 * 0.5f;
        this.RArm.rotateAngleZ = 0.0f;
        this.LArm.rotateAngleZ = 0.0f;
        this.RLeg.rotateAngleX = MathHelper.cos(f * 0.6662f) * 1.4f * f1;
        this.LLeg.rotateAngleX = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.4f * f1;
        this.RLeg.rotateAngleY = 0.0f;
        this.LLeg.rotateAngleY = 0.0f;
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

