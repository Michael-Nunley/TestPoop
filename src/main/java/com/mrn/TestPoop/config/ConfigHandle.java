package com.mrn.TestPoop.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandle
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        boolean configValue = false;
        try
        {
            configuration.load();

            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Wow!").getBoolean(true);
        }
        catch (Exception e)
        {

        }
        finally
        {
            configuration.save();
        }

        System.out.println("[TestPoop] " + configValue);
    }
}
