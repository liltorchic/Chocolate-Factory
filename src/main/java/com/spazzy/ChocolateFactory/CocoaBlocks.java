package com.spazzy.ChocolateFactory;

import com.spazzy.ChocolateFactory.blocks.CocoaDryer;
import com.spazzy.ChocolateFactory.reference.*;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class CocoaBlocks
{
    public static final CocoaDryer cocoaDryer = new CocoaDryer();

    public static void init()
    {
        GameRegistry.registerBlock(cocoaDryer, "cocoaDryer");
    }
}