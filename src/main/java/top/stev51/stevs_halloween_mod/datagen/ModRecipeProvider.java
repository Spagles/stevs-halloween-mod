package top.stev51.stevs_halloween_mod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.neoforge.common.Tags;
import top.stev51.stevs_halloween_mod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        // Food

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.SUGAR_COOKIE.get(), 8)
                .pattern("WSW")
                .define('W', Items.WHEAT)
                .define('S', Items.SUGAR)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.FROSTED_SUGAR_COOKIE.get(), 8)
                .pattern(" M ")
                .pattern("WSW")
                .define('M', Items.MILK_BUCKET)
                .define('W', Items.WHEAT)
                .define('S', Items.SUGAR)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.FROSTED_SUGAR_COOKIE.get(), 8)
                .pattern("CCC")
                .pattern("CMC")
                .pattern("CCC")
                .define('M', Items.MILK_BUCKET)
                .define('C', ModItems.SUGAR_COOKIE)
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput, "frosted_sugar_cookie_from_sugar_cookie");

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.CARAMEL_APPLE.get(), 1)
                .pattern("C")
                .pattern("A")
                .pattern("S")
                .define('C', ModItems.CARAMEL)
                .define('A', Items.APPLE)
                .define('S', Items.STICK)
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.CANDY_APPLE.get(), 1)
                .pattern("C")
                .pattern("A")
                .pattern("S")
                .define('C', Items.SUGAR)
                .define('A', Items.APPLE)
                .define('S', Items.STICK)
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CHOCOLATE_BAR.get(), 8)
                .requires(Items.COCOA_BEANS)
                .requires(Items.SUGAR)
                .requires(Items.MILK_BUCKET)
                .unlockedBy("has_cocoa_beans", has(Items.COCOA_BEANS))
                .save(recipeOutput);

        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(Items.SUGAR), RecipeCategory.FOOD, ModItems.CARAMEL,
                0.35f, 200
        )
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput, "caramel_from_smelting");

        SimpleCookingRecipeBuilder.smoking(
                Ingredient.of(Items.SUGAR), RecipeCategory.FOOD, ModItems.CARAMEL,
                0.35f, 100
        )
                .unlockedBy("has_sugar", has(Items.SUGAR))
                .save(recipeOutput, "caramel_from_smoking");

        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(Items.PUMPKIN_SEEDS), RecipeCategory.FOOD, ModItems.TOASTED_PUMPKIN_SEEDS,
                0.35f, 200
        )
                .unlockedBy("has_pumpkin_seeds", has(Items.PUMPKIN_SEEDS))
                .save(recipeOutput, "toasted_pumpkin_seeds_from_smelting");

        SimpleCookingRecipeBuilder.smoking(
                Ingredient.of(Items.PUMPKIN_SEEDS), RecipeCategory.FOOD, ModItems.TOASTED_PUMPKIN_SEEDS,
                0.35f, 100
        )
                .unlockedBy("has_pumpkin_seeds", has(Items.PUMPKIN_SEEDS))
                .save(recipeOutput, "toasted_pumpkin_seeds_from_smoking");

        SimpleCookingRecipeBuilder.campfireCooking(
                        Ingredient.of(Items.PUMPKIN_SEEDS), RecipeCategory.FOOD, ModItems.TOASTED_PUMPKIN_SEEDS,
                        0.35f, 600
                )
                .unlockedBy("has_pumpkin_seeds", has(Items.PUMPKIN_SEEDS))
                .save(recipeOutput, "toasted_pumpkin_seeds_from_campfire_cooking");

        // Misc

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.APPLE_CORE.get(), 1)
                .requires(Items.APPLE)
                .unlockedBy("has_apple", has(Items.APPLE))
                .save(recipeOutput);

    }

}
