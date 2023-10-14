package fr.izeleam.utils.bettergui.tests;

import fr.izeleam.utils.bettergui.BetterGui;
import fr.izeleam.utils.bettergui.item.BetterItem;
import fr.izeleam.utils.bettergui.item.ItemManager;
import org.bukkit.Material;

public class coucou {

  public coucou() {

    ItemManager itemManager = BetterGui.getItemManager();
    BetterItem item = ItemManager.createItem(Material.ITEM_FRAME);

  }


}
