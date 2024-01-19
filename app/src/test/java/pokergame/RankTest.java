package pokergame;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class RankTest {

  private Rank[] ranks;

  @BeforeTest
  public void setUp() {
    ranks = Rank.values();
  }
  
  @Test
  public void testGetRankNames() {
    Assert.assertEquals(Rank.ACE.getRankName(), "Ace");
    Assert.assertEquals(Rank.TWO.getRankName(), "Two");
    Assert.assertEquals(Rank.THREE.getRankName(), "Three");
    Assert.assertEquals(Rank.FOUR.getRankName(), "Four");
    Assert.assertEquals(Rank.FIVE.getRankName(), "Five");
    Assert.assertEquals(Rank.SIX.getRankName(), "Six");
    Assert.assertEquals(Rank.SEVEN.getRankName(), "Seven");
    Assert.assertEquals(Rank.EIGHT.getRankName(), "Eight");
    Assert.assertEquals(Rank.NINE.getRankName(), "Nine");
    Assert.assertEquals(Rank.TEN.getRankName(), "Ten");
    Assert.assertEquals(Rank.JACK.getRankName(), "Jack");
    Assert.assertEquals(Rank.QUEEN.getRankName(), "Queen");
    Assert.assertEquals(Rank.KING.getRankName(), "King");
  }

  @Test
  public void testEnumValuesLength() {
    Assert.assertEquals(ranks.length, 13);
  }

  @Test
  public void testEnumValues() {
    Assert.assertEquals(ranks[0], Rank.TWO);
    Assert.assertEquals(ranks[1], Rank.THREE);
    Assert.assertEquals(ranks[2], Rank.FOUR);
    Assert.assertEquals(ranks[3], Rank.FIVE);
    Assert.assertEquals(ranks[4], Rank.SIX);
    Assert.assertEquals(ranks[5], Rank.SEVEN);
    Assert.assertEquals(ranks[6], Rank.EIGHT);
    Assert.assertEquals(ranks[7], Rank.NINE);
    Assert.assertEquals(ranks[8], Rank.TEN);
    Assert.assertEquals(ranks[9], Rank.JACK);
    Assert.assertEquals(ranks[10], Rank.QUEEN);
    Assert.assertEquals(ranks[11], Rank.KING);
    Assert.assertEquals(ranks[12], Rank.ACE);
  }
}
