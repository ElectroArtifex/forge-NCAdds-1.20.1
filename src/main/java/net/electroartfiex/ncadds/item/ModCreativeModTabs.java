package net.electroartfiex.ncadds.item;

import net.electroartfiex.ncadds.NCAdds;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NCAdds.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NCADDS_TAB = CREATIVE_MODE_TABS.register( "ncadds_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FIRE_OPAL.get()))
                    .title(Component.translatable("creativetab.ncadds_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.HEATSTONE.get());
                        pOutput.accept(ModItems.HEATSTONE_AMULET.get());
                        pOutput.accept(ModItems.FIRE_OPAL.get());
                        pOutput.accept(ModItems.FIRE_OPAL_AMULET.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
