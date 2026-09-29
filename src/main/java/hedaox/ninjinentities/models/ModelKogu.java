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

public class ModelKogu
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer EarR;
    private final ModelRenderer EarL;
    private final ModelRenderer HeadBand;
    private final ModelRenderer HeadBand2;
    private final ModelRenderer Hair1;
    private final ModelRenderer Hair2;
    private final ModelRenderer Hair3;
    private final ModelRenderer Hair4;
    private final ModelRenderer Hair5;
    private final ModelRenderer Hair6;
    private final ModelRenderer Hair7;
    private final ModelRenderer Hair8;
    private final ModelRenderer Hair9;
    private final ModelRenderer Hair10;
    private final ModelRenderer Body;
    private final ModelRenderer bb_main;
    private final ModelRenderer RArm;
    private final ModelRenderer bone;
    private final ModelRenderer LArm;
    private final ModelRenderer bone2;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private final ModelRenderer Sword;
    private final ModelRenderer Blade;
    private final ModelRenderer Grip;
    private final ModelRenderer Guard;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelKogu(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 30, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.EarR = new ModelRenderer(this);
        this.EarR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.EarR, 0.0f, -0.5236f, 0.0f);
        this.EarR.mirror = true;
        this.Head.addChild(this.EarR);
        this.EarR.cubeList.add(new ModelBox(this.EarR, 26, 23, -4.0f, -8.0f, -1.0f, 0, 6, 6, 0.0f));
        this.EarL = new ModelRenderer(this);
        this.EarL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.EarL, 0.0f, 0.5236f, 0.0f);
        this.Head.addChild(this.EarL);
        this.EarL.cubeList.add(new ModelBox(this.EarL, 26, 23, 4.0f, -8.0f, -1.0f, 0, 6, 6, 0.0f));
        this.HeadBand = new ModelRenderer(this);
        this.HeadBand.setRotationPoint(-5.0f, -2.0f, -3.0f);
        this.setRotationAngle(this.HeadBand, 0.0f, -0.3491f, 0.3491f);
        this.Head.addChild(this.HeadBand);
        this.HeadBand.cubeList.add(new ModelBox(this.HeadBand, 0, 0, -0.1406f, -5.4111f, 0.0512f, 0, 5, 2, 0.0f));
        this.HeadBand2 = new ModelRenderer(this);
        this.HeadBand2.setRotationPoint(-4.0f, -1.0f, -2.0f);
        this.setRotationAngle(this.HeadBand2, 0.0873f, -0.6109f, 0.1745f);
        this.Head.addChild(this.HeadBand2);
        this.HeadBand2.cubeList.add(new ModelBox(this.HeadBand2, 0, 0, -0.1244f, -5.8508f, 0.1619f, 0, 4, 2, 0.0f));
        this.Hair1 = new ModelRenderer(this);
        this.Hair1.setRotationPoint(-1.1493f, -7.2362f, -2.6078f);
        this.setRotationAngle(this.Hair1, 1.0472f, 0.5236f, -0.5236f);
        this.Head.addChild(this.Hair1);
        this.Hair1.cubeList.add(new ModelBox(this.Hair1, 12, 3, -1.8507f, -4.0f, 0.0f, 2, 6, 2, 0.0f));
        this.Hair2 = new ModelRenderer(this);
        this.Hair2.setRotationPoint(-2.1493f, -6.2362f, 0.3922f);
        this.setRotationAngle(this.Hair2, 0.8727f, 1.2217f, 0.0f);
        this.Head.addChild(this.Hair2);
        this.Hair2.cubeList.add(new ModelBox(this.Hair2, 12, 3, -2.8507f, -4.0f, 0.0f, 3, 5, 2, 0.0f));
        this.Hair3 = new ModelRenderer(this);
        this.Hair3.setRotationPoint(-2.1493f, -6.2362f, 2.3922f);
        this.setRotationAngle(this.Hair3, 0.8727f, 1.9199f, 0.0f);
        this.Head.addChild(this.Hair3);
        this.Hair3.cubeList.add(new ModelBox(this.Hair3, 12, 3, -1.4396f, -3.8854f, 0.0962f, 2, 4, 1, 0.0f));
        this.Hair4 = new ModelRenderer(this);
        this.Hair4.setRotationPoint(-0.1493f, -6.2362f, 2.3922f);
        this.setRotationAngle(this.Hair4, 0.8727f, 2.9671f, 0.0f);
        this.Head.addChild(this.Hair4);
        this.Hair4.cubeList.add(new ModelBox(this.Hair4, 12, 3, -1.8507f, -4.0f, 0.0f, 3, 4, 1, 0.0f));
        this.Hair5 = new ModelRenderer(this);
        this.Hair5.setRotationPoint(0.8507f, -7.1737f, -3.2953f);
        this.setRotationAngle(this.Hair5, 1.3963f, -0.2618f, 0.0f);
        this.Head.addChild(this.Hair5);
        this.Hair5.cubeList.add(new ModelBox(this.Hair5, 12, 3, -1.8507f, -2.0f, 0.0f, 2, 4, 2, 0.0f));
        this.Hair6 = new ModelRenderer(this);
        this.Hair6.setRotationPoint(2.8507f, -7.2362f, -2.6078f);
        this.setRotationAngle(this.Hair6, 1.3963f, -0.7854f, 0.0f);
        this.Head.addChild(this.Hair6);
        this.Hair6.cubeList.add(new ModelBox(this.Hair6, 12, 3, -1.8507f, -3.0f, 0.0f, 2, 6, 1, 0.0f));
        this.Hair7 = new ModelRenderer(this);
        this.Hair7.setRotationPoint(-0.1493f, -6.2362f, -0.6078f);
        this.setRotationAngle(this.Hair7, -0.2618f, 0.5236f, -0.6109f);
        this.Head.addChild(this.Hair7);
        this.Hair7.cubeList.add(new ModelBox(this.Hair7, 12, 3, -2.8507f, -5.0f, 0.0f, 3, 5, 2, 0.0f));
        this.Hair8 = new ModelRenderer(this);
        this.Hair8.setRotationPoint(2.1493f, -6.2362f, 2.3922f);
        this.setRotationAngle(this.Hair8, 0.8727f, -1.9199f, 0.0f);
        this.Head.addChild(this.Hair8);
        this.Hair8.cubeList.add(new ModelBox(this.Hair8, 12, 3, -2.1493f, -4.0f, 0.0f, 2, 4, 1, 0.0f));
        this.Hair9 = new ModelRenderer(this);
        this.Hair9.setRotationPoint(2.1493f, -6.2362f, 0.3922f);
        this.setRotationAngle(this.Hair9, 0.8727f, -1.2217f, 0.0f);
        this.Head.addChild(this.Hair9);
        this.Hair9.cubeList.add(new ModelBox(this.Hair9, 12, 3, -2.1493f, -4.0f, 0.0f, 3, 5, 2, 0.0f));
        this.Hair10 = new ModelRenderer(this);
        this.Hair10.setRotationPoint(0.1493f, -6.2362f, -0.6078f);
        this.setRotationAngle(this.Hair10, -0.2618f, -0.5236f, 0.6109f);
        this.Head.addChild(this.Hair10);
        this.Hair10.cubeList.add(new ModelBox(this.Hair10, 12, 3, -1.1493f, -5.0f, 0.0f, 2, 5, 2, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.2f, 5.4f, -0.2f);
        this.Body.cubeList.add(new ModelBox(this.Body, 40, 0, -4.2f, -5.4f, -1.8f, 8, 12, 4, 0.0f));
        this.bb_main = new ModelRenderer(this);
        this.bb_main.setRotationPoint(-0.2f, 18.6f, 0.2f);
        this.Body.addChild(this.bb_main);
        this.bb_main.cubeList.add(new ModelBox(this.bb_main, 0, 75, -4.5f, -23.6f, -2.4f, 9, 10, 5, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 54, 54, -4.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(4.0f, 22.0f, 0.0f);
        this.RArm.addChild(this.bone);
        this.bone.cubeList.add(new ModelBox(this.bone, 40, 16, -9.0f, -25.0f, -3.0f, 5, 4, 6, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 0, 56, 8.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(4.0f, 22.0f, 0.0f);
        this.LArm.addChild(this.bone2);
        this.bone2.cubeList.add(new ModelBox(this.bone2, 0, 46, 4.0f, -25.0f, -3.0f, 5, 4, 6, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 22, 47, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 38, 47, 2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.Sword = new ModelRenderer(this);
        this.Sword.setRotationPoint(-4.2f, 4.6f, -3.8f);
        this.setRotationAngle(this.Sword, -0.4363f, -0.3491f, 0.0f);
        this.Body.addChild(this.Sword);
        this.Blade = new ModelRenderer(this);
        this.Blade.setRotationPoint(0.0f, 1.0f, 0.0f);
        this.Sword.addChild(this.Blade);
        this.Blade.cubeList.add(new ModelBox(this.Blade, 33, 26, 0.0f, -1.0f, 0.0f, 0, 1, 18, 0.0f));
        this.Grip = new ModelRenderer(this);
        this.Grip.setRotationPoint(1.0f, 1.0f, -6.0f);
        this.Sword.addChild(this.Grip);
        this.Grip.cubeList.add(new ModelBox(this.Grip, 41, 36, -1.5f, -1.0f, -1.0f, 1, 1, 7, 0.0f));
        this.Guard = new ModelRenderer(this);
        this.Guard.setRotationPoint(2.0f, 2.0f, 0.0f);
        this.Sword.addChild(this.Guard);
        this.Guard.cubeList.add(new ModelBox(this.Guard, 57, 32, -4.0f, -3.5f, 0.0f, 4, 4, 0, 0.0f));
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

