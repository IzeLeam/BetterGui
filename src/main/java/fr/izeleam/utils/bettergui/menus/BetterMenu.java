package fr.izeleam.utils.bettergui.menus;

import fr.izeleam.utils.bettergui.BetterGui;
import fr.izeleam.utils.bettergui.item.BetterItem;
import fr.izeleam.utils.bettergui.item.Button;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class BetterMenu implements Listener {

  private Inventory inventory;
  private final String name;
  private final Map<Integer, Button> buttons = new HashMap<>();
  private final List<List<String>> lines = new ArrayList<>();

  public BetterMenu(String name) {
    this.name = name;
  }

  public void addLine(List<String> symbols) {
    assert symbols.size() == 9;
    assert lines.size() < 6;
    lines.add(symbols);
    this.inventory = Bukkit.createInventory(null, this.lines.size() * 9, this.name);
  }

  public void addLine(String... line) {
    this.addLine(Arrays.stream(line).toList());
  }

  public void addLine() {
    this.addLine(Arrays.asList("", "", "", "", "", "", "", "", ""));
  }

  public void setButton(String symbol, Button button) {
    int index = 0;
    for (List<String> line : this.lines) {
      for (String reference : line) {
        if (reference.equals(symbol)) {
          inventory.setItem(index, button.getItemStack());
          buttons.put(index, button);
        }
        index++;
      }
    }
  }

  public void setButton(String symbol, BetterItem item) {
    setButton(symbol, item.asButton());
  }

  public void setButtonList(String symbol, List<Button> buttons) {
    buttons.forEach(button -> setButton(symbol, button));
  }

  public void open(Player player) {
    assert !this.lines.isEmpty();
    Bukkit.getPluginManager().registerEvents(this, BetterGui.getInstance());
    player.openInventory(this.inventory);
  }

  @EventHandler
  public void onClose(InventoryCloseEvent event) {
    if (this.inventory.getViewers().contains(event.getPlayer()) && event.getInventory().getViewers().size() < 2) {
      HandlerList.unregisterAll(this);
    }
  }

  @EventHandler
  public void onInventoryClick(InventoryClickEvent event) {
    if (event.getClickedInventory() == null) {
      return;
    }
    if (!event.getClickedInventory().getType().equals(InventoryType.PLAYER)) {
      event.setCancelled(true);
      return;
    }

    Player player = (Player) event.getWhoClicked();
    if (!event.getInventory().getViewers().contains(player)) {
      return;
    }

    Button button = buttons.get(event.getSlot());
    if (button == null) {
      return;
    }

    button.getButtonAction().onClick(player);
    if (event.getClick().isLeftClick()) {
      button.getButtonAction().onClick(player);
    } else {
      button.getButtonAction().onRightClick(player);
    }

    event.setCancelled(true);
  }
}
