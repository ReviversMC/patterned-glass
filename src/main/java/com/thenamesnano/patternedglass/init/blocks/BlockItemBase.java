package com.thenamesnano.patternedglass.init.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import com.thenamesnano.patternedglass.PatternedGlass;

public class BlockItemBase extends BlockItem {
	public BlockItemBase(Block block) {
		super(block, new Item.Settings());

		ItemGroupEvents.modifyEntriesEvent(PatternedGlass.PATTERNED_GLASS_BLOCKS)
				.register(entries -> entries.add(block));
	}
}
