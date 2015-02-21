package com.SA;

import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.BukkitPluginRef;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SignificantAdvancments.MODID, version = SignificantAdvancments.VERSION, name = SignificantAdvancments.NAME)
public class SignificantAdvancments
{
    public static final String MODID = "sa";
    public static final String NAME = "Significant Advancments";
    public static final String VERSION = "0.0.1";
    
    @SidedProxy(clientSide = "com.SA.ClientProxy", serverSide = "com.SA.CommonProxy")
    public CommonProxy proxy;
    
    public static Logger log;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
    	LangRegistry.retrieveEntries();
    	
    	event.getModLog().info("[Significant Advancments] " + LangRegistry.langEntries.get("log.init.text"));
    	log = event.getModLog();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event){
    	
    }
}
