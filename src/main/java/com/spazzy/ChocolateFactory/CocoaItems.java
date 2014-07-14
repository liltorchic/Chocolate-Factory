package com.spazzy.ChocolateFactory;

import com.spazzy.ChocolateFactory.items.CocoaBeansCooked;
import com.spazzy.ChocolateFactory.items.CocoaBeansUncooked;
import com.spazzy.ChocolateFactory.items.CocoaFactoryItems;
import com.spazzy.ChocolateFactory.items.CocoaPod;

import cpw.mods.fml.common.registry.GameRegistry;

public class CocoaItems
{
    public static final CocoaFactoryItems cocoaPod = new CocoaPod();
    public static final CocoaFactoryItems cocoaBeanUncooked = new CocoaBeansUncooked();
    public static final CocoaFactoryItems cocoaBeanCooked = new CocoaBeansCooked();

    public static void init()
    {
        GameRegistry.registerItem(cocoaPod, "cocoaPod");
        GameRegistry.registerItem(cocoaBeanUncooked, "cocoaBeanUncooked");
        GameRegistry.registerItem(cocoaBeanCooked, "cocoaBeanCooked");
    }
}