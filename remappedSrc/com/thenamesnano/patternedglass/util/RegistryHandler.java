package com.thenamesnano.patternedglass.util;

import com.thenamesnano.patternedglass.PatternedGlass;
import com.thenamesnano.patternedglass.init.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class RegistryHandler {

    public static final List<PatternedGlassBlock> GLASS_BLOCK_LIST = new ArrayList<PatternedGlassBlock>();
    public static final List<PatternedGlassPaneBlock> GLASS_PANE_BLOCK_LIST = new ArrayList<PatternedGlassPaneBlock>();

    public static void init() {
        for (PatternedGlassBlock block : GLASS_BLOCK_LIST) {
            Registry.register(Registry.BLOCK, new Identifier(PatternedGlass.MOD_ID, block.key), block);
            Registry.register(Registry.ITEM, new Identifier(PatternedGlass.MOD_ID, block.key), new BlockItemBase(block));
        }
        for (PatternedGlassPaneBlock block : GLASS_PANE_BLOCK_LIST) {
            Registry.register(Registry.BLOCK, new Identifier(PatternedGlass.MOD_ID, block.key), block);
            Registry.register(Registry.ITEM, new Identifier(PatternedGlass.MOD_ID, block.key), new BlockItemBase(block));
        }
    }

    // Blocks ----------------------------------------------------------------------------------------------------------
    public static final Block WHITE_PATTERNED_GLASS = new PatternedGlassBlock("white_patterned_glass", DyeColor.WHITE);
    public static final Block ORANGE_PATTERNED_GLASS = new PatternedGlassBlock("orange_patterned_glass", DyeColor.ORANGE);
    public static final Block MAGENTA_PATTERNED_GLASS = new PatternedGlassBlock("magenta_patterned_glass", DyeColor.MAGENTA);
    public static final Block LIGHT_BLUE_PATTERNED_GLASS = new PatternedGlassBlock("light_blue_patterned_glass", DyeColor.LIGHT_BLUE);
    public static final Block YELLOW_PATTERNED_GLASS = new PatternedGlassBlock("yellow_patterned_glass", DyeColor.YELLOW);
    public static final Block LIME_PATTERNED_GLASS = new PatternedGlassBlock("lime_patterned_glass", DyeColor.LIME);
    public static final Block PINK_PATTERNED_GLASS = new PatternedGlassBlock("pink_patterned_glass", DyeColor.PINK);
    public static final Block GRAY_PATTERNED_GLASS = new PatternedGlassBlock("gray_patterned_glass", DyeColor.GRAY);
    public static final Block LIGHT_GRAY_PATTERNED_GLASS = new PatternedGlassBlock("light_gray_patterned_glass", DyeColor.LIGHT_GRAY);
    public static final Block CYAN_PATTERNED_GLASS = new PatternedGlassBlock("cyan_patterned_glass", DyeColor.CYAN);
    public static final Block PURPLE_PATTERNED_GLASS = new PatternedGlassBlock("purple_patterned_glass", DyeColor.PURPLE);
    public static final Block BLUE_PATTERNED_GLASS = new PatternedGlassBlock("blue_patterned_glass", DyeColor.BLUE);
    public static final Block BROWN_PATTERNED_GLASS = new PatternedGlassBlock("brown_patterned_glass", DyeColor.BROWN);
    public static final Block GREEN_PATTERNED_GLASS = new PatternedGlassBlock("green_patterned_glass", DyeColor.GREEN);
    public static final Block RED_PATTERNED_GLASS = new PatternedGlassBlock("red_patterned_glass", DyeColor.RED);
    public static final Block BLACK_PATTERNED_GLASS = new PatternedGlassBlock("black_patterned_glass", DyeColor.BLACK);

    public static final Block WHITE_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("white_patterned_glass_pane", DyeColor.WHITE);
    public static final Block ORANGE_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("orange_patterned_glass_pane", DyeColor.ORANGE);
    public static final Block MAGENTA_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("magenta_patterned_glass_pane", DyeColor.MAGENTA);
    public static final Block LIGHT_BLUE_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("light_blue_patterned_glass_pane", DyeColor.LIGHT_BLUE);
    public static final Block YELLOW_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("yellow_patterned_glass_pane", DyeColor.YELLOW);
    public static final Block LIME_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("lime_patterned_glass_pane", DyeColor.LIME);
    public static final Block PINK_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("pink_patterned_glass_pane", DyeColor.PINK);
    public static final Block GRAY_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("gray_patterned_glass_pane", DyeColor.GRAY);
    public static final Block LIGHT_GRAY_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("light_gray_patterned_glass_pane", DyeColor.LIGHT_GRAY);
    public static final Block CYAN_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("cyan_patterned_glass_pane", DyeColor.CYAN);
    public static final Block PURPLE_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("purple_patterned_glass_pane", DyeColor.PURPLE);
    public static final Block BLUE_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("blue_patterned_glass_pane", DyeColor.BLUE);
    public static final Block BROWN_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("brown_patterned_glass_pane", DyeColor.BROWN);
    public static final Block GREEN_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("green_patterned_glass_pane", DyeColor.GREEN);
    public static final Block RED_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("red_patterned_glass_pane", DyeColor.RED);
    public static final Block BLACK_PATTERNED_GLASS_PANE = new PatternedGlassPaneBlock("black_patterned_glass_pane", DyeColor.BLACK);

}
