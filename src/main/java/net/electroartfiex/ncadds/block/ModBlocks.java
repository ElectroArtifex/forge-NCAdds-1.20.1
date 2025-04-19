package net.electroartfiex.ncadds.block;

import net.electroartfiex.ncadds.NCAdds;
import net.electroartfiex.ncadds.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NCAdds.MOD_ID);

    public static final RegistryObject<Block> HEATSTONE_BLOCK = registerBlock("heatstone_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)));

    public static final RegistryObject<Block> FIRE_OPAL_BLOCK = registerBlock("fire_opal_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)));

    public static final RegistryObject<Block> MITHRIL_FIRE_OPAL_BLOCK = registerBlock("mithril_fire_opal_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_ORANGE).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops().strength(2.0F, 6.0F)));

    public static final RegistryObject<Block> GRACE_STATUE_BLOCK = registerBlock("grace_statue_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)));

    public static final RegistryObject<Block> ETERNAL_ICE_SCULPTURE = registerBlock("eternal_ice_sculpture",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)));

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
