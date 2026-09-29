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

public class EntityRaditz
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityRaditz(World par1World) {
        super(par1World, 5, EntityDBCNinjin.MindState.NEUTRAL, false, false, new byte[]{3, 1}, new byte[]{3, 3});
        this.experienceValue = 80;
        this.setSize(0.63f, 1.89f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(30.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/raditz.png";
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int k;
        int j = this.rand.nextInt(2 + par2);
        for (k = 0; k < j; ++k) {
            this.dropItem(ItemsDBC.BattleArmorChest03, 1);
        }
        j = this.rand.nextInt(2 + par2);
        for (k = 0; k < j; ++k) {
            this.dropItem(ItemsDBC.BattleArmorLegs03, 1);
        }
        j = this.rand.nextInt(2 + par2);
        for (k = 0; k < j; ++k) {
            this.dropItem(ItemsDBC.BattleArmorBoots03, 1);
        }
        j = this.rand.nextInt(2) + this.rand.nextInt(1 + par2);
        for (k = 0; k < j; ++k) {
            this.dropItem(ItemsDBC.BattleArmorHelmet04, 1);
        }
    }
}

