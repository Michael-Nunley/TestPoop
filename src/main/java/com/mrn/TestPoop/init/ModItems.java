package com.mrn.TestPoop.init;

import com.mrn.TestPoop.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final item_leaf leaf = new item_leaf();

    public static void init()
    {
        GameRegistry.registerItem(leaf, "leaf");
    }
}
