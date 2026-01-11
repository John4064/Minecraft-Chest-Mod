//package dev.rcslabs.gigachests.recipe;
//
//import dev.rcslabs.gigachests.GigaChests;
//import net.minecraft.core.registries.Registries;
//import net.minecraft.world.item.crafting.RecipeSerializer;
//import net.minecraft.world.item.crafting.RecipeType;
//import net.neoforged.bus.api.IEventBus;
//import net.neoforged.neoforge.registries.DeferredRegister;
//
//public class ModRecipes {
//
//    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
//            DeferredRegister.create(Registries.RECIPE_SERIALIZER, GigaChests.MOD_ID);
//
//    public static final DeferredRegister<RecipeType<?>> TYPES =
//            DeferredRegister.create(Registries.RECIPE_TYPE, GigaChests.MOD_ID);
//
//    public static void register(IEventBus eventBus) {
//        SERIALIZERS.register(eventBus);
//        TYPES.register(eventBus);
//    }
//}
