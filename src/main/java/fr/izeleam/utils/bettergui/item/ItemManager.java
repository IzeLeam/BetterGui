package fr.izeleam.utils.bettergui.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ItemManager {

  private static ItemManager itemManager;

  public static ItemManager getInstance() {
    if (itemManager == null) {
      itemManager = new ItemManager();
    }
    return itemManager;
  }

  public static BetterItem createItem(ItemStack itemStack) {
    return new BetterItem(itemStack);
  }

  public static BetterItem createItem(Material material) {
    return new BetterItem(material);
  }

  public static BetterItem createItem(Material material, int amount) {
    return new BetterItem(material, amount);
  }
}
