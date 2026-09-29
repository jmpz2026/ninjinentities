/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityHatchiyack
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityHatchiyack(World par1World) {
        super(par1World, 0, EntityDBCNinjin.MindState.AGGRESSIVE, false, true, new byte[]{5}, new byte[]{6});
        this.experienceValue = 80;
        this.setSize(0.72f, 2.16f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1600.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/hatchiyack.png";
    }
}

