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

public class ModelZamasuMerged
extends ModelBase {
    private final ModelRenderer Head;
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
    private final ModelRenderer Hair11;
    private final ModelRenderer Hair12;
    private final ModelRenderer Hair13;
    private final ModelRenderer Hair14;
    private final ModelRenderer Strand1;
    private final ModelRenderer Strand2;
    private final ModelRenderer REar;
    private final ModelRenderer LEar;
    private final ModelRenderer REarring;
    private final ModelRenderer LEarring;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scale = 1.0f;

    public ModelZamasuMerged(float _scale) {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.scale = _scale;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(1.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -5.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Hair1 = new ModelRenderer(this);
        this.Hair1.setRotationPoint(-1.0f, -11.0f, 3.0f);
        this.setRotationAngle(this.Hair1, -0.3491f, 0.0f, 0.2618f);
        this.Head.addChild(this.Hair1);
        this.Hair1.cubeList.add(new ModelBox(this.Hair1, 45, 2, -2.2f, -1.658f, -5.0f, 3, 7, 3, 0.0f));
        this.Hair2 = new ModelRenderer(this);
        this.Hair2.setRotationPoint(-3.0f, -9.0f, 1.0f);
        this.setRotationAngle(this.Hair2, -0.2618f, 0.0f, 0.4363f);
        this.Head.addChild(this.Hair2);
        this.Hair2.cubeList.add(new ModelBox(this.Hair2, 45, 2, 2.0603f, -3.658f, -3.0f, 3, 7, 3, 0.0f));
        this.Hair3 = new ModelRenderer(this);
        this.Hair3.setRotationPoint(-3.0f, -9.0f, 1.0f);
        this.setRotationAngle(this.Hair3, -0.4363f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair3);
        this.Hair3.cubeList.add(new ModelBox(this.Hair3, 39, 0, 1.0603f, -5.658f, 0.0f, 4, 7, 4, 0.0f));
        this.Hair4 = new ModelRenderer(this);
        this.Hair4.setRotationPoint(-1.0f, -11.0f, 3.0f);
        this.setRotationAngle(this.Hair4, -0.1746f, 0.0f, -0.2618f);
        this.Head.addChild(this.Hair4);
        this.Hair4.cubeList.add(new ModelBox(this.Hair4, 45, 2, -4.9397f, -2.658f, -6.0f, 3, 7, 3, 0.0f));
        this.Hair5 = new ModelRenderer(this);
        this.Hair5.setRotationPoint(-1.0f, -11.0f, 3.0f);
        this.setRotationAngle(this.Hair5, -0.3491f, 0.0f, -1.7453f);
        this.Head.addChild(this.Hair5);
        this.Hair5.cubeList.add(new ModelBox(this.Hair5, 45, 2, -4.9397f, -6.658f, -3.0f, 3, 7, 3, 0.0f));
        this.Hair6 = new ModelRenderer(this);
        this.Hair6.setRotationPoint(-5.0f, -7.0f, 4.0f);
        this.setRotationAngle(this.Hair6, -0.6109f, 0.0f, -0.4363f);
        this.Head.addChild(this.Hair6);
        this.Hair6.cubeList.add(new ModelBox(this.Hair6, 45, 2, 1.8099f, -4.1257f, -5.2188f, 3, 7, 3, 0.0f));
        this.Hair7 = new ModelRenderer(this);
        this.Hair7.setRotationPoint(-5.0f, -7.0f, 4.0f);
        this.setRotationAngle(this.Hair7, -0.3491f, 0.0f, 0.4364f);
        this.Head.addChild(this.Hair7);
        this.Hair7.cubeList.add(new ModelBox(this.Hair7, 45, 2, 4.8099f, -6.1257f, -5.2188f, 3, 7, 3, 0.0f));
        this.Hair8 = new ModelRenderer(this);
        this.Hair8.setRotationPoint(-5.0f, -7.0f, 4.0f);
        this.setRotationAngle(this.Hair8, 0.0f, 0.0f, 0.4364f);
        this.Head.addChild(this.Hair8);
        this.Hair8.cubeList.add(new ModelBox(this.Hair8, 39, 4, 2.8099f, -5.1257f, -7.9f, 5, 4, 4, 0.0f));
        this.Hair9 = new ModelRenderer(this);
        this.Hair9.setRotationPoint(-3.0f, -9.0f, 1.0f);
        this.setRotationAngle(this.Hair9, -0.4363f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair9);
        this.Hair9.cubeList.add(new ModelBox(this.Hair9, 38, 2, -1.9397f, -2.658f, 1.0f, 6, 6, 4, 0.0f));
        this.Hair10 = new ModelRenderer(this);
        this.Hair10.setRotationPoint(-5.0f, -7.0f, 4.0f);
        this.setRotationAngle(this.Hair10, -0.6109f, 0.0f, -0.4363f);
        this.Head.addChild(this.Hair10);
        this.Hair10.cubeList.add(new ModelBox(this.Hair10, 45, 2, -0.1901f, -1.1257f, -4.2188f, 3, 7, 3, 0.0f));
        this.Hair11 = new ModelRenderer(this);
        this.Hair11.setRotationPoint(-5.0f, -7.0f, 4.0f);
        this.setRotationAngle(this.Hair11, -0.3491f, 0.0f, 0.4364f);
        this.Head.addChild(this.Hair11);
        this.Hair11.cubeList.add(new ModelBox(this.Hair11, 45, 2, 4.8099f, -4.1257f, -3.2188f, 3, 7, 3, 0.0f));
        this.Hair12 = new ModelRenderer(this);
        this.Hair12.setRotationPoint(-5.0f, -7.0f, 4.0f);
        this.setRotationAngle(this.Hair12, -0.3491f, 0.0f, 0.6109f);
        this.Head.addChild(this.Hair12);
        this.Hair12.cubeList.add(new ModelBox(this.Hair12, 45, 2, 5.8099f, -4.1257f, -3.2188f, 3, 6, 3, 0.0f));
        this.Hair13 = new ModelRenderer(this);
        this.Hair13.setRotationPoint(3.0f, -7.0f, 4.0f);
        this.setRotationAngle(this.Hair13, -0.3491f, 0.0f, -0.6109f);
        this.Head.addChild(this.Hair13);
        this.Hair13.cubeList.add(new ModelBox(this.Hair13, 45, 2, -8.8099f, -4.1257f, -2.2188f, 3, 6, 3, 0.0f));
        this.Hair14 = new ModelRenderer(this);
        this.Hair14.setRotationPoint(-3.0f, -9.0f, 1.0f);
        this.setRotationAngle(this.Hair14, -0.4363f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair14);
        this.Hair14.cubeList.add(new ModelBox(this.Hair14, 38, 2, -0.9397f, 0.342f, 2.0f, 6, 6, 4, 0.0f));
        this.Strand1 = new ModelRenderer(this);
        this.Strand1.setRotationPoint(-2.0f, -10.0f, -2.0f);
        this.setRotationAngle(this.Strand1, -1.1345f, -1.2218f, 1.7453f);
        this.Head.addChild(this.Strand1);
        this.Strand1.cubeList.add(new ModelBox(this.Strand1, 38, 2, -2.417f, 1.3579f, -1.7351f, 2, 7, 2, 0.0f));
        this.Strand2 = new ModelRenderer(this);
        this.Strand2.setRotationPoint(0.0f, -10.0f, -2.0f);
        this.setRotationAngle(this.Strand2, -1.1345f, 1.2218f, -1.5708f);
        this.Head.addChild(this.Strand2);
        this.Strand2.cubeList.add(new ModelBox(this.Strand2, 38, 2, 0.417f, 2.3579f, -0.7351f, 2, 4, 2, 0.0f));
        this.REar = new ModelRenderer(this);
        this.REar.setRotationPoint(-5.0f, -4.0f, 0.0f);
        this.setRotationAngle(this.REar, 0.1745f, -0.5236f, 0.0f);
        this.Head.addChild(this.REar);
        this.REar.cubeList.add(new ModelBox(this.REar, 0, 0, -0.2f, -2.0f, -1.0f, 0, 4, 4, 0.0f));
        this.LEar = new ModelRenderer(this);
        this.LEar.setRotationPoint(3.0f, -4.0f, 0.0f);
        this.setRotationAngle(this.LEar, 0.1745f, 0.5236f, 0.0f);
        this.LEar.mirror = true;
        this.Head.addChild(this.LEar);
        this.LEar.cubeList.add(new ModelBox(this.LEar, 0, 0, 0.2f, -2.0f, -1.0f, 0, 4, 4, 0.0f));
        this.REarring = new ModelRenderer(this);
        this.REarring.setRotationPoint(-5.0f, -4.0f, 0.0f);
        this.setRotationAngle(this.REarring, 0.1745f, -0.5236f, 0.0f);
        this.Head.addChild(this.REarring);
        this.REarring.cubeList.add(new ModelBox(this.REarring, 50, 10, -0.5f, 1.0f, -1.0f, 0, 2, 2, 0.0f));
        this.LEarring = new ModelRenderer(this);
        this.LEarring.setRotationPoint(3.0f, -4.0f, 0.0f);
        this.setRotationAngle(this.LEarring, 0.1745f, 0.5236f, 0.0f);
        this.LEarring.mirror = true;
        this.Head.addChild(this.LEarring);
        this.LEarring.cubeList.add(new ModelBox(this.LEarring, 50, 10, 0.5f, 1.0f, -1.0f, 0, 2, 2, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(-3.8f, 5.4f, 3.8f);
        this.Body.cubeList.add(new ModelBox(this.Body, 16, 16, -0.2f, -5.4f, -5.8f, 8, 12, 4, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 41, 16, 1.0f, -2.0f, -6.0f, 3, 12, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(3.8f, -3.4f, 0.2f);
        this.LArm.mirror = true;
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 41, 16, 4.0f, -2.0f, -6.0f, 3, 12, 4, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 16, 2.0f, 0.0f, -6.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(5.8f, 6.6f, 0.2f);
        this.LLeg.mirror = true;
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 0, 16, -2.0f, 0.0f, -6.0f, 4, 12, 4, 0.0f));
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

