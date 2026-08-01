package top.stev51.stevs_halloween_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.*;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.AddTableLootModifier;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.loot.AddItemModifier;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {

    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, HalloweenMod.MOD_ID);
    }

    @Override
    protected void start() {

        add("pumpkin_seeds_to_short_grass", new AddItemModifier(
                new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SHORT_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build()
                },
                Items.PUMPKIN_SEEDS
        ));

        add("pumpkin_seeds_to_tall_grass", new AddItemModifier(
                new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.TALL_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build()
                },
                Items.PUMPKIN_SEEDS
        ));



        ResourceKey<LootTable> vanillaCandyTable = ResourceKey.create(
                Registries.LOOT_TABLE,
                ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "vanilla_mob_candy_loot_table")
        );

        add("candy_to_zombie", new AddTableLootModifier(
                new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie")).build()
                },
                vanillaCandyTable
        ));

        add("candy_to_zombie_villager", new AddTableLootModifier(
                new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/zombie_villager")).build()
                },
                vanillaCandyTable
        ));

        add("candy_to_husk", new AddTableLootModifier(
                new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/husk")).build()
                },
                vanillaCandyTable
        ));

        add("candy_to_drowned", new AddTableLootModifier(
                new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/drowned")).build()
                },
                vanillaCandyTable
        ));

        add("candy_to_skeleton", new AddTableLootModifier(
                new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/skeleton")).build()
                },
                vanillaCandyTable
        ));

        add("candy_to_stray", new AddTableLootModifier(
                new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/stray")).build()
                },
                vanillaCandyTable
        ));

        add("candy_to_bogged", new AddTableLootModifier(
                new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/bogged")).build()
                },
                vanillaCandyTable
        ));

        add("candy_to_wither_skeleton", new AddTableLootModifier(
                new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/wither_skeleton")).build()
                },
                vanillaCandyTable
        ));

        add("candy_to_spider", new AddTableLootModifier(
                new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/spider")).build()
                },
                vanillaCandyTable
        ));

        add("candy_to_cave_spider", new AddTableLootModifier(
                new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/cave_spider")).build()
                },
                vanillaCandyTable
        ));

        add("candy_to_witch", new AddTableLootModifier(
                new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/witch")).build()
                },
                vanillaCandyTable
        ));

        add("candy_to_ghast", new AddTableLootModifier(
                new LootItemCondition[] {
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("entities/ghast")).build()
                },
                vanillaCandyTable
        ));

    }

}
