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

public class ModelAndroid13
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer Visor;
    private final ModelRenderer Hat;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
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
    private final ModelRenderer Hair9;
    private final ModelRenderer Hair10;
    private final ModelRenderer Hair11;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelAndroid13(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Visor = new ModelRenderer(this);
        this.Visor.setRotationPoint(-0.1875f, 24.0f, 0.0f);
        this.Head.addChild(this.Visor);
        this.Visor.cubeList.add(new ModelBox(this.Visor, 0, 0, -3.0f, -30.0f, -6.0f, 6, 1, 2, 0.0f));
        this.Hat = new ModelRenderer(this);
        this.Hat.setRotationPoint(-0.0875f, 0.0f, 0.75f);
        this.Head.addChild(this.Hat);
        this.Hat.cubeList.add(new ModelBox(this.Hat, 36, 0, -3.9125f, -9.0f, -4.75f, 8, 4, 8, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 16, 16, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 40, 16, -3.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.Body.addChild(this.LArm);
        this.LArm.mirror = true;
        this.LArm.cubeList.add(new ModelBox(this.LArm, 40, 16, -1.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-1.9f, 12.0f, 0.1f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(1.9f, 12.0f, 0.1f);
        this.Body.addChild(this.LLeg);
        this.LLeg.mirror = true;
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.Hair1 = new ModelRenderer(this);
        this.Hair1.setRotationPoint(4.0f, 0.0f, 3.375f);
        this.setRotationAngle(this.Hair1, 0.6109f, 0.1745f, -1.9199f);
        this.Hair1.cubeList.add(new ModelBox(this.Hair1, 45, 13, -4.0f, -1.0f, 0.0f, 8, 1, 1, 0.0f));
        this.Hair2 = new ModelRenderer(this);
        this.Hair2.setRotationPoint(-4.0f, 0.0f, 3.375f);
        this.setRotationAngle(this.Hair2, 0.6109f, -0.1745f, 1.9199f);
        this.Hair2.cubeList.add(new ModelBox(this.Hair2, 45, 13, -4.0f, -1.0f, 0.0f, 8, 1, 1, 0.0f));
        this.Hair3 = new ModelRenderer(this);
        this.Hair3.setRotationPoint(-3.0f, 0.0f, 3.375f);
        this.setRotationAngle(this.Hair3, 0.4363f, -0.4363f, 1.8326f);
        this.Hair3.cubeList.add(new ModelBox(this.Hair3, 45, 13, -4.0f, -1.0f, -1.0f, 8, 1, 2, 0.0f));
        this.Hair4 = new ModelRenderer(this);
        this.Hair4.setRotationPoint(3.0f, 0.0f, 3.375f);
        this.setRotationAngle(this.Hair4, 0.4363f, 0.4363f, -1.8326f);
        this.Hair4.cubeList.add(new ModelBox(this.Hair4, 45, 13, -4.0f, -1.0f, -1.0f, 8, 1, 2, 0.0f));
        this.Hair5 = new ModelRenderer(this);
        this.Hair5.setRotationPoint(2.0f, 0.0f, 3.375f);
        this.setRotationAngle(this.Hair5, 0.4363f, 0.1745f, -1.8326f);
        this.Hair5.cubeList.add(new ModelBox(this.Hair5, 45, 13, -4.0f, -1.0f, 0.0f, 8, 1, 1, 0.0f));
        this.Hair6 = new ModelRenderer(this);
        this.Hair6.setRotationPoint(-2.0f, 0.0f, 3.375f);
        this.setRotationAngle(this.Hair6, 0.4363f, -0.1745f, 1.8326f);
        this.Hair6.cubeList.add(new ModelBox(this.Hair6, 45, 13, -4.0f, -1.0f, 0.0f, 8, 1, 1, 0.0f));
        this.Hair7 = new ModelRenderer(this);
        this.Hair7.setRotationPoint(-1.0f, 0.0f, 3.375f);
        this.setRotationAngle(this.Hair7, 0.4363f, -0.4363f, 1.8326f);
        this.Hair7.cubeList.add(new ModelBox(this.Hair7, 45, 13, -4.0f, -1.0f, 0.0f, 8, 1, 1, 0.0f));
        this.Hair8 = new ModelRenderer(this);
        this.Hair8.setRotationPoint(2.0f, 0.0f, 3.375f);
        this.setRotationAngle(this.Hair8, 0.4363f, 0.1745f, -1.8326f);
        this.Hair8.cubeList.add(new ModelBox(this.Hair8, 45, 13, -4.0f, -1.0f, 0.0f, 8, 1, 1, 0.0f));
        this.Hair9 = new ModelRenderer(this);
        this.Hair9.setRotationPoint(1.0f, 0.0f, 3.375f);
        this.setRotationAngle(this.Hair9, 0.4363f, 0.4363f, -1.8326f);
        this.Hair9.cubeList.add(new ModelBox(this.Hair9, 45, 13, -4.0f, -1.0f, -1.0f, 8, 1, 2, 0.0f));
        this.Hair10 = new ModelRenderer(this);
        this.Hair10.setRotationPoint(-5.0f, 0.0f, 3.375f);
        this.setRotationAngle(this.Hair10, 0.4363f, 0.0f, 1.8326f);
        this.Hair10.cubeList.add(new ModelBox(this.Hair10, 45, 13, -4.0f, -1.0f, -1.0f, 8, 1, 2, 0.0f));
        this.Hair11 = new ModelRenderer(this);
        this.Hair11.setRotationPoint(5.0f, 0.0f, 3.375f);
        this.setRotationAngle(this.Hair11, 0.4363f, 0.0f, -1.8326f);
        this.Hair11.cubeList.add(new ModelBox(this.Hair11, 44, 13, -4.0f, -1.0f, -1.0f, 8, 1, 2, 0.0f));
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

