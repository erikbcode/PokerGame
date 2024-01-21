package pokergame;

import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Deck {

  private List<Card> cards = new ArrayList<Card>();
  public final int DECK_SIZE = 52;

  public Deck() {
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        cards.add(new Card(suit, rank));
      }
    }
  }

  public List<Card> getDeck() {
    return cards;
  }

  public void shuffleCards() {
    Collections.shuffle(cards);
  }

  public Card drawCard() {
    return this.cards.remove(0);
  }

}
