package fr.izeleam.utils.bettergui;

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
    Bukkit.getLogger().info("BetterGUI enabling");
    Instance = this;

    Bukkit.getLogger().info("Loading managers...");
    itemManager = new ItemManager();
    menuManager = new MenuManager();
    Bukkit.getLogger().info("Managers loaded successfully");
  }

  @Override
  public void onDisable() {
      // Plugin shutdown logic
  }

  private static ItemManager itemManager;
  private static MenuManager menuManager;

  public static ItemManager getItemManager() {
    return itemManager;
  }

  public static MenuManager getMenuManager() {
    return menuManager;
  }
}
