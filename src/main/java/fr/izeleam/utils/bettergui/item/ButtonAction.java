package fr.izeleam.utils.bettergui.item;

import org.bukkit.entity.Player;

public interface ButtonAction {

  default void onClick(final Player player) {
  }

  default void onRightClick(final Player player) {
  }

  default void onLeftClick(final Player player) {
  }

}
