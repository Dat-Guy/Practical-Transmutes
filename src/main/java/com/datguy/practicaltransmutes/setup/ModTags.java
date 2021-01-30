package com.datguy.practicaltransmutes.setup;

import com.datguy.practicaltransmutes.PracticalTransmutes;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {

    // Helper class containing ALL of the block tags
    public static final class Blocks {
        public static final ITag.INamedTag<Block> ORES_JADE = forge("ores/jade");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_JADE = forge("storage_blocks/jade");

        // Helper method for general tag generation
        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        // Helper method for tag generation of mod-specific tags
        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation(PracticalTransmutes.MOD_ID, path).toString());
        }
    }

    // Helper class containing ALL of the item tags
    public static final class Items {
        // Block items
        public static final ITag.INamedTag<Item> ORES_JADE = forge("ores/jade");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_JADE = forge("storage_blocks/jade");

        // Standalone items
        public static final ITag.INamedTag<Item> GEMS_JADE = forge("gems/jade");

        // Helper method for general tag generation
        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        // Helper method for tag generation of mod-specific tags
        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation(PracticalTransmutes.MOD_ID, path).toString());
        }
    }
}
