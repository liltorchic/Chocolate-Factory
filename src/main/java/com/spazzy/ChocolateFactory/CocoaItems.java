package com.spazzy.ChocolateFactory;

import com.spazzy.ChocolateFactory.items.CocoaBeansCooked;
import com.spazzy.ChocolateFactory.items.CocoaBeansUncooked;
import com.spazzy.ChocolateFactory.items.CocoaItemsBase;
import com.spazzy.ChocolateFactory.items.CocoaPod;

import cpw.mods.fml.common.registry.GameRegistry;

public class CocoaItems
{
    public static final CocoaItemsBase cocoaPod = new CocoaPod();
    public static final CocoaItemsBase cocoaBeanUncooked = new CocoaBeansUncooked();
    public static final CocoaItemsBase cocoaBeanCooked = new CocoaBeansCooked();

    public static void init()
    {
        GameRegistry.registerItem(cocoaPod, "cocoaPod");
        GameRegistry.registerItem(cocoaBeanUncooked, "cocoaBeanUncooked");
        GameRegistry.registerItem(cocoaBeanCooked, "cocoaBeanCooked");
    }
}