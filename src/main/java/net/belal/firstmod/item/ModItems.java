package net.belal.firstmod.item;

import net.belal.firstmod.MyFirstMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import net.minecraft.registry.Registry;

public class ModItems {
        public static Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
        public static Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));


    private static Item registerItem(String name,Item Item){
        return Registry.register(Registries.ITEM, Identifier.of(MyFirstMod.MOD_ID,name),Item);
    }

    public static void registerModItems(){
        MyFirstMod.LOGGER.info("Registering Mod Items for " + MyFirstMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
        });
    }
}
