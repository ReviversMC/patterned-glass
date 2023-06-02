package com.thenamesnano.patternedglass.init.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.DyeColor;

import com.thenamesnano.patternedglass.util.RegistryHandler;

public class PatternedGlassBlock extends AbstractGlassBlock implements Stainable {
	public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
	private final DyeColor color;
	private final String key;

	public PatternedGlassBlock(String key, DyeColor color) {
		super(FabricBlockSettings.copyOf(Blocks.GLASS)
				.strength(0.3F)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
				.allowsSpawning((state, view, pos, entity) -> false)
				.suffocates((state, view, pos) -> false)
				.blockVision((state, view, pos) -> false)
				.pistonBehavior(PistonBehavior.PUSH_ONLY));

		this.color = color;
		this.key = key;

		RegistryHandler.GLASS_BLOCK_LIST.add(this);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
	}

	public PistonBehavior getPistonBehavior(BlockState state) {
		return PistonBehavior.PUSH_ONLY;
	}

	@Override
	public BlockState rotate(BlockState state, BlockRotation rotation) {
		return (BlockState) state.with(FACING, rotation.rotate(state.get(FACING)));
	}

	@Override
	public BlockState mirror(BlockState state, BlockMirror mirror) {
		return state.rotate(mirror.getRotation(state.get(FACING)));
	}

	@Override
	public DyeColor getColor() {
		return color;
	}

	public String getKey() {
		return key;
	}
}
