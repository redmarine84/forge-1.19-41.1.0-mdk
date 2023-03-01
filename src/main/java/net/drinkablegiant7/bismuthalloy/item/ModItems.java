package net.drinkablegiant7.bismuthalloy.item;

import net.drinkablegiant7.bismuthalloy.BismuthAlloy;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BismuthAlloy.MOD_ID);
    public static final RegistryObject<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BISMUTH_ORE = ITEMS.register("bismuth_ore",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> BISMUTH_BRONZE = ITEMS.register("bismuth_bronze",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
