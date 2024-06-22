package net.pygmales.apothecary;

import net.fabricmc.api.ModInitializer;
import net.pygmales.apothecary.block.ApothecaryBlocks;
import net.pygmales.apothecary.item.ApothecaryItemGroup;
import net.pygmales.apothecary.item.ApothecaryItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApothecaryMod implements ModInitializer {
    public static final String ID = "apothecary";
    public static final Logger LOGGER = LoggerFactory.getLogger(ID);


    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Apothecary Mod...");
        ApothecaryItems.regsterItems();
        ApothecaryBlocks.registerBlocks();
        ApothecaryItemGroup.registerItemGroup();
    }
}
