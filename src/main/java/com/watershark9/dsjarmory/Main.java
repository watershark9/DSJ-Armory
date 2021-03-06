package com.watershark9.dsjarmory;

import com.watershark9.dsjarmory.init.ModFluids;
import com.watershark9.dsjarmory.proxy.CommonProxy;
import com.watershark9.dsjarmory.util.Reference;
import com.watershark9.dsjarmory.util.handlers.RegistryHandler;
import com.watershark9.dsjarmory.util.handlers.RenderHandler;
import com.watershark9.dsjarmory.world.ModWorldGen;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide =Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	static { FluidRegistry.enableUniversalBucket(); }
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		RegistryHandler.preInitRegistries(event);
		
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
	}
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
}
