package com.mrn.testpoop.init;

import com.mrn.testpoop.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final item_TP leaf = new item_leaf();

    public static void init()
    {
        GameRegistry.registerItem(leaf, "leaf");
    }
}
