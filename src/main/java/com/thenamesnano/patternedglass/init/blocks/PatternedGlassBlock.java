package com.thenamesnano.patternedglass.init.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.Stainable;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

import com.thenamesnano.patternedglass.util.RegistryHandler;

public class PatternedGlassBlock extends AbstractGlassBlock implements Stainable {
	public static final DirectionProperty FACING;
	private final DyeColor color;
	private final String key;

	static {
		FACING = Properties.HORIZONTAL_FACING;
	}

	private static boolean never(BlockState state, BlockView blockView, BlockPos pos) {
		return false;
	}

	private static boolean never(BlockState state, BlockView blockView, BlockPos pos, EntityType<?> entityType) {
		return false;
	}

	public PatternedGlassBlock(String key, DyeColor color) {
		super(FabricBlockSettings.of(Material.GLASS)
				.strength(0.3F)
				.sounds(BlockSoundGroup.GLASS)
				.nonOpaque()
				.allowsSpawning(PatternedGlassBlock::never)
				.suffocates(PatternedGlassBlock::never)
				.blockVision(PatternedGlassBlock::never));

		this.color = color;
		this.key = key;

		RegistryHandler.GLASS_BLOCK_LIST.add(this);
	}

	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(new Property[]{FACING});
	}

	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return (BlockState) getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
	}

	public PistonBehavior getPistonBehavior(BlockState state) {
		return PistonBehavior.PUSH_ONLY;
	}

	public BlockState rotate(BlockState state, BlockRotation rotation) {
		return (BlockState) state.with(FACING, rotation.rotate((Direction) state.get(FACING)));
	}

	public BlockState mirror(BlockState state, BlockMirror mirror) {
		return state.rotate(mirror.getRotation((Direction) state.get(FACING)));
	}

	@Override
	public DyeColor getColor() {
		return color;
	}

	public String getKey() {
		return key;
	}
}
