/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityRoshi
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;
    private int angerLevel = 0;

    public EntityRoshi(World par1World) {
        super(par1World, 80, EntityDBCNinjin.MindState.NEUTRAL, true, false, new byte[]{3}, new byte[]{2});
        this.experienceValue = 80;
        this.setSize(0.6f, 1.8f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/roshishell.png";
    }
}

