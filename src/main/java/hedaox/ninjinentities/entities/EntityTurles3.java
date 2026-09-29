/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityTurles3
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityTurles3(World par1World) {
        super(par1World, 0, EntityDBCNinjin.MindState.AGGRESSIVE, false, false, new byte[]{1, 3, 6}, new byte[]{3, 3, 3});
        this.experienceValue = 80;
        this.setSize(0.6f, 1.8f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1400.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(140.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/turles3.png";
    }
}

