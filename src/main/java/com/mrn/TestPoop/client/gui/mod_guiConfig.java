package com.mrn.testpoop.client.gui;

import com.mrn.testpoop.config.ConfigHandle;
import com.mrn.testpoop.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class mod_guiConfig extends GuiConfig
{
    public mod_guiConfig(GuiScreen guiscreen)
    {
        super(  guiscreen,
                new ConfigElement(ConfigHandle.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandle.configuration.toString())                   );
    }
}

