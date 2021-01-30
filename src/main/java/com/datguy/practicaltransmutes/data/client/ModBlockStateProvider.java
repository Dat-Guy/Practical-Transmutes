package com.datguy.practicaltransmutes.data.client;

import com.datguy.practicaltransmutes.PracticalTransmutes;
import com.datguy.practicaltransmutes.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, PracticalTransmutes.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Creates monotexture and monostate block models
        simpleBlock(ModBlocks.JADE_BLOCK.get());
        simpleBlock(ModBlocks.JADE_ORE.get());
    }
}
