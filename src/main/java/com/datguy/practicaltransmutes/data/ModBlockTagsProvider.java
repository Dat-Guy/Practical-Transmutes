package com.datguy.practicaltransmutes.data;

import com.datguy.practicaltransmutes.PracticalTransmutes;
import com.datguy.practicaltransmutes.setup.ModBlocks;
import com.datguy.practicaltransmutes.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, PracticalTransmutes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        // Creates and adds a tag to blocks, adds blocks to the correct group
        // Ores
        getOrCreateBuilder(ModTags.Blocks.ORES_JADE).add(ModBlocks.JADE_ORE.get());
        getOrCreateBuilder(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_JADE);
        // Storage Blocks (Compact Materials)
        getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_JADE).add(ModBlocks.JADE_BLOCK.get());
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_JADE);
    }
}
