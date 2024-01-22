package pokergame;

import java.util.List;

import pokergame.exceptions.MisdealException;

import java.util.ArrayList;

public class Hand {
  
  private List<Card> cards;

  public Hand() {
    cards = new ArrayList<Card>();
  }

  public void clearHand() {
    this.cards.clear();
  }

  public void addCard(Card card) {
    if (cards.size() >= 2) {
      throw new MisdealException("Player cannot have more than two cards");
    }

    this.cards.add(card);
  }

  public String toString() {
    StringBuilder str = new StringBuilder();
    str.append(this.cards.get(0).toString());
    str.append(", ");
    str.append(this.cards.get(1)).toString();
    return str.toString();
  }

  public List<Card> getCards() {
    return this.cards;
  }
}
