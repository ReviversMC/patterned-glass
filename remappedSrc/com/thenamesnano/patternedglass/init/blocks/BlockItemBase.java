package com.thenamesnano.patternedglass.init.blocks;

import com.thenamesnano.patternedglass.PatternedGlass;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new FabricItemSettings().group(PatternedGlass.PATTERNED_GLASS_BLOCKS));
    }
}
