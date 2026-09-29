package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityvegetoXENO extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityvegetoXENO(World par1World) {
		super(par1World, 100, MindState.NEUTRAL, true, true, new byte[]{1}, new byte[]{2});
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				500000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				50000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/vegetoXENO.png";
	}
}
