package org.molodoyss.bfufois.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//initializing mod
public class BfufoisClient implements ClientModInitializer {
    public static final String MODID = "BFUFOIS";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("{} Initialized", MODID);
    }
}
