/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAndroid15
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityAndroid15(World par1World) {
        super(par1World, 0, EntityDBCNinjin.MindState.AGGRESSIVE, false, true, new byte[]{6, 1, 5}, new byte[]{2, 2, 2});
        this.experienceValue = 80;
        this.setSize(0.51f, 1.53f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8250.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(875.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/android15.png";
    }
}

