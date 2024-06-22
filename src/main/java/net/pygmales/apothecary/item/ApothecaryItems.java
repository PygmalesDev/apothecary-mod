package net.pygmales.apothecary.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pygmales.apothecary.ApothecaryMod;

public class ApothecaryItems {
    public static final Item EXAMPLE_PETALS = registerItem("example_petals", new Item(new Item.Settings()));
    public static final Item EMPTY_PHIAL = registerItem("empty_phial", new Item(new Item.Settings()));
    public static final Item EMPTY_FLACON = registerItem("empty_flacon", new Item(new Item.Settings()));
    public static final Item EMPTY_VIAL = registerItem("empty_vial", new Item(new Item.Settings()));
    public static final Item BAMBOO_CORK = registerItem("bamboo_cork", new Item(new Item.Settings()));

    private static Item registerItem(String itemID, Item itemData) {
        return Registry.register(Registries.ITEM,
                Identifier.of(ApothecaryMod.ID, itemID),
                itemData);
    }

    public static void regsterItems() {
        ApothecaryMod.LOGGER.info("Registering items for Apothecary Mod...");
    }
}
