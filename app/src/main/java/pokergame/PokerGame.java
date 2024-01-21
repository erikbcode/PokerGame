package pokergame;

import pokergame.exceptions.NotEnoughPlayersException;
import pokergame.exceptions.TooManyPlayersException;

public class PokerGame {
  
  private int numPlayers;
  private Dealer dealer;
  private static final int MAX_PLAYERS = 9;
  private static final int MIN_PLAYERS = 2;

  public PokerGame(int numPlayers, Dealer dealer) throws TooManyPlayersException, NotEnoughPlayersException {
    if (this.numPlayers > MAX_PLAYERS) {
      throw new TooManyPlayersException("You cannot initialize a poker game with more than 9 players");
    } else if (this.numPlayers < MIN_PLAYERS) {
      throw new NotEnoughPlayersException("You cannot initialize a poker game with less than 2 players");
    }
    this.numPlayers = numPlayers;
    this.dealer = dealer;
  }
}
