package com.tsk.armoreria;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tsk.armoreria.core.init.BlockInit;
import com.tsk.armoreria.core.init.ItemInit;
import com.tsk.armoreria.world.OreGeneration;





@Mod(Armors.MOD_ID)
public class Armors{
	public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "armor";
    
    public static final ItemGroup GAA = new GA("mod_items");
    public static final ItemGroup AMR = new ARM("armory_items");


    public Armors() {	
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::setup);
    	
    	ItemInit.ITEMS.register(bus);
    	BlockInit.BLOCKS.register(bus);
        
    	MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    	MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
    	
    } 
    public static class	GA extends ItemGroup {

		public GA(String label) {
			super(label);
		}

		@Override
		public ItemStack createIcon() {
			return ItemInit.VIBRANIUM.get().getDefaultInstance();
		}
    }
    public static class	ARM extends ItemGroup {

		public ARM(String label) {
			super(label);
		}

		@Override
		public ItemStack createIcon() {
			return ItemInit.ENDERITE_CHESTPLATE.get().getDefaultInstance();
		}
    }
}
