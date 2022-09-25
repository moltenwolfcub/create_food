package com.moltenwolfcub.crafted_cuisine.datagen;

import com.moltenwolfcub.crafted_cuisine.CraftedCuisine;
import com.moltenwolfcub.crafted_cuisine.init.AllBlockItems;
import com.moltenwolfcub.crafted_cuisine.init.AllBlocks;
import com.moltenwolfcub.crafted_cuisine.init.AllFluids;
import com.moltenwolfcub.crafted_cuisine.init.AllItems;
import com.moltenwolfcub.crafted_cuisine.init.AllTags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.FluidTags;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("unchecked")
public class ModTagProvider{
    
    public static class ModItemTagProvider extends FabricTagProvider<Item> {

        public ModItemTagProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator, Registry.ITEM, "items/", "Item Tags: " + CraftedCuisine.MODID);
        }

        @Override
        public void generateTags() {
            addModTags();
            addVanillaTags();
            addForgeTags();
        }

        public void addTags(TagKey<Item> mainTag, TagKey<Item>... addingTags) {
            FabricTagBuilder<Item> tagBuilder = getOrCreateTagBuilder(mainTag);

            for (TagKey<Item> tag : addingTags) {
                tagBuilder.addTag(tag);
            }
        }

        private void addModTags() {
            getOrCreateTagBuilder(AllTags.Items.CINNAMON_LOGS).add(
                AllBlockItems.CINNAMON_LOG,
                AllBlockItems.CINNAMON_WOOD,
                AllBlockItems.STRIPPED_CINNAMON_LOG,
                AllBlockItems.STRIPPED_CINNAMON_WOOD
            );
            getOrCreateTagBuilder(AllTags.Items.POLISHED_BLACKSTONE).add(
                Items.POLISHED_BLACKSTONE
            );
        }
        
        private void addVanillaTags() {
            getOrCreateTagBuilder(ItemTags.LEAVES).add(AllBlockItems.CINNAMON_LEAVES);
            getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN).addTag(AllTags.Items.CINNAMON_LOGS);
            getOrCreateTagBuilder(ItemTags.LOGS).addTag(AllTags.Items.CINNAMON_LOGS);
            getOrCreateTagBuilder(ItemTags.PLANKS).add(AllBlockItems.CINNAMON_PLANKS);
            getOrCreateTagBuilder(ItemTags.SAPLINGS).add(AllBlockItems.CINNAMON_SAPLING);
            getOrCreateTagBuilder(ItemTags.SIGNS).add(AllItems.CINNAMON_SIGN);
            getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS).add(AllBlockItems.CINNAMON_BUTTON);
            getOrCreateTagBuilder(ItemTags.WOODEN_DOORS).add(AllBlockItems.CINNAMON_DOOR);
            getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES).add(AllBlockItems.CINNAMON_PRESSURE_PLATE);
            getOrCreateTagBuilder(ItemTags.WOODEN_SLABS).add(AllBlockItems.CINNAMON_SLAB);
            getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS).add(AllBlockItems.CINNAMON_STAIRS);
            getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS).add(AllBlockItems.CINNAMON_TRAPDOOR);
        }
    
        private void addForgeTags() {

            getOrCreateTagBuilder(AllTags.Items.PAPER_PULP).add(
                AllItems.PAPER_PULP
            );

            addTags(AllTags.Items.BARK,
                AllTags.Items.ACACIA_BARK,
                AllTags.Items.BIRCH_BARK,
                AllTags.Items.CINNAMON_BARK,
                AllTags.Items.CRIMSON_BARK,
                AllTags.Items.DARK_OAK_BARK,
                AllTags.Items.JUNGLE_BARK,
                AllTags.Items.OAK_BARK,
                AllTags.Items.SPRUCE_BARK,
                AllTags.Items.WARPED_BARK
            );
            getOrCreateTagBuilder(AllTags.Items.BARK).add(
                AllItems.UNKNOWN_BARK
            );

            getOrCreateTagBuilder(AllTags.Items.ACACIA_BARK).add(
                AllItems.ACACIA_BARK
            );
            getOrCreateTagBuilder(AllTags.Items.BIRCH_BARK).add(
                AllItems.BIRCH_BARK
            );
            getOrCreateTagBuilder(AllTags.Items.CINNAMON_BARK).add(
                AllItems.CINNAMON_BARK
            );
            getOrCreateTagBuilder(AllTags.Items.CRIMSON_BARK).add(
                AllItems.CRIMSON_BARK
            );
            getOrCreateTagBuilder(AllTags.Items.DARK_OAK_BARK).add(
                AllItems.DARK_OAK_BARK
            );
            getOrCreateTagBuilder(AllTags.Items.JUNGLE_BARK).add(
                AllItems.JUNGLE_BARK
            );
            getOrCreateTagBuilder(AllTags.Items.OAK_BARK).add(
                AllItems.OAK_BARK
            );
            getOrCreateTagBuilder(AllTags.Items.SPRUCE_BARK).add(
                AllItems.SPRUCE_BARK
            );
            getOrCreateTagBuilder(AllTags.Items.WARPED_BARK).add(
                AllItems.WARPED_BARK
            );

            addTags(AllTags.Items.ROSE_CARPETS,
                AllTags.Items.RED_ROSE_CARPETS,
                AllTags.Items.ORANGE_ROSE_CARPETS,
                AllTags.Items.YELLOW_ROSE_CARPETS,
                AllTags.Items.LIME_ROSE_CARPETS,
                AllTags.Items.GREEN_ROSE_CARPETS,
                AllTags.Items.BLUE_ROSE_CARPETS,
                AllTags.Items.CYAN_ROSE_CARPETS,
                AllTags.Items.LIGHT_BLUE_ROSE_CARPETS,
                AllTags.Items.PURPLE_ROSE_CARPETS,
                AllTags.Items.MAGENTA_ROSE_CARPETS,
                AllTags.Items.PINK_ROSE_CARPETS,
                AllTags.Items.BLACK_ROSE_CARPETS,
                AllTags.Items.GRAY_ROSE_CARPETS,
                AllTags.Items.LIGHT_GRAY_ROSE_CARPETS,
                AllTags.Items.WHITE_ROSE_CARPETS,
                AllTags.Items.BROWN_ROSE_CARPETS
            );
            getOrCreateTagBuilder(AllTags.Items.RED_ROSE_CARPETS).add(AllBlockItems.RED_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.ORANGE_ROSE_CARPETS).add(AllBlockItems.ORANGE_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.YELLOW_ROSE_CARPETS).add(AllBlockItems.YELLOW_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.LIME_ROSE_CARPETS).add(AllBlockItems.LIME_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.GREEN_ROSE_CARPETS).add(AllBlockItems.GREEN_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.BLUE_ROSE_CARPETS).add(AllBlockItems.BLUE_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.CYAN_ROSE_CARPETS).add(AllBlockItems.CYAN_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.LIGHT_BLUE_ROSE_CARPETS).add(AllBlockItems.LIGHT_BLUE_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.PURPLE_ROSE_CARPETS).add(AllBlockItems.PURPLE_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.MAGENTA_ROSE_CARPETS).add(AllBlockItems.MAGENTA_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.PINK_ROSE_CARPETS).add(AllBlockItems.PINK_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.BLACK_ROSE_CARPETS).add(AllBlockItems.BLACK_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.GRAY_ROSE_CARPETS).add(AllBlockItems.GRAY_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.LIGHT_GRAY_ROSE_CARPETS).add(AllBlockItems.LIGHT_GRAY_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.WHITE_ROSE_CARPETS).add(AllBlockItems.WHITE_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Items.BROWN_ROSE_CARPETS).add(AllBlockItems.BROWN_ROSE_CARPET);

            addTags(AllTags.Items.PETALS,
                AllTags.Items.RED_PETALS,
                AllTags.Items.ORANGE_PETALS,
                AllTags.Items.YELLOW_PETALS,
                AllTags.Items.LIME_PETALS,
                AllTags.Items.GREEN_PETALS,
                AllTags.Items.BLUE_PETALS,
                AllTags.Items.CYAN_PETALS,
                AllTags.Items.LIGHT_BLUE_PETALS,
                AllTags.Items.PURPLE_PETALS,
                AllTags.Items.MAGENTA_PETALS,
                AllTags.Items.PINK_PETALS,
                AllTags.Items.BLACK_PETALS,
                AllTags.Items.GRAY_PETALS,
                AllTags.Items.LIGHT_GRAY_PETALS,
                AllTags.Items.WHITE_PETALS,
                AllTags.Items.BROWN_PETALS
            );
            getOrCreateTagBuilder(AllTags.Items.RED_PETALS).add(AllItems.RED_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.ORANGE_PETALS).add(AllItems.ORANGE_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.YELLOW_PETALS).add(AllItems.YELLOW_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.LIME_PETALS).add(AllItems.LIME_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.GREEN_PETALS).add(AllItems.GREEN_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.BLUE_PETALS).add(AllItems.BLUE_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.CYAN_PETALS).add(AllItems.CYAN_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.LIGHT_BLUE_PETALS).add(AllItems.LIGHT_BLUE_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.PURPLE_PETALS).add(AllItems.PURPLE_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.MAGENTA_PETALS).add(AllItems.MAGENTA_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.PINK_PETALS).add(AllItems.PINK_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.BLACK_PETALS).add(AllItems.BLACK_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.GRAY_PETALS).add(AllItems.GRAY_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.LIGHT_GRAY_PETALS).add(AllItems.LIGHT_GRAY_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.WHITE_PETALS).add(AllItems.WHITE_ROSE_PETAL);
            getOrCreateTagBuilder(AllTags.Items.BROWN_PETALS).add(AllItems.BROWN_ROSE_PETAL);


            getOrCreateTagBuilder(AllTags.Items.EGG_YOLK).add(AllItems.EGG_YOLK);
            getOrCreateTagBuilder(AllTags.Items.EGG_WHITE).add(AllItems.EGG_WHITE);
            getOrCreateTagBuilder(AllTags.Items.CINNAMON).add(AllItems.CINNAMON);
            getOrCreateTagBuilder(AllTags.Items.CRUSHED_CINNAMON).add(AllItems.CRUSHED_CINNAMON);
            getOrCreateTagBuilder(AllTags.Items.BLOW_TORCHES).add(AllItems.BLOW_TORCH);
            getOrCreateTagBuilder(AllTags.Items.RAW_MERINGUE).add(AllItems.RAW_MERINGUE);
            getOrCreateTagBuilder(AllTags.Items.MERINGUE).add(AllItems.MERINGUE);
            getOrCreateTagBuilder(AllTags.Items.SUGAR).add(Items.SUGAR);
            getOrCreateTagBuilder(AllTags.Items.BUTTER).add(AllItems.BUTTER);
            getOrCreateTagBuilder(AllTags.Items.CREAM).add(AllItems.CREAM);
            getOrCreateTagBuilder(AllTags.Items.CARAMEL).add(AllItems.CARAMEL);

            getOrCreateTagBuilder(AllTags.Items.CROP_LEMONS).add(AllItems.LEMON);
            getOrCreateTagBuilder(AllTags.Items.FRUIT_LEMONS).add(AllItems.LEMON);
            getOrCreateTagBuilder(AllTags.Items.CROP_LIMES).add(AllItems.LIME);
            getOrCreateTagBuilder(AllTags.Items.FRUIT_LIMES).add(AllItems.LIME);
            getOrCreateTagBuilder(AllTags.Items.CROP_ORANGES).add(AllItems.ORANGE, AllItems.BLOOD_ORANGE);
            getOrCreateTagBuilder(AllTags.Items.FRUIT_ORANGES).add(AllItems.ORANGE, AllItems.BLOOD_ORANGE);

            getOrCreateTagBuilder(AllTags.Items.INGOTS_REINFORCED_BLACKSONE).add(AllItems.REINFORCED_BLACKSTONE_INGOT);
            getOrCreateTagBuilder(AllTags.Items.RODS_REINFORCED_BLACKSONE).add(AllItems.REINFORCED_BLACKSTONE_STICK);
            getOrCreateTagBuilder(AllTags.Items.NUGGETS_REINFORCED_BLACKSONE).add(AllItems.REINFORCED_BLACKSTONE_NUGGET);
            getOrCreateTagBuilder(AllTags.Items.STORAGE_BLOCKS_REINFORCED_BLACKSONE).add(AllBlockItems.REINFORCED_BLACKSTONE);
            // getOrCreateTagBuilder(AllTags.Items.REINFORCED_BLACKSTONE_SHARD).add(AllItems.REINFORCED_BLACKSTONE_SHARD);
        }
    }

    public static class ModBlockTagsProvider extends FabricTagProvider<Block> {

        public ModBlockTagsProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator, Registry.BLOCK, "blocks/", "Block Tags: " + CraftedCuisine.MODID);
        }

        @Override
        public void generateTags() {
            addModTags();
            addVanillaTags();
            addForgeTags();
        }

        public void addTags(TagKey<Block> mainTag, TagKey<Block>... addingTags) {
            FabricTagBuilder<Block> tagBuilder = getOrCreateTagBuilder(mainTag);

            for (TagKey<Block> tag : addingTags) {
                tagBuilder.addTag(tag);
            }
        }

        private void addModTags() {
            getOrCreateTagBuilder(AllTags.Blocks.CINNAMON_LOGS).add(
                AllBlocks.CINNAMON_LOG,
                AllBlocks.CINNAMON_WOOD,
                AllBlocks.STRIPPED_CINNAMON_LOG,
                AllBlocks.STRIPPED_CINNAMON_WOOD
            );
            getOrCreateTagBuilder(AllTags.Blocks.ROSE_CARPET_PLACEABLES).add(
                Blocks.HOPPER
            );
        }

        private void addVanillaTags() {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(
                AllBlocks.AUTO_BLOWTORCH,
                // AllBlocks.CARAMELISER,
                AllBlocks.REINFORCED_BLACKSTONE,
                AllBlocks.REINFORCED_BLACKSTONE_DOOR,
                AllBlocks.REINFORCED_BLACKSTONE_LADDER,
                AllBlocks.REINFORCED_BLACKSTONE_BARS,
                AllBlocks.REINFORCED_BLACKSTONE_TRAPDOOR
            );
            getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE).add(
                AllBlocks.SAW_DUST,
                AllBlocks.REINFORCED_BLACKSTONE_GRAVEL
            );
            getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).add(
                AllBlocks.REINFORCED_BLACKSTONE
            );

            getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE).add(
                AllBlocks.REINFORCED_BLACKSTONE_BARS
            );

            getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(
                AllBlocks.CINNAMON_FENCE_GATE
            );
            getOrCreateTagBuilder(BlockTags.LEAVES).add(
                AllBlocks.CINNAMON_LEAVES
            );
            getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).addTag(
                AllTags.Blocks.CINNAMON_LOGS
            );
            getOrCreateTagBuilder(BlockTags.LOGS).addTag(
                AllTags.Blocks.CINNAMON_LOGS
            );
            getOrCreateTagBuilder(BlockTags.PLANKS).add(
                AllBlocks.CINNAMON_PLANKS
            );
            getOrCreateTagBuilder(BlockTags.SAPLINGS).add(
                AllBlocks.CINNAMON_SAPLING
            );
            getOrCreateTagBuilder(BlockTags.STANDING_SIGNS).add(
                AllBlocks.CINNAMON_SIGN
            );
            getOrCreateTagBuilder(BlockTags.WALL_SIGNS).add(
                AllBlocks.CINNAMON_WALL_SIGN
            );
            getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS).add(
                AllBlocks.CINNAMON_BUTTON
            );
            getOrCreateTagBuilder(BlockTags.WOODEN_DOORS).add(
                AllBlocks.CINNAMON_DOOR
            );
            getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(
                AllBlocks.CINNAMON_FENCE
            );
            getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES).add(
                AllBlocks.CINNAMON_PRESSURE_PLATE
            );
            getOrCreateTagBuilder(BlockTags.WOODEN_SLABS).add(
                AllBlocks.CINNAMON_SLAB
            );
            getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS).add(
                AllBlocks.CINNAMON_STAIRS
            );
            getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS).add(
                AllBlocks.CINNAMON_TRAPDOOR
            );
            getOrCreateTagBuilder(BlockTags.CLIMBABLE).add(
                AllBlocks.REINFORCED_BLACKSTONE_LADDER
            );
            getOrCreateTagBuilder(BlockTags.DOORS).add(
                AllBlocks.REINFORCED_BLACKSTONE_DOOR
            );
            getOrCreateTagBuilder(BlockTags.TRAPDOORS).add(
                AllBlocks.REINFORCED_BLACKSTONE_TRAPDOOR
            );
        }
        
        private void addForgeTags() {
            getOrCreateTagBuilder(AllTags.Blocks.FLOWER_STEMS).add(
                AllBlocks.FLOWER_STEM
            );

            getOrCreateTagBuilder(AllTags.Blocks.RED_ROSE_CARPETS).add(AllBlocks.RED_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.ORANGE_ROSE_CARPETS).add(AllBlocks.ORANGE_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.YELLOW_ROSE_CARPETS).add(AllBlocks.YELLOW_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.LIME_ROSE_CARPETS).add(AllBlocks.LIME_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.GREEN_ROSE_CARPETS).add(AllBlocks.GREEN_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.BLUE_ROSE_CARPETS).add(AllBlocks.BLUE_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.CYAN_ROSE_CARPETS).add(AllBlocks.CYAN_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.LIGHT_BLUE_ROSE_CARPETS).add(AllBlocks.LIGHT_BLUE_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.PURPLE_ROSE_CARPETS).add(AllBlocks.PURPLE_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.MAGENTA_ROSE_CARPETS).add(AllBlocks.MAGENTA_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.PINK_ROSE_CARPETS).add(AllBlocks.PINK_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.BLACK_ROSE_CARPETS).add(AllBlocks.BLACK_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.GRAY_ROSE_CARPETS).add(AllBlocks.GRAY_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.LIGHT_GRAY_ROSE_CARPETS).add(AllBlocks.LIGHT_GRAY_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.WHITE_ROSE_CARPETS).add(AllBlocks.WHITE_ROSE_CARPET);
            getOrCreateTagBuilder(AllTags.Blocks.BROWN_ROSE_CARPETS).add(AllBlocks.BROWN_ROSE_CARPET);

            addTags(AllTags.Blocks.ROSE_CARPETS,
                AllTags.Blocks.RED_ROSE_CARPETS,
                AllTags.Blocks.ORANGE_ROSE_CARPETS,
                AllTags.Blocks.YELLOW_ROSE_CARPETS,
                AllTags.Blocks.LIME_ROSE_CARPETS,
                AllTags.Blocks.GREEN_ROSE_CARPETS,
                AllTags.Blocks.BLUE_ROSE_CARPETS,
                AllTags.Blocks.CYAN_ROSE_CARPETS,
                AllTags.Blocks.LIGHT_BLUE_ROSE_CARPETS,
                AllTags.Blocks.PURPLE_ROSE_CARPETS,
                AllTags.Blocks.MAGENTA_ROSE_CARPETS,
                AllTags.Blocks.PINK_ROSE_CARPETS,
                AllTags.Blocks.BLACK_ROSE_CARPETS,
                AllTags.Blocks.GRAY_ROSE_CARPETS,
                AllTags.Blocks.LIGHT_GRAY_ROSE_CARPETS,
                AllTags.Blocks.WHITE_ROSE_CARPETS,
                AllTags.Blocks.BROWN_ROSE_CARPETS
            );
        }
    }

    public static class ModFluidTagProvider extends FabricTagProvider<Fluid> {

        public ModFluidTagProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator, Registry.FLUID, "fluids/", "Fluid Tags: " + CraftedCuisine.MODID);
        }

        @Override
        public void generateTags() {
            addVanillaTags();
            addForgeTags();
        }

        private void addForgeTags() {
        }

        private void addVanillaTags() {
            getOrCreateTagBuilder(FluidTags.WATER).add(AllFluids.CARAMEL_FLOWING, AllFluids.CARAMEL_STILL);
        }

        
    }

}
