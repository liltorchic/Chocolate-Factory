package com.spazzy.ChocolateFactory;

import com.spazzy.ChocolateFactory.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabChocolate
{
    public static final CreativeTabs ChocoTab = new CreativeTabs(Reference.MODID)
    {
        @Override
        public Item getTabIconItem()
        {
            return CocoaItems.cocoaPod;
        }
    };
}