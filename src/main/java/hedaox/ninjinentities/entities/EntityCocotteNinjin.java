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

public class EntityCocotteNinjin
extends EntityDBCNinjin {
    public EntityCocotteNinjin(World par1World) {
        super(par1World, 80, EntityDBCNinjin.MindState.NEUTRAL, false, true, new byte[]{1, 3}, new byte[]{7, 3});
        this.experienceValue = 80;
        this.setSize(0.51f, 1.62f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2000.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/cocotte.png";
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int var3 = this.rand.nextInt(2 + par2);
        for (int var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.ItemsOutfit1[38], 1);
        }
    }
}

