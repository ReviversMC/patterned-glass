package com.thenamesnano.patternedglass.init.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.Stainable;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.DyeColor;

import com.thenamesnano.patternedglass.util.RegistryHandler;

public class PatternedGlassPaneBlock extends PaneBlock implements Stainable {
	public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
	private final DyeColor color;
	private final String key;

	public PatternedGlassPaneBlock(String key, DyeColor color) {
		super(FabricBlockSettings.copyOf(Blocks.GLASS)
				.strength(0.3F)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
				.allowsSpawning((state, view, pos, entity) -> false)
				.suffocates((state, view, pos) -> false)
				.blockVision((state, view, pos) -> false));

		this.color = color;
		this.key = key;

		RegistryHandler.GLASS_PANE_BLOCK_LIST.add(this);
	}

	@Override
	public DyeColor getColor() {
		return color;
	}

	public String getKey() {
		return key;
	}
}
