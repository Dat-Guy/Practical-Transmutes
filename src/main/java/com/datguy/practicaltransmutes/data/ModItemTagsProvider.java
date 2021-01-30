package com.datguy.practicaltransmutes.data;

import com.datguy.practicaltransmutes.PracticalTransmutes;
import com.datguy.practicaltransmutes.setup.ModItems;
import com.datguy.practicaltransmutes.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, PracticalTransmutes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        // Copies the tag data from the Blocks registry to the Items registry of the respective blockItem
        // Ores
        copy(ModTags.Blocks.ORES_JADE, ModTags.Items.ORES_JADE);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        // Storage Blocks (Materials in compact block form)
        copy(ModTags.Blocks.STORAGE_BLOCKS_JADE, ModTags.Items.STORAGE_BLOCKS_JADE);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        // Creates and adds a tag
        getOrCreateBuilder(ModTags.Items.GEMS_JADE).add(ModItems.JADE_SHARD.get());
        getOrCreateBuilder(Tags.Items.GEMS).addTag(ModTags.Items.GEMS_JADE);
    }
}
