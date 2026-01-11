package dev.rcslabs.gigachests.datagen;

import dev.rcslabs.gigachests.block.ModBlocks;
import dev.rcslabs.gigachests.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import java.util.concurrent.CompletableFuture;


public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput){
        super(provider, recipeOutput);
    }

    public static class Runner extends RecipeProvider.Runner{
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider){
            super(packOutput, provider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput){
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName(){
            return "Giga Recipes";
        }
    }

    @Override
    protected void buildRecipes(){

        shaped(RecipeCategory.MISC, ModBlocks.OMEGA_CHEST.get())
                .pattern(" SS")
                .pattern(" SS")
                .pattern("   ")
                .define('S', ModItems.UPGRADE_ROCK.get())
                .unlockedBy("has_upgrade_rock", has(ModItems.UPGRADE_ROCK)).save(output);
    }
}
