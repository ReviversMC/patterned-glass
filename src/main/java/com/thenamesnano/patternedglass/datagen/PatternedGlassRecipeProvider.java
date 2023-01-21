package com.thenamesnano.patternedglass.datagen;

import java.util.function.Consumer;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import com.thenamesnano.patternedglass.PatternedGlass;
import com.thenamesnano.patternedglass.util.RegistryHandler;

public class PatternedGlassRecipeProvider extends FabricRecipeProvider {
	public PatternedGlassRecipeProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generate(Consumer<RecipeJsonProvider> exporter) {
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.WHITE_PATTERNED_GLASS, Blocks.WHITE_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.ORANGE_PATTERNED_GLASS, Blocks.ORANGE_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.MAGENTA_PATTERNED_GLASS, Blocks.MAGENTA_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.LIGHT_BLUE_PATTERNED_GLASS, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.YELLOW_PATTERNED_GLASS, Blocks.YELLOW_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.LIME_PATTERNED_GLASS, Blocks.LIME_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.PINK_PATTERNED_GLASS, Blocks.PINK_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.GRAY_PATTERNED_GLASS, Blocks.GRAY_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.LIGHT_GRAY_PATTERNED_GLASS, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.CYAN_PATTERNED_GLASS, Blocks.CYAN_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.PURPLE_PATTERNED_GLASS, Blocks.PURPLE_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.BLUE_PATTERNED_GLASS, Blocks.BLUE_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.BROWN_PATTERNED_GLASS, Blocks.BROWN_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.GREEN_PATTERNED_GLASS, Blocks.GREEN_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.RED_PATTERNED_GLASS, Blocks.RED_GLAZED_TERRACOTTA);
		offerPatternedGlassDyeingRecipe(exporter, RegistryHandler.BLACK_PATTERNED_GLASS, Blocks.BLACK_GLAZED_TERRACOTTA);

		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.WHITE_PATTERNED_GLASS_PANE, RegistryHandler.WHITE_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.ORANGE_PATTERNED_GLASS_PANE, RegistryHandler.ORANGE_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.MAGENTA_PATTERNED_GLASS_PANE, RegistryHandler.MAGENTA_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.LIGHT_BLUE_PATTERNED_GLASS_PANE, RegistryHandler.LIGHT_BLUE_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.YELLOW_PATTERNED_GLASS_PANE, RegistryHandler.YELLOW_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.LIME_PATTERNED_GLASS_PANE, RegistryHandler.LIME_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.PINK_PATTERNED_GLASS_PANE, RegistryHandler.PINK_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.GRAY_PATTERNED_GLASS_PANE, RegistryHandler.GRAY_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.LIGHT_GRAY_PATTERNED_GLASS_PANE, RegistryHandler.LIGHT_GRAY_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.CYAN_PATTERNED_GLASS_PANE, RegistryHandler.CYAN_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.PURPLE_PATTERNED_GLASS_PANE, RegistryHandler.PURPLE_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.BLUE_PATTERNED_GLASS_PANE, RegistryHandler.BLUE_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.BROWN_PATTERNED_GLASS_PANE, RegistryHandler.BROWN_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.GREEN_PATTERNED_GLASS_PANE, RegistryHandler.GREEN_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.RED_PATTERNED_GLASS_PANE, RegistryHandler.RED_PATTERNED_GLASS);
		offerPatternedGlassPaneRecipe(exporter, RegistryHandler.BLACK_PATTERNED_GLASS_PANE, RegistryHandler.BLACK_PATTERNED_GLASS);

		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.WHITE_PATTERNED_GLASS_PANE, Blocks.WHITE_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.ORANGE_PATTERNED_GLASS_PANE, Blocks.ORANGE_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.MAGENTA_PATTERNED_GLASS_PANE, Blocks.MAGENTA_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.LIGHT_BLUE_PATTERNED_GLASS_PANE, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.YELLOW_PATTERNED_GLASS_PANE, Blocks.YELLOW_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.LIME_PATTERNED_GLASS_PANE, Blocks.LIME_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.PINK_PATTERNED_GLASS_PANE, Blocks.PINK_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.GRAY_PATTERNED_GLASS_PANE, Blocks.GRAY_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.LIGHT_GRAY_PATTERNED_GLASS_PANE, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.CYAN_PATTERNED_GLASS_PANE, Blocks.CYAN_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.PURPLE_PATTERNED_GLASS_PANE, Blocks.PURPLE_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.BLUE_PATTERNED_GLASS_PANE, Blocks.BLUE_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.BROWN_PATTERNED_GLASS_PANE, Blocks.BROWN_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.GREEN_PATTERNED_GLASS_PANE, Blocks.GREEN_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.RED_PATTERNED_GLASS_PANE, Blocks.RED_GLAZED_TERRACOTTA);
		offerPatternedGlassPaneDyeingRecipe(exporter, RegistryHandler.BLACK_PATTERNED_GLASS_PANE, Blocks.BLACK_GLAZED_TERRACOTTA);
	}

	@Override
	protected Identifier getRecipeIdentifier(Identifier identifier) {
		return new Identifier(PatternedGlass.MOD_ID, identifier.getPath());
	}

	private static void offerPatternedGlassDyeingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8)
				.input('#', Blocks.GLASS)
				.input('X', input)
				.pattern("###")
				.pattern("#X#")
				.pattern("###")
				.group("patterned_glass")
				.criterion("has_glass", conditionsFromItem(Blocks.GLASS))
				.criterion(hasItem(input), conditionsFromItem(input))
				.offerTo(exporter);
	}

	private static void offerPatternedGlassPaneRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 16)
				.input('#', input)
				.pattern("###")
				.pattern("###")
				.group("patterned_glass_pane")
				.criterion(hasItem(input), conditionsFromItem(input))
				.offerTo(exporter);
	}

	private static void offerPatternedGlassPaneDyeingRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
		ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8)
				.input('#', Blocks.GLASS_PANE)
				.input('$', input)
				.pattern("###")
				.pattern("#$#")
				.pattern("###")
				.group("patterned_glass_pane")
				.criterion("has_glass_pane", conditionsFromItem(Blocks.GLASS_PANE))
				.criterion(hasItem(input), conditionsFromItem(input))
				.offerTo(exporter, convertBetween(output, Blocks.GLASS_PANE));
	}
}
