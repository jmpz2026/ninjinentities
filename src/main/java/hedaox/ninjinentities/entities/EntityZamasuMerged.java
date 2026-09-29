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

public class EntityZamasuMerged
extends EntityDBCNinjin {
    public EntityZamasuMerged(World par1World) {
        super(par1World, 5, EntityDBCNinjin.MindState.AGGRESSIVE, false, true, new byte[]{3, 1, 5}, new byte[]{3, 3, 3}, 125.0f, 0.0f, 255.0f, false, true, 125.0f, 0.0f, 200.0f);
        this.experienceValue = 80;
        this.angerLevel = 400;
        this.setSize(0.6f, 1.8f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(15000.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/zamasuMerged.png";
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int var4;
        int var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit1[30], 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit2[30], 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit3[30], 1);
        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        this.heal((float)(this.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue() / 1000.0));
    }
}

