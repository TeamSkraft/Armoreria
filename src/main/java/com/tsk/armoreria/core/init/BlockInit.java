package com.tsk.armoreria.core.init;


import com.tsk.armoreria.Armors;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,Armors.MOD_ID);
	
	public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE)
					.hardnessAndResistance(15f, 30f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> ENDER_ORE = BLOCKS.register("ender_ore",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE)
					.hardnessAndResistance(15f, 30f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> ENDERITE_DEBRIS = BLOCKS.register("enderite_debris",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLUE)
					.hardnessAndResistance(15f, 30f).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().sound(SoundType.STONE)));
	
	

}
