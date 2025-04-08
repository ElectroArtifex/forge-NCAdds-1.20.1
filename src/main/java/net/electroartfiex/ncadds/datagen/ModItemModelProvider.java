package net.electroartfiex.ncadds.datagen;

import net.electroartfiex.ncadds.NCAdds;
import net.electroartfiex.ncadds.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output,  ExistingFileHelper existingFileHelper) {
        super(output, NCAdds.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.HEATSTONE);
        simpleItem(ModItems.FIRE_OPAL);
        simpleItem(ModItems.HEATSTONE_AMULET);
        simpleItem(ModItems.FIRE_OPAL_AMULET);


    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(NCAdds.MOD_ID, "item/" + item.getId().getPath()));
    }
}
