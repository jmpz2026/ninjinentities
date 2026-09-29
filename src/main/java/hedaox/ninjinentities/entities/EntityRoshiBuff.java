/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityRoshiBuff
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;
    private int angerLevel = 0;

    public EntityRoshiBuff(World par1World) {
        super(par1World, 80, EntityDBCNinjin.MindState.AGGRESSIVE, true, false, new byte[]{3}, new byte[]{2});
        this.experienceValue = 80;
        this.setSize(0.66f, 1.98f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(230.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(23.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/roshiBuff.png";
    }
}

