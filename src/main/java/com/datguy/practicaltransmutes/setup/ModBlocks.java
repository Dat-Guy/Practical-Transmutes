package com.datguy.practicaltransmutes.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    // Create and add blocks to their individual registers
    public static final RegistryObject<Block> JADE_ORE =
            register("jade_ore", () -> new Block(AbstractBlock.Properties
                    .create(Material.ROCK)
                    .hardnessAndResistance(3, 10)
                    .harvestLevel(3)
                    .sound(SoundType.STONE)));
    public static final RegistryObject<Block> JADE_BLOCK =
            register("jade_block", () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON)
                    .hardnessAndResistance(5, 50)
                    .harvestLevel(2)
                    .sound(SoundType.GILDED_BLACKSTONE)));

    static void register() {}

    // Helper method which wraps raw data into a basic register
    private static <T extends Block>RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    // Helper method which wraps raw data into a register (with corresponding item)
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        // Note that all blocks are currently added to the building_blocks creative tab, under the respective item group.
        Registration.ITEMS
                .register(name, () -> new BlockItem(ret.get(), new Item.Properties()
                        .group(ItemGroup.BUILDING_BLOCKS)));
        return ret;
    }
}
