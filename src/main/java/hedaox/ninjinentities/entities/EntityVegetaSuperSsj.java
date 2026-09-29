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

public class EntityVegetaSuperSsj
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityVegetaSuperSsj(World par1World) {
        super(par1World, 70, EntityDBCNinjin.MindState.NEUTRAL, true, true, new byte[]{3, 6, 3, 5}, new byte[]{3, 7, 7, 7}, 255.0f, 217.0f, 25.0f);
        this.experienceValue = 80;
        this.setSize(0.6f, 1.8f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(35000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3500.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/vegetaSuperSsj.png";
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int var4;
        int var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit1[39], 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit2[39], 1);
        }
        var3 = this.rand.nextInt(2 + par2);
        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit3[39], 1);
        }
    }
}

