package pokergame;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class DeckTest {
  

  @Test
  public void testDeckInitialization() {
    Deck deck = new Deck();
    
    List<Card> cards = deck.getDeck();

    Assert.assertEquals(cards.size(), 52);
    assertUniqueCards(cards);
  }

  private void assertUniqueCards(List<Card> cards) {
    Set<Card> uniqueCards = new HashSet<Card>(cards);
    Assert.assertEquals(uniqueCards.size(), cards.size(), "Deck should have all unique cards");
  }

  @Test
  public void testShuffle() {
    Deck deck = new Deck();
    
    List<Card> originalDeck = new ArrayList<>(deck.getDeck());
    // Shuffle cards twice to reduce likelihood that cards are in the same order;
    deck.shuffleCards();
    deck.shuffleCards();

    List<Card> newDeck = new ArrayList<>(deck.getDeck());
    Assert.assertEquals(newDeck.size(), 52, "Deck should contain 52 cards after shuffling");
    Assert.assertFalse(originalDeck.equals(newDeck), "Deck should be different after shuffling");
    assertUniqueCards(newDeck);
  }

}