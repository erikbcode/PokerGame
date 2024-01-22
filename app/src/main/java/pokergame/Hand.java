package pokergame;

import java.util.List;

import pokergame.exceptions.MisdealException;

import java.util.ArrayList;

public class Hand {
  
  private List<Card> hand;

  public Hand() {
    hand = new ArrayList<Card>();
  }

  public void clearHand() {
    this.hand.clear();
  }

  public void addCard(Card card) {
    if (hand.size() >= 2) {
      throw new MisdealException("Player cannot have more than two cards");
    }

    this.hand.add(card);
  }

  public String toString() {
    StringBuilder str = new StringBuilder();
    str.append(this.hand.get(0).toString());
    str.append(", ");
    str.append(this.hand.get(1)).toString();
    return str.toString();
  }

  public List<Card> getCards() {
    return this.hand;
  }
}
