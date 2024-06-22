package net.pygmales.apothecary.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pygmales.apothecary.ApothecaryMod;
import net.pygmales.apothecary.block.ApothecaryBlocks;

public class ApothecaryItemGroup {
    public static final ItemGroup APOTHECARY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ApothecaryMod.ID, "apothecary_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.apothecary"))
                    .icon(() -> new ItemStack(ApothecaryItems.EXAMPLE_PETALS)).entries((displayContext, entries) -> {
                        entries.add(ApothecaryItems.EXAMPLE_PETALS);
                        entries.add(ApothecaryItems.EMPTY_PHIAL);
                        entries.add(ApothecaryItems.EMPTY_VIAL);
                        entries.add(ApothecaryItems.EMPTY_FLACON);
                        entries.add(ApothecaryItems.BAMBOO_CORK);

                        entries.add(ApothecaryBlocks.EXAMPLE_PLANT);
                    })
                    .build()
    );
    public static void registerItemGroup() {
        ApothecaryMod.LOGGER.info("Registering Apothecary Mod item group...");
    }
}
