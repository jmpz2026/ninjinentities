/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityCoolerFifthForm
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityCoolerFifthForm(World par1World) {
        super(par1World, 0, EntityDBCNinjin.MindState.AGGRESSIVE, false, false, new byte[]{1, 3, 5}, new byte[]{3, 3, 8});
        this.experienceValue = 80;
        this.setSize(0.66f, 1.98f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8500.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(850.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/coolerFifthForm.png";
    }
}

