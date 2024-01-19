package pokergame;

import java.util.Random;
import java.util.Arrays;

public class Deck {

  private Card[] deck = new Card[52];
  public final int DECK_SIZE = 52;

  public Deck() {
    int counter = 0;

    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        deck[counter] = new Card(suit, rank);
        counter ++;
      }
    }
  }

  public Card[] getDeck() {
    return deck;
  }

  public void shuffleCards() {
    Random random = new Random();

    for (int i = DECK_SIZE-1; i > 0; i--) {

      int randomInd = random.nextInt(i);

      Card tempCard = deck[i];
      deck[i] = deck[randomInd];
      deck[randomInd] = tempCard;
    }
  }

  public static void main(String [] args) {
    Deck deck = new Deck();
    
    Card[] originalDeck = deck.getDeck();
    // Shuffle cards to reduce likelihood that cards are in the same order;
    deck.shuffleCards();

    Card[] newDeck = deck.getDeck();
    System.out.println(Arrays.toString(originalDeck));

    System.out.println(Arrays.toString(newDeck));

  }

}
