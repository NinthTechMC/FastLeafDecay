package com.olafski.fastleafdecay;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MODID, version = ModInfo.VERSION, acceptableRemoteVersions = "*")
public class FastLeafDecay
{
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        FldConfiguration.init(event);
    }
}
