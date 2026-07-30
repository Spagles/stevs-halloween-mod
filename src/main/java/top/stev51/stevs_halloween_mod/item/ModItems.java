package top.stev51.stevs_halloween_mod.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.block.ModBlocks;
import top.stev51.stevs_halloween_mod.entity.ModEntities;
import top.stev51.stevs_halloween_mod.item.custom.ModFoodProperties;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HalloweenMod.MOD_ID);



    // Foods - Non-craftable candy

    public static final DeferredItem<Item> PEANUT_BUTTER_CUP = ITEMS.register("peanut_butter_cup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PEANUT_BUTTER_CUP))
    );

    public static final DeferredItem<Item> GUMDROP = ITEMS.register("gumdrop",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GUMDROP))
    );

    public static final DeferredItem<Item> LOLLIPOP = ITEMS.register("lollipop",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LOLLIPOP))
    );

    public static final DeferredItem<Item> HARD_CANDY = ITEMS.register("hard_candy",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HARD_CANDY))
    );

    // Foods - Craftable candy

    public static final DeferredItem<Item> SUGAR_COOKIE = ITEMS.register("sugar_cookie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SUGAR_COOKIE))
    );

    public static final DeferredItem<Item> CHOCOLATE_BAR = ITEMS.register("chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOCOLATE_BAR))
    );

    public static final DeferredItem<Item> CARAMEL = ITEMS.register("caramel",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CARAMEL))
    );

    public static final DeferredItem<Item> CARAMEL_APPLE = ITEMS.register("caramel_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CARAMEL_APPLE))
    );

    public static final DeferredItem<Item> CANDY_APPLE = ITEMS.register("candy_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CANDY_APPLE))
    );

    // Foods - Misc

    public static final DeferredItem<Item> TOASTED_PUMPKIN_SEEDS = ITEMS.register("toasted_pumpkin_seeds",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOASTED_PUMPKIN_SEEDS))
    );

    // Misc

    public static final DeferredItem<Item> APPLE_CORE = ITEMS.register("apple_core",
            () -> new ItemNameBlockItem(ModBlocks.APPLE_SAPLING.get(), new Item.Properties())
    );

    // Spawn Eggs

    public static final DeferredItem<Item> GHOST_SPAWN_EGG = ITEMS.register("ghost_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.GHOST, 0xFFBAE3E8, 0xFF282828, new Item.Properties())
    );

    public static final DeferredItem<Item> VAMPIRE_SPAWN_EGG = ITEMS.register("vampire_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.VAMPIRE, 0xFF002C40, 0xFFDF2F4E, new Item.Properties())
    );

    public static final DeferredItem<Item> WEREWOLF_SPAWN_EGG = ITEMS.register("werewolf_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.WEREWOLF, 0xffffff, 0xffffff, new Item.Properties())
    );

    public static final DeferredItem<Item> FRANKENSTEIN_SPAWN_EGG = ITEMS.register("frankenstein_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.FRANKENSTEIN, 0xffffff, 0xffffff, new Item.Properties())
    );

    public static final DeferredItem<Item> MUMMY_SPAWN_EGG = ITEMS.register("mummy_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.MUMMY, 0xFFD1BF97, 0xFF403428, new Item.Properties())
    );

    public static final DeferredItem<Item> DEVIL_SPAWN_EGG = ITEMS.register("devil_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.DEVIL, 0xffffff, 0xffffff, new Item.Properties())
    );



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
