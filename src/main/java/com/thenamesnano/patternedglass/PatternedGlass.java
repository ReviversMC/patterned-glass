package com.thenamesnano.patternedglass;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import com.thenamesnano.patternedglass.util.RegistryHandler;

public class PatternedGlass implements ModInitializer {
	// Hardcoded Mod Identification
	public static final String MOD_ID = "patternedglass";

	// ItemGroup Declaration
	public static final ItemGroup PATTERNED_GLASS_BLOCKS = FabricItemGroup.builder(new Identifier(MOD_ID, "blocks"))
			.icon(() -> new ItemStack(RegistryHandler.BLACK_PATTERNED_GLASS.asItem()))
			.build();

	@Override
	public void onInitialize() {
		RegistryHandler.init();
	}
}
