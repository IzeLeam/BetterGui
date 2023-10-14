package fr.izeleam.utils.bettergui;

import fr.izeleam.utils.bettergui.item.Button;
import fr.izeleam.utils.bettergui.item.ItemManager;
import fr.izeleam.utils.bettergui.menus.MenuManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BetterGui extends JavaPlugin {

  private static BetterGui Instance;

  public static BetterGui getInstance() {
    return Instance;
  }

  @Override
  public void onEnable() {
    Bukkit.getLogger().info("BetterGui enabling");
    Instance = this;
  }

  @Override
  public void onDisable() {
      // Plugin shutdown logic
  }

  public static ItemManager getItemManager() {
    return ItemManager.getInstance();
  }

  public static MenuManager getMenuManager() {
    return MenuManager.getInstance();
  }
}
