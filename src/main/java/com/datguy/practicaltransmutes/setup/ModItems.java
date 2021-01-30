package com.datguy.practicaltransmutes.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    // Create and add items to their individual registers
    public static final RegistryObject<Item> JADE_SHARD =
            Registration.ITEMS.register("jade_shard", () -> new Item(new Item.Properties()
                    .group(ItemGroup.MATERIALS)));

    static void register() {}
}
