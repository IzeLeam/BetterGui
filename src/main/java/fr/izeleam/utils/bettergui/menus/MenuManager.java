package fr.izeleam.utils.bettergui.menus;

public class MenuManager {

  private static MenuManager menuManager;

  public static MenuManager getInstance() {
    if (menuManager == null) {
      menuManager = new MenuManager();
    }
    return menuManager;
  }

}
