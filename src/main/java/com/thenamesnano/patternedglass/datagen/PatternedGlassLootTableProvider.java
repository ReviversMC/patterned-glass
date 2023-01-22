package com.thenamesnano.patternedglass.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;

import com.thenamesnano.patternedglass.util.RegistryHandler;

public class PatternedGlassLootTableProvider extends FabricBlockLootTableProvider {
	protected PatternedGlassLootTableProvider(FabricDataOutput dataOutput) {
		super(dataOutput);
	}

	@Override
	public void generate() {
		for (Block block: RegistryHandler.GLASS_BLOCK_LIST) {
			addDropWithSilkTouch(block);
		}

		for (Block block: RegistryHandler.GLASS_PANE_BLOCK_LIST) {
			addDropWithSilkTouch(block);
		}
	}
}
