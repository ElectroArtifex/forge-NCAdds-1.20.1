package net.electroartfiex.ncadds.item;

import net.electroartfiex.ncadds.NCAdds;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NCAdds.MOD_ID);
    public static final RegistryObject<Item> HEATSTONE = ITEMS.register("heatstone",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GLACIAL_AQUAMARINE = ITEMS.register("glacial_aquamarine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRE_OPAL = ITEMS.register("fire_opal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRE_OPAL_AMULET = ITEMS.register("fire_opal_amulet",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GLACIAL_AQUAMARINE_AMULET = ITEMS.register("glacial_aquamarine_amulet",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HEATSTONE_AMULET = ITEMS.register("heatstone_amulet",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> EIS_AMULET = ITEMS.register("eis_amulet",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }
}
