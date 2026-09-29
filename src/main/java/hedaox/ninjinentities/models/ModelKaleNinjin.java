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

public class ModelKaleNinjin
extends ModelBase {
    private ModelRenderer Head;
    private ModelRenderer Hair1;
    private ModelRenderer Hair2;
    private ModelRenderer Hair3;
    private ModelRenderer Hair4;
    private ModelRenderer Hair5;
    private ModelRenderer Hair6;
    private ModelRenderer Hair7;
    private ModelRenderer Hair8;
    private ModelRenderer Hair9;
    private ModelRenderer Hair10;
    private ModelRenderer Hair11;
    private ModelRenderer Hair12;
    private ModelRenderer Hair13;
    private ModelRenderer Strand1;
    private ModelRenderer Strand2;
    private ModelRenderer Body;
    private ModelRenderer RArm;
    private ModelRenderer LArm;
    private ModelRenderer RLeg;
    private ModelRenderer LLeg;
    private int form = 0;
    private float scale = 1.0f;

    public ModelKaleNinjin(int _form, float _scale) {
        this.form = _form;
        this.scale = _scale;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(-3.8f, 5.4f, 3.8f);
        this.Body.cubeList.add(new ModelBox(this.Body, 16, 16, -0.2f, -5.4f, -5.8f, 8, 12, 4, 0.0f));
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
        if (this.form == 0) {
            this.Hair1 = new ModelRenderer(this);
            this.Hair1.setRotationPoint(-1.0f, -9.0f, 6.0f);
            this.setRotationAngle(this.Hair1, -0.6109f, 0.0f, -0.1745f);
            this.Head.addChild(this.Hair1);
            this.Hair1.cubeList.add(new ModelBox(this.Hair1, 45, 2, -0.9397f, -3.0844f, -3.8192f, 4, 8, 4, 0.0f));
            this.Hair2 = new ModelRenderer(this);
            this.Hair2.setRotationPoint(-2.0f, -9.0f, 8.0f);
            this.setRotationAngle(this.Hair2, -0.6109f, 0.0873f, -1.0472f);
            this.Head.addChild(this.Hair2);
            this.Hair2.cubeList.add(new ModelBox(this.Hair2, 45, 2, 0.8795f, -1.7014f, -2.5098f, 3, 4, 2, 0.0f));
            this.Hair3 = new ModelRenderer(this);
            this.Hair3.setRotationPoint(1.6f, -8.2f, 6.5f);
            this.setRotationAngle(this.Hair3, -1.309f, -1.309f, -1.6581f);
            this.Head.addChild(this.Hair3);
            this.Hair3.cubeList.add(new ModelBox(this.Hair3, 45, 2, -1.1652f, -0.8754f, -2.9934f, 2, 4, 2, 0.0f));
            this.Hair4 = new ModelRenderer(this);
            this.Hair4.setRotationPoint(0.0f, -11.0f, 5.0f);
            this.setRotationAngle(this.Hair4, -0.6109f, -0.5236f, 0.9599f);
            this.Head.addChild(this.Hair4);
            this.Hair4.cubeList.add(new ModelBox(this.Hair4, 45, 2, 0.9103f, -0.509f, -3.2128f, 2, 4, 2, 0.0f));
            this.Hair5 = new ModelRenderer(this);
            this.Hair5.setRotationPoint(-1.0f, -14.0f, 7.0f);
            this.setRotationAngle(this.Hair5, -0.6109f, -0.5236f, 0.9599f);
            this.Head.addChild(this.Hair5);
            this.Hair5.cubeList.add(new ModelBox(this.Hair5, 45, 2, 1.1647f, -0.0582f, -3.4994f, 2, 4, 2, 0.0f));
            this.Hair6 = new ModelRenderer(this);
            this.Hair6.setRotationPoint(-4.0f, -7.0f, 2.7f);
            this.setRotationAngle(this.Hair6, -0.6109f, -1.8326f, -1.6581f);
            this.Head.addChild(this.Hair6);
            this.Hair6.cubeList.add(new ModelBox(this.Hair6, 45, 2, 0.8212f, 1.3411f, -2.1979f, 2, 4, 2, 0.0f));
            this.Hair7 = new ModelRenderer(this);
            this.Hair7.setRotationPoint(2.0f, -6.0f, 1.7f);
            this.setRotationAngle(this.Hair7, -0.6109f, -1.309f, -2.4435f);
            this.Head.addChild(this.Hair7);
            this.Hair7.cubeList.add(new ModelBox(this.Hair7, 45, 2, 1.1308f, 2.0f, -2.2039f, 2, 4, 2, 0.0f));
            this.Strand1 = new ModelRenderer(this);
            this.Strand1.setRotationPoint(1.4f, -4.6f, -2.3f);
            this.setRotationAngle(this.Strand1, -0.3491f, 0.0f, -0.3491f);
            this.Head.addChild(this.Strand1);
            this.Strand1.cubeList.add(new ModelBox(this.Strand1, 38, 2, 0.583f, -2.6421f, -2.7351f, 2, 6, 2, 0.0f));
        } else {
            this.Hair1 = new ModelRenderer(this);
            this.Hair1.setRotationPoint(-1.0f, -11.0f, 3.0f);
            this.setRotationAngle(this.Hair1, -0.3491f, 0.0f, 0.5236f);
            this.Head.addChild(this.Hair1);
            this.Hair1.cubeList.add(new ModelBox(this.Hair1, 45, 2, 0.0603f, -3.658f, -3.0f, 3, 7, 3, 0.0f));
            this.Hair2 = new ModelRenderer(this);
            this.Hair2.setRotationPoint(-3.0f, -9.0f, 1.0f);
            this.setRotationAngle(this.Hair2, -0.4363f, 0.0f, -0.2618f);
            this.Head.addChild(this.Hair2);
            this.Hair2.cubeList.add(new ModelBox(this.Hair2, 45, 2, 0.0603f, -3.658f, -3.0f, 3, 7, 3, 0.0f));
            this.Hair3 = new ModelRenderer(this);
            this.Hair3.setRotationPoint(0.0f, -8.0f, 0.0f);
            this.setRotationAngle(this.Hair3, -0.2618f, 0.1745f, 0.4363f);
            this.Head.addChild(this.Hair3);
            this.Hair3.cubeList.add(new ModelBox(this.Hair3, 45, 2, 0.0429f, -4.3675f, -2.9049f, 3, 7, 3, 0.0f));
            this.Hair4 = new ModelRenderer(this);
            this.Hair4.setRotationPoint(2.0f, -7.0f, 0.0f);
            this.setRotationAngle(this.Hair4, 0.0f, 0.0873f, 0.2618f);
            this.Head.addChild(this.Hair4);
            this.Hair4.cubeList.add(new ModelBox(this.Hair4, 45, 2, 1.0603f, -4.342f, -3.0f, 2, 7, 3, 0.0f));
            this.Hair5 = new ModelRenderer(this);
            this.Hair5.setRotationPoint(-5.0f, -6.0f, -2.0f);
            this.setRotationAngle(this.Hair5, 2.7925f, 0.0873f, -0.6109f);
            this.Head.addChild(this.Hair5);
            this.Hair5.cubeList.add(new ModelBox(this.Hair5, 45, 2, -0.2474f, -2.6696f, -2.7223f, 3, 6, 3, 0.0f));
            this.Hair6 = new ModelRenderer(this);
            this.Hair6.setRotationPoint(-5.0f, -7.0f, 4.0f);
            this.setRotationAngle(this.Hair6, -0.3491f, 0.0f, -0.4363f);
            this.Head.addChild(this.Hair6);
            this.Hair6.cubeList.add(new ModelBox(this.Hair6, 45, 2, 1.8099f, -4.1257f, -3.2188f, 3, 7, 3, 0.0f));
            this.Hair7 = new ModelRenderer(this);
            this.Hair7.setRotationPoint(-1.0f, -10.0f, 4.0f);
            this.setRotationAngle(this.Hair7, -0.3491f, 0.0f, 0.5236f);
            this.Head.addChild(this.Hair7);
            this.Hair7.cubeList.add(new ModelBox(this.Hair7, 45, 2, 1.8099f, -2.4417f, -5.0982f, 3, 6, 5, 0.0f));
            this.Hair8 = new ModelRenderer(this);
            this.Hair8.setRotationPoint(-5.0f, -7.0f, 2.0f);
            this.setRotationAngle(this.Hair8, 2.7925f, 0.0873f, -0.4363f);
            this.Head.addChild(this.Hair8);
            this.Hair8.cubeList.add(new ModelBox(this.Hair8, 45, 2, -0.4847f, -3.7367f, -2.7246f, 3, 7, 3, 0.0f));
            this.Hair9 = new ModelRenderer(this);
            this.Hair9.setRotationPoint(3.0f, -8.0f, 2.0f);
            this.setRotationAngle(this.Hair9, 2.7925f, 0.0873f, 0.5236f);
            this.Head.addChild(this.Hair9);
            this.Hair9.cubeList.add(new ModelBox(this.Hair9, 45, 2, 0.3618f, -3.6765f, -2.7815f, 3, 7, 3, 0.0f));
            this.Hair10 = new ModelRenderer(this);
            this.Hair10.setRotationPoint(0.0f, -2.0f, 6.0f);
            this.setRotationAngle(this.Hair10, -0.5236f, 0.3491f, 0.0f);
            this.Head.addChild(this.Hair10);
            this.Hair10.cubeList.add(new ModelBox(this.Hair10, 38, 2, 0.9972f, -5.6289f, -4.1585f, 3, 8, 3, 0.0f));
            this.Hair11 = new ModelRenderer(this);
            this.Hair11.setRotationPoint(-4.0f, -2.0f, 4.0f);
            this.setRotationAngle(this.Hair11, -0.5236f, -0.2618f, 0.0f);
            this.Head.addChild(this.Hair11);
            this.Hair11.cubeList.add(new ModelBox(this.Hair11, 38, 2, 0.9972f, -5.6289f, -4.1585f, 3, 8, 3, 0.0f));
            this.Hair12 = new ModelRenderer(this);
            this.Hair12.setRotationPoint(-5.0f, 0.0f, 3.0f);
            this.setRotationAngle(this.Hair12, -0.5236f, -0.2618f, -0.7854f);
            this.Head.addChild(this.Hair12);
            this.Hair12.cubeList.add(new ModelBox(this.Hair12, 38, 2, 1.9972f, -4.6289f, -4.1585f, 2, 7, 2, 0.0f));
            this.Hair13 = new ModelRenderer(this);
            this.Hair13.setRotationPoint(1.0f, -6.0f, 3.0f);
            this.setRotationAngle(this.Hair13, -0.2618f, -0.2618f, 0.7854f);
            this.Head.addChild(this.Hair13);
            this.Hair13.cubeList.add(new ModelBox(this.Hair13, 38, 2, 1.9972f, -4.6289f, -4.1585f, 2, 7, 2, 0.0f));
            this.Strand1 = new ModelRenderer(this);
            this.Strand1.setRotationPoint(-2.0f, -10.0f, -2.0f);
            this.setRotationAngle(this.Strand1, 0.0872f, -0.0873f, 1.5708f);
            this.Head.addChild(this.Strand1);
            this.Strand1.cubeList.add(new ModelBox(this.Strand1, 38, 2, 0.583f, -1.6421f, -2.7351f, 2, 5, 2, 0.0f));
            this.Strand2 = new ModelRenderer(this);
            this.Strand2.setRotationPoint(1.0f, -5.0f, -2.0f);
            this.setRotationAngle(this.Strand2, -0.3491f, 0.0f, -0.7854f);
            this.Head.addChild(this.Strand2);
            this.Strand2.cubeList.add(new ModelBox(this.Strand2, 38, 2, 1.9972f, -1.6421f, -2.7351f, 2, 5, 2, 0.0f));
        }
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glScalef((float)this.scale, (float)this.scale, (float)this.scale);
        GL11.glTranslatef((float)0.0f, (float)((float)((double)-1.04f + 5.5 / (1.0 + Math.pow(this.scale / 0.45f, 1.88f)))), (float)0.0f);
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

