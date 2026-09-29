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

public class EntityVegeta2
extends EntityDBCNinjin {
    public int randomSoundDelay = 0;

    public EntityVegeta2(World par1World) {
        super(par1World, 70, EntityDBCNinjin.MindState.NEUTRAL, true, false, new byte[]{3, 6, 3, 5}, new byte[]{3, 7, 7, 7});
        this.experienceValue = 80;
        this.setSize(0.6f, 1.8f);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8000.0);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(800.0);
    }

    @Override
    @SideOnly(value=Side.CLIENT)
    public String getTexture() {
        return "ninjinentities:textures/entity/vegeta2.png";
    }

    @Override
    protected void dropFewItems(boolean par1, int par2) {
        int var3 = this.rand.nextInt(2 + par2);
        for (int var4 = 0; var4 < var3; ++var4) {
            this.dropItem(ItemsDBC.BattleArmorBoots05, 1);
        }
    }
}

