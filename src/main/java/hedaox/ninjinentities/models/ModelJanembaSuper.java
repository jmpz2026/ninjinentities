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

public class ModelJanembaSuper
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer earleft;
    private final ModelRenderer earright;
    private final ModelRenderer HornL1;
    private final ModelRenderer HornL2;
    private final ModelRenderer HornL3;
    private final ModelRenderer HornR1;
    private final ModelRenderer HornR2;
    private final ModelRenderer HornR3;
    private final ModelRenderer Body;
    private final ModelRenderer tail;
    private final ModelRenderer neckguardleft;
    private final ModelRenderer neckguardright;
    private final ModelRenderer Tail2;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelJanembaSuper(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.earleft = new ModelRenderer(this);
        this.earleft.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.earleft, 0.0f, -0.7695f, -0.4554f);
        this.Head.addChild(this.earleft);
        this.earleft.cubeList.add(new ModelBox(this.earleft, 44, 27, 1.6084f, -3.5f, -4.5365f, 6, 3, 0, 0.0f));
        this.earright = new ModelRenderer(this);
        this.earright.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.earright, 0.0f, 0.7695f, 0.4554f);
        this.Head.addChild(this.earright);
        this.earright.cubeList.add(new ModelBox(this.earright, 39, 18, -7.5084f, -3.5f, -4.5365f, 6, 3, 0, 0.0f));
        this.HornL1 = new ModelRenderer(this);
        this.HornL1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HornL1, -0.4098f, 0.0948f, 0.403f);
        this.Head.addChild(this.HornL1);
        this.HornL1.cubeList.add(new ModelBox(this.HornL1, 0, 16, -1.9f, -10.4f, -6.0f, 3, 5, 2, 0.0f));
        this.HornL2 = new ModelRenderer(this);
        this.HornL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HornL2, -0.5918f, 0.182f, 0.4098f);
        this.Head.addChild(this.HornL2);
        this.HornL2.cubeList.add(new ModelBox(this.HornL2, 0, 0, -1.6f, -12.3f, -7.6f, 2, 4, 2, 0.0f));
        this.HornL3 = new ModelRenderer(this);
        this.HornL3.setRotationPoint(6.1375f, -13.4875f, 2.025f);
        this.setRotationAngle(this.HornL3, -0.5084f, 0.2276f, 0.9183f);
        this.Head.addChild(this.HornL3);
        this.HornL3.cubeList.add(new ModelBox(this.HornL3, 50, 50, -0.5f, -1.5f, -1.0f, 1, 3, 2, 0.0f));
        this.HornR1 = new ModelRenderer(this);
        this.HornR1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HornR1, -0.4098f, -0.0948f, -0.403f);
        this.Head.addChild(this.HornR1);
        this.HornR1.cubeList.add(new ModelBox(this.HornR1, 0, 16, -1.1f, -10.4f, -6.0f, 3, 5, 2, 0.0f));
        this.HornR2 = new ModelRenderer(this);
        this.HornR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HornR2, -0.5918f, -0.182f, -0.4098f);
        this.Head.addChild(this.HornR2);
        this.HornR2.cubeList.add(new ModelBox(this.HornR2, 0, 0, -0.4f, -12.3f, -7.6f, 2, 4, 2, 0.0f));
        this.HornR3 = new ModelRenderer(this);
        this.HornR3.setRotationPoint(-6.1375f, -13.4875f, 2.025f);
        this.setRotationAngle(this.HornR3, -0.5084f, -0.2276f, -0.9183f);
        this.Head.addChild(this.HornR3);
        this.HornR3.cubeList.add(new ModelBox(this.HornR3, 50, 50, -0.5f, -1.5f, -1.0f, 1, 3, 2, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 24, 26, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f));
        this.tail = new ModelRenderer(this);
        this.tail.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.tail, -0.3491f, 0.0f, 0.0f);
        this.Body.addChild(this.tail);
        this.tail.cubeList.add(new ModelBox(this.tail, 0, 16, -2.0f, 7.0f, 3.0f, 3, 3, 11, 0.0f));
        this.neckguardleft = new ModelRenderer(this);
        this.neckguardleft.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.neckguardleft, 0.0f, 0.0f, 0.5918f);
        this.Body.addChild(this.neckguardleft);
        this.neckguardleft.cubeList.add(new ModelBox(this.neckguardleft, 44, 16, 3.0f, -4.5f, -3.6f, 2, 4, 7, 0.0f));
        this.neckguardright = new ModelRenderer(this);
        this.neckguardright.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.neckguardright, 0.0f, 0.0f, -0.5918f);
        this.Body.addChild(this.neckguardright);
        this.neckguardright.cubeList.add(new ModelBox(this.neckguardright, 41, 35, -4.9f, -4.5f, -3.6f, 2, 4, 7, 0.0f));
        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(-3.0f, 15.2f, 17.0f);
        this.setRotationAngle(this.Tail2, 0.1745f, 0.0f, 0.0f);
        this.Body.addChild(this.Tail2);
        this.Tail2.cubeList.add(new ModelBox(this.Tail2, 23, 7, 1.0f, -4.4717f, -7.8214f, 3, 2, 9, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.setRotationAngle(this.RArm, 0.0f, 0.0f, 0.1f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 28, 42, -3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.setRotationAngle(this.LArm, 0.0f, 0.0f, -0.1f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 38, 0, -1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-1.9f, 12.0f, 0.1f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 30, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(1.9f, 12.0f, 0.1f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 12, 42, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
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

