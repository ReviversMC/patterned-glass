package com.thenamesnano.patternedglass;

import com.thenamesnano.patternedglass.util.RegistryHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class PatternedGlass implements ModInitializer {

	// Hardcoded Mod Identification
	public static final String MOD_ID = "patternedglass";

	// ItemGroup Declaration
	public static final ItemGroup PATTERNED_GLASS_BLOCKS = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "blocks"),
			() -> new ItemStack(RegistryHandler.BLACK_PATTERNED_GLASS.asItem()));

	// -4020941818228131454
	@Override
	public void onInitialize() {
		RegistryHandler.init();
	}
}
