package com.datguy.practicaltransmutes.data.loot;

import com.datguy.practicaltransmutes.setup.Registration;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;

import java.util.stream.Collectors;

public class ModBlockLootTables extends BlockLootTables {
    @Override
    protected void addTables() {
        Registration.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .filter(block -> block.asItem() != Items.AIR)
                .forEach(this::registerDropSelfLootTable);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .collect(Collectors.toList());
    }
}
