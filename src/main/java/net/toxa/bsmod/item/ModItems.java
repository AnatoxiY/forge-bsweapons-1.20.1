package net.toxa.bsmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.toxa.bsmod.BS_mod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BS_mod.MOD_ID);

    public static final RegistryObject<Item> STARDROP = ITEMS.register("stardrop",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHELLYATT = ITEMS.register("shelly_attack",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHELLYULT = ITEMS.register("shelly_ultimate",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
