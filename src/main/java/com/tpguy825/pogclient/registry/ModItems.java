package com.tpguy825.pogclient.registry;

import com.tpguy825.pogclient.PogClient;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    // Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(PogClient.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(PogClient.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }
}
