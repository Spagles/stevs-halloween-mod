package top.stev51.stevs_halloween_mod.event;

import net.minecraft.world.entity.SpawnPlacementType;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.entity.ModEntities;
import top.stev51.stevs_halloween_mod.entity.custom.*;

@EventBusSubscriber(modid=HalloweenMod.MOD_ID, bus=EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {

        event.put(ModEntities.GHOST.get(), GhostEntity.createAttributes().build());
        event.put(ModEntities.VAMPIRE.get(), VampireEntity.createAttributes().build());
        event.put(ModEntities.WEREWOLF.get(), WerewolfEntity.createAttributes().build());
        event.put(ModEntities.FRANKENSTEIN.get(), FrankensteinEntity.createAttributes().build());
        event.put(ModEntities.MUMMY.get(), MummyEntity.createAttributes().build());
        event.put(ModEntities.DEVIL.get(), DevilEntity.createAttributes().build());

    }

    @SubscribeEvent
    public static void registerSpawnPlacements(RegisterSpawnPlacementsEvent event) {

        event.register(ModEntities.GHOST.get(),
                SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(ModEntities.VAMPIRE.get(),
                SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(ModEntities.WEREWOLF.get(),
                SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(ModEntities.FRANKENSTEIN.get(),
                SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(ModEntities.MUMMY.get(),
                SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(ModEntities.DEVIL.get(),
                SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

    }

}
