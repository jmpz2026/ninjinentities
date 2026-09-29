/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityHirudegarnPre
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityHirudegarnPre(World par1World) {
        super(par1World, 0, EntityDBCNinjin.MindState.AGGRESSIVE, false, true, new byte[]{3, 3, 5}, new byte[]{2, 4, 4});
        this.experienceValue = 80;
        this.setSize(2.0f, 6.0f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(25000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2500.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/hirudegarnPre.png";
    }
}

