package net.toxa.bsmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.toxa.bsmod.BS_mod;
import net.toxa.bsmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BS_mod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BS_WEAPONS_TAB = CREATIVE_MODE_TABS.register("bs_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STARRDROP.get()))
                    .title(Component.translatable("creativetab.bs_mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STARRDROP.get());
                        output.accept(ModItems.COIN.get());
                        output.accept(ModItems.POWER_POINT.get());
                        output.accept(ModItems.CREDIT.get());
                        output.accept(ModItems.BLING.get());
                        output.accept(ModItems.GEM.get());
                        output.accept(ModBlocks.MAP_BOX_BLOCK.get());
                        output.accept(ModBlocks.MAP_GRASS_BLOCK.get());
                        output.accept(ModItems.SHELLYATT.get());
                        output.accept(ModItems.SHELLYULT.get());



                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
