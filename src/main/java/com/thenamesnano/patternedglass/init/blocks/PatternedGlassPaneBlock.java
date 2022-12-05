package com.thenamesnano.patternedglass.init.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.Stainable;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

import com.thenamesnano.patternedglass.util.RegistryHandler;

public class PatternedGlassPaneBlock extends PaneBlock implements Stainable {
	private final DyeColor color;
	private final String key;

	private static boolean never(BlockState state, BlockView blockView, BlockPos pos) {
		return false;
	}

	private static boolean never(BlockState state, BlockView blockView, BlockPos pos, EntityType<?> entityType) {
		return false;
	}

	public PatternedGlassPaneBlock(String key, DyeColor color) {
		super(FabricBlockSettings.of(Material.GLASS)
				.strength(0.3F)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
				.allowsSpawning(PatternedGlassPaneBlock::never)
				.suffocates(PatternedGlassPaneBlock::never)
				.blockVision(PatternedGlassPaneBlock::never));

		this.color = color;
		this.key = key;

		setDefaultState(stateManager.getDefaultState()
				.with(NORTH, false)
				.with(EAST, false)
				.with(SOUTH, false)
				.with(WEST, false)
				.with(WATERLOGGED, false));
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
