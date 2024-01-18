package net.byteme.item;

import net.byteme.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
//    Variable initializer
    public static final Item TURQUOISE;



//    Item Initializer
    static {
        TURQUOISE = registerItem("turquoise", new Item(new Item.Settings()));
    }

//    register items to fabric/mc
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM,
                new Identifier(TutorialMod.MOD_ID, name),
                item);
    }
    private static void addItemsToIngredentsTab(FabricItemGroupEntries entries){
        entries.add(TURQUOISE);
    }
    public static void register(){
        TutorialMod.LOGGER.info("Registering mod items"); // Logger stuff
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredentsTab);

    }
}
