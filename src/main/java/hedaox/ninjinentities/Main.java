/*
 * Decompiled with CFR 0.152.
 */
package hedaox.ninjinentities;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import hedaox.ninjinentities.command.CommandSummonNinjin;
import hedaox.ninjinentities.config.ModConfig;
import hedaox.ninjinentities.entities.NinjinEntities;
import hedaox.ninjinentities.entities.NinjinEntitiesUnofficial;
import hedaox.ninjinentities.network.MessageSendEntityToSpark;
import hedaox.ninjinentities.proxy.CommonProxy;

@Mod(modid="ninjinentities", name="Ninjin Entities")
public class Main {
    @Mod.Instance
    public static Main instance = new Main();
    @SidedProxy(clientSide="hedaox.ninjinentities.proxy.ClientProxy", serverSide="hedaox.ninjinentities.proxy.ServerProxy")
    public static CommonProxy proxy;
    public static SimpleNetworkWrapper network;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent $e) {
        ModConfig.loadConfig($e.getSuggestedConfigurationFile());
        proxy.preInit($e);
        NinjinEntities.init();
        NinjinEntitiesUnofficial.init();
        network = NetworkRegistry.INSTANCE.newSimpleChannel("MyChannel");
        network.registerMessage(MessageSendEntityToSpark.Handler.class, MessageSendEntityToSpark.class, 0, Side.SERVER);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent $e) {
        proxy.init($e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent $e) {
        proxy.postInit($e);
    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandSummonNinjin());
    }
}

