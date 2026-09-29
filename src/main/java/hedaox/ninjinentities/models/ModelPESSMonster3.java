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

public class ModelPESSMonster3
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer bone3;
    private final ModelRenderer Body;
    private final ModelRenderer bodyChild_1;
    private final ModelRenderer bodyChild_3;
    private final ModelRenderer bodyChild_2;
    private final ModelRenderer bodyChild;
    private final ModelRenderer RArm;
    private final ModelRenderer rightarmshoulder;
    private final ModelRenderer LArm;
    private final ModelRenderer leftarmshoulder;
    private final ModelRenderer RLeg;
    private final ModelRenderer bone;
    private final ModelRenderer LLeg;
    private final ModelRenderer bone2;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelPESSMonster3(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -6.0f, 8, 8, 8, 0.0f));
        this.bone3 = new ModelRenderer(this);
        this.bone3.setRotationPoint(0.0f, 24.0f, 0.0f);
        this.Head.addChild(this.bone3);
        this.bone3.cubeList.add(new ModelBox(this.bone3, 0, 54, -1.0f, -34.0f, -6.0f, 2, 2, 8, 0.0f));
        this.bone3.cubeList.add(new ModelBox(this.bone3, 120, 53, -1.0f, -34.0f, 2.0f, 2, 10, 2, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 64, 0, -5.0f, 0.0f, -2.0f, 10, 5, 5, 0.0f));
        this.Body.cubeList.add(new ModelBox(this.Body, 16, 16, -3.5f, 5.0f, -2.0f, 7, 7, 4, 0.0f));
        this.bodyChild_1 = new ModelRenderer(this);
        this.bodyChild_1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addChild(this.bodyChild_1);
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 69, 59, -1.0f, 5.0f, 2.0f, 2, 3, 2, 0.0f));
        this.bodyChild_1.cubeList.add(new ModelBox(this.bodyChild_1, 120, 57, -1.0f, 0.0f, 3.0f, 2, 5, 2, 0.0f));
        this.bodyChild_3 = new ModelRenderer(this);
        this.bodyChild_3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bodyChild_3, 0.5236f, 0.0f, 0.0f);
        this.Body.addChild(this.bodyChild_3);
        this.bodyChild_3.cubeList.add(new ModelBox(this.bodyChild_3, 32, 48, -2.0f, 15.0f, 2.0f, 4, 4, 12, 0.0f));
        this.bodyChild_2 = new ModelRenderer(this);
        this.bodyChild_2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bodyChild_2, -0.3491f, 0.0f, 0.0f);
        this.Body.addChild(this.bodyChild_2);
        this.bodyChild_2.cubeList.add(new ModelBox(this.bodyChild_2, 32, 48, -2.0f, 7.0f, 4.0f, 4, 4, 12, 0.0f));
        this.bodyChild = new ModelRenderer(this);
        this.bodyChild.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bodyChild, -0.1745f, 0.0f, 0.0f);
        this.Body.addChild(this.bodyChild);
        this.bodyChild.cubeList.add(new ModelBox(this.bodyChild, 64, 12, -4.5f, 1.0f, -1.9333f, 9, 4, 1, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.setRotationAngle(this.RArm, -0.0231f, 0.0f, 0.0791f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 40, 16, -5.0f, -2.0f, -2.0f, 5, 12, 5, 0.0f));
        this.rightarmshoulder = new ModelRenderer(this);
        this.rightarmshoulder.setRotationPoint(0.0f, 0.0f, -0.6f);
        this.setRotationAngle(this.rightarmshoulder, 0.0f, 0.0f, 0.1f);
        this.RArm.addChild(this.rightarmshoulder);
        this.rightarmshoulder.cubeList.add(new ModelBox(this.rightarmshoulder, 38, 0, -5.984f, -2.8398f, -1.9984f, 6, 3, 6, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.setRotationAngle(this.LArm, 0.0231f, 0.0f, -0.0791f);
        this.Body.addChild(this.LArm);
        this.LArm.mirror = true;
        this.LArm.cubeList.add(new ModelBox(this.LArm, 40, 16, 0.0f, -2.0f, -2.0f, 5, 12, 5, 0.0f));
        this.leftarmshoulder = new ModelRenderer(this);
        this.leftarmshoulder.setRotationPoint(0.0f, 0.0f, -0.5f);
        this.setRotationAngle(this.leftarmshoulder, 0.0f, 0.0f, -0.1f);
        this.LArm.addChild(this.leftarmshoulder);
        this.leftarmshoulder.mirror = true;
        this.leftarmshoulder.cubeList.add(new ModelBox(this.leftarmshoulder, 38, 0, 0.0815f, -2.7938f, -2.0021f, 6, 3, 6, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(2.0f, 13.0f, 0.0f);
        this.setRotationAngle(this.bone, -0.1745f, 0.0f, 0.0f);
        this.RLeg.addChild(this.bone);
        this.bone.cubeList.add(new ModelBox(this.bone, 0, 0, -3.0f, -7.0f, -5.0f, 2, 1, 3, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.Body.addChild(this.LLeg);
        this.LLeg.mirror = true;
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(2.0f, 13.0f, 0.0f);
        this.setRotationAngle(this.bone2, -0.1745f, 0.0f, 0.0f);
        this.LLeg.addChild(this.bone2);
        this.bone2.cubeList.add(new ModelBox(this.bone2, 0, 0, -3.0f, -7.0f, -5.0f, 2, 1, 3, 0.0f));
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

