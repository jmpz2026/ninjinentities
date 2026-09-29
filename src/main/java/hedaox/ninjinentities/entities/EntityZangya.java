/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityZangya
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityZangya(World par1World) {
        super(par1World, 10, EntityDBCNinjin.MindState.AGGRESSIVE, false, true, new byte[]{1, 6}, new byte[]{7, 7});
        this.experienceValue = 80;
        this.setSize(0.51f, 1.53f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(9000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(800.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/zangya.png";
    }
}

