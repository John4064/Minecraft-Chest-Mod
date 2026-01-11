package dev.rcslabs.gigachests.item;

import dev.rcslabs.gigachests.GigaChests;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GigaChests.MOD_ID);

    public static final DeferredItem<Item> UPGRADE_ROCK = ITEMS.registerItem("upgrade_rock",
            Item::new);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
