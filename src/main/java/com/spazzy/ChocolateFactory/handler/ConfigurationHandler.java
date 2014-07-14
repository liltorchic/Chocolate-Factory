package com.spazzy.ChocolateFactory.handler;

import java.io.File;

import com.spazzy.ChocolateFactory.reference.Reference;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	
	public static Configuration configuration; 
	public static boolean Generate_Ores = false;
	
	public static void init(File configFile)
	{
		if(configuration == null)
		{
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if(event.modID.equalsIgnoreCase(Reference.MODID))
		{
			//Resync config
			loadConfiguration();
			
		}
	}
	
	private static void loadConfiguration()
	{
		Generate_Ores = configuration.getBoolean("Generate_Ores", Configuration.CATEGORY_GENERAL, true, "Generate Ores");
		
		if(configuration.hasChanged())
		{
			configuration.save();
		}
	}

}

	
