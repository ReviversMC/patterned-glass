package com.thenamesnano.patternedglass.init.blocks;

import com.thenamesnano.patternedglass.util.RegistryHandler;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class PatternedGlassPaneBlock extends PaneBlock implements Stainable {

  private final DyeColor color;
  public final String key;

  public PatternedGlassPaneBlock(String key, DyeColor color) {
    super(FabricBlockSettings.of(Material.GLASS)
            .strength(0.3F)
            .sounds(BlockSoundGroup.GLASS)
            .nonOpaque()
            .allowsSpawning(PatternedGlassPaneBlock::never)
            .suffocates(PatternedGlassPaneBlock::never)
            .blockVision(PatternedGlassPaneBlock::never));
    this.setDefaultState((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.stateManager
            .getDefaultState())
            .with(NORTH, false))
            .with(EAST, false))
            .with(SOUTH, false))
            .with(WEST, false))
            .with(WATERLOGGED, false));
    this.color = color;
    this.key = key;
    RegistryHandler.GLASS_PANE_BLOCK_LIST.add(this);
  }

  private static boolean never(BlockState state, BlockView blockView, BlockPos pos) {
    return false;
  }

  private static boolean never(BlockState state, BlockView blockView, BlockPos pos, EntityType<?> entityType) {
    return false;
  }

  @Override
  public DyeColor getColor() {
    return this.color;
  }
}
