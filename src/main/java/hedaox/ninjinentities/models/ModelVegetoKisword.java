package hedaox.ninjinentities.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelVegetoKisword extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer Vegeto;
	private final ModelRenderer Vegeto2;
	private final ModelRenderer Vegeto3;
	private final ModelRenderer Vegeto4;
	private final ModelRenderer Vegeto5;
	private final ModelRenderer Vegeto6;
	private final ModelRenderer Vegeto7;
	private final ModelRenderer Vegeto8;
	private final ModelRenderer Vegeto9;
	private final ModelRenderer Vegeto10;
	private final ModelRenderer Vegeto11;
	private final ModelRenderer Vegeto12;
	private final ModelRenderer Vegeto13;
	private final ModelRenderer Vegeto14;
	private final ModelRenderer Vegeto15;
	private final ModelRenderer Vegeto16;
	private final ModelRenderer Vegeto17;
	private final ModelRenderer Vegeto18;
	private final ModelRenderer Vegeto19;
	private final ModelRenderer Vegeto20;
	private final ModelRenderer Vegeto21;
	private final ModelRenderer Vegeto22;
	private final ModelRenderer Vegeto23;
	private final ModelRenderer Vegeto24;
	private final ModelRenderer Vegeto25;
	private final ModelRenderer Vegeto26;
	private final ModelRenderer Vegeto27;
	private final ModelRenderer Vegeto28;
	private final ModelRenderer Hair27_r1;
	private final ModelRenderer Vegeto29;
	private final ModelRenderer Vegeto30;
	private final ModelRenderer Vegeto31;
	private final ModelRenderer Vegeto32;
	private final ModelRenderer Vegeto33;
	private final ModelRenderer Vegeto34;
	private final ModelRenderer Vegeto35;
	private final ModelRenderer Vegeto36;
	private final ModelRenderer Vegeto37;
	private final ModelRenderer Vegeto38;
	private final ModelRenderer Vegeto39;
	private final ModelRenderer Vegeto40;
	private final ModelRenderer Vegeto41;
	private final ModelRenderer Vegeto42;
	private final ModelRenderer Vegeto43;
	private final ModelRenderer Vegeto44;
	private final ModelRenderer Vegeto45;
	private final ModelRenderer Vegeto46;
	private final ModelRenderer Vegeto47;
	private final ModelRenderer Vegeto48;
	private final ModelRenderer Vegeto49;
	private final ModelRenderer Vegeto50;
	private final ModelRenderer Vegeto51;
	private final ModelRenderer Vegeto52;
	private final ModelRenderer Vegeto53;
	private final ModelRenderer Hair53_r1;
	private final ModelRenderer Hair53_r1_r1;
	private final ModelRenderer Vegeto54;
	private final ModelRenderer Hair54_r1;
	private final ModelRenderer Vegeto55;
	private final ModelRenderer Hair55_r1;
	private final ModelRenderer Vegeto56;
	private final ModelRenderer Vegeto57;
	private final ModelRenderer Vegeto58;
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer kisword;
	private final ModelRenderer kisword2;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer kisword3;
	private final ModelRenderer kisword4;
	private final ModelRenderer kisword6;
	private final ModelRenderer kisword5;
	private final ModelRenderer kisword7;
	private final ModelRenderer kisword8;
	private final ModelRenderer kisword9;
	private final ModelRenderer kisword10;
	private final ModelRenderer kisword11;
	private final ModelRenderer kisword12;
	private final ModelRenderer kisword13;
	private final ModelRenderer kisword14;
	private final ModelRenderer kisword15;
	private final ModelRenderer kisword16;
	private final ModelRenderer kisword17;
	private final ModelRenderer kisword18;
	private final ModelRenderer kisword19;
	private final ModelRenderer kisword20;
	private final ModelRenderer kisword21;
	private final ModelRenderer kisword22;
	private final ModelRenderer kisword23;
	private final ModelRenderer kisword24;
	private final ModelRenderer kisword25;
	private final ModelRenderer kisword26;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedLeftLeg;
    private float scale = 1.0F;

	public ModelVegetoKisword(float _scale) {
        textureWidth = 128;
        textureHeight = 64;
        scale = _scale;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Vegeto = new ModelRenderer(this);
		Vegeto.setRotationPoint(0.0F, 24.7F, 0.0F);
		bipedHead.addChild(Vegeto);


		Vegeto2 = new ModelRenderer(this);
		Vegeto2.setRotationPoint(3.0F, -32.9F, -3.0F);
		Vegeto.addChild(Vegeto2);
		setRotationAngle(Vegeto2, -0.0744F, 0.2428F, 2.9929F);
		Vegeto2.cubeList.add(new ModelBox(Vegeto2, 94, 36, -0.9F, -1.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto3 = new ModelRenderer(this);
		Vegeto3.setRotationPoint(1.0F, -32.0F, -3.0F);
		Vegeto.addChild(Vegeto3);
		setRotationAngle(Vegeto3, 0.0744F, 0.0F, -2.9557F);
		Vegeto3.cubeList.add(new ModelBox(Vegeto3, 94, 36, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Vegeto4 = new ModelRenderer(this);
		Vegeto4.setRotationPoint(-1.0F, -32.0F, -3.0F);
		Vegeto.addChild(Vegeto4);
		setRotationAngle(Vegeto4, 0.1487F, 0.2974F, -3.0292F);
		Vegeto4.cubeList.add(new ModelBox(Vegeto4, 94, 36, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto5 = new ModelRenderer(this);
		Vegeto5.setRotationPoint(-3.0F, -32.8F, -3.0F);
		Vegeto.addChild(Vegeto5);
		setRotationAngle(Vegeto5, -0.1115F, 0.0F, -2.9185F);
		Vegeto5.cubeList.add(new ModelBox(Vegeto5, 94, 36, -1.0F, -1.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto6 = new ModelRenderer(this);
		Vegeto6.setRotationPoint(3.0F, -33.0F, -2.0F);
		Vegeto.addChild(Vegeto6);
		setRotationAngle(Vegeto6, 0.1115F, 0.2974F, 3.0301F);
		Vegeto6.cubeList.add(new ModelBox(Vegeto6, 94, 36, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto7 = new ModelRenderer(this);
		Vegeto7.setRotationPoint(1.0F, -33.0F, -2.0F);
		Vegeto.addChild(Vegeto7);
		setRotationAngle(Vegeto7, 0.2974F, -0.5949F, -3.0103F);
		Vegeto7.cubeList.add(new ModelBox(Vegeto7, 90, 38, 0.0F, -1.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto8 = new ModelRenderer(this);
		Vegeto8.setRotationPoint(-1.0F, -33.0F, -2.0F);
		Vegeto.addChild(Vegeto8);
		setRotationAngle(Vegeto8, 0.2974F, 0.0F, 3.1416F);
		Vegeto8.cubeList.add(new ModelBox(Vegeto8, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto9 = new ModelRenderer(this);
		Vegeto9.setRotationPoint(-3.0F, -33.0F, -2.0F);
		Vegeto.addChild(Vegeto9);
		setRotationAngle(Vegeto9, 0.1859F, 0.8551F, 3.1416F);
		Vegeto9.cubeList.add(new ModelBox(Vegeto9, 94, 36, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto10 = new ModelRenderer(this);
		Vegeto10.setRotationPoint(3.3F, -32.4F, 0.0F);
		Vegeto.addChild(Vegeto10);
		setRotationAngle(Vegeto10, 0.1093F, 0.0F, 3.1241F);
		Vegeto10.cubeList.add(new ModelBox(Vegeto10, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto11 = new ModelRenderer(this);
		Vegeto11.setRotationPoint(1.0F, -32.0F, 0.0F);
		Vegeto.addChild(Vegeto11);
		setRotationAngle(Vegeto11, 0.1115F, -0.8179F, -2.9929F);
		Vegeto11.cubeList.add(new ModelBox(Vegeto11, 100, 37, 1.0F, 0.0F, -2.0F, 2, 9, 2, -0.19F));

		Vegeto12 = new ModelRenderer(this);
		Vegeto12.setRotationPoint(-1.0F, -33.0F, 0.0F);
		Vegeto.addChild(Vegeto12);
		setRotationAngle(Vegeto12, 0.3421F, 0.0F, -3.1416F);
		Vegeto12.cubeList.add(new ModelBox(Vegeto12, 90, 38, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto13 = new ModelRenderer(this);
		Vegeto13.setRotationPoint(-3.0F, -33.0F, 0.0F);
		Vegeto.addChild(Vegeto13);
		setRotationAngle(Vegeto13, 0.1859F, 0.0F, -3.0672F);
		Vegeto13.cubeList.add(new ModelBox(Vegeto13, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto14 = new ModelRenderer(this);
		Vegeto14.setRotationPoint(3.0F, -33.0F, 2.0F);
		Vegeto.addChild(Vegeto14);
		setRotationAngle(Vegeto14, 0.0744F, 0.0F, 3.1044F);
		Vegeto14.cubeList.add(new ModelBox(Vegeto14, 90, 38, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto15 = new ModelRenderer(this);
		Vegeto15.setRotationPoint(1.0F, -32.0F, 2.0F);
		Vegeto.addChild(Vegeto15);
		setRotationAngle(Vegeto15, 0.1115F, 0.0F, 3.1416F);
		Vegeto15.cubeList.add(new ModelBox(Vegeto15, 97, 36, -1.0F, 0.0F, -1.0F, 2, 10, 2, -0.19F));

		Vegeto16 = new ModelRenderer(this);
		Vegeto16.setRotationPoint(-1.0F, -33.0F, 2.0F);
		Vegeto.addChild(Vegeto16);
		setRotationAngle(Vegeto16, 0.1487F, 0.0F, -3.1044F);
		Vegeto16.cubeList.add(new ModelBox(Vegeto16, 90, 38, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.19F));

		Vegeto17 = new ModelRenderer(this);
		Vegeto17.setRotationPoint(-3.0F, -33.0F, 2.0F);
		Vegeto.addChild(Vegeto17);
		setRotationAngle(Vegeto17, 0.0372F, 0.9666F, 3.1044F);
		Vegeto17.cubeList.add(new ModelBox(Vegeto17, 90, 38, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto18 = new ModelRenderer(this);
		Vegeto18.setRotationPoint(-3.0F, -33.0F, 4.0F);
		Vegeto.addChild(Vegeto18);
		setRotationAngle(Vegeto18, -0.1726F, -1.2466F, -2.8051F);
		Vegeto18.cubeList.add(new ModelBox(Vegeto18, 90, 38, -1.0F, 0.0F, -1.0F, 2, 8, 2, -0.19F));

		Vegeto19 = new ModelRenderer(this);
		Vegeto19.setRotationPoint(-1.0F, -33.0F, 4.0F);
		Vegeto.addChild(Vegeto19);
		setRotationAngle(Vegeto19, 0.1115F, 0.0F, 3.1416F);
		Vegeto19.cubeList.add(new ModelBox(Vegeto19, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto20 = new ModelRenderer(this);
		Vegeto20.setRotationPoint(1.0F, -33.0F, 4.0F);
		Vegeto.addChild(Vegeto20);
		setRotationAngle(Vegeto20, 0.1859F, -0.632F, 3.0126F);
		Vegeto20.cubeList.add(new ModelBox(Vegeto20, 94, 36, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto21 = new ModelRenderer(this);
		Vegeto21.setRotationPoint(3.0F, -33.0F, 4.0F);
		Vegeto.addChild(Vegeto21);
		setRotationAngle(Vegeto21, 0.1487F, 0.0F, 2.9929F);
		Vegeto21.cubeList.add(new ModelBox(Vegeto21, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto22 = new ModelRenderer(this);
		Vegeto22.setRotationPoint(-3.0F, -33.0F, -3.0F);
		Vegeto.addChild(Vegeto22);
		setRotationAngle(Vegeto22, 0.2231F, 0.0F, 0.4833F);
		Vegeto22.cubeList.add(new ModelBox(Vegeto22, 94, 36, -1.0F, 0.0F, -1.0F, 2, 3, 2, -0.19F));

		Vegeto23 = new ModelRenderer(this);
		Vegeto23.setRotationPoint(-3.0F, -31.0F, -3.0F);
		Vegeto.addChild(Vegeto23);
		setRotationAngle(Vegeto23, 0.7459F, -1.4346F, 2.4072F);
		Vegeto23.cubeList.add(new ModelBox(Vegeto23, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto24 = new ModelRenderer(this);
		Vegeto24.setRotationPoint(-3.0F, -28.0F, 1.0F);
		Vegeto.addChild(Vegeto24);
		setRotationAngle(Vegeto24, 0.2231F, 0.0F, 2.7884F);
		Vegeto24.cubeList.add(new ModelBox(Vegeto24, 94, 36, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto25 = new ModelRenderer(this);
		Vegeto25.setRotationPoint(-3.0F, -29.0F, -1.0F);
		Vegeto.addChild(Vegeto25);
		setRotationAngle(Vegeto25, 0.2231F, 0.0F, 2.6769F);
		Vegeto25.cubeList.add(new ModelBox(Vegeto25, 94, 36, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Vegeto26 = new ModelRenderer(this);
		Vegeto26.setRotationPoint(-3.0F, -31.0F, 3.0F);
		Vegeto.addChild(Vegeto26);
		setRotationAngle(Vegeto26, 0.1662F, 0.0F, 3.1044F);
		Vegeto26.cubeList.add(new ModelBox(Vegeto26, 90, 38, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto27 = new ModelRenderer(this);
		Vegeto27.setRotationPoint(-3.0F, -31.0F, 2.0F);
		Vegeto.addChild(Vegeto27);
		setRotationAngle(Vegeto27, 0.0372F, 0.5949F, 2.7884F);
		Vegeto27.cubeList.add(new ModelBox(Vegeto27, 90, 38, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto28 = new ModelRenderer(this);
		Vegeto28.setRotationPoint(-3.0F, -33.0F, 0.0F);
		Vegeto.addChild(Vegeto28);
		setRotationAngle(Vegeto28, 0.2231F, -0.3718F, 3.1056F);


		Hair27_r1 = new ModelRenderer(this);
		Hair27_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Vegeto28.addChild(Hair27_r1);
		setRotationAngle(Hair27_r1, -0.0172F, 0.1298F, -0.132F);
		Hair27_r1.cubeList.add(new ModelBox(Hair27_r1, 90, 39, -1.0F, -2.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto29 = new ModelRenderer(this);
		Vegeto29.setRotationPoint(-3.0F, -30.0F, -3.0F);
		Vegeto.addChild(Vegeto29);
		setRotationAngle(Vegeto29, 0.2231F, 0.0F, 2.9743F);
		Vegeto29.cubeList.add(new ModelBox(Vegeto29, 90, 38, -1.0F, 3.0F, -1.0F, 2, 4, 2, -0.19F));

		Vegeto30 = new ModelRenderer(this);
		Vegeto30.setRotationPoint(-3.0F, -29.0F, 2.0F);
		Vegeto.addChild(Vegeto30);
		setRotationAngle(Vegeto30, 0.2231F, 0.0F, 2.8256F);
		Vegeto30.cubeList.add(new ModelBox(Vegeto30, 94, 36, -0.7F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto31 = new ModelRenderer(this);
		Vegeto31.setRotationPoint(-3.0F, -27.0F, 3.0F);
		Vegeto.addChild(Vegeto31);
		setRotationAngle(Vegeto31, 0.2231F, 0.0F, 2.7884F);
		Vegeto31.cubeList.add(new ModelBox(Vegeto31, 94, 36, -1.3F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto32 = new ModelRenderer(this);
		Vegeto32.setRotationPoint(-4.0F, -31.0F, 3.0F);
		Vegeto.addChild(Vegeto32);
		setRotationAngle(Vegeto32, 0.2777F, -0.4461F, -3.1416F);
		Vegeto32.cubeList.add(new ModelBox(Vegeto32, 94, 36, -1.0F, 1.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto33 = new ModelRenderer(this);
		Vegeto33.setRotationPoint(-3.0F, -30.0F, -2.0F);
		Vegeto.addChild(Vegeto33);
		setRotationAngle(Vegeto33, -0.1487F, 0.7064F, 2.7884F);
		Vegeto33.cubeList.add(new ModelBox(Vegeto33, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto34 = new ModelRenderer(this);
		Vegeto34.setRotationPoint(-3.0F, -29.0F, 3.0F);
		Vegeto.addChild(Vegeto34);
		setRotationAngle(Vegeto34, 0.2033F, 0.0F, 2.7884F);
		Vegeto34.cubeList.add(new ModelBox(Vegeto34, 94, 36, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Vegeto35 = new ModelRenderer(this);
		Vegeto35.setRotationPoint(-3.0F, -30.0F, 0.0F);
		Vegeto.addChild(Vegeto35);
		setRotationAngle(Vegeto35, 0.2231F, 0.3346F, 2.7884F);
		Vegeto35.cubeList.add(new ModelBox(Vegeto35, 94, 36, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto36 = new ModelRenderer(this);
		Vegeto36.setRotationPoint(3.0F, -34.0F, 4.0F);
		Vegeto.addChild(Vegeto36);
		setRotationAngle(Vegeto36, -0.1487F, 0.0F, 0.1487F);
		Vegeto36.cubeList.add(new ModelBox(Vegeto36, 89, 38, -2.0F, 0.0F, -1.0F, 3, 8, 2, -0.19F));

		Vegeto37 = new ModelRenderer(this);
		Vegeto37.setRotationPoint(1.0F, -34.0F, 4.0F);
		Vegeto.addChild(Vegeto37);
		setRotationAngle(Vegeto37, -0.1662F, 0.0F, 0.0F);
		Vegeto37.cubeList.add(new ModelBox(Vegeto37, 89, 38, -2.0F, 0.0F, -1.0F, 3, 8, 2, -0.19F));

		Vegeto38 = new ModelRenderer(this);
		Vegeto38.setRotationPoint(-1.0F, -34.0F, 4.0F);
		Vegeto.addChild(Vegeto38);
		setRotationAngle(Vegeto38, -0.1487F, 0.0F, 0.0F);
		Vegeto38.cubeList.add(new ModelBox(Vegeto38, 89, 38, -2.0F, 0.0F, -1.0F, 3, 8, 2, -0.19F));

		Vegeto39 = new ModelRenderer(this);
		Vegeto39.setRotationPoint(-2.4569F, -30.3746F, 3.6889F);
		Vegeto.addChild(Vegeto39);
		setRotationAngle(Vegeto39, -0.3035F, 0.0F, -0.1487F);
		Vegeto39.cubeList.add(new ModelBox(Vegeto39, 90, 38, -1.0F, -3.5F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto40 = new ModelRenderer(this);
		Vegeto40.setRotationPoint(3.0F, -31.0F, -3.0F);
		Vegeto.addChild(Vegeto40);
		setRotationAngle(Vegeto40, 0.0372F, 0.0F, -3.0487F);
		Vegeto40.cubeList.add(new ModelBox(Vegeto40, 94, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto41 = new ModelRenderer(this);
		Vegeto41.setRotationPoint(3.094F, -27.966F, 1.0F);
		Vegeto.addChild(Vegeto41);
		setRotationAngle(Vegeto41, 0.2231F, 0.0F, -2.7942F);
		Vegeto41.cubeList.add(new ModelBox(Vegeto41, 94, 36, -0.8F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto42 = new ModelRenderer(this);
		Vegeto42.setRotationPoint(3.0894F, -28.9552F, -1.0F);
		Vegeto.addChild(Vegeto42);
		setRotationAngle(Vegeto42, 0.2231F, 0.0F, -2.6769F);
		Vegeto42.cubeList.add(new ModelBox(Vegeto42, 94, 36, -0.8F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Vegeto43 = new ModelRenderer(this);
		Vegeto43.setRotationPoint(3.0F, -31.0F, 3.0F);
		Vegeto.addChild(Vegeto43);
		setRotationAngle(Vegeto43, 0.1662F, 0.5205F, 3.1044F);
		Vegeto43.cubeList.add(new ModelBox(Vegeto43, 91, 37, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto44 = new ModelRenderer(this);
		Vegeto44.setRotationPoint(3.0F, -31.0F, 2.0F);
		Vegeto.addChild(Vegeto44);
		setRotationAngle(Vegeto44, 0.1859F, 0.4461F, -2.9743F);
		Vegeto44.cubeList.add(new ModelBox(Vegeto44, 99, 37, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto45 = new ModelRenderer(this);
		Vegeto45.setRotationPoint(3.0F, -32.5F, 0.0F);
		Vegeto.addChild(Vegeto45);
		setRotationAngle(Vegeto45, -0.1859F, -1.8218F, -2.9743F);
		Vegeto45.cubeList.add(new ModelBox(Vegeto45, 97, 38, -1.0F, 0.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto46 = new ModelRenderer(this);
		Vegeto46.setRotationPoint(3.0F, -30.0F, -3.0F);
		Vegeto.addChild(Vegeto46);
		setRotationAngle(Vegeto46, 0.2603F, 0.0F, -3.1416F);
		Vegeto46.cubeList.add(new ModelBox(Vegeto46, 99, 38, -1.0F, 1.0F, -1.0F, 2, 7, 2, -0.19F));

		Vegeto47 = new ModelRenderer(this);
		Vegeto47.setRotationPoint(3.0F, -29.0F, 2.0F);
		Vegeto.addChild(Vegeto47);
		setRotationAngle(Vegeto47, 0.2231F, 0.0F, -2.8256F);
		Vegeto47.cubeList.add(new ModelBox(Vegeto47, 94, 36, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto48 = new ModelRenderer(this);
		Vegeto48.setRotationPoint(4.0F, -31.0F, 3.0F);
		Vegeto.addChild(Vegeto48);
		setRotationAngle(Vegeto48, 0.2405F, 0.409F, 3.1044F);
		Vegeto48.cubeList.add(new ModelBox(Vegeto48, 94, 36, -1.0F, 1.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto49 = new ModelRenderer(this);
		Vegeto49.setRotationPoint(3.0F, -30.0F, -2.0F);
		Vegeto.addChild(Vegeto49);
		setRotationAngle(Vegeto49, 0.0F, -0.4461F, -2.8256F);
		Vegeto49.cubeList.add(new ModelBox(Vegeto49, 90, 36, -1.0F, 0.0F, -1.0F, 2, 6, 2, -0.19F));

		Vegeto50 = new ModelRenderer(this);
		Vegeto50.setRotationPoint(3.0F, -29.0F, 3.0F);
		Vegeto.addChild(Vegeto50);
		setRotationAngle(Vegeto50, 0.2033F, 0.0F, -2.7884F);
		Vegeto50.cubeList.add(new ModelBox(Vegeto50, 96, 35, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		Vegeto51 = new ModelRenderer(this);
		Vegeto51.setRotationPoint(3.0F, -30.0F, 0.0F);
		Vegeto.addChild(Vegeto51);
		setRotationAngle(Vegeto51, 0.2231F, 0.0F, -2.7884F);
		Vegeto51.cubeList.add(new ModelBox(Vegeto51, 100, 35, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto52 = new ModelRenderer(this);
		Vegeto52.setRotationPoint(-0.4727F, -33.1725F, -1.3F);
		Vegeto.addChild(Vegeto52);
		setRotationAngle(Vegeto52, -1.1022F, 0.4833F, 0.1115F);
		Vegeto52.cubeList.add(new ModelBox(Vegeto52, 100, 32, -1.0273F, -0.2275F, -1.1F, 2, 5, 2, -0.19F));

		Vegeto53 = new ModelRenderer(this);
		Vegeto53.setRotationPoint(-3.1901F, -31.131F, -5.5863F);
		Vegeto.addChild(Vegeto53);
		setRotationAngle(Vegeto53, -0.2625F, 0.4843F, 0.0372F);


		Hair53_r1 = new ModelRenderer(this);
		Hair53_r1.setRotationPoint(-0.0099F, -0.069F, 0.7863F);
		Vegeto53.addChild(Hair53_r1);
		setRotationAngle(Hair53_r1, -0.0873F, 0.0F, 0.0873F);


		Hair53_r1_r1 = new ModelRenderer(this);
		Hair53_r1_r1.setRotationPoint(0.15F, -0.2F, 0.1F);
		Hair53_r1.addChild(Hair53_r1_r1);
		setRotationAngle(Hair53_r1_r1, 0.0003F, -0.0175F, -0.0175F);
		Hair53_r1_r1.cubeList.add(new ModelBox(Hair53_r1_r1, 90, 36, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.19F));

		Vegeto54 = new ModelRenderer(this);
		Vegeto54.setRotationPoint(1.5F, -33.4F, -1.0F);
		Vegeto.addChild(Vegeto54);
		setRotationAngle(Vegeto54, -1.1393F, 0.0F, -0.1859F);


		Hair54_r1 = new ModelRenderer(this);
		Hair54_r1.setRotationPoint(0.0F, 2.5F, 0.0F);
		Vegeto54.addChild(Hair54_r1);
		setRotationAngle(Hair54_r1, 0.0F, 0.0F, -0.1309F);
		Hair54_r1.cubeList.add(new ModelBox(Hair54_r1, 98, 32, -1.0F, -2.5F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto55 = new ModelRenderer(this);
		Vegeto55.setRotationPoint(1.8F, -31.2F, -6.1F);
		Vegeto.addChild(Vegeto55);
		setRotationAngle(Vegeto55, -0.0766F, 0.0F, -0.0372F);


		Hair55_r1 = new ModelRenderer(this);
		Hair55_r1.setRotationPoint(0.4F, 0.3F, 1.0F);
		Vegeto55.addChild(Hair55_r1);
		setRotationAngle(Hair55_r1, -0.0436F, 0.0F, -0.1745F);
		Hair55_r1.cubeList.add(new ModelBox(Hair55_r1, 94, 36, -0.9F, -1.5F, -1.0F, 2, 3, 2, -0.19F));

		Vegeto56 = new ModelRenderer(this);
		Vegeto56.setRotationPoint(-3.0F, -30.0F, -2.0F);
		Vegeto.addChild(Vegeto56);
		setRotationAngle(Vegeto56, 0.0F, 0.4461F, 2.8256F);
		Vegeto56.cubeList.add(new ModelBox(Vegeto56, 94, 32, -1.0F, 0.0F, -0.5F, 2, 6, 2, -0.19F));

		Vegeto57 = new ModelRenderer(this);
		Vegeto57.setRotationPoint(-3.0F, -28.0F, 1.0F);
		Vegeto.addChild(Vegeto57);
		setRotationAngle(Vegeto57, 0.2231F, 0.0F, 2.7942F);
		Vegeto57.cubeList.add(new ModelBox(Vegeto57, 94, 35, -1.0F, 0.0F, -1.0F, 2, 5, 2, -0.19F));

		Vegeto58 = new ModelRenderer(this);
		Vegeto58.setRotationPoint(-3.0F, -29.0F, -1.0F);
		Vegeto.addChild(Vegeto58);
		setRotationAngle(Vegeto58, 0.2231F, 0.0F, 2.6769F);
		Vegeto58.cubeList.add(new ModelBox(Vegeto58, 90, 32, -1.0F, 0.0F, -1.0F, 2, 4, 2, -0.19F));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 5.4F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 16, 16, -4.0F, -5.4F, -2.0F, 8, 12, 4, 0.0F));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, -2.4F, 0.0F);
		bipedBody.addChild(bipedRightArm);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 40, 16, -3.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

		kisword = new ModelRenderer(this);
		kisword.setRotationPoint(-1.0F, 10.3F, 0.0F);
		bipedRightArm.addChild(kisword);
		kisword.cubeList.add(new ModelBox(kisword, 120, 0, -0.95F, -1.6F, -1.05F, 2, 10, 2, 0.0F));
		kisword.cubeList.add(new ModelBox(kisword, 121, 1, -0.3F, 8.5F, -0.7F, 1, 2, 1, 0.0F));
		kisword.cubeList.add(new ModelBox(kisword, 104, 0, -3.0F, -5.3F, -3.0F, 6, 5, 6, -0.8F));

		kisword2 = new ModelRenderer(this);
		kisword2.setRotationPoint(0.0F, 4.9F, 0.0F);
		kisword.addChild(kisword2);


		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, 0.0F, 0.0F);
		kisword2.addChild(bone28);
		setRotationAngle(bone28, 0.0F, -1.5708F, 0.0F);
		bone28.cubeList.add(new ModelBox(bone28, 120, -2, 0.0F, 3.2F, -1.75F, 0, 1, 4, 0.0F));
		bone28.cubeList.add(new ModelBox(bone28, 121, -1, 0.0F, 4.6F, -1.4F, 0, 1, 3, 0.0F));
		bone28.cubeList.add(new ModelBox(bone28, 123, 1, 0.0F, 5.3F, -0.7F, 0, 1, 1, 0.0F));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, -4.9F, -0.7F);
		bone28.addChild(bone29);
		bone29.cubeList.add(new ModelBox(bone29, 118, -2, 0.0F, -1.3F, -1.05F, 0, 9, 4, 0.0F));
		bone29.cubeList.add(new ModelBox(bone29, 122, 2, 0.0F, 2.9F, 2.45F, 0, 2, 1, 0.0F));
		bone29.cubeList.add(new ModelBox(bone29, 122, 2, 0.0F, 1.8F, -1.75F, 0, 1, 1, 0.0F));
		bone29.cubeList.add(new ModelBox(bone29, 122, 2, 0.0F, 4.7F, -1.75F, 0, 3, 1, 0.0F));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, 0.0F, 0.0F);
		kisword2.addChild(bone25);
		bone25.cubeList.add(new ModelBox(bone25, 120, -2, 0.0F, 3.2F, -1.75F, 0, 1, 4, 0.0F));
		bone25.cubeList.add(new ModelBox(bone25, 121, -1, 0.0F, 4.6F, -1.4F, 0, 1, 3, 0.0F));
		bone25.cubeList.add(new ModelBox(bone25, 123, 1, 0.0F, 5.3F, -0.7F, 0, 1, 1, 0.0F));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, -4.9F, -0.7F);
		bone25.addChild(bone26);
		bone26.cubeList.add(new ModelBox(bone26, 118, -2, 0.0F, -1.3F, -1.05F, 0, 9, 4, 0.0F));
		bone26.cubeList.add(new ModelBox(bone26, 122, 2, 0.0F, 5.0F, 2.45F, 0, 2, 1, 0.0F));
		bone26.cubeList.add(new ModelBox(bone26, 122, 2, 0.0F, 0.4F, -1.75F, 0, 1, 1, 0.0F));
		bone26.cubeList.add(new ModelBox(bone26, 122, 2, 0.0F, 3.2F, -1.75F, 0, 1, 1, 0.0F));

		kisword3 = new ModelRenderer(this);
		kisword3.setRotationPoint(1.75F, -1.05F, -0.35F);
		kisword.addChild(kisword3);


		kisword4 = new ModelRenderer(this);
		kisword4.setRotationPoint(0.0F, 0.0F, 0.0F);
		kisword3.addChild(kisword4);
		setRotationAngle(kisword4, 0.0F, 0.0F, -0.6109F);
		kisword4.cubeList.add(new ModelBox(kisword4, 115, -2, 0.0F, -0.3F, -1.4F, 0, 1, 4, 0.0F));
		kisword4.cubeList.add(new ModelBox(kisword4, 118, 1, 0.0F, 0.4F, 0.7F, 0, 1, 1, 0.0F));
		kisword4.cubeList.add(new ModelBox(kisword4, 119, 2, 0.0F, 0.4F, -1.4F, 0, 1, 1, 0.0F));
		kisword4.cubeList.add(new ModelBox(kisword4, 119, 2, 0.0F, 1.8F, 0.7F, 0, 1, 1, 0.0F));
		kisword4.cubeList.add(new ModelBox(kisword4, 119, 2, 0.0F, 2.5F, -0.7F, 0, 1, 1, 0.0F));
		kisword4.cubeList.add(new ModelBox(kisword4, 118, 1, 0.0F, 1.1F, 0.0F, 0, 1, 1, 0.0F));

		kisword6 = new ModelRenderer(this);
		kisword6.setRotationPoint(0.0F, 0.0F, 0.7F);
		kisword4.addChild(kisword6);
		setRotationAngle(kisword6, 0.0F, 0.0F, 0.2618F);
		kisword6.cubeList.add(new ModelBox(kisword6, 115, -2, 0.0F, -0.3F, -2.1F, 0, 1, 4, 0.0F));
		kisword6.cubeList.add(new ModelBox(kisword6, 117, 0, 0.0F, 0.4F, -2.1F, 0, 1, 2, 0.0F));
		kisword6.cubeList.add(new ModelBox(kisword6, 119, 2, 0.0F, 0.4F, 0.7F, 0, 1, 1, 0.0F));
		kisword6.cubeList.add(new ModelBox(kisword6, 119, 2, 0.0F, 1.8F, -1.4F, 0, 1, 1, 0.0F));
		kisword6.cubeList.add(new ModelBox(kisword6, 119, 2, 0.0F, 1.1F, 0.0F, 0, 1, 1, 0.0F));
		kisword6.cubeList.add(new ModelBox(kisword6, 118, 1, 0.0F, 1.1F, -2.1F, 0, 1, 1, 0.0F));

		kisword5 = new ModelRenderer(this);
		kisword5.setRotationPoint(-1.75F, 1.4F, 0.35F);
		kisword3.addChild(kisword5);
		setRotationAngle(kisword5, 0.0F, -0.7854F, 0.0F);


		kisword7 = new ModelRenderer(this);
		kisword7.setRotationPoint(-0.35F, 0.0F, -0.35F);
		kisword5.addChild(kisword7);
		setRotationAngle(kisword7, 0.0F, 0.0F, -0.6109F);
		kisword7.cubeList.add(new ModelBox(kisword7, 116, -1, 1.4335F, 0.7038F, -1.05F, 0, 1, 3, 0.0F));
		kisword7.cubeList.add(new ModelBox(kisword7, 118, 1, 1.4335F, 1.4038F, 0.35F, 0, 1, 1, 0.0F));
		kisword7.cubeList.add(new ModelBox(kisword7, 119, 2, 1.4335F, 1.4038F, -1.05F, 0, 1, 1, 0.0F));
		kisword7.cubeList.add(new ModelBox(kisword7, 119, 2, 1.4335F, 2.8038F, 0.35F, 0, 1, 1, 0.0F));
		kisword7.cubeList.add(new ModelBox(kisword7, 119, 2, 1.4335F, 3.5038F, -0.35F, 0, 1, 1, 0.0F));
		kisword7.cubeList.add(new ModelBox(kisword7, 118, 1, 1.4335F, 2.1038F, -0.35F, 0, 1, 1, 0.0F));

		kisword8 = new ModelRenderer(this);
		kisword8.setRotationPoint(1.4335F, 1.0038F, 0.35F);
		kisword7.addChild(kisword8);
		setRotationAngle(kisword8, 0.0F, 0.0F, 0.3491F);
		kisword8.cubeList.add(new ModelBox(kisword8, 116, -1, 0.0F, -0.3F, -1.4F, 0, 1, 3, 0.0F));
		kisword8.cubeList.add(new ModelBox(kisword8, 118, 1, 0.0F, 0.4F, -1.4F, 0, 1, 1, 0.0F));
		kisword8.cubeList.add(new ModelBox(kisword8, 119, 2, 0.0F, 0.4F, 0.7F, 0, 1, 1, 0.0F));
		kisword8.cubeList.add(new ModelBox(kisword8, 119, 2, 0.0F, 1.8F, -1.4F, 0, 1, 1, 0.0F));
		kisword8.cubeList.add(new ModelBox(kisword8, 118, 1, 0.0F, 1.1F, 0.0F, 0, 1, 1, 0.0F));

		kisword9 = new ModelRenderer(this);
		kisword9.setRotationPoint(-1.75F, 0.0F, 0.35F);
		kisword3.addChild(kisword9);
		setRotationAngle(kisword9, 0.0F, -1.5708F, 0.0F);


		kisword10 = new ModelRenderer(this);
		kisword10.setRotationPoint(0.0F, 0.0F, 0.0F);
		kisword9.addChild(kisword10);
		setRotationAngle(kisword10, 0.0F, 0.0F, -0.6109F);
		kisword10.cubeList.add(new ModelBox(kisword10, 115, -2, 1.4335F, 0.7038F, -1.75F, 0, 1, 4, 0.0F));
		kisword10.cubeList.add(new ModelBox(kisword10, 118, 1, 1.4335F, 1.4038F, 0.35F, 0, 1, 1, 0.0F));
		kisword10.cubeList.add(new ModelBox(kisword10, 119, 2, 1.4335F, 1.4038F, -1.75F, 0, 1, 1, 0.0F));
		kisword10.cubeList.add(new ModelBox(kisword10, 119, 2, 1.4335F, 2.8038F, 0.35F, 0, 1, 1, 0.0F));
		kisword10.cubeList.add(new ModelBox(kisword10, 119, 2, 1.4335F, 3.5038F, -1.05F, 0, 1, 1, 0.0F));
		kisword10.cubeList.add(new ModelBox(kisword10, 118, 1, 1.4335F, 2.1038F, -0.35F, 0, 1, 1, 0.0F));

		kisword11 = new ModelRenderer(this);
		kisword11.setRotationPoint(1.4335F, 1.0038F, 0.35F);
		kisword10.addChild(kisword11);
		setRotationAngle(kisword11, 0.0F, 0.0F, 0.2618F);
		kisword11.cubeList.add(new ModelBox(kisword11, 115, -2, 0.0F, -0.3F, -2.1F, 0, 1, 4, 0.0F));
		kisword11.cubeList.add(new ModelBox(kisword11, 117, 0, 0.0F, 0.4F, -2.1F, 0, 1, 2, 0.0F));
		kisword11.cubeList.add(new ModelBox(kisword11, 119, 2, 0.0F, 0.4F, 0.7F, 0, 1, 1, 0.0F));
		kisword11.cubeList.add(new ModelBox(kisword11, 119, 2, 0.0F, 1.8F, -1.4F, 0, 1, 1, 0.0F));
		kisword11.cubeList.add(new ModelBox(kisword11, 119, 2, 0.0F, 1.1F, 0.0F, 0, 1, 1, 0.0F));
		kisword11.cubeList.add(new ModelBox(kisword11, 118, 1, 0.0F, 1.1F, -2.1F, 0, 1, 1, 0.0F));

		kisword12 = new ModelRenderer(this);
		kisword12.setRotationPoint(-1.75F, 1.4F, 0.35F);
		kisword3.addChild(kisword12);
		setRotationAngle(kisword12, 0.0F, 0.7854F, 0.0F);


		kisword13 = new ModelRenderer(this);
		kisword13.setRotationPoint(-0.35F, 0.0F, 0.35F);
		kisword12.addChild(kisword13);
		setRotationAngle(kisword13, 0.0F, 0.0F, -0.6109F);
		kisword13.cubeList.add(new ModelBox(kisword13, 116, -1, 1.4335F, 0.7038F, -1.75F, 0, 1, 3, 0.0F));
		kisword13.cubeList.add(new ModelBox(kisword13, 118, 1, 1.4335F, 1.4038F, -1.75F, 0, 1, 1, 0.0F));
		kisword13.cubeList.add(new ModelBox(kisword13, 119, 2, 1.4335F, 1.4038F, 0.35F, 0, 1, 1, 0.0F));
		kisword13.cubeList.add(new ModelBox(kisword13, 119, 2, 1.4335F, 2.8038F, -1.05F, 0, 1, 1, 0.0F));
		kisword13.cubeList.add(new ModelBox(kisword13, 119, 2, 1.4335F, 3.5038F, -0.35F, 0, 1, 1, 0.0F));
		kisword13.cubeList.add(new ModelBox(kisword13, 118, 1, 1.4335F, 2.1038F, -1.05F, 0, 1, 1, 0.0F));

		kisword14 = new ModelRenderer(this);
		kisword14.setRotationPoint(1.4335F, 1.0038F, -0.35F);
		kisword13.addChild(kisword14);
		setRotationAngle(kisword14, 0.0F, 0.0F, 0.3491F);
		kisword14.cubeList.add(new ModelBox(kisword14, 116, -1, 0.0F, -0.3F, -1.4F, 0, 1, 3, 0.0F));
		kisword14.cubeList.add(new ModelBox(kisword14, 118, 1, 0.0F, 0.4F, 0.0F, 0, 1, 1, 0.0F));
		kisword14.cubeList.add(new ModelBox(kisword14, 119, 2, 0.0F, 0.4F, -1.4F, 0, 1, 1, 0.0F));
		kisword14.cubeList.add(new ModelBox(kisword14, 119, 2, 0.0F, 1.8F, 0.7F, 0, 1, 1, 0.0F));
		kisword14.cubeList.add(new ModelBox(kisword14, 119, 2, 0.0F, 1.1F, -0.7F, 0, 1, 1, 0.0F));
		kisword14.cubeList.add(new ModelBox(kisword14, 118, 1, 0.0F, 1.1F, 0.0F, 0, 1, 1, 0.0F));

		kisword15 = new ModelRenderer(this);
		kisword15.setRotationPoint(-1.75F, 0.0F, 0.35F);
		kisword3.addChild(kisword15);
		setRotationAngle(kisword15, 0.0F, 1.5708F, 0.0F);


		kisword16 = new ModelRenderer(this);
		kisword16.setRotationPoint(0.0F, 0.0F, 0.0F);
		kisword15.addChild(kisword16);
		setRotationAngle(kisword16, 0.0F, 0.0F, -0.6109F);
		kisword16.cubeList.add(new ModelBox(kisword16, 115, -2, 1.4335F, 0.7038F, -1.75F, 0, 1, 4, 0.0F));
		kisword16.cubeList.add(new ModelBox(kisword16, 118, 1, 1.4335F, 1.4038F, -1.75F, 0, 1, 1, 0.0F));
		kisword16.cubeList.add(new ModelBox(kisword16, 119, 2, 1.4335F, 1.4038F, 1.05F, 0, 1, 1, 0.0F));
		kisword16.cubeList.add(new ModelBox(kisword16, 119, 2, 1.4335F, 2.8038F, -1.05F, 0, 1, 1, 0.0F));
		kisword16.cubeList.add(new ModelBox(kisword16, 119, 2, 1.4335F, 3.5038F, 0.35F, 0, 1, 1, 0.0F));
		kisword16.cubeList.add(new ModelBox(kisword16, 118, 1, 1.4335F, 2.1038F, -1.05F, 0, 1, 1, 0.0F));

		kisword17 = new ModelRenderer(this);
		kisword17.setRotationPoint(1.4335F, 1.0038F, -0.35F);
		kisword16.addChild(kisword17);
		setRotationAngle(kisword17, 0.0F, 0.0F, 0.2618F);
		kisword17.cubeList.add(new ModelBox(kisword17, 115, -2, 0.0F, -0.3F, -1.4F, 0, 1, 4, 0.0F));
		kisword17.cubeList.add(new ModelBox(kisword17, 117, 0, 0.0F, 0.4F, 0.0F, 0, 1, 2, 0.0F));
		kisword17.cubeList.add(new ModelBox(kisword17, 119, 2, 0.0F, 0.4F, -1.4F, 0, 1, 1, 0.0F));
		kisword17.cubeList.add(new ModelBox(kisword17, 119, 2, 0.0F, 1.8F, 0.7F, 0, 1, 1, 0.0F));
		kisword17.cubeList.add(new ModelBox(kisword17, 119, 2, 0.0F, 1.1F, -0.7F, 0, 1, 1, 0.0F));
		kisword17.cubeList.add(new ModelBox(kisword17, 118, 1, 0.0F, 1.1F, 0.7F, 0, 1, 1, 0.0F));

		kisword18 = new ModelRenderer(this);
		kisword18.setRotationPoint(-3.5F, 0.0F, 0.0F);
		kisword3.addChild(kisword18);
		setRotationAngle(kisword18, 0.0F, 0.0F, 0.6109F);
		kisword18.cubeList.add(new ModelBox(kisword18, 115, -2, 0.0F, -0.3F, -1.4F, 0, 1, 4, 0.0F));
		kisword18.cubeList.add(new ModelBox(kisword18, 118, 1, 0.0F, 0.4F, 0.7F, 0, 1, 1, 0.0F));
		kisword18.cubeList.add(new ModelBox(kisword18, 119, 2, 0.0F, 0.4F, -1.4F, 0, 1, 1, 0.0F));
		kisword18.cubeList.add(new ModelBox(kisword18, 119, 2, 0.0F, 1.8F, 0.7F, 0, 1, 1, 0.0F));
		kisword18.cubeList.add(new ModelBox(kisword18, 119, 2, 0.0F, 2.5F, -0.7F, 0, 1, 1, 0.0F));
		kisword18.cubeList.add(new ModelBox(kisword18, 118, 1, 0.0F, 1.1F, 0.0F, 0, 1, 1, 0.0F));

		kisword19 = new ModelRenderer(this);
		kisword19.setRotationPoint(0.0F, 0.0F, 0.7F);
		kisword18.addChild(kisword19);
		setRotationAngle(kisword19, 0.0F, 0.0F, -0.2618F);
		kisword19.cubeList.add(new ModelBox(kisword19, 115, -2, 0.0F, -0.3F, -2.1F, 0, 1, 4, 0.0F));
		kisword19.cubeList.add(new ModelBox(kisword19, 117, 0, 0.0F, 0.4F, -2.1F, 0, 1, 2, 0.0F));
		kisword19.cubeList.add(new ModelBox(kisword19, 119, 2, 0.0F, 0.4F, 0.7F, 0, 1, 1, 0.0F));
		kisword19.cubeList.add(new ModelBox(kisword19, 119, 2, 0.0F, 1.8F, -1.4F, 0, 1, 1, 0.0F));
		kisword19.cubeList.add(new ModelBox(kisword19, 119, 2, 0.0F, 1.1F, 0.0F, 0, 1, 1, 0.0F));
		kisword19.cubeList.add(new ModelBox(kisword19, 118, 1, 0.0F, 1.1F, -2.1F, 0, 1, 1, 0.0F));

		kisword20 = new ModelRenderer(this);
		kisword20.setRotationPoint(-1.75F, 1.4F, 0.35F);
		kisword3.addChild(kisword20);
		setRotationAngle(kisword20, 0.0F, -0.7854F, 0.0F);


		kisword21 = new ModelRenderer(this);
		kisword21.setRotationPoint(0.35F, 0.0F, 0.35F);
		kisword20.addChild(kisword21);
		setRotationAngle(kisword21, 0.0F, 0.0F, 0.6109F);
		kisword21.cubeList.add(new ModelBox(kisword21, 116, -1, -1.4335F, 0.7038F, -1.75F, 0, 1, 3, 0.0F));
		kisword21.cubeList.add(new ModelBox(kisword21, 118, 1, -1.4335F, 1.4038F, -1.75F, 0, 1, 1, 0.0F));
		kisword21.cubeList.add(new ModelBox(kisword21, 119, 2, -1.4335F, 1.4038F, 0.35F, 0, 1, 1, 0.0F));
		kisword21.cubeList.add(new ModelBox(kisword21, 119, 2, -1.4335F, 2.8038F, -1.05F, 0, 1, 1, 0.0F));
		kisword21.cubeList.add(new ModelBox(kisword21, 119, 2, -1.4335F, 3.5038F, -0.35F, 0, 1, 1, 0.0F));
		kisword21.cubeList.add(new ModelBox(kisword21, 118, 1, -1.4335F, 2.1038F, -1.05F, 0, 1, 1, 0.0F));

		kisword22 = new ModelRenderer(this);
		kisword22.setRotationPoint(-1.4335F, 1.0038F, -0.35F);
		kisword21.addChild(kisword22);
		setRotationAngle(kisword22, 0.0F, 0.0F, -0.3491F);
		kisword22.cubeList.add(new ModelBox(kisword22, 116, -1, 0.0F, -0.3F, -1.4F, 0, 1, 3, 0.0F));
		kisword22.cubeList.add(new ModelBox(kisword22, 118, 1, 0.0F, 0.4F, 0.0F, 0, 1, 1, 0.0F));
		kisword22.cubeList.add(new ModelBox(kisword22, 119, 2, 0.0F, 0.4F, -1.4F, 0, 1, 1, 0.0F));
		kisword22.cubeList.add(new ModelBox(kisword22, 119, 2, 0.0F, 1.8F, 0.7F, 0, 1, 1, 0.0F));
		kisword22.cubeList.add(new ModelBox(kisword22, 119, 2, 0.0F, 1.1F, -0.7F, 0, 1, 1, 0.0F));
		kisword22.cubeList.add(new ModelBox(kisword22, 118, 1, 0.0F, 1.1F, 0.0F, 0, 1, 1, 0.0F));

		kisword23 = new ModelRenderer(this);
		kisword23.setRotationPoint(-1.75F, 1.4F, 0.35F);
		kisword3.addChild(kisword23);
		setRotationAngle(kisword23, 0.0F, 0.7854F, 0.0F);


		kisword24 = new ModelRenderer(this);
		kisword24.setRotationPoint(0.35F, 0.0F, -0.35F);
		kisword23.addChild(kisword24);
		setRotationAngle(kisword24, 0.0F, 0.0F, 0.6109F);
		kisword24.cubeList.add(new ModelBox(kisword24, 116, -1, -1.4335F, 0.7038F, -1.05F, 0, 1, 3, 0.0F));
		kisword24.cubeList.add(new ModelBox(kisword24, 118, 1, -1.4335F, 1.4038F, 0.35F, 0, 1, 1, 0.0F));
		kisword24.cubeList.add(new ModelBox(kisword24, 119, 2, -1.4335F, 1.4038F, -1.05F, 0, 1, 1, 0.0F));
		kisword24.cubeList.add(new ModelBox(kisword24, 119, 2, -1.4335F, 2.8038F, 0.35F, 0, 1, 1, 0.0F));
		kisword24.cubeList.add(new ModelBox(kisword24, 119, 2, -1.4335F, 3.5038F, -0.35F, 0, 1, 1, 0.0F));
		kisword24.cubeList.add(new ModelBox(kisword24, 118, 1, -1.4335F, 2.1038F, -0.35F, 0, 1, 1, 0.0F));

		kisword25 = new ModelRenderer(this);
		kisword25.setRotationPoint(-1.4335F, 1.0038F, 0.35F);
		kisword24.addChild(kisword25);
		setRotationAngle(kisword25, 0.0F, 0.0F, -0.3491F);
		kisword25.cubeList.add(new ModelBox(kisword25, 116, -1, 0.0F, -0.3F, -1.4F, 0, 1, 3, 0.0F));
		kisword25.cubeList.add(new ModelBox(kisword25, 118, 1, 0.0F, 0.4F, -1.4F, 0, 1, 1, 0.0F));
		kisword25.cubeList.add(new ModelBox(kisword25, 119, 2, 0.0F, 0.4F, 0.7F, 0, 1, 1, 0.0F));
		kisword25.cubeList.add(new ModelBox(kisword25, 119, 2, 0.0F, 1.8F, -1.4F, 0, 1, 1, 0.0F));
		kisword25.cubeList.add(new ModelBox(kisword25, 118, 1, 0.0F, 1.1F, 0.0F, 0, 1, 1, 0.0F));

		kisword26 = new ModelRenderer(this);
		kisword26.setRotationPoint(0.0F, 0.0F, 0.0F);
		kisword.addChild(kisword26);
		setRotationAngle(kisword26, 0.0F, -0.7854F, 0.0F);
		kisword26.cubeList.add(new ModelBox(kisword26, 120, 0, -0.95F, -1.6F, -1.05F, 2, 10, 2, 0.0F));
		kisword26.cubeList.add(new ModelBox(kisword26, 121, 1, -0.3F, 8.5F, -0.7F, 1, 2, 1, 0.0F));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, -2.4F, 0.0F);
        bipedLeftArm.mirror = true;
		bipedBody.addChild(bipedLeftArm);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 40, 32, -1.0F, -3.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 6.6F, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 16, -1.9F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 6.6F, 0.0F);
        bipedLeftLeg.mirror = true;
		bipedBody.addChild(bipedLeftLeg);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 0, 32, -2.1F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netbipedHeadYaw, float headPitch, float scaleFactor) {
        // ★ 先计算动画角度
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netbipedHeadYaw, headPitch, scaleFactor, entity);
        GL11.glPushMatrix();
        GL11.glScalef(scale, scale, scale);
        GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(scale/0.45F,1.88F)))), 0.0F);
        // 渲染带动画的部件
        bipedHead.render(scaleFactor);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        bipedBody.render(scaleFactor);
        GL11.glDisable(GL11.GL_BLEND);
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
    }
}
