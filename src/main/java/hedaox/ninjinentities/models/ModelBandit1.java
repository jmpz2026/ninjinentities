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

public class ModelBandit1
extends ModelBase {
    private final ModelRenderer Head;
    private final ModelRenderer Snout;
    private final ModelRenderer REar;
    private final ModelRenderer LEar;
    private final ModelRenderer Hair1;
    private final ModelRenderer Body;
    private final ModelRenderer RArm;
    private final ModelRenderer Sword;
    private final ModelRenderer LArm;
    private final ModelRenderer RLeg;
    private final ModelRenderer LLeg;
    private final ModelRenderer Tail;
    private float scale = 1.0f;

    public ModelBandit1(float _scale) {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.scale = _scale;
        this.Head = new ModelRenderer(this);
        this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.Head.cubeList.add(new ModelBox(this.Head, 0, 0, -4.0f, -7.0f, -4.0f, 8, 7, 8, 0.0f));
        this.Snout = new ModelRenderer(this);
        this.Snout.setRotationPoint(1.0f, -5.0f, -2.0f);
        this.Head.addChild(this.Snout);
        this.Snout.cubeList.add(new ModelBox(this.Snout, 50, 2, -3.0f, 2.0f, -5.0f, 4, 3, 3, 0.0f));
        this.REar = new ModelRenderer(this);
        this.REar.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.REar, 0.0f, -0.5236f, 0.0f);
        this.Head.addChild(this.REar);
        this.REar.cubeList.add(new ModelBox(this.REar, 32, 0, -4.0f, -10.0f, -1.0f, 0, 6, 6, 0.0f));
        this.LEar = new ModelRenderer(this);
        this.LEar.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.setRotationAngle(this.LEar, 0.0f, 0.5236f, 0.0f);
        this.Head.addChild(this.LEar);
        this.LEar.cubeList.add(new ModelBox(this.LEar, 32, 0, 4.0f, -10.0f, -1.0f, 0, 6, 6, 0.0f));
        this.Hair1 = new ModelRenderer(this);
        this.Hair1.setRotationPoint(-2.5f, 0.0f, 3.0f);
        this.setRotationAngle(this.Hair1, 0.0f, -1.5708f, 0.0f);
        this.Head.addChild(this.Hair1);
        this.Hair1.cubeList.add(new ModelBox(this.Hair1, 27, 0, -6.0f, -10.0f, -3.0f, 6, 3, 1, 0.0f));
        this.Body = new ModelRenderer(this);
        this.Body.setRotationPoint(-3.8f, 5.4f, 3.8f);
        this.Body.cubeList.add(new ModelBox(this.Body, 16, 16, -0.2f, -5.4f, -5.8f, 8, 12, 4, 0.0f));
        this.RArm = new ModelRenderer(this);
        this.RArm.setRotationPoint(-0.2f, -3.4f, -3.8f);
        this.Body.addChild(this.RArm);
        this.RArm.cubeList.add(new ModelBox(this.RArm, 40, 16, -4.0f, -2.0f, -2.0f, 4, 12, 4, 0.0f));
        this.Sword = new ModelRenderer(this);
        this.Sword.setRotationPoint(-2.0f, 9.0f, -2.0f);
        this.setRotationAngle(this.Sword, 1.2217f, 0.0f, 0.0f);
        this.RArm.addChild(this.Sword);
        this.Sword.cubeList.add(new ModelBox(this.Sword, 59, 16, 0.0f, -13.0f, 0.0f, 0, 13, 2, 0.0f));
        this.LArm = new ModelRenderer(this);
        this.LArm.setRotationPoint(7.8f, -3.4f, -3.8f);
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
        this.Tail = new ModelRenderer(this);
        this.Tail.setRotationPoint(4.0f, 6.0f, -2.0f);
        this.setRotationAngle(this.Tail, -0.7854f, 0.0f, 0.0f);
        this.Body.addChild(this.Tail);
        this.Tail.cubeList.add(new ModelBox(this.Tail, 32, 0, -1.7f, -2.4f, -0.8f, 3, 3, 12, 0.0f));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        this.scale = 1.1f;
        GL11.glScalef((float)(this.scale * 1.2f), (float)this.scale, (float)this.scale);
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

