package net.toxa.bsmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.toxa.bsmod.BS_mod;
import net.toxa.bsmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BS_mod.MOD_ID);

    public static final RegistryObject<Block> MAP_BOX_BLOCK = registerBlock("map_box_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(5.0F, 1.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAP_GRASS_BLOCK = registerBlock("map_grass_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).strength(5.0F, 1.0F).sound(SoundType.GRASS).noCollission()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
