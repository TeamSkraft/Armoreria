package com.tsk.armoreria.world;

import com.tsk.armoreria.core.init.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {
	
	public static void generateOres(final BiomeLoadingEvent event) {
		if(!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.TIN_ORE.get().getDefaultState(), 5, 0, 30, 4);	}	
		
		if(!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.ENDERITE_DEBRIS.get().getDefaultState(), 3, 0, 30, 4);
		}
		if(!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
					BlockInit.ENDER_ORE.get().getDefaultState(), 5, 0, 30, 4);
		}
		
	}
	
	private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize,
			int minHeight, int maxHeight, int amount) {
		settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
				Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
				.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
				.square().func_242731_b(amount));
	}
}

