package com.thenamesnano.patternedglass.init.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

import com.thenamesnano.patternedglass.PatternedGlass;

public class BlockItemBase extends BlockItem {
	public BlockItemBase(Block block) {
		super(block, new FabricItemSettings());
		ItemGroupEvents.modifyEntriesEvent(PatternedGlass.PATTERNED_GLASS_BLOCKS).register(entries -> entries.add(block));
	}
}
