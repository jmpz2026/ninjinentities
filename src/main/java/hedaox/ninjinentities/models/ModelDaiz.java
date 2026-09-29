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

public class ModelDaiz
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer bone;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
    private final ModelRenderer rightarmshoulder;
    private final ModelRenderer LArm;
    private final ModelRenderer leftarmshoulder;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private final ModelRenderer Hair1;
    private final ModelRenderer Hair2;
    private final ModelRenderer Hair3;
    private final ModelRenderer Hair4;
    private final ModelRenderer Hair5;
    private final ModelRenderer Hair6;
    private final ModelRenderer Hair7;
    private final ModelRenderer Hair8;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelDaiz(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(0.0f, -2.3599f, 4.398f);
        this.setRotationAngle(this.bone, 0.3491f, 0.0f, 0.0f);
        this.Head.addChild(this.bone);
        this.bone.cubeList.add(new ModelBox(this.bone, 10, 52, -0.5f, -0.5f, 0.5f, 1, 1, -1, 0.5f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.2f, 5.4f, -0.2f);
        this.Body.cubeList.add(new ModelBox(this.Body, 0, 16, -4.2f, -5.4f, -1.8f, 8, 12, 4, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 16, 34, -4.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.rightarmshoulder = new ModelRenderer(this);
        this.rightarmshoulder.setRotationPoint(-1.0f, 0.0f, -0.6f);
        this.setRotationAngle(this.rightarmshoulder, 0.0f, 0.0f, 0.1f);
        this.RArm.addChild(this.rightarmshoulder);
        this.rightarmshoulder.cubeList.add(new ModelBox(this.rightarmshoulder, 26, 10, -6.0f, -3.0f, -2.4f, 7, 4, 6, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 44, 46, 8.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.leftarmshoulder = new ModelRenderer(this);
        this.leftarmshoulder.setRotationPoint(9.0f, 0.0f, -0.5f);
        this.setRotationAngle(this.leftarmshoulder, 0.0f, 0.0f, -0.1f);
        this.LArm.addChild(this.leftarmshoulder);
        this.leftarmshoulder.cubeList.add(new ModelBox(this.leftarmshoulder, 24, 24, -1.0f, -3.0f, -2.5f, 7, 4, 6, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 32, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 32, 34, 2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.Hair1 = new ModelRenderer(this);
        this.Hair1.setRotationPoint(0.0f, -0.7582f, 4.5047f);
        this.setRotationAngle(this.Hair1, 0.1745f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair1);
        this.Hair1.cubeList.add(new ModelBox(this.Hair1, 7, 52, -1.0f, -0.5f, -0.5f, 2, 9, 1, 0.0f));
        this.Hair2 = new ModelRenderer(this);
        this.Hair2.setRotationPoint(0.125f, -0.7582f, 4.5047f);
        this.setRotationAngle(this.Hair2, 0.1745f, 0.0f, -0.2618f);
        this.Head.addChild(this.Hair2);
        this.Hair2.cubeList.add(new ModelBox(this.Hair2, 7, 52, -1.0f, -0.5f, -0.5f, 2, 8, 1, 0.0f));
        this.Hair3 = new ModelRenderer(this);
        this.Hair3.setRotationPoint(-0.125f, -0.7582f, 4.5047f);
        this.setRotationAngle(this.Hair3, 0.1745f, 0.0f, 0.2618f);
        this.Head.addChild(this.Hair3);
        this.Hair3.cubeList.add(new ModelBox(this.Hair3, 7, 52, -1.0f, -0.5f, -0.5f, 2, 6, 1, 0.0f));
        this.Hair4 = new ModelRenderer(this);
        this.Hair4.setRotationPoint(0.0f, -0.7582f, 4.5047f);
        this.setRotationAngle(this.Hair4, 0.3491f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair4);
        this.Hair4.cubeList.add(new ModelBox(this.Hair4, 7, 52, -1.0f, -0.5f, -0.5f, 2, 7, 1, 0.0f));
        this.Hair5 = new ModelRenderer(this);
        this.Hair5.setRotationPoint(0.0f, -0.7582f, 4.5047f);
        this.setRotationAngle(this.Hair5, 0.0f, 0.0f, 0.1745f);
        this.Head.addChild(this.Hair5);
        this.Hair5.cubeList.add(new ModelBox(this.Hair5, 7, 52, -1.0f, -0.5f, -0.5f, 2, 8, 1, 0.0f));
        this.Hair6 = new ModelRenderer(this);
        this.Hair6.setRotationPoint(0.125f, -0.7582f, 4.5047f);
        this.setRotationAngle(this.Hair6, 0.1745f, 0.0f, -0.5236f);
        this.Head.addChild(this.Hair6);
        this.Hair6.cubeList.add(new ModelBox(this.Hair6, 7, 52, -1.0f, -0.5f, -0.5f, 2, 6, 1, 0.0f));
        this.Hair7 = new ModelRenderer(this);
        this.Hair7.setRotationPoint(-0.125f, -0.7582f, 4.5047f);
        this.setRotationAngle(this.Hair7, 0.1745f, 0.0f, 0.5236f);
        this.Head.addChild(this.Hair7);
        this.Hair7.cubeList.add(new ModelBox(this.Hair7, 7, 52, -1.0f, -0.5f, -0.5f, 2, 5, 1, 0.0f));
        this.Hair8 = new ModelRenderer(this);
        this.Hair8.setRotationPoint(0.0f, -0.7582f, 4.5047f);
        this.setRotationAngle(this.Hair8, 0.5236f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair8);
        this.Hair8.cubeList.add(new ModelBox(this.Hair8, 7, 52, -1.0f, -0.5f, -0.5f, 2, 4, 1, 0.0f));
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

