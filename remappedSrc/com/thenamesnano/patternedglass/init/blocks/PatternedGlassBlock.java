package com.thenamesnano.patternedglass.init.blocks;

import com.thenamesnano.patternedglass.util.RegistryHandler;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
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
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class PatternedGlassBlock extends AbstractGlassBlock implements Stainable {

    private final DyeColor color;
    public final String key;
    public static final DirectionProperty FACING;

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

    private static boolean never(BlockState state, BlockView blockView, BlockPos pos) {
        return false;
    }

    private static boolean never(BlockState state, BlockView blockView, BlockPos pos, EntityType<?> entityType) {
        return false;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.PUSH_ONLY;
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate((Direction)state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation((Direction)state.get(FACING)));
    }

    static {
        FACING = Properties.HORIZONTAL_FACING;
    }

    @Override
    public DyeColor getColor() {
        return this.color;
    }
}
