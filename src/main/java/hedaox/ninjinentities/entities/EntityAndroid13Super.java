/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAndroid13Super
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityAndroid13Super(World par1World) {
        super(par1World, 0, EntityDBCNinjin.MindState.AGGRESSIVE, false, true, new byte[]{5, 3}, new byte[]{4, 4});
        this.experienceValue = 80;
        this.setSize(0.72f, 2.16f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(14000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1400.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/android13Super.png";
    }
}

