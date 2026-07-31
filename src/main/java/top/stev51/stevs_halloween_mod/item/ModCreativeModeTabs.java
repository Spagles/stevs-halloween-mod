package top.stev51.stevs_halloween_mod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HalloweenMod.MOD_ID);

    public static final Supplier<CreativeModeTab> HALLOWEEN_MOD_TAB = CREATIVE_MODE_TAB.register("stevs_halloween_mod_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(Blocks.JACK_O_LANTERN))
                    .title(Component.translatable("creativetab.stevs_halloween_mod.stevs_halloween_mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        // Blocks
                        output.accept(ModBlocks.APPLE_LEAVES);
                        output.accept(ModBlocks.APPLE_SAPLING);

                        // Items - Food
                        output.accept(ModItems.CANDY_APPLE);
                        output.accept(ModItems.CARAMEL_APPLE);
                        output.accept(ModItems.CARAMEL);
                        output.accept(ModItems.CHOCOLATE_BAR);
                        output.accept(ModItems.GUMDROP);
                        output.accept(ModItems.HARD_CANDY);
                        output.accept(ModItems.LOLLIPOP);
                        output.accept(ModItems.PEANUT_BUTTER_CUP);
                        output.accept(ModItems.SUGAR_COOKIE);
                        output.accept(ModItems.FROSTED_SUGAR_COOKIE);
                        output.accept(ModItems.TOASTED_PUMPKIN_SEEDS);

                        // Items - Misc
                        output.accept(ModItems.APPLE_CORE);

                        // Spawn Eggs
                        output.accept(ModItems.DEVIL_SPAWN_EGG);
                        output.accept(ModItems.GHOST_SPAWN_EGG);
                        output.accept(ModItems.FRANKENSTEIN_SPAWN_EGG); // Monster
                        output.accept(ModItems.MUMMY_SPAWN_EGG);
                        output.accept(ModItems.VAMPIRE_SPAWN_EGG);
                        output.accept(ModItems.WEREWOLF_SPAWN_EGG);

                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
