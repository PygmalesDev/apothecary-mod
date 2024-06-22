package net.pygmales.apothecary.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pygmales.apothecary.ApothecaryMod;

public class ApothecaryBlocks {
    public static final Block EXAMPLE_PLANT = registerBlock("example_plant",
            new Block(Block.Settings.copy(Blocks.DANDELION)
                    .nonOpaque()
                    .luminance(value -> 16)));

    private static Item registerBlockItem(String blockID, Block block) {
        return Registry.register(Registries.ITEM,
                Identifier.of(ApothecaryMod.ID, blockID),
                new BlockItem(block, new Item.Settings()));
    }

    private static Block registerBlock(String blockID, Block block) {
        registerBlockItem(blockID, block);
        return Registry.register(Registries.BLOCK,
                Identifier.of(ApothecaryMod.ID, blockID), block);
    }

    public static void registerBlocks() {
        ApothecaryMod.LOGGER.info("Registering blocks for Apothecary Mode...");
    }
}
