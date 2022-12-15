package com.thenamesnano.patternedglass.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PatternedGlassDatagen implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
		FabricDataGenerator.Pack pack = dataGenerator.createPack();
		pack.addProvider(PatternedGlassLootTableProvider::new);
		pack.addProvider(PatternedGlassBlockTagProvider::new);
		pack.addProvider(PatternedGlassItemTagProvider::new);
		pack.addProvider(PatternedGlassRecipeProvider::new);
	}
}
