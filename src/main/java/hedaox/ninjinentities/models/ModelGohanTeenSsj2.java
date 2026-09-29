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

public class ModelGohanTeenSsj2
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
    private final ModelRenderer Strand1;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scale = 1.0f;

    public ModelGohanTeenSsj2(float _scale) {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.scale = _scale;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Hair1 = new ModelRenderer(this);
        this.Hair1.setRotationPoint(-1.0f, -9.0f, 0.0f);
        this.setRotationAngle(this.Hair1, -0.0873f, 0.0f, -0.1745f);
        this.Head.addChild(this.Hair1);
        this.Hair1.cubeList.add(new ModelBox(this.Hair1, 42, 2, -0.5133f, -6.474f, -2.0714f, 3, 8, 3, 0.0f));
        this.Hair2 = new ModelRenderer(this);
        this.Hair2.setRotationPoint(-2.0f, -10.0f, 0.0f);
        this.setRotationAngle(this.Hair2, 0.0f, 0.0f, -0.349f);
        this.Head.addChild(this.Hair2);
        this.Hair2.cubeList.add(new ModelBox(this.Hair2, 43, 2, -1.9397f, -3.658f, -3.0f, 3, 7, 3, 0.0f));
        this.Hair3 = new ModelRenderer(this);
        this.Hair3.setRotationPoint(1.0f, -8.0f, 0.0f);
        this.setRotationAngle(this.Hair3, 0.0f, 0.0f, 0.3665f);
        this.Head.addChild(this.Hair3);
        this.Hair3.cubeList.add(new ModelBox(this.Hair3, 43, 2, 0.0603f, -5.342f, -3.0f, 3, 7, 3, 0.0f));
        this.Hair4 = new ModelRenderer(this);
        this.Hair4.setRotationPoint(2.0f, -7.0f, 0.0f);
        this.setRotationAngle(this.Hair4, 0.0f, 0.0873f, 0.4363f);
        this.Head.addChild(this.Hair4);
        this.Hair4.cubeList.add(new ModelBox(this.Hair4, 45, 2, 1.0603f, -5.342f, -0.9f, 2, 7, 3, 0.0f));
        this.Hair5 = new ModelRenderer(this);
        this.Hair5.setRotationPoint(-4.6f, -6.4f, -2.0f);
        this.setRotationAngle(this.Hair5, 2.7925f, 0.0873f, -0.4364f);
        this.Head.addChild(this.Hair5);
        this.Hair5.cubeList.add(new ModelBox(this.Hair5, 42, 2, -0.0028f, -2.171f, -3.2188f, 3, 7, 3, 0.0f));
        this.Hair6 = new ModelRenderer(this);
        this.Hair6.setRotationPoint(-5.0f, -7.0f, 4.0f);
        this.setRotationAngle(this.Hair6, -0.0873f, 0.0f, -0.4363f);
        this.Head.addChild(this.Hair6);
        this.Hair6.cubeList.add(new ModelBox(this.Hair6, 45, 2, 1.8099f, -5.1257f, -3.0188f, 3, 9, 3, 0.0f));
        this.Hair7 = new ModelRenderer(this);
        this.Hair7.setRotationPoint(-1.0f, -10.0f, 4.0f);
        this.setRotationAngle(this.Hair7, -0.3491f, 0.0f, 0.0699f);
        this.Head.addChild(this.Hair7);
        this.Hair7.cubeList.add(new ModelBox(this.Hair7, 43, 2, 1.8099f, -4.0417f, -5.0982f, 3, 7, 4, 0.0f));
        this.Hair8 = new ModelRenderer(this);
        this.Hair8.setRotationPoint(-3.0f, -8.0f, 2.0f);
        this.setRotationAngle(this.Hair8, 2.7925f, -0.0873f, -0.349f);
        this.Head.addChild(this.Hair8);
        this.Hair8.cubeList.add(new ModelBox(this.Hair8, 43, 4, -1.9972f, -3.571f, -3.2188f, 3, 7, 3, 0.0f));
        this.Hair9 = new ModelRenderer(this);
        this.Hair9.setRotationPoint(3.0f, -8.0f, 2.0f);
        this.setRotationAngle(this.Hair9, 2.7925f, 0.0873f, 0.349f);
        this.Head.addChild(this.Hair9);
        this.Hair9.cubeList.add(new ModelBox(this.Hair9, 43, 4, -1.0028f, -3.571f, -3.2188f, 3, 7, 3, 0.0f));
        this.Hair10 = new ModelRenderer(this);
        this.Hair10.setRotationPoint(-0.7f, -4.2f, 1.3f);
        this.setRotationAngle(this.Hair10, 2.8798f, 0.0873f, 0.0f);
        this.Head.addChild(this.Hair10);
        this.Hair10.cubeList.add(new ModelBox(this.Hair10, 42, 2, 0.9972f, -2.3391f, -4.0809f, 3, 10, 3, 0.0f));
        this.Hair11 = new ModelRenderer(this);
        this.Hair11.setRotationPoint(-3.5f, -6.6f, 1.6f);
        this.setRotationAngle(this.Hair11, 2.9671f, 0.0175f, 0.0524f);
        this.Head.addChild(this.Hair11);
        this.Hair11.cubeList.add(new ModelBox(this.Hair11, 42, 2, 0.9972f, -4.6289f, -4.1585f, 3, 10, 3, 0.0f));
        this.Strand1 = new ModelRenderer(this);
        this.Strand1.setRotationPoint(-5.5f, -7.0f, -2.6f);
        this.setRotationAngle(this.Strand1, -0.4364f, 0.0f, 0.3491f);
        this.Head.addChild(this.Strand1);
        this.Strand1.cubeList.add(new ModelBox(this.Strand1, 38, 2, 1.9972f, -2.971f, -3.2188f, 2, 5, 2, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.2f, 5.4f, -0.2f);
        this.Body.cubeList.add(new ModelBox(this.Body, 16, 16, -4.2f, -5.4f, -1.8f, 8, 12, 4, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 40, 16, -4.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.LArm.mirror = true;
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 40, 16, 8.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.LLeg.mirror = true;
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 0, 16, 2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
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

