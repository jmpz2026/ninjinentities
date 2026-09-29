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

public class ModelCymbal
extends ModelBase {
    private final ModelRenderer Body;
    private final ModelRenderer bone3;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer LLeg;
    private final ModelRenderer RLeg;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail3;
    private final ModelRenderer LeftWing;
    private final ModelRenderer RightWing;
    private final ModelRenderer Head;
    private final ModelRenderer EarL;
    private final ModelRenderer EarR;
    private final ModelRenderer bone2;
    private final ModelRenderer Snout;
    private final ModelRenderer HornR;
    private final ModelRenderer HornL;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelCymbal(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 90;
        this.textureHeight = 90;
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 0, 0, -6.0f, 0.0f, -3.0f, 12, 12, 6, 0.0f));
        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Body.addChild(this.bone3);
        this.bone3.cubeList.add(new ModelBox(this.bone3, 59, 34, 0.0f, -23.0f, 3.0f, 0, 10, 2, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.setRotationAngle(this.RArm, -0.0086f, 0.0f, 0.0873f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 42, 15, -5.0f, -2.0f, -2.0f, 4, 11, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.setRotationAngle(this.LArm, -0.0086f, 0.0f, -0.0873f);
        this.Body.addChild(this.LArm);
        this.LArm.mirror = true;
        this.LArm.cubeList.add(new ModelBox(this.LArm, 42, 15, 1.0f, -2.0f, -2.0f, 4, 11, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 26, 28, -1.9f, 0.0f, -3.0f, 5, 12, 6, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.Body.addChild(this.RLeg);
        this.RLeg.mirror = true;
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 26, 28, -3.1f, 0.0f, -3.0f, 5, 12, 6, 0.0f));
        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Body.addChild(this.Tail1);
        this.Tail1.cubeList.add(new ModelBox(this.Tail1, 0, 74, -2.0f, -13.0f, 3.0f, 4, 4, 7, 0.0f));
        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(0.0f, 13.0f, 10.0f);
        this.setRotationAngle(this.Tail2, -0.3491f, 0.0f, 0.0f);
        this.Body.addChild(this.Tail2);
        this.Tail2.cubeList.add(new ModelBox(this.Tail2, 21, 74, -1.5f, -1.6579f, -0.9397f, 3, 3, 7, 0.0f));
        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setRotationPoint(-0.8125f, 15.0625f, 15.5702f);
        this.setRotationAngle(this.Tail3, -0.3491f, 0.6109f, 0.0f);
        this.Body.addChild(this.Tail3);
        this.Tail3.cubeList.add(new ModelBox(this.Tail3, 39, 77, -0.1704f, -1.251f, -0.7723f, 3, 2, 7, 0.0f));
        this.LeftWing = new ModelRenderer(this);
        this.LeftWing.setRotationPoint(2.3f, 2.2f, 0.8f);
        this.setRotationAngle(this.LeftWing, 0.6716f, 0.607f, -0.4098f);
        this.Body.addChild(this.LeftWing);
        this.LeftWing.cubeList.add(new ModelBox(this.LeftWing, 66, 0, 1.0f, 0.0f, 0.0f, 0, 16, 11, 0.0f));
        this.RightWing = new ModelRenderer(this);
        this.RightWing.setRotationPoint(-2.3f, 2.2f, 0.8f);
        this.setRotationAngle(this.RightWing, 0.6716f, -0.607f, 0.4098f);
        this.Body.addChild(this.RightWing);
        this.RightWing.mirror = true;
        this.RightWing.cubeList.add(new ModelBox(this.RightWing, 66, 0, -1.0f, 0.0f, 0.0f, 0, 16, 11, 0.0f));
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 18, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.5f));
        this.EarL = new ModelRenderer(this);
        this.EarL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.EarL, 0.0f, 0.5236f, 0.0f);
        this.Head.addChild(this.EarL);
        this.EarL.cubeList.add(new ModelBox(this.EarL, 24, 16, 4.0f, -6.0f, -1.0f, 0, 4, 6, 0.0f));
        this.EarR = new ModelRenderer(this);
        this.EarR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.EarR, 0.0f, -0.5236f, 0.0f);
        this.Head.addChild(this.EarR);
        this.EarR.cubeList.add(new ModelBox(this.EarR, 24, 12, -4.0f, -6.0f, -1.0f, 0, 4, 6, 0.0f));
        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.bone2);
        this.bone2.cubeList.add(new ModelBox(this.bone2, 36, 52, 0.0f, -10.0f, -4.0f, 0, 2, 9, 0.0f));
        this.bone2.cubeList.add(new ModelBox(this.bone2, 0, 52, 0.0f, -10.0f, 4.0f, 0, 10, 2, 0.0f));
        this.Snout = new ModelRenderer(this);
        this.Snout.setRotationPoint(0.0f, -1.0f, -5.0f);
        this.setRotationAngle(this.Snout, 0.4363f, 0.0f, 0.0f);
        this.Head.addChild(this.Snout);
        this.Snout.cubeList.add(new ModelBox(this.Snout, 30, 48, -3.0f, -3.0f, -4.0f, 6, 4, 6, 0.0f));
        this.HornR = new ModelRenderer(this);
        this.HornR.setRotationPoint(0.0f, -8.0f, 1.0f);
        this.setRotationAngle(this.HornR, 0.4363f, 0.0f, 0.0f);
        this.Head.addChild(this.HornR);
        this.HornR.cubeList.add(new ModelBox(this.HornR, 58, 48, -3.1875f, -2.5468f, -4.2113f, 2, 2, 10, 0.0f));
        this.HornL = new ModelRenderer(this);
        this.HornL.setRotationPoint(0.0f, -8.0f, 1.0f);
        this.setRotationAngle(this.HornL, 0.4363f, 0.0f, 0.0f);
        this.Head.addChild(this.HornL);
        this.HornL.mirror = true;
        this.HornL.cubeList.add(new ModelBox(this.HornL, 58, 48, 1.1875f, -2.5468f, -4.2113f, 2, 2, 10, 0.0f));
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

