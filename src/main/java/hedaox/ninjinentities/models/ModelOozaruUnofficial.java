package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelOozaruUnofficial extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer Snout;
	private final ModelRenderer Ear;
	private final ModelRenderer Ear_r1;
	private final ModelRenderer Ear_r2;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
	private final ModelRenderer FroB;
	private final ModelRenderer ftailS1;
	private final ModelRenderer ftailS2;
	private final ModelRenderer ftailS3;
	private final ModelRenderer ftailS4;
	private final ModelRenderer ftailS5;
	private final ModelRenderer ftailS6;
	private float scale = 1.0F;

	public ModelOozaruUnofficial(float _scale) {
		textureWidth = 64;
		textureHeight = 32;

		scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Snout = new ModelRenderer(this);
		Snout.setRotationPoint(1.0F, -5.0F, -2.0F);
		bipedHead.addChild(Snout);
		Snout.cubeList.add(new ModelBox(Snout, 50, 2, -3.0F, 2.0F, -5.0F, 4, 3, 3, 0.0F));

		Ear = new ModelRenderer(this);
		Ear.setRotationPoint(0.0F, 0.0F, -1.0F);
		bipedHead.addChild(Ear);
		setRotationAngle(Ear, 0.0F, 3.1416F, 0.0F);


		Ear_r1 = new ModelRenderer(this);
		Ear_r1.setRotationPoint(-4.4F, -4.5F, -0.3342F);
		Ear.addChild(Ear_r1);
        Ear_r1.mirror = true;
		setRotationAngle(Ear_r1, -0.0271F, 0.2606F, -0.0902F);
		Ear_r1.cubeList.add(new ModelBox(Ear_r1, 0, -4, 0.0F, -2.5F, -2.0F, 0, 5, 4, 0.0F));

		Ear_r2 = new ModelRenderer(this);
		Ear_r2.setRotationPoint(4.4F, -4.5F, -0.3342F);
		Ear.addChild(Ear_r2);
        Ear_r2.mirror = true;
		setRotationAngle(Ear_r2, -0.0271F, -0.2606F, 0.0902F);
		Ear_r2.cubeList.add(new ModelBox(Ear_r2, 0, -4, 0.0F, -2.5F, -2.0F, 0, 5, 4, 0.0F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 5.4F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.0F, -5.4F, -2.0F, 8, 12, 4, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, -2.4F, 0.0F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -3.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, -2.4F, 0.0F);
        bipedLeftArm.mirror = true;
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 16, -1.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 6.6F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 6.6F, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
        bipedLeftLeg.mirror = true;
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		FroB = new ModelRenderer(this);
		FroB.setRotationPoint(0.0F, 4.6F, 1.5F);
		bipedBody.addChild(FroB);


		ftailS1 = new ModelRenderer(this);
		ftailS1.setRotationPoint(0.0F, 0.0F, 0.0F);
		FroB.addChild(ftailS1);
		ftailS1.cubeList.add(new ModelBox(ftailS1, 35, 5, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

		ftailS2 = new ModelRenderer(this);
		ftailS2.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS1.addChild(ftailS2);
		ftailS2.cubeList.add(new ModelBox(ftailS2, 35, 5, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

		ftailS3 = new ModelRenderer(this);
		ftailS3.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS2.addChild(ftailS3);
		ftailS3.cubeList.add(new ModelBox(ftailS3, 35, 5, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

		ftailS4 = new ModelRenderer(this);
		ftailS4.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS3.addChild(ftailS4);
		ftailS4.cubeList.add(new ModelBox(ftailS4, 35, 5, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

		ftailS5 = new ModelRenderer(this);
		ftailS5.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS4.addChild(ftailS5);
		ftailS5.cubeList.add(new ModelBox(ftailS5, 35, 5, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));

		ftailS6 = new ModelRenderer(this);
		ftailS6.setRotationPoint(0.0F, 0.0F, 5.0F);
		ftailS5.addChild(ftailS6);
		ftailS6.cubeList.add(new ModelBox(ftailS6, 35, 5, -1.5F, -2.0F, 0.0F, 3, 3, 6, 0.0F));
	}

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netbipedHeadYaw, float headPitch, float scaleFactor) {
        // ★ 先计算动画角度
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netbipedHeadYaw, headPitch, scaleFactor, entity);
        GL11.glPushMatrix();
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(0.0F, (float) (-1.0399999618530273 + 5.5 / (1.0 + Math.pow(scale / 0.45F, 1.8799999952316284))), 0.0F);
        // 渲染带动画的部件
        bipedHead.render(scaleFactor);
        FroB.showModel = false;
        bipedBody.render(scaleFactor);
        FroB.showModel = true;
        bipedBody.postRender(scaleFactor);
        GL11.glScalef(0.75F, 0.75F, 0.75F);
        FroB.render(scaleFactor);
        GL11.glPopMatrix();
    }
    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netbipedHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        this.bipedHead.rotateAngleY = netbipedHeadYaw / (180F / (float)Math.PI);
        this.bipedHead.rotateAngleX = headPitch / (180F / (float)Math.PI);

        this.bipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
        this.bipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;

        this.bipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.bipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        this.bipedRightArm.rotateAngleZ = 0.0F;
        this.bipedLeftArm.rotateAngleZ = 0.0F;
        this.bipedRightLeg.rotateAngleY = 0.0F;
        this.bipedLeftLeg.rotateAngleY = 0.0F;
        this.bipedRightArm.rotateAngleY = 0.0F;

        float animProgress = this.swingProgress;
        this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(animProgress) * (float)Math.PI * 2.0F) * 0.2F;

        float animCurve = 1.0F - animProgress;
        animCurve *= animCurve;
        animCurve *= animCurve;
        animCurve = 1.0F - animCurve;

        float sinCurve = MathHelper.sin(animCurve * (float)Math.PI);
        float headOffset = MathHelper.sin(animProgress * (float)Math.PI) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
        this.bipedRightArm.rotateAngleX -= (sinCurve * 1.2F + headOffset);
        this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
        this.bipedRightArm.rotateAngleZ = MathHelper.sin(animProgress * 2.1415927F) * -0.4F;

        // Tail animation
        float r = MathHelper.sin(ageInTicks * 0.02F) * 0.1F;
        float r2 = MathHelper.cos(ageInTicks * 0.02F) * 0.1F;
        float r3 = MathHelper.cos(ageInTicks * 0.14F) * 0.1F;
        ftailS1.rotateAngleY = 0.2F;
        ftailS1.rotateAngleY += MathHelper.cos(ageInTicks * 0.09F) * 0.2F - 0.2F + r;
        ftailS1.rotateAngleX = -0.3F;
        ftailS2.rotateAngleY = 0.2F;
        ftailS2.rotateAngleY += MathHelper.cos(ageInTicks * 0.09F) * 0.2F - 0.2F + r2 + r3;
        ftailS2.rotateAngleX = 0.4F;
        ftailS3.rotateAngleY = 0.1F;
        ftailS3.rotateAngleY += MathHelper.cos(ageInTicks * 0.09F) * 0.1F - 0.1F + r + r3;
        ftailS3.rotateAngleX = 0.6F;
        ftailS3.rotateAngleX += MathHelper.sin(ageInTicks * 0.09F) * 0.4F + 0.3F;
        ftailS4.rotateAngleY = 0.1F;
        ftailS4.rotateAngleY += MathHelper.cos(ageInTicks * 0.09F) * 0.4F - 0.1F + r2;
        ftailS4.rotateAngleX = 0.3F;
        ftailS4.rotateAngleX += MathHelper.sin(ageInTicks * 0.09F) * 0.1F - 0.2F;
        ftailS5.rotateAngleY = 0.2F;
        ftailS5.rotateAngleY += MathHelper.cos(ageInTicks * 0.09F) * 0.4F - 0.2F + r + r3;
        ftailS5.rotateAngleX = -0.2F;
        ftailS5.rotateAngleX += MathHelper.sin(ageInTicks * 0.09F) * 0.1F - 0.3F;
        ftailS6.rotateAngleY = 0.2F;
        ftailS6.rotateAngleY += MathHelper.cos(ageInTicks * 0.09F) * 0.4F - 0.2F + r2 + r3;
        ftailS6.rotateAngleX = -0.4F;
        ftailS6.rotateAngleX += MathHelper.sin(ageInTicks * 0.09F) * 0.4F - 0.4F;
    }
}
