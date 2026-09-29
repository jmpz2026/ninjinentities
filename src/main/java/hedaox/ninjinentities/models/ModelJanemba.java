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

public class ModelJanemba
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer Head2;
    private final ModelRenderer lefteyebrow;
    private final ModelRenderer righteyebrow;
    private final ModelRenderer leftear;
    private final ModelRenderer rightear;
    private final ModelRenderer Body;
    private final ModelRenderer HoleL1;
    private final ModelRenderer HoleR1;
    private final ModelRenderer UpperBody;
    private final ModelRenderer Breasts;
    private final ModelRenderer JunkSide;
    private final ModelRenderer Ass;
    private final ModelRenderer HoleL2;
    private final ModelRenderer HoleL3;
    private final ModelRenderer HoleR2;
    private final ModelRenderer HoleR3;
    private final ModelRenderer Tail1;
    private final ModelRenderer Tail2;
    private final ModelRenderer RArm;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer leg_1;
    private final ModelRenderer rightfoot;
    private final ModelRenderer LLeg;
    private final ModelRenderer leg_2;
    private final ModelRenderer leftfoot;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float scaleZ = 1.0f;

    public ModelJanemba(float _scaleX, float _scaleY, float _scaleZ) {
        this.scaleX = _scaleX;
        this.scaleY = _scaleY;
        this.scaleZ = _scaleZ;
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, -16.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 66, 0, -4.9f, -4.0f, -4.5f, 10, 4, 10, 0.0f));
        this.Head2 = new ModelRenderer(this);
        this.Head2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.addChild(this.Head2);
        this.Head2.cubeList.add(new ModelBox(this.Head2, 70, 81, -4.0f, -8.0f, -3.5f, 8, 8, 8, 0.0f));
        this.lefteyebrow = new ModelRenderer(this);
        this.lefteyebrow.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.lefteyebrow, 0.0f, -0.5463f, -0.4554f);
        this.Head.addChild(this.lefteyebrow);
        this.lefteyebrow.cubeList.add(new ModelBox(this.lefteyebrow, 10, 6, 2.1f, -7.9f, -4.1f, 4, 1, 1, 0.0f));
        this.righteyebrow = new ModelRenderer(this);
        this.righteyebrow.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.righteyebrow, 0.0f, 0.5463f, 0.4554f);
        this.Head.addChild(this.righteyebrow);
        this.righteyebrow.cubeList.add(new ModelBox(this.righteyebrow, 12, 3, -6.0f, -8.0f, -4.0f, 4, 1, 1, 0.0f));
        this.leftear = new ModelRenderer(this);
        this.leftear.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.leftear, 0.0f, -0.5463f, -0.4554f);
        this.Head.addChild(this.leftear);
        this.leftear.cubeList.add(new ModelBox(this.leftear, 12, 0, 4.0f, -4.0f, -1.0f, 5, 3, 0, 0.0f));
        this.rightear = new ModelRenderer(this);
        this.rightear.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.rightear, 0.0f, 0.5463f, 0.4554f);
        this.Head.addChild(this.rightear);
        this.rightear.cubeList.add(new ModelBox(this.rightear, 0, 12, -9.0f, -4.4f, -1.6f, 5, 3, 0, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.cubeList.add(new ModelBox(this.Body, 0, 0, -11.2f, -8.0f, -10.4f, 22, 18, 22, 0.0f));
        this.HoleL1 = new ModelRenderer(this);
        this.HoleL1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addChild(this.HoleL1);
        this.HoleL1.cubeList.add(new ModelBox(this.HoleL1, 0, 121, 5.0f, -17.0f, -2.0f, 4, 1, 4, 0.0f));
        this.HoleR1 = new ModelRenderer(this);
        this.HoleR1.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addChild(this.HoleR1);
        this.HoleR1.cubeList.add(new ModelBox(this.HoleR1, 0, 121, -9.0f, -17.0f, -2.0f, 4, 1, 4, 0.0f));
        this.UpperBody = new ModelRenderer(this);
        this.UpperBody.setRotationPoint(0.0f, -17.1f, 1.2f);
        this.Body.addChild(this.UpperBody);
        this.UpperBody.cubeList.add(new ModelBox(this.UpperBody, 0, 40, -9.6f, 1.0f, -8.9f, 19, 8, 17, 0.0f));
        this.Breasts = new ModelRenderer(this);
        this.Breasts.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.Breasts, -0.4098f, 0.0f, 0.0f);
        this.Body.addChild(this.Breasts);
        this.Breasts.cubeList.add(new ModelBox(this.Breasts, 55, 40, -9.0f, -11.0f, -12.5f, 18, 6, 7, 0.0f));
        this.JunkSide = new ModelRenderer(this);
        this.JunkSide.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.JunkSide, 0.4554f, 0.0f, 0.0f);
        this.Body.addChild(this.JunkSide);
        this.JunkSide.cubeList.add(new ModelBox(this.JunkSide, 58, 58, -10.6f, 4.5f, -13.5f, 21, 9, 14, 0.0f));
        this.Ass = new ModelRenderer(this);
        this.Ass.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Body.addChild(this.Ass);
        this.Ass.cubeList.add(new ModelBox(this.Ass, 0, 67, -10.6f, 9.0f, -6.3f, 21, 9, 14, 0.0f));
        this.HoleL2 = new ModelRenderer(this);
        this.HoleL2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HoleL2, 0.0f, 0.0f, 0.7285f);
        this.Body.addChild(this.HoleL2);
        this.HoleL2.cubeList.add(new ModelBox(this.HoleL2, 0, 0, 0.0f, -7.0f, -12.0f, 4, 4, 2, 0.0f));
        this.HoleL3 = new ModelRenderer(this);
        this.HoleL3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HoleL3, 0.0f, 0.0f, 0.7285f);
        this.Body.addChild(this.HoleL3);
        this.HoleL3.cubeList.add(new ModelBox(this.HoleL3, 0, 6, 5.5f, -1.0f, -12.0f, 4, 4, 2, 0.0f));
        this.HoleR2 = new ModelRenderer(this);
        this.HoleR2.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HoleR2, 0.0f, 0.0f, -0.7285f);
        this.Body.addChild(this.HoleR2);
        this.HoleR2.cubeList.add(new ModelBox(this.HoleR2, 0, 0, -4.0f, -7.0f, -12.0f, 4, 4, 2, 0.0f));
        this.HoleR3 = new ModelRenderer(this);
        this.HoleR3.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.HoleR3, 0.0f, 0.0f, -0.7285f);
        this.Body.addChild(this.HoleR3);
        this.HoleR3.cubeList.add(new ModelBox(this.HoleR3, 0, 6, -9.5f, -1.0f, -12.0f, 4, 4, 2, 0.0f));
        this.Tail1 = new ModelRenderer(this);
        this.Tail1.setRotationPoint(-3.0f, 4.3f, 13.0f);
        this.setRotationAngle(this.Tail1, -0.1745f, 0.0f, 0.0f);
        this.Body.addChild(this.Tail1);
        this.Tail1.cubeList.add(new ModelBox(this.Tail1, 92, 109, 0.0f, 0.0f, -2.0f, 5, 5, 13, 0.0f));
        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setRotationPoint(-3.0f, 5.2f, 21.0f);
        this.setRotationAngle(this.Tail2, 0.1745f, 0.0f, 0.0f);
        this.Body.addChild(this.Tail2);
        this.Tail2.cubeList.add(new ModelBox(this.Tail2, 97, 112, 0.0f, 0.9848f, -0.1736f, 5, 5, 10, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-9.0f, -16.0f, 0.0f);
        this.setRotationAngle(this.RArm, 0.0f, 0.0f, 0.4887f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 88, 14, -6.0f, 0.0f, -3.0f, 6, 18, 6, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(10.0f, -16.0f, 0.0f);
        this.setRotationAngle(this.LArm, 0.0f, 0.0f, -0.4887f);
        this.Body.addChild(this.LArm);
        this.LArm.cubeList.add(new ModelBox(this.LArm, 0, 90, -1.0f, 0.0f, -3.0f, 6, 17, 6, 0.0f));
        this.RLeg = new ModelRenderer(this);
        this.RLeg.setRotationPoint(-2.0f, 24.0f, 0.0f);
        this.Body.addChild(this.RLeg);
        this.leg_1 = new ModelRenderer(this);
        this.leg_1.setRotationPoint(-3.3f, -5.8f, 0.0f);
        this.RLeg.addChild(this.leg_1);
        this.leg_1.cubeList.add(new ModelBox(this.leg_1, 94, 94, -4.1f, 0.0f, -4.4f, 8, 3, 8, 0.0f));
        this.rightfoot = new ModelRenderer(this);
        this.rightfoot.setRotationPoint(-1.3f, -29.8f, 0.0f);
        this.setRotationAngle(this.rightfoot, 0.0f, 0.4363f, 0.0f);
        this.RLeg.addChild(this.rightfoot);
        this.rightfoot.cubeList.add(new ModelBox(this.rightfoot, 95, 43, -4.2289f, 27.0f, -7.5163f, 5, 3, 10, 0.0f));
        this.LLeg = new ModelRenderer(this);
        this.LLeg.setRotationPoint(2.0f, 24.0f, 0.0f);
        this.Body.addChild(this.LLeg);
        this.leg_2 = new ModelRenderer(this);
        this.leg_2.setRotationPoint(3.3f, -5.8f, 0.0f);
        this.LLeg.addChild(this.leg_2);
        this.leg_2.mirror = true;
        this.leg_2.cubeList.add(new ModelBox(this.leg_2, 94, 94, -3.9f, 0.0f, -4.4f, 8, 3, 8, 0.0f));
        this.leftfoot = new ModelRenderer(this);
        this.leftfoot.setRotationPoint(1.3f, -29.8f, 0.0f);
        this.setRotationAngle(this.leftfoot, 0.0f, -0.4363f, 0.0f);
        this.LLeg.addChild(this.leftfoot);
        this.leftfoot.mirror = true;
        this.leftfoot.cubeList.add(new ModelBox(this.leftfoot, 95, 43, -0.7711f, 27.0f, -7.5163f, 5, 3, 10, 0.0f));
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

