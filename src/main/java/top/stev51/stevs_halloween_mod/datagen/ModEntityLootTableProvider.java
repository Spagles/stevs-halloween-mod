package top.stev51.stevs_halloween_mod.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import top.stev51.stevs_halloween_mod.entity.ModEntities;

import java.util.stream.Stream;

public class ModEntityLootTableProvider extends EntityLootSubProvider {

    protected ModEntityLootTableProvider(HolderLookup.Provider registries) {
        super(FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    public void generate() {

        add(ModEntities.GHOST.get(), ModLootTableProvider.HALLOWEEN_MOB_CANDY_LOOT_TABLE);
        add(ModEntities.VAMPIRE.get(), ModLootTableProvider.HALLOWEEN_MOB_CANDY_LOOT_TABLE);
        add(ModEntities.WEREWOLF.get(), ModLootTableProvider.HALLOWEEN_MOB_CANDY_LOOT_TABLE);
        add(ModEntities.FRANKENSTEIN.get(), ModLootTableProvider.HALLOWEEN_MOB_CANDY_LOOT_TABLE);
        add(ModEntities.MUMMY.get(), ModLootTableProvider.HALLOWEEN_MOB_CANDY_LOOT_TABLE);
        add(ModEntities.DEVIL.get(), ModLootTableProvider.HALLOWEEN_MOB_CANDY_LOOT_TABLE);

    }

    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return ModEntities.ENTITY_TYPES.getEntries().stream().map(Holder::value);
    }
}
