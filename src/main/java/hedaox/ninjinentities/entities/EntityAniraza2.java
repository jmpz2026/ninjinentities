/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAniraza2
extends EntityDBCNinjin {
    public EntityAniraza2(World par1World) {
        super(par1World, 85, EntityDBCNinjin.MindState.NEUTRAL, false, true, new byte[]{3, 5}, new byte[]{4, 4});
        this.experienceValue = 80;
        this.setSize(0.66f, 1.98f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(79000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7900.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/aniraza.png";
    }
}

