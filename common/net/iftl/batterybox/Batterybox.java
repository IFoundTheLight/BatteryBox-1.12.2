package net.iftl.batterybox;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.Random;

import org.apache.logging.log4j.Logger;

@Mod(modid = Batterybox.MODID, name = Batterybox.NAME, version = Batterybox.VERSION, dependencies = Batterybox.DEPENDENCIES)
public class Batterybox
{
	// Constants
    public static final String MODID = "iftl_batterybox";
    public static final String NAME = "IFTL Battery Box";
    public static final String VERSION = "1.0.0";
    public static final String DEPENDENCIES = "required-after:forge@[14.23.1.2610,]";
    public static final String RESOURCE_PREFIX = MODID.toLowerCase() + ":";
    
    // Variables
    public static Random random = new Random();
    
    
    @Instance(MODID)
    public static Batterybox instance;
    private static Logger logger;  
    
    @SidedProxy(clientSide = "net.iftl.batterybox.ClientProxy", serverSide = "net.iftl.batterybox.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}
