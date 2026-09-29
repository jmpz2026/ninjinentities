/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.entities.EntityDBCNinjin;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityNappaDamaged
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityNappaDamaged(World par1World) {
        super(par1World, 3, EntityDBCNinjin.MindState.AGGRESSIVE, false, false, new byte[]{3, 5}, new byte[]{7, 7});
        this.experienceValue = 80;
        this.setSize(0.675f, 1.98f);
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
        return "ninjinentities:textures/entity/nappaDamaged.png";
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int k;
        int j = this.rand.nextInt(2 + par2);
        j = this.rand.nextInt(2 + par2);
        for (k = 0; k < j; ++k) {
            this.dropItem(ItemsDBC.BattleArmorBoots02, 1);
        }
        j = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
        for (k = 0; k < j; ++k) {
            this.dropItem(ItemsDBC.BattleArmorLegs02, 1);
        }
    }
}

