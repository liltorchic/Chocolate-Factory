package com.spazzy.ChocolateFactory.client.gui;

import com.spazzy.ChocolateFactory.container.ContainerCocoaDryer;
import com.spazzy.ChocolateFactory.tileentity.TileEntityCocoaDryer;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public GuiHandler (){

	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityCocoaDryer tileEntityFurnace = (TileEntityCocoaDryer) world.getTileEntity(x, y, z);
			return new ContainerCocoaDryer(player.inventory, tileEntityFurnace);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 0){
			TileEntityCocoaDryer tileEntityTestContainer = (TileEntityCocoaDryer) world.getTileEntity(x, y, z);
			return new GuiCocoaDryer(player.inventory, tileEntityTestContainer);
		}
		return null;
	}

}