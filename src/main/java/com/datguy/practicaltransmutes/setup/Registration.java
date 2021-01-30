package com.datguy.practicaltransmutes.setup;

import com.datguy.practicaltransmutes.PracticalTransmutes;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PracticalTransmutes.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PracticalTransmutes.MOD_ID);

    public static void register() {
        // Get a single instance of the load event bus
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Add the bus to the BLOCKS and ITEMS registers
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        // Populate the block and item registers
        ModBlocks.register();
        ModItems.register();
    }
}
