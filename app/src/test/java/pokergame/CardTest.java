package pokergame;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CardTest {
  
  Card aceOfSpades;

  @BeforeClass
  public void setUp() {
    aceOfSpades = new Card(Suit.SPADE, Rank.ACE);
  }
  
  @Test 
  public void testGetSuitValid() {
    Assert.assertEquals(aceOfSpades.getSuit(), Suit.SPADE);
  }

  @Test
  public void testGetSuitInvalid() {
    Assert.assertNotEquals(aceOfSpades.getSuit(), Suit.CLUB, "Invalid suit not detected");
    Assert.assertNotEquals(aceOfSpades.getSuit(), Suit.HEART, "Invalid suit not detected");
    Assert.assertNotEquals(aceOfSpades.getSuit(), Suit.DIAMOND, "Invalid suit not detected");
  }

  @Test
  public void testGetRankValid() {
    Assert.assertEquals(aceOfSpades.getRank(), Rank.ACE);
  }

  @Test
  public void testGetRankInvalid() {
    Assert.assertNotEquals(aceOfSpades.getRank(), Rank.TWO, "Invalid rank not detected");
    Assert.assertNotEquals(aceOfSpades.getRank(), Rank.THREE, "Invalid rank not detected");
    Assert.assertNotEquals(aceOfSpades.getRank(), Rank.FOUR, "Invalid rank not detected");
    Assert.assertNotEquals(aceOfSpades.getRank(), Rank.FIVE, "Invalid rank not detected");
    Assert.assertNotEquals(aceOfSpades.getRank(), Rank.SIX, "Invalid rank not detected");
    Assert.assertNotEquals(aceOfSpades.getRank(), Rank.SEVEN, "Invalid rank not detected");
    Assert.assertNotEquals(aceOfSpades.getRank(), Rank.EIGHT, "Invalid rank not detected");
    Assert.assertNotEquals(aceOfSpades.getRank(), Rank.NINE, "Invalid rank not detected");
    Assert.assertNotEquals(aceOfSpades.getRank(), Rank.TEN, "Invalid rank not detected");
    Assert.assertNotEquals(aceOfSpades.getRank(), Rank.JACK, "Invalid rank not detected");
    Assert.assertNotEquals(aceOfSpades.getRank(), Rank.QUEEN, "Invalid rank not detected");
    Assert.assertNotEquals(aceOfSpades.getRank(), Rank.KING, "Invalid rank not detected");
  }

  @Test(expectedExceptions = IllegalArgumentException.class) 
  public void testInvalidInitializationNullSuit() {
    new Card(null, Rank.ACE);
    System.out.println("made it");
  }

  @Test(expectedExceptions = IllegalArgumentException.class) 
  public void testInvalidInitializationNullRank() {
    new Card(Suit.SPADE, null);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInvalidInitializationNullSuitAndRank() {
    new Card(null, null);
  }
  
}
