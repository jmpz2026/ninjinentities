/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityTrunksKid
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityTrunksKid(World par1World) {
        super(par1World, 100, EntityDBCNinjin.MindState.NEUTRAL, true, false, new byte[]{3, 1, 6}, new byte[]{7, 7, 7});
        this.experienceValue = 80;
        this.setSize(0.39f, 1.17f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1700.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(170.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/trunksKid.png";
    }
}

