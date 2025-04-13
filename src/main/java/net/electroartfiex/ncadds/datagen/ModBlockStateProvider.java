package net.electroartfiex.ncadds.datagen;

import net.electroartfiex.ncadds.NCAdds;
import net.electroartfiex.ncadds.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NCAdds.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.HEATSTONE_BLOCK);
        blockWithItem(ModBlocks.FIRE_OPAL_BLOCK);
        blockWithItem(ModBlocks.MITHRIL_FIRE_OPAL_BLOCK);
        blockWithItem(ModBlocks.CREATIVE_HEAT_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}