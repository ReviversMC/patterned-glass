package com.thenamesnano.patternedglass.datagen;

import java.util.Arrays;
import java.util.List;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import com.thenamesnano.patternedglass.PatternedGlass;
import com.thenamesnano.patternedglass.util.RegistryHandler;

public class PatternedGlassBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public PatternedGlassBlockTagProvider(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	protected void generateTags() {
		List<FabricTagBuilder<Block>> glassBlockTagBuilders = Arrays.asList(
				getOrCreateTagBuilder(BlockTags.IMPERMEABLE),
				getOrCreateTagBuilder(TagKey.of(Registry.BLOCK_KEY, new Identifier(PatternedGlass.MOD_ID, "glass_blocks"))),
				getOrCreateTagBuilder(TagKey.of(Registry.BLOCK_KEY, new Identifier("c:glass"))));

		List<FabricTagBuilder<Block>> glassPaneTagBuilders = Arrays.asList(
				getOrCreateTagBuilder(TagKey.of(Registry.BLOCK_KEY, new Identifier(PatternedGlass.MOD_ID, "glass_panes"))),
				getOrCreateTagBuilder(TagKey.of(Registry.BLOCK_KEY, new Identifier("c:glass_panes"))));

		for (Block block: RegistryHandler.GLASS_BLOCK_LIST) {
			for (FabricTagBuilder<Block> tagBuilder : glassBlockTagBuilders) {
				tagBuilder.add(block);
			}
		}

		for (Block block: RegistryHandler.GLASS_PANE_BLOCK_LIST) {
			for (FabricTagBuilder<Block> tagBuilder : glassPaneTagBuilders) {
				tagBuilder.add(block);
			}
		}
	}
}
