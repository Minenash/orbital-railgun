package io.github.mishkis.orbital_railgun.item;

import io.github.mishkis.orbital_railgun.OrbitalRailgun;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class OrbitalRailgunItems {
    public static final OrbitalRailgunItem ORBITAL_RAILGUN = (OrbitalRailgunItem) register(new OrbitalRailgunItem(), "orbital_railgun");

    public static Item register(Item item, String id) {
		Identifier itemID = new Identifier(OrbitalRailgun.MOD_ID, id);
		return  Registry.register(Registries.ITEM, itemID, item);
	}
	
	public static void initialize() {
	}
}
