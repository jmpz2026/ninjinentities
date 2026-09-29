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

public class ModelBojack
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer EarR;
    private final ModelRenderer EarL;
    private final ModelRenderer Hair2;
    private final ModelRenderer Hair3;
    private final ModelRenderer Hair8;
    private final ModelRenderer Hair9;
    private final ModelRenderer Hair12;
    private final ModelRenderer Hair13;
    private final ModelRenderer Hair14;
    private final ModelRenderer Hair15;
    private final ModelRenderer BandanaStripR;
    private final ModelRenderer BandanaStripL;
    private final ModelRenderer Body;
    private final ModelRenderer bb_main;
    private final ModelRenderer RArm;
    private final ModelRenderer bone;
    private final ModelRenderer LArm;
    private final ModelRenderer bone2;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelBojack(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 30, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.EarR = new ModelRenderer(this);
        this.EarR.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.EarR, 0.0f, -0.5236f, 0.0f);
        this.Head.addChild(this.EarR);
        this.EarR.mirror = true;
        this.EarR.cubeList.add(new ModelBox(this.EarR, 61, 27, -4.0f, -8.0f, -1.0f, 0, 6, 6, 0.0f));
        this.EarL = new ModelRenderer(this);
        this.EarL.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.EarL, 0.0f, 0.5236f, 0.0f);
        this.Head.addChild(this.EarL);
        this.EarL.cubeList.add(new ModelBox(this.EarL, 61, 27, 4.0f, -8.0f, -1.0f, 0, 6, 6, 0.0f));
        this.Hair2 = new ModelRenderer(this);
        this.Hair2.setRotationPoint(-2.0f, 0.0f, 5.5f);
        this.setRotationAngle(this.Hair2, 0.2618f, 0.0f, 0.6109f);
        this.Head.addChild(this.Hair2);
        this.Hair2.cubeList.add(new ModelBox(this.Hair2, 0, 18, -3.7208f, -2.448f, -2.2857f, 8, 4, 2, 0.0f));
        this.Hair3 = new ModelRenderer(this);
        this.Hair3.setRotationPoint(2.0f, 0.0f, 5.5f);
        this.setRotationAngle(this.Hair3, 0.2618f, 0.0f, -0.6109f);
        this.Head.addChild(this.Hair3);
        this.Hair3.cubeList.add(new ModelBox(this.Hair3, 0, 18, -4.2792f, -2.448f, -2.2857f, 8, 4, 2, 0.0f));
        this.Hair8 = new ModelRenderer(this);
        this.Hair8.setRotationPoint(2.0f, -1.0f, 5.5f);
        this.setRotationAngle(this.Hair8, 0.349f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair8);
        this.Hair8.cubeList.add(new ModelBox(this.Hair8, 0, 16, -6.0f, -3.0f, -2.5f, 8, 7, 3, 0.0f));
        this.Hair9 = new ModelRenderer(this);
        this.Hair9.setRotationPoint(2.0f, 5.0f, 6.5f);
        this.setRotationAngle(this.Hair9, 0.0873f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair9);
        this.Hair9.cubeList.add(new ModelBox(this.Hair9, 0, 16, -6.0f, -3.0f, -2.5f, 8, 7, 3, 0.0f));
        this.Hair12 = new ModelRenderer(this);
        this.Hair12.setRotationPoint(-2.0f, 0.0f, 6.5f);
        this.setRotationAngle(this.Hair12, 0.0873f, 0.0f, 0.6109f);
        this.Head.addChild(this.Hair12);
        this.Hair12.cubeList.add(new ModelBox(this.Hair12, 0, 18, -2.0f, 0.0f, -2.5f, 8, 4, 2, 0.0f));
        this.Hair13 = new ModelRenderer(this);
        this.Hair13.setRotationPoint(2.0f, 0.0f, 6.5f);
        this.setRotationAngle(this.Hair13, 0.0873f, 0.0f, -0.6109f);
        this.Head.addChild(this.Hair13);
        this.Hair13.cubeList.add(new ModelBox(this.Hair13, 0, 18, -6.0f, 0.0f, -2.5f, 8, 4, 2, 0.0f));
        this.Hair14 = new ModelRenderer(this);
        this.Hair14.setRotationPoint(2.0f, 5.0f, 7.5f);
        this.setRotationAngle(this.Hair14, 0.0873f, 0.0f, -0.6109f);
        this.Head.addChild(this.Hair14);
        this.Hair14.cubeList.add(new ModelBox(this.Hair14, 0, 17, -6.0f, 0.0f, -3.5f, 8, 4, 3, 0.0f));
        this.Hair15 = new ModelRenderer(this);
        this.Hair15.setRotationPoint(-2.0f, 5.0f, 7.5f);
        this.setRotationAngle(this.Hair15, 0.0873f, 0.0f, 0.6109f);
        this.Head.addChild(this.Hair15);
        this.Hair15.cubeList.add(new ModelBox(this.Hair15, 0, 17, -2.0f, 0.0f, -3.5f, 8, 4, 3, 0.0f));
        this.BandanaStripR = new ModelRenderer(this);
        this.BandanaStripR.setRotationPoint(0.0f, -4.0f, 4.0f);
        this.setRotationAngle(this.BandanaStripR, 0.0f, 0.0f, -0.3491f);
        this.Head.addChild(this.BandanaStripR);
        this.BandanaStripR.cubeList.add(new ModelBox(this.BandanaStripR, 8, 11, -7.0f, -2.0f, 0.0f, 7, 2, 0, 0.0f));
        this.BandanaStripL = new ModelRenderer(this);
        this.BandanaStripL.setRotationPoint(0.0f, -4.0f, 4.0f);
        this.setRotationAngle(this.BandanaStripL, 0.0f, 0.0f, 0.3491f);
        this.Head.addChild(this.BandanaStripL);
        this.BandanaStripL.mirror = true;
        this.BandanaStripL.cubeList.add(new ModelBox(this.BandanaStripL, 8, 11, 0.0f, -2.0f, 0.0f, 7, 2, 0, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.2f, 5.4f, -0.2f);
        this.Body.cubeList.add(new ModelBox(this.Body, 40, 0, -4.2f, -5.4f, -1.8f, 8, 12, 4, 0.0f));
        this.bb_main = new ModelRenderer(this);
        this.bb_main.setRotationPoint(-0.2f, 18.6f, 0.2f);
        this.Body.addChild(this.bb_main);
        this.bb_main.cubeList.add(new ModelBox(this.bb_main, 32, 32, -4.5f, -13.6f, -2.4f, 9, 10, 5, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 54, 54, -4.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.bone = new ModelRenderer(this);
        this.bone.setRotationPoint(4.0f, 22.0f, 0.0f);
        this.RArm.addChild(this.bone);
        this.bone.cubeList.add(new ModelBox(this.bone, 40, 16, -9.0f, -25.0f, -3.0f, 5, 4, 6, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(-4.2f, -3.4f, 0.2f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 0, 56, 8.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.bone2 = new ModelRenderer(this);
        this.bone2.setRotationPoint(4.0f, 22.0f, 0.0f);
        this.LArm.addChild(this.bone2);
        this.bone2.cubeList.add(new ModelBox(this.bone2, 0, 46, 4.0f, -25.0f, -3.0f, 5, 4, 6, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 22, 47, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(-2.2f, 6.6f, 0.2f);
        this.Body.addChild(this.LLeg);
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 38, 47, 2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
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

