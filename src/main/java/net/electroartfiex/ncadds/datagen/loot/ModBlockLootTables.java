package net.electroartfiex.ncadds.datagen.loot;

import net.electroartfiex.ncadds.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.HEATSTONE_BLOCK.get());
        this.dropSelf(ModBlocks.FIRE_OPAL_BLOCK.get());
        this.dropSelf(ModBlocks.MITHRIL_FIRE_OPAL_BLOCK.get());
        this.dropSelf(ModBlocks.ETERNAL_ICE_SCULPTURE.get());
        this.dropSelf(ModBlocks.GRACE_STATUE_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
