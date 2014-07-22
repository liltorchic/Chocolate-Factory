package com.spazzy.ChocolateFactory.proxy;

import com.spazzy.ChocolateFactory.CocoaBase;
import com.spazzy.ChocolateFactory.client.gui.GuiHandler;
import com.spazzy.ChocolateFactory.render.RenderChocolateRoller;
import com.spazzy.ChocolateFactory.tileentity.TileEntityChocolateRoller;
import com.spazzy.ChocolateFactory.tileentity.TileEntityCocoaDryer;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ServerProxy{

	public void registerRenderThings() {

	}
	
	public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(CocoaBase.instance, new GuiHandler());
	}

	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityChocolateRoller.class, "TileEntityChocolateRoller");
		GameRegistry.registerTileEntity(TileEntityCocoaDryer.class, "TileEntityCocoaFurnace");
	}
}
