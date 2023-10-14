package fr.izeleam.utils.bettergui.item;

import java.util.Set;
import org.bukkit.Instrument;
import org.bukkit.inventory.ItemStack;

public class Button {

  private final ItemStack itemStack;
  private ButtonAction buttonAction;
  private Set<Integer> slots;

  public Button(ItemStack itemStack) {
    this.itemStack = itemStack;
    this.buttonAction = null;
  }

  public void setButtonAction(ButtonAction buttonAction) {
    this.buttonAction = buttonAction;
  }

  public ItemStack getItemStack() {
    return this.itemStack;
  }

  public ButtonAction getButtonAction() {
    return this.buttonAction;
  }

  public Set<Integer> getSlots() {
    return this.slots;
  }

}
