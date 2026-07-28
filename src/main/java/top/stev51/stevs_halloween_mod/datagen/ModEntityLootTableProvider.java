package top.stev51.stevs_halloween_mod.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import top.stev51.stevs_halloween_mod.entity.ModEntities;
import top.stev51.stevs_halloween_mod.item.ModItems;
import top.stev51.stevs_halloween_mod.loot.ModLootTables;

import java.util.stream.Stream;

public class ModEntityLootTableProvider extends EntityLootSubProvider {

    protected ModEntityLootTableProvider(HolderLookup.Provider registries) {
        super(FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    public void generate() {

        add(ModEntities.GHOST.get(), ModLootTables.CANDY_LOOT_TABLE);
        add(ModEntities.VAMPIRE.get(), ModLootTables.CANDY_LOOT_TABLE);
        add(ModEntities.WEREWOLF.get(), ModLootTables.CANDY_LOOT_TABLE);
        add(ModEntities.FRANKENSTEIN.get(), ModLootTables.CANDY_LOOT_TABLE);
        add(ModEntities.MUMMY.get(), ModLootTables.CANDY_LOOT_TABLE);
        add(ModEntities.DEVIL.get(), ModLootTables.CANDY_LOOT_TABLE);

    }

    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return ModEntities.ENTITY_TYPES.getEntries().stream().map(Holder::value);
    }
}
