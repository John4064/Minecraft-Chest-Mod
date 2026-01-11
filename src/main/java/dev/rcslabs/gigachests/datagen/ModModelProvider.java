package dev.rcslabs.gigachests.datagen;

import dev.rcslabs.gigachests.GigaChests;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {

    public ModModelProvider(PackOutput output){
        super(output, GigaChests.MOD_ID);
    }



}
