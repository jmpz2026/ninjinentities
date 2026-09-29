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

public class EntityToppoNinjinFullPower
extends EntityDBCNinjin {
    public EntityToppoNinjinFullPower(World par1World) {
        super(par1World, 80, EntityDBCNinjin.MindState.AGGRESSIVE, false, true, new byte[]{1, 3, 6, 5}, new byte[]{4, 4, 4, 3}, 255.0f, 50.0f, 50.0f, false, true, 200.0f, 50.0f, 50.0f);
        this.experienceValue = 80;
        this.angerLevel = 400;
        this.setSize(0.78f, 2.34f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10000.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/toppoFullPower.png";
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int var4;
        int var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit2[38], 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit3[38], 1);
        }
    }
}

