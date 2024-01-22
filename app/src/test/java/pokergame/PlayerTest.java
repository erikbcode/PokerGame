package pokergame;

import org.testng.annotations.Test;

import pokergame.exceptions.InsufficientChipStackException;

import org.testng.Assert;

public class PlayerTest {
  
  @Test
  public void testPlayerInitialization() {
    int initialChipCount = 300;
    Player player = new Player(initialChipCount);

    Assert.assertEquals(player.getChipCount(), initialChipCount, "Initial chip count is different than expected");
    Assert.assertNull(player.getName(), "Player name should be null directly after initialization");
    Assert.assertNull(player.getTable(), "Table should be null directly after initialization");
    Assert.assertNotNull(player.getHand(), "Hand should not be null directly after initialization");
  }

  @Test
  public void testAddChips() {
    Player player = new Player(300);

    player.addChips(100);

    Assert.assertEquals(player.getChipCount(), 400);
  }

  @Test
  public void testValidBet() {
    Player player = new Player(300);

    try {
      player.bet(200);
    } catch (InsufficientChipStackException e) {
      Assert.fail("Unexpected exception: " + e.getMessage());
    }

    Assert.assertEquals(player.getChipCount(), 100);
  }

  @Test(expectedExceptions = InsufficientChipStackException.class)
  public void testInvalidBetInsufficientChips() throws InsufficientChipStackException {
    Player player = new Player(300);

    player.bet(301);
  }

  @Test
  public void testFold() {
    Player player = new Player(300);

    player.getHand().addCard(new Card(Suit.HEART, Rank.ACE));
    player.getHand().addCard(new Card(Suit.SPADE, Rank.ACE));

    player.fold();

    Assert.assertTrue(player.getHand().getCards().isEmpty());
  }
}
