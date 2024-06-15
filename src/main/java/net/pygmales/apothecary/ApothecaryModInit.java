package net.pygmales.apothecary;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApothecaryModInit implements ModInitializer {
    public static final String ID = "apothecary";
    public static final Logger LOGGER = LoggerFactory.getLogger(ID);


    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Apothecary Mod...");
    }
}
