package top.stev51.stevs_halloween_mod.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import top.stev51.stevs_halloween_mod.block.ModBlocks;
import top.stev51.stevs_halloween_mod.entity.ModEntities;
import top.stev51.stevs_halloween_mod.item.ModItems;

import java.util.Set;
import java.util.stream.Stream;

public class ModEntityLootTableProvider extends EntityLootSubProvider {

    protected ModEntityLootTableProvider(HolderLookup.Provider registries) {
        super(FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    public void generate() {

        LootTable.Builder candyLootTable = LootTable.lootTable().withPool(
                LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ModItems.PEANUT_BUTTER_CUP))
        );

        add(ModEntities.GHOST.get(), candyLootTable);
        add(ModEntities.VAMPIRE.get(), candyLootTable);
        add(ModEntities.WEREWOLF.get(), candyLootTable);
        add(ModEntities.FRANKENSTEIN.get(), candyLootTable);
        add(ModEntities.MUMMY.get(), candyLootTable);
        add(ModEntities.DEVIL.get(), candyLootTable);

    }

    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return ModEntities.ENTITY_TYPES.getEntries().stream().map(Holder::value);
    }
}
