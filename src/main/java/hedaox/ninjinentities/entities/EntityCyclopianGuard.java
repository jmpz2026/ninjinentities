/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityCyclopianGuard
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityCyclopianGuard(World par1World) {
        super(par1World, 10, EntityDBCNinjin.MindState.AGGRESSIVE, false, false, new byte[]{1}, new byte[]{2});
        this.experienceValue = 80;
        this.setSize(1.2f, 2.7f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(5500.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(550.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/cyclopianGuard.png";
    }
}

