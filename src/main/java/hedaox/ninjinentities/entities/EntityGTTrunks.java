package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGTTrunks extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityGTTrunks(World par1World) {
		super(par1World, 100, MindState.NEUTRAL, true, false, new byte[]{3, 5, 6}, new byte[]{7, 7, 7});
		this.experienceValue = 80;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				4000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				400.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/trunksGT.png";
	}
}
