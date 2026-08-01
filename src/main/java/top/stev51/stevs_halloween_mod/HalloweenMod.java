package top.stev51.stevs_halloween_mod;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import top.stev51.stevs_halloween_mod.block.ModBlocks;
import top.stev51.stevs_halloween_mod.entity.ModEntities;
import top.stev51.stevs_halloween_mod.entity.client.*;
import top.stev51.stevs_halloween_mod.item.ModCreativeModeTabs;
import top.stev51.stevs_halloween_mod.item.ModItems;
import top.stev51.stevs_halloween_mod.loot.ModLootModifiers;

@Mod(HalloweenMod.MOD_ID)
public class HalloweenMod {

    public static final String MOD_ID = "stevs_halloween_mod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HalloweenMod(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntities.register(modEventBus);
        ModLootModifiers.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {

        event.enqueueWork(() -> {
            ((FlowerPotBlock)Blocks.FLOWER_POT).addPlant(ModBlocks.APPLE_SAPLING.getId(), ModBlocks.POTTED_APPLE_SAPLING);
        });

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        ;
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        ;
    }

    @EventBusSubscriber(modid=MOD_ID, value=Dist.CLIENT, bus=EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

            EntityRenderers.register(ModEntities.GHOST.get(), GhostRenderer::new);
            EntityRenderers.register(ModEntities.VAMPIRE.get(), VampireRenderer::new);
            EntityRenderers.register(ModEntities.WEREWOLF.get(), WerewolfRenderer::new);
            EntityRenderers.register(ModEntities.FRANKENSTEIN.get(), FrankensteinRenderer::new);
            EntityRenderers.register(ModEntities.MUMMY.get(), MummyRenderer::new);
            EntityRenderers.register(ModEntities.DEVIL.get(), DevilRenderer::new);

        }

    }

}
