package top.stev51.stevs_halloween_mod.loot;

import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import top.stev51.stevs_halloween_mod.item.ModItems;

public class ModLootTables {

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

}
