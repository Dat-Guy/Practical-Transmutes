package com.datguy.practicaltransmutes.data.client;

import com.datguy.practicaltransmutes.PracticalTransmutes;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, PracticalTransmutes.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Creates blockItem models from block models
        withExistingParent("jade_ore", modLoc("block/jade_ore"));
        withExistingParent("jade_block", modLoc("block/jade_block"));

        // Gets item model interface
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        // Creates monotexture and monostate item models
        itemBuilder(itemGenerated, "jade_shard");
    }

    // Helper function which wraps an item with its associated texture
    private ItemModelBuilder itemBuilder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
