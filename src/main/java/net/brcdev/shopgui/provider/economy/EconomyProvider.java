package net.brcdev.shopgui.provider.economy;

import org.bukkit.entity.Player;

public abstract class EconomyProvider {

  protected String currencyPrefix = "";
  protected String currencySuffix = "";

  /**
   * Returns currency prefix used in all messages, lores etc.
   *
   * @return currency name
   */
  public String getCurrencyPrefix() {
    return this.currencyPrefix;
  }

  public void setCurrencyPrefix(String currencyPrefix) {
    this.currencyPrefix = currencyPrefix;
  }

  /**
   * Returns currency suffix used in all messages, lores etc.
   *
   * @return currency name
   */
  public String getCurrencySuffix() {
    return this.currencySuffix;
  }

  public void setCurrencySuffix(String currencySuffix) {
    this.currencySuffix = currencySuffix;
  }

  /**
   * Returns user-friendly name of economy
   *
   * @return economy name
   */
  public abstract String getName();

  /**
   * Gets the money balance of specified player
   *
   * @param player Player to check balance
   * @return money balance
   */
  public abstract double getBalance(Player player);

  /**
   * Adds the specified money amount to player's balance
   *
   * @param player Player whose balance shall be modified
   * @param amount Money amount
   */
  public abstract void deposit(Player player, double amount);

  /**
   * Removes the specified money amount from player's balance
   *
   * @param player Player whose balance shall be modified
   * @param amount Money amount
   */
  public abstract void withdraw(Player player, double amount);

  /**
   * Checks whether player's balance is equal or higher than the specified money amount
   *
   * @param player Player whose balance shall be checked
   * @param amount Amount required from player
   * @return whether player has enough money
   */
  public boolean has(Player player, double amount) {
    return getBalance(player) >= amount;
  }
}
