package net.toxa.bsmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.toxa.bsmod.BS_mod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BS_mod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BS_WEAPONS_TAB = CREATIVE_MODE_TABS.register("bs_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STARDROP.get()))
                    .title(Component.translatable("creativetab.bs_mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STARDROP.get());
                        output.accept(ModItems.SHELLYATT.get());
                        output.accept(ModItems.SHELLYULT.get());



                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
