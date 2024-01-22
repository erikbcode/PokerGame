package pokergame;

import pokergame.exceptions.IllegalChipAddException;
import pokergame.exceptions.InsufficientBankrollException;
import pokergame.exceptions.InsufficientChipStackException;

public class Player {

  private String name;
  private int chipCount;
  private Table table;
  private Hand hand;

  public Player(int money) {
    this.chipCount = money;
    this.table = null;
    this.hand = new Hand();
  }

  public void addChips(int chips) {
    this.chipCount += chips;
  }

  public void validateChipAdd(int chips) throws IllegalChipAddException, InsufficientBankrollException {
    if (table == null) {
      throw new IllegalChipAddException("Player cannot add chips if they are not at a table");
    }

    if (chipCount + chips > table.getMaxChips()) {
      throw new IllegalChipAddException("Cannot add chips above the max starting buy-in");
    }
  }

  public void bet(int betAmount) throws InsufficientChipStackException {
    if (betAmount > chipCount) {
      StringBuilder str = new StringBuilder();
      str.append("Player does not have enough chips to bet");
      throw new InsufficientChipStackException(str.toString());
    }
    this.chipCount -= betAmount;
  }

  public int getChipCount() {
    return this.chipCount;
  }

  public Hand getHand() {
    return this.hand;
  }

  public void fold() {
    this.hand.clearHand();
  }

  public String getName() {
    return this.name;
  }

  public Table getTable() {
    return this.table;
  }
}