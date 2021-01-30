package com.datguy.practicaltransmutes.data;

import com.datguy.practicaltransmutes.PracticalTransmutes;
import com.datguy.practicaltransmutes.data.client.ModBlockStateProvider;
import com.datguy.practicaltransmutes.data.client.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = PracticalTransmutes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    private DataGenerators() {}

    // Tells forge to run this on resource population (runData)
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        // Gets required information interfaces
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        // Adds block and item providers to the dataGen
        gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));

        // Adds block and item tags to the dataGen
        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, existingFileHelper);
        gen.addProvider(blockTags);
        gen.addProvider(new ModItemTagsProvider(gen, blockTags, existingFileHelper));
    }
}
