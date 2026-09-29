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

public class ModelAngila
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer HornR;
    private final ModelRenderer HornL;
    private final ModelRenderer EarR;
    private final ModelRenderer EarL;
    private final ModelRenderer Hair;
    private final ModelRenderer Hair1;
    private final ModelRenderer Hair2;
    private final ModelRenderer Hair3;
    private final ModelRenderer Hair4;
    private final ModelRenderer Hair5;
    private final ModelRenderer Hair6;
    private final ModelRenderer Hair7;
    private final ModelRenderer Body;
    private final ModelRenderer bone4;
    private final ModelRenderer Cape;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer bone5;
    private final ModelRenderer LLeg;
    private final ModelRenderer bone6;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelAngila(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 24, 24, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.HornR = new ModelRenderer(this);
        this.HornR.setRotationPoint(0.0f, 25.0f, -2.0f);
        this.setRotationAngle(this.HornR, -0.0873f, 0.0f, 0.0f);
        this.Head.addChild(this.HornR);
        this.HornR.cubeList.add(new ModelBox(this.HornR, 0, 3, -3.0f, -31.0f, -6.0f, 1, 1, 2, 0.0f));
        this.HornL = new ModelRenderer(this);
        this.HornL.setRotationPoint(0.0f, 25.0f, -2.0f);
        this.setRotationAngle(this.HornL, -0.0873f, 0.0f, 0.0f);
        this.Head.addChild(this.HornL);
        this.HornL.mirror = true;
        this.HornL.cubeList.add(new ModelBox(this.HornL, 0, 3, 2.0f, -31.0f, -6.0f, 1, 1, 2, 0.0f));
        this.EarR = new ModelRenderer(this);
        this.EarR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.EarR, 0.0f, -0.5236f, 0.0f);
        this.Head.addChild(this.EarR);
        this.EarR.cubeList.add(new ModelBox(this.EarR, 26, 10, -4.5f, -6.0f, -1.866f, 0, 4, 6, 0.0f));
        this.EarL = new ModelRenderer(this);
        this.EarL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.EarL, 0.0f, 0.5236f, 0.0f);
        this.Head.addChild(this.EarL);
        this.EarL.mirror = true;
        this.EarL.cubeList.add(new ModelBox(this.EarL, 26, 10, 4.5f, -6.0f, -1.866f, 0, 4, 6, 0.0f));
        this.Hair = new ModelRenderer(this);
        this.Hair.setRotationPoint(0.0f, 0.875f, 6.0625f);
        this.setRotationAngle(this.Hair, 0.3491f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair);
        this.Hair1 = new ModelRenderer(this);
        this.Hair1.setRotationPoint(0.0f, -2.0f, -1.0f);
        this.Hair.addChild(this.Hair1);
        this.Hair1.cubeList.add(new ModelBox(this.Hair1, 24, 41, -4.0f, -4.786f, -0.76f, 8, 11, 2, 0.0f));
        this.Hair2 = new ModelRenderer(this);
        this.Hair2.setRotationPoint(-3.0625f, -0.6875f, -1.0f);
        this.setRotationAngle(this.Hair2, 0.0f, 0.0f, 0.5236f);
        this.Hair.addChild(this.Hair2);
        this.Hair2.cubeList.add(new ModelBox(this.Hair2, 27, 45, -4.0f, -4.786f, -0.76f, 5, 5, 2, 0.0f));
        this.Hair3 = new ModelRenderer(this);
        this.Hair3.setRotationPoint(3.0625f, -0.6875f, -1.0f);
        this.setRotationAngle(this.Hair3, 0.0f, 0.0f, -0.5236f);
        this.Hair.addChild(this.Hair3);
        this.Hair3.cubeList.add(new ModelBox(this.Hair3, 27, 45, -1.0f, -4.786f, -0.76f, 5, 5, 2, 0.0f));
        this.Hair4 = new ModelRenderer(this);
        this.Hair4.setRotationPoint(-1.75f, -3.25f, -1.0f);
        this.setRotationAngle(this.Hair4, 0.0f, 0.0f, -1.9199f);
        this.Hair.addChild(this.Hair4);
        this.Hair4.cubeList.add(new ModelBox(this.Hair4, 20, 48, -9.1875f, -4.8447f, -0.76f, 10, 5, 2, 0.0f));
        this.Hair5 = new ModelRenderer(this);
        this.Hair5.setRotationPoint(1.75f, -3.25f, -1.0f);
        this.setRotationAngle(this.Hair5, 0.0f, 0.0f, 1.9199f);
        this.Hair.addChild(this.Hair5);
        this.Hair5.cubeList.add(new ModelBox(this.Hair5, 20, 48, -0.9786f, -4.8447f, -0.76f, 10, 5, 2, 0.0f));
        this.Hair6 = new ModelRenderer(this);
        this.Hair6.setRotationPoint(0.0f, -2.342f, -0.9397f);
        this.setRotationAngle(this.Hair6, 0.1745f, 0.0f, 0.0f);
        this.Hair.addChild(this.Hair6);
        this.Hair6.cubeList.add(new ModelBox(this.Hair6, 28, 42, -3.0f, -4.0f, 0.0f, 6, 11, 1, 0.0f));
        this.Hair7 = new ModelRenderer(this);
        this.Hair7.setRotationPoint(0.0f, -6.5924f, -0.9224f);
        this.setRotationAngle(this.Hair7, 0.1745f, 0.0f, 0.0f);
        this.Hair.addChild(this.Hair7);
        this.Hair7.cubeList.add(new ModelBox(this.Hair7, 25, 45, -4.0f, -1.0f, 0.0f, 8, 8, 1, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 32, 0, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f));
        this.bone4 = new ModelRenderer(this);
        this.bone4.setRotationPoint(0.0f, 24.0f, -0.4375f);
        this.Body.addChild(this.bone4);
        this.bone4.cubeList.add(new ModelBox(this.bone4, 0, 16, -5.0f, -24.0f, -2.0f, 10, 10, 5, 0.0f));
        this.Cape = new ModelRenderer(this);
        this.Cape.setRotationPoint(0.0f, 0.0f, -1.0f);
        this.setRotationAngle(this.Cape, 0.1745f, 0.0f, 0.0f);
        this.Body.addChild(this.Cape);
        this.Cape.cubeList.add(new ModelBox(this.Cape, 0, 32, -5.0f, 1.0f, 4.0f, 10, 22, 0, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 32, 56, -3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 48, 16, -1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 44, 44, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.bone5 = new ModelRenderer(this);
        this.bone5.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.bone5, 0.0f, 0.0f, 0.0873f);
        this.RLeg.addChild(this.bone5);
        this.bone5.cubeList.add(new ModelBox(this.bone5, 55, 55, -2.5872f, -0.5962f, -2.4f, 4, 6, 5, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 0, 54, 2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.bone6 = new ModelRenderer(this);
        this.bone6.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.setRotationAngle(this.bone6, 0.0f, 0.0f, -0.0873f);
        this.LLeg.addChild(this.bone6);
        this.bone6.cubeList.add(new ModelBox(this.bone6, 56, 0, 1.5834f, -12.509f, -2.4f, 4, 5, 5, 0.0f));
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

