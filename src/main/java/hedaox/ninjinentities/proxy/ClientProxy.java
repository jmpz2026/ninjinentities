/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import hedaox.ninjinentities.proxy.CommonProxy;
import hedaox.ninjinentities.rendering.entities.NinjinRenderEntities;
import hedaox.ninjinentities.rendering.entities.NinjinRenderEntitiesUnofficial;

public class ClientProxy
extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent $e) {
        super.preInit($e);
        NinjinRenderEntities.init();
        NinjinRenderEntitiesUnofficial.init();
    }

    @Override
    public void init(FMLInitializationEvent $e) {
        super.init($e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent $e) {
        super.postInit($e);
    }
}

