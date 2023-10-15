package fr.izeleam.utils.bettergui.menus;

import java.awt.Menu;

public class MenuManager {

  public static BetterMenu createMenu(String name) {
    return new BetterMenu(name);
  }

}
