package com.thenamesnano.patternedglass.datagen;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import com.thenamesnano.patternedglass.PatternedGlass;
import com.thenamesnano.patternedglass.util.RegistryHandler;

public class PatternedGlassBlockTagProvider extends FabricTagProvider<Block> {
	public PatternedGlassBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
		super(output, RegistryKeys.BLOCK, registriesFuture);
	}

	@Override
	protected void configure(RegistryWrapper.WrapperLookup lookup) {
		List<FabricTagBuilder> glassBlockTagBuilders = Arrays.asList(
			getOrCreateTagBuilder(BlockTags.IMPERMEABLE),
			getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier(PatternedGlass.MOD_ID, "glass_blocks"))),
			getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("c:glass"))));

		List<FabricTagBuilder> glassPaneTagBuilders = Arrays.asList(
			getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier(PatternedGlass.MOD_ID, "glass_panes"))),
			getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("c:glass_panes"))));

		for (Block block: RegistryHandler.GLASS_BLOCK_LIST) {
			for (FabricTagBuilder tagBuilder : glassBlockTagBuilders) {
				tagBuilder.add(block);
			}
		}

		for (Block block: RegistryHandler.GLASS_PANE_BLOCK_LIST) {
			for (FabricTagBuilder tagBuilder : glassPaneTagBuilders) {
				tagBuilder.add(block);
			}
		}
	}
}
