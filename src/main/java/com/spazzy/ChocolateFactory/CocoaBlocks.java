package com.spazzy.ChocolateFactory;

import net.minecraft.block.Block;
import net.minecraftforge.oredict.OreDictionary;

import com.spazzy.ChocolateFactory.blocks.ChocolateRoller;
import com.spazzy.ChocolateFactory.blocks.CocoaDryer;
import com.spazzy.ChocolateFactory.reference.*;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class CocoaBlocks
{
    public static final Block cocoaDryer = new CocoaDryer(false).setBlockName("cocoaDryer");
    public static final Block cocoaDryerActive = new CocoaDryer(true).setBlockName("cocoaDryerActive");
    public static final ChocolateRoller chocolateRoller = new ChocolateRoller();

    public static void init()
    {
        GameRegistry.registerBlock(cocoaDryer, "cocoaDryer");
        GameRegistry.registerBlock(cocoaDryerActive, "cocoaDryerActive");
        GameRegistry.registerBlock(chocolateRoller, "chocolateRoller");
        //OreDictionary.registerOre("", ore);
    }
}