package com.thenamesnano.patternedglass.datagen;

import java.util.Arrays;
import java.util.List;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import com.thenamesnano.patternedglass.PatternedGlass;
import com.thenamesnano.patternedglass.util.RegistryHandler;

public class PatternedGlassItemTagProvider extends FabricTagProvider.ItemTagProvider {
	public PatternedGlassItemTagProvider(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	protected void generateTags() {
		List<FabricTagBuilder<Item>> glassBlockTagBuilders = Arrays.asList(
				getOrCreateTagBuilder(TagKey.of(Registry.ITEM_KEY, new Identifier(PatternedGlass.MOD_ID, "glass_blocks"))),
				getOrCreateTagBuilder(TagKey.of(Registry.ITEM_KEY, new Identifier("c:glass"))));

		List<FabricTagBuilder<Item>> glassPaneTagBuilders = Arrays.asList(
				getOrCreateTagBuilder(TagKey.of(Registry.ITEM_KEY, new Identifier(PatternedGlass.MOD_ID, "glass_panes"))),
				getOrCreateTagBuilder(TagKey.of(Registry.ITEM_KEY, new Identifier("c:glass_panes"))));

		for (Block block: RegistryHandler.GLASS_BLOCK_LIST) {
			for (FabricTagBuilder<Item> tagBuilder : glassBlockTagBuilders) {
				tagBuilder.add(block.asItem());
			}
		}

		for (Block block: RegistryHandler.GLASS_PANE_BLOCK_LIST) {
			for (FabricTagBuilder<Item> tagBuilder : glassPaneTagBuilders) {
				tagBuilder.add(block.asItem());
			}
		}
	}
}
