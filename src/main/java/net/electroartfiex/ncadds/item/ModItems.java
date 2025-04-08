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
    public static final RegistryObject<Item> FIREBIRD_FEATHER = ITEMS.register("firebird_feather",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIREBIRD_TEAR = ITEMS.register("firebird_tear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIREBIRD_ASHES = ITEMS.register("firebird_ashes",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUL_FIREBIRD_FEATHER = ITEMS.register("soul_firebird_feather",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUL_FIREBIRD_ASHES = ITEMS.register("soul_firebird_ashes",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEATSTONE = ITEMS.register("heatstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEATSTONE_AMULET = ITEMS.register("heatstone_amulet",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }
}
