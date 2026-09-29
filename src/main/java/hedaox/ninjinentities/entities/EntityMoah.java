/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityMoah
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityMoah(World par1World) {
        super(par1World, 10, EntityDBCNinjin.MindState.AGGRESSIVE, false, false, new byte[]{6}, new byte[]{3});
        this.experienceValue = 80;
        this.setSize(0.57f, 1.71f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(100.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/moah.png";
    }
}

