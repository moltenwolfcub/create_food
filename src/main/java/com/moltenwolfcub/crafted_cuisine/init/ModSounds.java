package com.moltenwolfcub.crafted_cuisine.init;

import com.moltenwolfcub.crafted_cuisine.CraftedCuisine;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CraftedCuisine.MODID);
    
    public static final RegistryObject<SoundEvent> BLOW_TORCH_USE = SOUNDS.register("item.blow_torch.use", 
        ()-> new SoundEvent(new ResourceLocation(CraftedCuisine.MODID, "item.blow_torch.use")));
    
}