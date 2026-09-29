/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityCell4Ninjin
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityCell4Ninjin(World par1World) {
        super(par1World, 0, EntityDBCNinjin.MindState.AGGRESSIVE, false, true, new byte[]{1, 6, 2, 3, 4, 3}, new byte[]{3, 2, 7, 3, 7, 2}, 255.0f, 217.0f, 25.0f, true);
        this.experienceValue = 80;
        this.setSize(0.45f, 1.35f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(18500.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1850.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/cell3.png";
    }
}

