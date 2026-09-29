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

public class ModelBrolyZBase
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
    private final ModelRenderer Hair15;
    private final ModelRenderer Hair16;
    private final ModelRenderer Hair17;
    private final ModelRenderer Strand1;
    private final ModelRenderer Strand2;
    private final ModelRenderer Body;
    private final ModelRenderer Kilt;
    private final ModelRenderer RArm;
    private final ModelRenderer RShoulderArmor;
    private final ModelRenderer LArm;
    private final ModelRenderer LShoulderArmor;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelBrolyZBase(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Hair1 = new ModelRenderer(this);
        this.Hair1.setRotationPoint(0.0f, -11.0f, 1.0f);
        this.setRotationAngle(this.Hair1, 1.0472f, 1.5708f, 0.5236f);
        this.Head.addChild(this.Hair1);
        this.Hair1.cubeList.add(new ModelBox(this.Hair1, 45, 2, 0.0603f, -3.658f, -3.0f, 3, 7, 3, 0.0f));
        this.Hair2 = new ModelRenderer(this);
        this.Hair2.setRotationPoint(-5.0f, -10.0f, 0.0f);
        this.setRotationAngle(this.Hair2, -0.7854f, 0.0f, 1.1345f);
        this.Head.addChild(this.Hair2);
        this.Hair2.cubeList.add(new ModelBox(this.Hair2, 45, 2, 1.0603f, -3.658f, -3.0f, 2, 7, 3, 0.0f));
        this.Hair3 = new ModelRenderer(this);
        this.Hair3.setRotationPoint(5.0f, -10.0f, 0.0f);
        this.setRotationAngle(this.Hair3, -0.7854f, 0.0f, -1.1345f);
        this.Head.addChild(this.Hair3);
        this.Hair3.cubeList.add(new ModelBox(this.Hair3, 45, 2, -3.0603f, -3.658f, -3.0f, 2, 7, 3, 0.0f));
        this.Hair4 = new ModelRenderer(this);
        this.Hair4.setRotationPoint(-1.0f, -10.0f, 4.0f);
        this.setRotationAngle(this.Hair4, -0.3491f, 0.0f, 0.5236f);
        this.Head.addChild(this.Hair4);
        this.Hair4.cubeList.add(new ModelBox(this.Hair4, 45, 2, 1.8099f, -3.4417f, -5.0982f, 3, 7, 3, 0.0f));
        this.Hair5 = new ModelRenderer(this);
        this.Hair5.setRotationPoint(-2.0f, -7.0f, 1.0f);
        this.setRotationAngle(this.Hair5, 2.7925f, 0.0873f, -2.0072f);
        this.Head.addChild(this.Hair5);
        this.Hair5.cubeList.add(new ModelBox(this.Hair5, 45, 2, 0.1736f, -2.8054f, -2.4469f, 3, 7, 3, 0.0f));
        this.Hair6 = new ModelRenderer(this);
        this.Hair6.setRotationPoint(2.0f, -7.0f, 1.0f);
        this.setRotationAngle(this.Hair6, 2.7925f, -0.0873f, 2.0072f);
        this.Head.addChild(this.Hair6);
        this.Hair6.cubeList.add(new ModelBox(this.Hair6, 45, 2, -3.1736f, -2.8054f, -2.4469f, 3, 7, 3, 0.0f));
        this.Hair7 = new ModelRenderer(this);
        this.Hair7.setRotationPoint(0.0f, -11.0f, 1.0f);
        this.setRotationAngle(this.Hair7, 1.0472f, -1.5708f, -0.5236f);
        this.Head.addChild(this.Hair7);
        this.Hair7.cubeList.add(new ModelBox(this.Hair7, 45, 2, -3.0603f, -3.658f, -3.0f, 3, 7, 3, 0.0f));
        this.Hair8 = new ModelRenderer(this);
        this.Hair8.setRotationPoint(1.0f, -10.0f, 4.0f);
        this.setRotationAngle(this.Hair8, -0.3491f, 0.0f, -0.5236f);
        this.Head.addChild(this.Hair8);
        this.Hair8.cubeList.add(new ModelBox(this.Hair8, 45, 2, -4.8099f, -3.4417f, -5.0982f, 3, 7, 3, 0.0f));
        this.Hair9 = new ModelRenderer(this);
        this.Hair9.setRotationPoint(6.0f, -7.0f, 2.0f);
        this.setRotationAngle(this.Hair9, 2.7925f, 0.0873f, 2.4435f);
        this.Head.addChild(this.Hair9);
        this.Hair9.cubeList.add(new ModelBox(this.Hair9, 45, 2, 2.923f, -0.7204f, -1.944f, 3, 4, 3, 0.0f));
        this.Hair10 = new ModelRenderer(this);
        this.Hair10.setRotationPoint(-6.0f, -7.0f, 2.0f);
        this.setRotationAngle(this.Hair10, 2.7925f, -0.0873f, -2.4435f);
        this.Head.addChild(this.Hair10);
        this.Hair10.cubeList.add(new ModelBox(this.Hair10, 45, 2, -5.923f, -0.7204f, -1.944f, 3, 4, 3, 0.0f));
        this.Hair11 = new ModelRenderer(this);
        this.Hair11.setRotationPoint(-3.0f, -5.0f, 1.0f);
        this.setRotationAngle(this.Hair11, -2.3562f, -0.5236f, 0.0f);
        this.Head.addChild(this.Hair11);
        this.Hair11.cubeList.add(new ModelBox(this.Hair11, 38, 2, 0.9972f, -9.1645f, -0.623f, 3, 8, 3, 0.0f));
        this.Hair12 = new ModelRenderer(this);
        this.Hair12.setRotationPoint(4.0f, -5.0f, 1.0f);
        this.setRotationAngle(this.Hair12, -2.5307f, 0.2618f, -0.0873f);
        this.Head.addChild(this.Hair12);
        this.Hair12.cubeList.add(new ModelBox(this.Hair12, 38, 2, -3.9972f, -8.9054f, -1.8641f, 3, 8, 3, 0.0f));
        this.Hair13 = new ModelRenderer(this);
        this.Hair13.setRotationPoint(7.5f, -6.2f, 4.4f);
        this.setRotationAngle(this.Hair13, 0.0f, 0.0f, 2.8798f);
        this.Head.addChild(this.Hair13);
        this.Hair13.cubeList.add(new ModelBox(this.Hair13, 38, 2, 3.689f, -6.3956f, -4.0294f, 2, 7, 3, 0.0f));
        this.Hair14 = new ModelRenderer(this);
        this.Hair14.setRotationPoint(-5.5f, -8.2f, 4.4f);
        this.setRotationAngle(this.Hair14, -0.0873f, 0.0873f, -2.618f);
        this.Head.addChild(this.Hair14);
        this.Hair14.cubeList.add(new ModelBox(this.Hair14, 38, 2, -4.9972f, -8.2916f, -5.4173f, 2, 7, 3, 0.0f));
        this.Hair15 = new ModelRenderer(this);
        this.Hair15.setRotationPoint(3.5f, -3.2f, 7.4f);
        this.setRotationAngle(this.Hair15, 0.3491f, 0.0f, 0.0f);
        this.Head.addChild(this.Hair15);
        this.Hair15.cubeList.add(new ModelBox(this.Hair15, 38, 2, -4.9972f, -2.8702f, -5.5267f, 3, 9, 3, 0.0f));
        this.Hair16 = new ModelRenderer(this);
        this.Hair16.setRotationPoint(-0.5f, 0.8f, 7.4f);
        this.setRotationAngle(this.Hair16, 0.3491f, 0.0f, 0.5236f);
        this.Head.addChild(this.Hair16);
        this.Hair16.cubeList.add(new ModelBox(this.Hair16, 38, 2, -3.9972f, -5.0013f, -4.751f, 3, 7, 3, 0.0f));
        this.Hair17 = new ModelRenderer(this);
        this.Hair17.setRotationPoint(0.5f, 0.8f, 7.4f);
        this.setRotationAngle(this.Hair17, 0.3491f, 0.0f, -0.5236f);
        this.Head.addChild(this.Hair17);
        this.Hair17.cubeList.add(new ModelBox(this.Hair17, 38, 2, 0.9972f, -5.0013f, -4.751f, 3, 7, 3, 0.0f));
        this.Strand1 = new ModelRenderer(this);
        this.Strand1.setRotationPoint(0.0f, -5.0f, -2.5f);
        this.setRotationAngle(this.Strand1, -0.3491f, -0.1745f, -0.7854f);
        this.Head.addChild(this.Strand1);
        this.Strand1.cubeList.add(new ModelBox(this.Strand1, 38, 2, 1.9972f, -1.6421f, -2.7351f, 2, 5, 2, 0.0f));
        this.Strand2 = new ModelRenderer(this);
        this.Strand2.setRotationPoint(0.0f, -5.0f, -2.5f);
        this.setRotationAngle(this.Strand2, -0.3491f, 0.1745f, 0.7854f);
        this.Head.addChild(this.Strand2);
        this.Strand2.cubeList.add(new ModelBox(this.Strand2, 38, 2, -3.9972f, -1.6421f, -2.7351f, 2, 5, 2, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(-3.8f, 5.4f, 3.8f);
        this.Body.cubeList.add(new ModelBox(this.Body, 16, 16, -0.2f, -5.4f, -5.8f, 8, 12, 4, 0.0f));
        this.Kilt = new ModelRenderer(this);
        this.Kilt.setRotationPoint(7.3f, 13.0f, -7.0f);
        this.Body.addChild(this.Kilt);
        this.Kilt.cubeList.add(new ModelBox(this.Kilt, 63, 16, -8.0f, -10.0f, 0.8f, 9, 10, 5, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-0.2f, -3.4f, -3.8f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 40, 16, -4.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.RShoulderArmor = new ModelRenderer(this);
        this.RShoulderArmor.setRotationPoint(-7.0f, -1.7f, 4.0f);
        this.setRotationAngle(this.RShoulderArmor, -1.5708f, 0.0f, 0.1047f);
        this.RArm.addChild(this.RShoulderArmor);
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(7.8f, -3.4f, -3.8f);
        this.Body.addChild(this.LArm);
        this.LArm.mirror = true;
        this.LArm.cubeList.add(new ModelBox(this.LArm, 40, 16, 0.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LShoulderArmor = new ModelRenderer(this);
        this.LShoulderArmor.setRotationPoint(7.0f, -1.7f, 4.0f);
        this.setRotationAngle(this.LShoulderArmor, -1.5708f, 0.0f, -0.1047f);
        this.LArm.addChild(this.LShoulderArmor);
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(1.8f, 6.6f, -3.8f);
        this.Body.addChild(this.RLeg);
        this.RLeg.cubeList.add(new ModelBox(this.RLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(5.8f, 6.6f, -3.8f);
        this.Body.addChild(this.LLeg);
        this.LLeg.mirror = true;
        this.LLeg.cubeList.add(new ModelBox(this.LLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f));
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

