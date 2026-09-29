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

public class ModelBrolyZBio
extends ModelBase {
    private final ModelRenderer Body;
    private final ModelRenderer Head;
    private final ModelRenderer Hair_1;
    private final ModelRenderer Hair_18;
    private final ModelRenderer Hair_3;
    private final ModelRenderer Hair_19;
    private final ModelRenderer Hair_2;
    private final ModelRenderer Hair_16;
    private final ModelRenderer Hair_12;
    private final ModelRenderer Hair_17;
    private final ModelRenderer Hair_13;
    private final ModelRenderer Hair_9;
    private final ModelRenderer Hair_14;
    private final ModelRenderer Hair_5;
    private final ModelRenderer Hair_8;
    private final ModelRenderer Hair_6;
    private final ModelRenderer Hair_7;
    private final ModelRenderer Hair;
    private final ModelRenderer Hair_10;
    private final ModelRenderer Hair_11;
    private final ModelRenderer Hair_15;
    private final ModelRenderer Hair_4;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelBrolyZBio(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(-3.8f, 5.4f, 3.8f);
        this.Body.cubeList.add(new ModelBox(this.Body, 16, 16, -0.2f, -5.4f, -5.8f, 8, 12, 4, 0.0f));
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Hair_1 = new ModelRenderer(this);
        this.Hair_1.setRotationPoint(-4.0f, -11.0f, 0.0f);
        this.setRotationAngle(this.Hair_1, -0.7854f, 0.0f, 1.6581f);
        this.Head.addChild(this.Hair_1);
        this.Hair_18 = new ModelRenderer(this);
        this.Hair_18.setRotationPoint(0.0f, -5.0f, -2.5f);
        this.setRotationAngle(this.Hair_18, -0.3491f, -0.1745f, -0.7854f);
        this.Head.addChild(this.Hair_18);
        this.Hair_3 = new ModelRenderer(this);
        this.Hair_3.setRotationPoint(3.0f, -7.0f, 2.0f);
        this.setRotationAngle(this.Hair_3, -0.5236f, 0.0873f, 0.2618f);
        this.Head.addChild(this.Hair_3);
        this.Hair_19 = new ModelRenderer(this);
        this.Hair_19.setRotationPoint(-5.0f, -10.0f, -2.5f);
        this.setRotationAngle(this.Hair_19, -0.3491f, -0.1745f, 0.6981f);
        this.Head.addChild(this.Hair_19);
        this.Hair_2 = new ModelRenderer(this);
        this.Hair_2.setRotationPoint(4.0f, -11.0f, -1.0f);
        this.setRotationAngle(this.Hair_2, -0.6981f, 0.2618f, -1.9199f);
        this.Head.addChild(this.Hair_2);
        this.Hair_16 = new ModelRenderer(this);
        this.Hair_16.setRotationPoint(0.5f, 0.8f, 7.4f);
        this.setRotationAngle(this.Hair_16, 0.3491f, 0.0f, -0.5236f);
        this.Head.addChild(this.Hair_16);
        this.Hair_16.cubeList.add(new ModelBox(this.Hair_16, 40, 3, 1.9972f, -6.6289f, -4.1585f, 3, 7, 3, 0.0f));
        this.Hair_12 = new ModelRenderer(this);
        this.Hair_12.setRotationPoint(7.5f, -8.2f, 2.4f);
        this.setRotationAngle(this.Hair_12, -0.2618f, -0.2618f, 2.8798f);
        this.Head.addChild(this.Hair_12);
        this.Hair_12.cubeList.add(new ModelBox(this.Hair_12, 40, 3, 3.4302f, -6.1456f, -4.9624f, 2, 7, 3, 0.0f));
        this.Hair_17 = new ModelRenderer(this);
        this.Hair_17.setRotationPoint(-2.0f, -8.0f, -2.0f);
        this.setRotationAngle(this.Hair_17, -0.3491f, -0.0873f, 0.2618f);
        this.Head.addChild(this.Hair_17);
        this.Hair_13 = new ModelRenderer(this);
        this.Hair_13.setRotationPoint(-7.5f, -8.2f, 2.4f);
        this.setRotationAngle(this.Hair_13, -0.2618f, 0.2618f, -2.8798f);
        this.Head.addChild(this.Hair_13);
        this.Hair_13.cubeList.add(new ModelBox(this.Hair_13, 41, 3, -5.4302f, -6.1456f, -4.9624f, 2, 7, 3, 0.0f));
        this.Hair_9 = new ModelRenderer(this);
        this.Hair_9.setRotationPoint(-4.0f, -7.0f, 2.0f);
        this.setRotationAngle(this.Hair_9, 2.7925f, -0.0873f, -1.2217f);
        this.Head.addChild(this.Hair_9);
        this.Hair_14 = new ModelRenderer(this);
        this.Hair_14.setRotationPoint(3.5f, -3.2f, 7.4f);
        this.setRotationAngle(this.Hair_14, 0.3491f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair_14);
        this.Hair_14.cubeList.add(new ModelBox(this.Hair_14, 40, 2, -4.9972f, -4.7495f, -4.8426f, 3, 9, 3, 0.0f));
        this.Hair_5 = new ModelRenderer(this);
        this.Hair_5.setRotationPoint(2.0f, -7.0f, 1.0f);
        this.setRotationAngle(this.Hair_5, 2.7925f, -0.0873f, 1.4836f);
        this.Head.addChild(this.Hair_5);
        this.Hair_8 = new ModelRenderer(this);
        this.Hair_8.setRotationPoint(4.0f, -7.0f, 2.0f);
        this.setRotationAngle(this.Hair_8, 2.7925f, 0.0873f, 1.2217f);
        this.Head.addChild(this.Hair_8);
        this.Hair_6 = new ModelRenderer(this);
        this.Hair_6.setRotationPoint(-1.0f, -10.0f, 4.0f);
        this.setRotationAngle(this.Hair_6, -0.3491f, 0.0f, 0.5236f);
        this.Head.addChild(this.Hair_6);
        this.Hair_7 = new ModelRenderer(this);
        this.Hair_7.setRotationPoint(1.0f, -10.0f, 4.0f);
        this.setRotationAngle(this.Hair_7, -0.3491f, 0.0f, -0.5236f);
        this.Head.addChild(this.Hair_7);
        this.Hair = new ModelRenderer(this);
        this.Hair.setRotationPoint(0.0f, -11.0f, 1.0f);
        this.setRotationAngle(this.Hair, 0.5236f, 0.4363f, 0.6109f);
        this.Head.addChild(this.Hair);
        this.Hair_10 = new ModelRenderer(this);
        this.Hair_10.setRotationPoint(-3.0f, -5.0f, 1.0f);
        this.setRotationAngle(this.Hair_10, -2.3562f, -0.5236f, 0.0f);
        this.Head.addChild(this.Hair_10);
        this.Hair_10.cubeList.add(new ModelBox(this.Hair_10, 40, 2, 0.9972f, -7.0431f, -2.7443f, 3, 8, 3, 0.0f));
        this.Hair_10.cubeList.add(new ModelBox(this.Hair_10, 41, 2, -0.0028f, -5.8184f, -1.5195f, 3, 8, 3, 0.0f));
        this.Hair_11 = new ModelRenderer(this);
        this.Hair_11.setRotationPoint(4.0f, -5.0f, 1.0f);
        this.setRotationAngle(this.Hair_11, -2.5307f, 0.2618f, 0.0f);
        this.Head.addChild(this.Hair_11);
        this.Hair_11.cubeList.add(new ModelBox(this.Hair_11, 41, 2, -3.9972f, -7.2672f, -3.0113f, 3, 8, 3, 0.0f));
        this.Hair_15 = new ModelRenderer(this);
        this.Hair_15.setRotationPoint(-0.5f, 0.8f, 7.4f);
        this.setRotationAngle(this.Hair_15, 0.3491f, 0.0f, 0.5236f);
        this.Head.addChild(this.Hair_15);
        this.Hair_15.cubeList.add(new ModelBox(this.Hair_15, 41, 3, -4.9972f, -6.6289f, -4.1585f, 3, 7, 3, 0.0f));
        this.Hair_4 = new ModelRenderer(this);
        this.Hair_4.setRotationPoint(-2.0f, -7.0f, 1.0f);
        this.setRotationAngle(this.Hair_4, 2.7925f, 0.0873f, -1.4836f);
        this.Head.addChild(this.Hair_4);
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-0.2f, -3.4f, -3.8f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 40, 16, -4.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(7.8f, -3.4f, -3.8f);
        this.LArm.mirror = true;
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 40, 16, 0.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(1.8f, 6.6f, -3.8f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(5.8f, 6.6f, -3.8f);
        this.LLeg.mirror = true;
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
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

