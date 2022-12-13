package com.thenamesnano.patternedglass.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PatternedGlassDatagen implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
		dataGenerator.addProvider(PatternedGlassLootTableProvider::new);
		dataGenerator.addProvider(PatternedGlassBlockTagProvider::new);
		dataGenerator.addProvider(PatternedGlassItemTagProvider::new);
		dataGenerator.addProvider(PatternedGlassRecipeProvider::new);
	}
}
