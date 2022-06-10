package com.thenamesnano.patternedglass;

import com.thenamesnano.patternedglass.init.blocks.PatternedGlassBlock;
import com.thenamesnano.patternedglass.init.blocks.PatternedGlassPaneBlock;
import com.thenamesnano.patternedglass.util.RegistryHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class PatternedGlassClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        // Make sure that the glass renders translucent on the client
        for (PatternedGlassBlock block : RegistryHandler.GLASS_BLOCK_LIST){
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
        }
        for (PatternedGlassPaneBlock block : RegistryHandler.GLASS_PANE_BLOCK_LIST){
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
        }

    }
}
