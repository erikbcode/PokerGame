package pokergame;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HandTest {
  

  @Test
  public void testInitialization() {
    Hand hand = new Hand();

    Assert.assertNotNull(hand);
    Assert.assertEquals(hand.getCards().size(), 0);
  }
}
