/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityChiaotzu2
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityChiaotzu2(World par1World) {
        super(par1World, 80, EntityDBCNinjin.MindState.NEUTRAL, true, false, new byte[]{3, 6}, new byte[]{7, 7});
        this.experienceValue = 80;
        this.setSize(0.36f, 1.08f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(350.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(35.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/chiaotzu2.png";
    }
}

