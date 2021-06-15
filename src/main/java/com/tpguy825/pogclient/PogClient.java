package com.tpguy825.pogclient;

import com.tpguy825.pogclient.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class PogClient implements ModInitializer {

    public static final String MOD_ID = "pogclient";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
