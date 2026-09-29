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

public class ModelBido
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer EarR;
    private final ModelRenderer EarL;
    private final ModelRenderer headhair;
    private final ModelRenderer Hair1;
    private final ModelRenderer Hair2;
    private final ModelRenderer Hair3;
    private final ModelRenderer Body;
    private final ModelRenderer bb_main;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer LLeg;
    private final ModelRenderer RLeg;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelBido(float _scaleX, float _scaleY, float _scaleZ) {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 30, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.EarR = new ModelRenderer(this);
        this.EarR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.EarR, 0.0f, -0.5236f, 0.0f);
        this.Head.addChild(this.EarR);
        this.EarR.mirror = true;
        this.EarR.cubeList.add(new ModelBox(this.EarR, 25, 19, -4.0f, -8.0f, -1.0f, 0, 6, 6, 0.0f));
        this.EarL = new ModelRenderer(this);
        this.EarL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.EarL, 0.0f, 0.5236f, 0.0f);
        this.Head.addChild(this.EarL);
        this.EarL.cubeList.add(new ModelBox(this.EarL, 25, 19, 4.0f, -8.0f, -1.0f, 0, 6, 6, 0.0f));
        this.headhair = new ModelRenderer(this);
        this.headhair.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.headhair);
        this.headhair.cubeList.add(new ModelBox(this.headhair, 0, 0, -5.0f, -9.0f, -5.0f, 10, 9, 10, 0.0f));
        this.Hair1 = new ModelRenderer(this);
        this.Hair1.setRotationPoint(1.0f, -8.0f, 0.0f);
        this.setRotationAngle(this.Hair1, 0.7854f, 0.3491f, -0.6109f);
        this.Head.addChild(this.Hair1);
        this.Hair1.cubeList.add(new ModelBox(this.Hair1, 0, 0, -2.0f, -4.0f, 0.0f, 2, 5, 2, 0.0f));
        this.Hair2 = new ModelRenderer(this);
        this.Hair2.setRotationPoint(0.0f, -7.0f, -2.0f);
        this.setRotationAngle(this.Hair2, 1.3963f, 0.5236f, 0.3491f);
        this.Head.addChild(this.Hair2);
        this.Hair2.cubeList.add(new ModelBox(this.Hair2, 0, 0, -2.0f, -4.0f, 0.0f, 2, 5, 2, 0.0f));
        this.Hair3 = new ModelRenderer(this);
        this.Hair3.setRotationPoint(1.0f, -7.0f, 3.0f);
        this.setRotationAngle(this.Hair3, 0.7854f, 0.3491f, -0.0873f);
        this.Head.addChild(this.Hair3);
        this.Hair3.cubeList.add(new ModelBox(this.Hair3, 0, 0, -1.658f, -4.6645f, -1.6645f, 2, 4, 3, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.2f, 5.4f, -0.2f);
        this.Body.cubeList.add(new ModelBox(this.Body, 32, 32, -4.2f, -5.4f, -1.8f, 8, 12, 4, 0.0f));
        this.bb_main = new ModelRenderer(this);
        this.bb_main.setRotationPoint(-0.2f, 18.6f, 0.2f);
        this.Body.addChild(this.bb_main);
        this.bb_main.cubeList.add(new ModelBox(this.bb_main, 34, 49, -4.5f, -14.6f, -2.4f, 9, 7, 5, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 0, 46, -4.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 16, 46, 8.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 40, 16, 2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 40, 0, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
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

