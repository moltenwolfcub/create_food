package com.moltenwolfcub.crafted_cuisine.data;

import com.moltenwolfcub.crafted_cuisine.data.language.EnUsLanguageProvider;
import com.moltenwolfcub.crafted_cuisine.data.loot.ModLootTableProvider;
import com.moltenwolfcub.crafted_cuisine.data.recipe.ModRecipeProvider;
import com.moltenwolfcub.crafted_cuisine.data.world.ModConfiguredFeatureProvider;
import com.moltenwolfcub.crafted_cuisine.data.world.ModPlacedFeatureProvider;
import com.moltenwolfcub.crafted_cuisine.data.world.ModProcessorListProvider;
import com.moltenwolfcub.crafted_cuisine.data.world.ModStructureSetProvider;
import com.moltenwolfcub.crafted_cuisine.data.world.ModStructureProvider;
import com.moltenwolfcub.crafted_cuisine.data.world.ModTemplatePoolProvider;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableProvider;

public class DataGenerators implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModTagProvider.ModItemTagProvider::new);
        pack.addProvider(ModTagProvider.ModBlockTagsProvider::new);
        pack.addProvider(ModTagProvider.ModFluidTagProvider::new);
        pack.addProvider(ModTagProvider.ModBiomeTagProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider((FabricDataGenerator.Pack.Factory<LootTableProvider>)ModLootTableProvider::create);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModWorldGenProvider::new);
        pack.addProvider(EnUsLanguageProvider::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
        registryBuilder.add(Registries.CONFIGURED_FEATURE, ctx -> ModConfiguredFeatureProvider.bootstrap(ctx));
        registryBuilder.add(Registries.PLACED_FEATURE, ctx -> ModPlacedFeatureProvider.bootstrap(ctx));
        registryBuilder.add(Registries.PROCESSOR_LIST, ctx -> ModProcessorListProvider.bootstrap(ctx));
        registryBuilder.add(Registries.TEMPLATE_POOL, ctx -> ModTemplatePoolProvider.bootstrap(ctx));
        registryBuilder.add(Registries.STRUCTURE, ctx -> ModStructureProvider.bootstrap(ctx));
        registryBuilder.add(Registries.STRUCTURE_SET, ctx -> ModStructureSetProvider.bootstrap(ctx));
    }
}
