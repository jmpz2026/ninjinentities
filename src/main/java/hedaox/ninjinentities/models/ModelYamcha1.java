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

public class ModelYamcha1
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
    private final ModelRenderer Strand3;
    private final ModelRenderer Strand4;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private float scale = 1.0f;

    public ModelYamcha1(float _scale) {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.scale = _scale;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f));
        this.Hair1 = new ModelRenderer(this);
        this.Hair1.setRotationPoint(-1.0f, -9.0f, 0.0f);
        this.setRotationAngle(this.Hair1, -0.0873f, 0.0f, -0.5585f);
        this.Head.addChild(this.Hair1);
        this.Hair1.cubeList.add(new ModelBox(this.Hair1, 42, 2, -0.5133f, -3.474f, -2.0714f, 3, 6, 3, 0.0f));
        this.Hair2 = new ModelRenderer(this);
        this.Hair2.setRotationPoint(-3.0f, -10.0f, 0.0f);
        this.setRotationAngle(this.Hair2, 0.0f, 0.0f, -0.9774f);
        this.Head.addChild(this.Hair2);
        this.Hair2.cubeList.add(new ModelBox(this.Hair2, 45, 2, -2.6397f, -2.658f, -3.0f, 3, 6, 3, 0.0f));
        this.Hair3 = new ModelRenderer(this);
        this.Hair3.setRotationPoint(1.0f, -8.0f, 0.0f);
        this.setRotationAngle(this.Hair3, 0.0f, 0.0f, 0.6981f);
        this.Head.addChild(this.Hair3);
        this.Hair3.cubeList.add(new ModelBox(this.Hair3, 45, 2, 0.0603f, -3.342f, -3.0f, 3, 6, 3, 0.0f));
        this.Hair4 = new ModelRenderer(this);
        this.Hair4.setRotationPoint(2.0f, -7.0f, 0.0f);
        this.setRotationAngle(this.Hair4, 0.0f, 0.0873f, 0.7854f);
        this.Head.addChild(this.Hair4);
        this.Hair4.cubeList.add(new ModelBox(this.Hair4, 45, 2, 1.0603f, -3.342f, -3.0f, 2, 5, 3, 0.0f));
        this.Hair5 = new ModelRenderer(this);
        this.Hair5.setRotationPoint(-5.0f, -6.0f, -2.0f);
        this.setRotationAngle(this.Hair5, 2.7925f, 0.0873f, -1.4836f);
        this.Head.addChild(this.Hair5);
        this.Hair5.cubeList.add(new ModelBox(this.Hair5, 45, 2, -1.0028f, -1.971f, -3.2188f, 3, 5, 3, 0.0f));
        this.Hair6 = new ModelRenderer(this);
        this.Hair6.setRotationPoint(-5.0f, -7.0f, 4.0f);
        this.setRotationAngle(this.Hair6, -0.3491f, 0.0f, -0.7854f);
        this.Head.addChild(this.Hair6);
        this.Hair6.cubeList.add(new ModelBox(this.Hair6, 45, 2, 1.8099f, -1.1257f, -2.2188f, 3, 5, 3, 0.0f));
        this.Hair7 = new ModelRenderer(this);
        this.Hair7.setRotationPoint(-1.0f, -10.0f, 4.0f);
        this.setRotationAngle(this.Hair7, -0.3491f, 0.0f, 0.6982f);
        this.Head.addChild(this.Hair7);
        this.Hair7.cubeList.add(new ModelBox(this.Hair7, 45, 2, 1.8099f, -1.4417f, -5.0982f, 3, 4, 5, 0.0f));
        this.Hair8 = new ModelRenderer(this);
        this.Hair8.setRotationPoint(-5.0f, -7.0f, 2.0f);
        this.setRotationAngle(this.Hair8, 2.7925f, 0.0873f, -1.309f);
        this.Head.addChild(this.Hair8);
        this.Hair8.cubeList.add(new ModelBox(this.Hair8, 45, 2, -2.0028f, -3.971f, -3.2188f, 3, 4, 3, 0.0f));
        this.Hair9 = new ModelRenderer(this);
        this.Hair9.setRotationPoint(3.0f, -8.0f, 2.0f);
        this.setRotationAngle(this.Hair9, 2.7925f, 0.0873f, 0.9599f);
        this.Head.addChild(this.Hair9);
        this.Hair9.cubeList.add(new ModelBox(this.Hair9, 45, 2, 0.9972f, -1.971f, -3.2188f, 3, 3, 3, 0.0f));
        this.Hair10 = new ModelRenderer(this);
        this.Hair10.setRotationPoint(-0.7f, -4.2f, 1.3f);
        this.setRotationAngle(this.Hair10, 2.8798f, 0.0873f, 0.0f);
        this.Head.addChild(this.Hair10);
        this.Hair10.cubeList.add(new ModelBox(this.Hair10, 38, 2, 0.9972f, -2.3391f, -4.0809f, 3, 7, 3, 0.0f));
        this.Hair11 = new ModelRenderer(this);
        this.Hair11.setRotationPoint(-3.5f, -6.6f, 1.6f);
        this.setRotationAngle(this.Hair11, 2.9671f, 0.0175f, 0.0524f);
        this.Head.addChild(this.Hair11);
        this.Hair11.cubeList.add(new ModelBox(this.Hair11, 38, 2, 0.9972f, -4.6289f, -4.1585f, 3, 7, 3, 0.0f));
        this.Hair12 = new ModelRenderer(this);
        this.Hair12.setRotationPoint(-4.5f, 1.1f, 2.1f);
        this.setRotationAngle(this.Hair12, -2.9671f, 0.0175f, -0.4712f);
        this.Head.addChild(this.Hair12);
        this.Hair12.cubeList.add(new ModelBox(this.Hair12, 38, 2, 0.9972f, -4.6289f, -4.1585f, 3, 7, 3, 0.0f));
        this.Hair13 = new ModelRenderer(this);
        this.Hair13.setRotationPoint(4.5f, 1.1f, 2.1f);
        this.setRotationAngle(this.Hair13, -2.9671f, -0.0175f, 0.4712f);
        this.Head.addChild(this.Hair13);
        this.Hair13.cubeList.add(new ModelBox(this.Hair13, 38, 2, -3.9972f, -4.6289f, -4.1585f, 3, 7, 3, 0.0f));
        this.Hair14 = new ModelRenderer(this);
        this.Hair14.setRotationPoint(2.5f, 1.1f, 2.1f);
        this.setRotationAngle(this.Hair14, -2.9671f, -0.0175f, 0.1222f);
        this.Head.addChild(this.Hair14);
        this.Hair14.cubeList.add(new ModelBox(this.Hair14, 38, 2, -3.9972f, -4.6289f, -4.1585f, 3, 7, 3, 0.0f));
        this.Hair15 = new ModelRenderer(this);
        this.Hair15.setRotationPoint(1.5f, 4.1f, 1.7f);
        this.setRotationAngle(this.Hair15, -2.9671f, -0.0175f, 1.6057f);
        this.Head.addChild(this.Hair15);
        this.Hair15.cubeList.add(new ModelBox(this.Hair15, 44, 2, -3.9972f, -6.6289f, -4.1585f, 3, 9, 3, 0.0f));
        this.Hair16 = new ModelRenderer(this);
        this.Hair16.setRotationPoint(1.5f, 4.1f, 1.7f);
        this.setRotationAngle(this.Hair16, 2.8798f, -0.0175f, -3.0194f);
        this.Head.addChild(this.Hair16);
        this.Hair16.cubeList.add(new ModelBox(this.Hair16, 44, 2, 4.3028f, -11.3289f, -4.1585f, 3, 9, 3, 0.0f));
        this.Hair17 = new ModelRenderer(this);
        this.Hair17.setRotationPoint(-1.5f, 4.1f, 1.7f);
        this.setRotationAngle(this.Hair17, 2.8798f, 0.0175f, 3.0194f);
        this.Head.addChild(this.Hair17);
        this.Hair17.cubeList.add(new ModelBox(this.Hair17, 44, 2, -7.3028f, -11.3289f, -4.1585f, 3, 9, 3, 0.0f));
        this.Strand1 = new ModelRenderer(this);
        this.Strand1.setRotationPoint(-4.0f, -8.0f, -2.0f);
        this.setRotationAngle(this.Strand1, -0.3491f, 0.0f, 0.3491f);
        this.Head.addChild(this.Strand1);
        this.Strand1.cubeList.add(new ModelBox(this.Strand1, 38, 2, 1.9972f, -1.971f, -3.2188f, 2, 4, 2, 0.0f));
        this.Strand2 = new ModelRenderer(this);
        this.Strand2.setRotationPoint(0.0f, -5.0f, -2.0f);
        this.setRotationAngle(this.Strand2, -0.3491f, 0.0f, -0.4363f);
        this.Head.addChild(this.Strand2);
        this.Strand2.cubeList.add(new ModelBox(this.Strand2, 38, 2, 1.9972f, -1.971f, -3.2188f, 2, 3, 2, 0.0f));
        this.Strand3 = new ModelRenderer(this);
        this.Strand3.setRotationPoint(2.0f, -5.0f, -1.0f);
        this.setRotationAngle(this.Strand3, -0.3491f, 0.0f, -0.4363f);
        this.Head.addChild(this.Strand3);
        this.Strand3.cubeList.add(new ModelBox(this.Strand3, 38, 2, 1.5441f, -0.9985f, -3.7609f, 2, 3, 2, 0.0f));
        this.Strand4 = new ModelRenderer(this);
        this.Strand4.setRotationPoint(-6.0f, -7.5f, -0.9f);
        this.setRotationAngle(this.Strand4, -0.3491f, 0.0f, 0.4363f);
        this.Head.addChild(this.Strand4);
        this.Strand4.cubeList.add(new ModelBox(this.Strand4, 38, 2, 1.5441f, -0.9985f, -3.7609f, 2, 3, 2, 0.0f));
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

