package fr.izeleam.utils.bettergui.item;

import fr.izeleam.utils.bettergui.BetterGui;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class ItemManager {

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
