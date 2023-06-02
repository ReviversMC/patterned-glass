package com.thenamesnano.patternedglass;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import com.thenamesnano.patternedglass.util.RegistryHandler;

public class PatternedGlass implements ModInitializer {
	// Hardcoded Mod Identification
	public static final String MOD_ID = "patternedglass";

	// ItemGroup Declaration
	public static final RegistryKey<ItemGroup> PATTERNED_GLASS_BLOCKS = RegistryKey
			.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "blocks"));

	@Override
	public void onInitialize() {
		RegistryHandler.init();
	}
}
