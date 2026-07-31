package top.stev51.stevs_halloween_mod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import top.stev51.stevs_halloween_mod.HalloweenMod;
import top.stev51.stevs_halloween_mod.block.ModBlocks;
import top.stev51.stevs_halloween_mod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HalloweenMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        saplingItem(ModBlocks.APPLE_SAPLING);

        basicItem(ModItems.PEANUT_BUTTER_CUP.get());
        basicItem(ModItems.GUMDROP.get());
        basicItem(ModItems.LOLLIPOP.get());
        basicItem(ModItems.HARD_CANDY.get());
        basicItem(ModItems.SUGAR_COOKIE.get());
        basicItem(ModItems.FROSTED_SUGAR_COOKIE.get());
        basicItem(ModItems.CHOCOLATE_BAR.get());
        basicItem(ModItems.CARAMEL.get());
        basicItem(ModItems.CARAMEL_APPLE.get());
        basicItem(ModItems.CANDY_APPLE.get());
        basicItem(ModItems.TOASTED_PUMPKIN_SEEDS.get());

        basicItem(ModItems.APPLE_CORE.get());

        withExistingParent(ModItems.GHOST_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.VAMPIRE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.WEREWOLF_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.FRANKENSTEIN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.MUMMY_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.DEVIL_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(), ResourceLocation.parse("item/generated"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(HalloweenMod.MOD_ID, "block/" + item.getId().getPath()));
    }

}
