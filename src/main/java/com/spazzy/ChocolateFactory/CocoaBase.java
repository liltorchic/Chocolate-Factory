package com.spazzy.ChocolateFactory;

import net.minecraftforge.common.MinecraftForge;

import com.spazzy.ChocolateFactory.blocks.CocoaFactoryBlocks;
import com.spazzy.ChocolateFactory.handler.ConfigurationHandler;
import com.spazzy.ChocolateFactory.handler.DropHandler;
import com.spazzy.ChocolateFactory.proxy.IProxy;
import com.spazzy.ChocolateFactory.reference.Reference;
import com.spazzy.ChocolateFactory.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class CocoaBase
{
    @Instance(Reference.MODID)
    public static CocoaBase instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    	FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
       	FMLCommonHandler.instance().bus().register(new DropHandler());
    	MinecraftForge.EVENT_BUS.register(new DropHandler());

    	CocoaItems.init();
    	CocoaBlocks.init();
    	LogHelper.info("Pre Initialization Complete");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	LogHelper.info("Initialization Complete");
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
    	LogHelper.info("Post Initialization Complete");
    }
}
