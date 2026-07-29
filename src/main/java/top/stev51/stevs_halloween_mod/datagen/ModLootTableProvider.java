package top.stev51.stevs_halloween_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.item.ModItems;

import java.util.function.BiConsumer;

public class ModLootTableProvider implements LootTableSubProvider {

    public static final LootTable.Builder CANDY_LOOT_TABLE = LootTable.lootTable().withPool(
            LootPool.lootPool()
                    .when(LootItemRandomChanceCondition.randomChance(0.5f))
                    .add(LootItem.lootTableItem(ModItems.PEANUT_BUTTER_CUP))
                    .add(LootItem.lootTableItem(ModItems.GUMDROP))
                    .add(LootItem.lootTableItem(ModItems.LOLLIPOP))
                    .add(LootItem.lootTableItem(ModItems.HARD_CANDY))
                    .add(LootItem.lootTableItem(ModItems.SUGAR_COOKIE))
                    .add(LootItem.lootTableItem(ModItems.CHOCOLATE_BAR))
                    .add(LootItem.lootTableItem(ModItems.CARAMEL))
                    .add(LootItem.lootTableItem(ModItems.CARAMEL_APPLE))
                    .add(LootItem.lootTableItem(ModItems.CANDY_APPLE))
    );

    public ModLootTableProvider(HolderLookup.Provider provider) {
        super();
    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> biConsumer) {

        lootTable(biConsumer, "candy_loot_table", CANDY_LOOT_TABLE);

    }

    private void lootTable(
            BiConsumer<ResourceKey<LootTable>, LootTable.Builder> biConsumer,
            String path, LootTable.Builder tableBuilder
    ) {
        biConsumer.accept(
                ResourceKey.create(
                        Registries.LOOT_TABLE,
                        ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, path)
                ),
                tableBuilder
        );
    }

}
