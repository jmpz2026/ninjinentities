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

public class EntityWhis
extends EntityDBCNinjin {
    public EntityWhis(World par1World) {
        super(par1World, 50, EntityDBCNinjin.MindState.NEUTRAL, true, true, new byte[]{6}, new byte[]{3});
        this.experienceValue = 80;
        this.setSize(0.6f, 1.98f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(250000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(25000.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "jinryuudragonbc:npcs/whis.png";
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int var4;
        int var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit1[40], 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit2[40], 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit3[40], 1);
        }
    }
}

