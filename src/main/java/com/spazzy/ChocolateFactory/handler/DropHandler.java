package com.spazzy.ChocolateFactory.handler;

import com.spazzy.ChocolateFactory.CocoaItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DropHandler
{
	
	@SubscribeEvent
	public void onBlockHarvest(HarvestDropsEvent event) {
		
		if (event.block == Blocks.cocoa)/**--->>>**/{event.drops.clear();event.drops.add(new ItemStack(CocoaItems.cocoaPod));}

	}
	
}