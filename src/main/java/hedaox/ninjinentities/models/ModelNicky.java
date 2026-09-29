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

public class ModelNicky
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer HeadChild_15;
    private final ModelRenderer HeadChild_16;
    private final ModelRenderer Hair1;
    private final ModelRenderer Hair2;
    private final ModelRenderer Hair3;
    private final ModelRenderer Body;
    private final ModelRenderer bone4;
    private final ModelRenderer RArm;
    private final ModelRenderer rightarmshoulder;
    private final ModelRenderer LArm;
    private final ModelRenderer leftarmshoulder;
    private final ModelRenderer RLeg;
    private final ModelRenderer bone;
    private final ModelRenderer LLeg;
    private final ModelRenderer bone5;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelNicky(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 86, -4.0f, -10.0f, -4.0f, 8, 10, 8, 0.5f));
        this.HeadChild_15 = new ModelRenderer(this);
        this.HeadChild_15.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HeadChild_15, 0.0f, 0.5236f, 0.0f);
        this.Head.addChild(this.HeadChild_15);
        this.HeadChild_15.cubeList.add(new ModelBox(this.HeadChild_15, 12, 39, 4.0f, -6.0f, -1.0f, 0, 4, 6, 0.0f));
        this.HeadChild_16 = new ModelRenderer(this);
        this.HeadChild_16.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HeadChild_16, 0.0f, -0.5236f, 0.0f);
        this.Head.addChild(this.HeadChild_16);
        this.HeadChild_16.cubeList.add(new ModelBox(this.HeadChild_16, 32, 16, -4.0f, -6.0f, -1.0f, 0, 4, 6, 0.0f));
        this.Hair1 = new ModelRenderer(this);
        this.Hair1.setRotationPoint(0.0f, -8.0f, -4.0f);
        this.setRotationAngle(this.Hair1, -0.1745f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair1);
        this.Hair1.cubeList.add(new ModelBox(this.Hair1, 51, 83, -3.0f, -4.0f, 0.0f, 6, 4, 8, 0.0f));
        this.Hair2 = new ModelRenderer(this);
        this.Hair2.setRotationPoint(-2.6875f, -7.0f, -4.0f);
        this.setRotationAngle(this.Hair2, -0.1745f, 0.0f, -0.733f);
        this.Head.addChild(this.Hair2);
        this.Hair2.cubeList.add(new ModelBox(this.Hair2, 51, 83, -2.0f, -3.0f, 0.0f, 5, 3, 8, 0.0f));
        this.Hair3 = new ModelRenderer(this);
        this.Hair3.setRotationPoint(2.6875f, -7.0f, -4.0f);
        this.setRotationAngle(this.Hair3, -0.1745f, 0.0f, 0.733f);
        this.Head.addChild(this.Hair3);
        this.Hair3.cubeList.add(new ModelBox(this.Hair3, 51, 83, -3.0f, -3.0f, 0.0f, 5, 3, 8, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.2f, 5.4f, -0.2f);
        this.Body.cubeList.add(new ModelBox(this.Body, 0, 29, -4.2f, -5.4f, -1.8f, 8, 12, 4, 0.0f));
        this.Body.cubeList.add(new ModelBox(this.Body, 27, 27, -4.7f, -6.0f, -2.2f, 9, 11, 5, 0.0f));
        this.Body.cubeList.add(new ModelBox(this.Body, 27, 11, -4.7f, 4.6875f, -2.2f, 9, 5, 5, 0.0f));
        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bone4, 0.1745f, 0.0f, 0.0f);
        this.Body.addChild(this.bone4);
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 16, 53, -4.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RArm.cubeList.add(new ModelBox(this.RArm, 44, 44, -4.7512f, 0.8794f, -2.4f, 5, 8, 5, 0.0f));
        this.rightarmshoulder = new ModelRenderer(this);
        this.rightarmshoulder.setRotationPoint(-1.0f, 0.0f, -0.6f);
        this.RArm.addChild(this.rightarmshoulder);
        this.rightarmshoulder.cubeList.add(new ModelBox(this.rightarmshoulder, 18, 43, -6.0f, -3.0f, -3.0f, 7, 4, 6, 0.0f));
        this.rightarmshoulder.cubeList.add(new ModelBox(this.rightarmshoulder, 3, 3, -5.2795f, -5.5857f, -2.0f, 1, 3, 1, 0.0f));
        this.rightarmshoulder.cubeList.add(new ModelBox(this.rightarmshoulder, 0, 0, -2.2945f, -5.8852f, 0.0f, 1, 3, 1, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 55, 6, 8.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.leftarmshoulder = new ModelRenderer(this);
        this.leftarmshoulder.setRotationPoint(9.0f, 0.0f, -0.5f);
        this.LArm.addChild(this.leftarmshoulder);
        this.leftarmshoulder.cubeList.add(new ModelBox(this.leftarmshoulder, 32, 0, -1.0f, -3.0f, -3.0f, 7, 4, 6, 0.0f));
        this.leftarmshoulder.cubeList.add(new ModelBox(this.leftarmshoulder, 4, 16, 4.2745f, -5.4858f, -2.0f, 1, 3, 1, 0.0f));
        this.leftarmshoulder.cubeList.add(new ModelBox(this.leftarmshoulder, 0, 16, 1.2895f, -5.7853f, 0.0f, 1, 3, 1, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 45, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(1.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bone, 0.0f, 0.0f, 0.2618f);
        this.RLeg.addChild(this.bone);
        this.bone.cubeList.add(new ModelBox(this.bone, 0, 0, -3.0f, 6.2805f, -1.0f, 2, 1, 1, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 32, 53, 2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(-2.0f, 1.0f, 0.0f);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, -0.1745f);
        this.LLeg.addChild(this.bone5);
        this.bone5.cubeList.add(new ModelBox(this.bone5, 0, 0, 6.0f, 6.0f, -1.0f, 3, 1, 1, 0.0f));
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

