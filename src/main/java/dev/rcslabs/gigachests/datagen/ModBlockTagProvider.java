package dev.rcslabs.gigachests.datagen;

import dev.rcslabs.gigachests.GigaChests;
import dev.rcslabs.gigachests.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, GigaChests.MOD_ID);
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider){
        //Kind
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.OMEGA_CHEST.get());

        //Tier
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.OMEGA_CHEST.get());
    }

}
