package com.thenamesnano.patternedglass.init.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

import com.thenamesnano.patternedglass.PatternedGlass;

public class BlockItemBase extends BlockItem {
	public BlockItemBase(Block block) {
		super(block, new FabricItemSettings().group(PatternedGlass.PATTERNED_GLASS_BLOCKS));
	}
}
