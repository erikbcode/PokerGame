package pokergame;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class DeckTest {
  

  @Test
  public void testDeckInitialization() {
    Deck deck = new Deck();
    
    Card[] cards = deck.getDeck();

    Assert.assertEquals(cards.length, 52);
    assertUniqueCards(cards);
  }

  private void assertUniqueCards(Card[] cards) {
    Set<Card> uniqueCards = new HashSet<Card>(Arrays.asList(cards));
    Assert.assertEquals(uniqueCards.size(), cards.length, "Deck should have all unique cards");
  }

  @Test
  public void testShuffle() {
    Deck deck = new Deck();
    
    Card[] originalDeck = Arrays.copyOf(deck.getDeck(), deck.DECK_SIZE);
    // Shuffle cards twice to reduce likelihood that cards are in the same order;
    deck.shuffleCards();
    deck.shuffleCards();

    Card[] newDeck = Arrays.copyOf(deck.getDeck(), deck.DECK_SIZE);
    Assert.assertEquals(newDeck.length, 52, "Deck should contain 52 cards after shuffling");
    Assert.assertFalse(Arrays.equals(originalDeck, newDeck), "Deck should be different after shuffling");
    assertUniqueCards(newDeck);
  }

}