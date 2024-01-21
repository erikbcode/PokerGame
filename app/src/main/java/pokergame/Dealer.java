package pokergame;

import pokergame.exceptions.InsufficientChipStackException;
import pokergame.exceptions.MisdealException;

public class Dealer {
  
  private String name;
  private PokerGame pokerGame;
  private Table pokerTable;

  public Dealer(String name) {
    this.name = name;
    this.pokerTable = null;
  }

  public void sitAtTable(Table table) {
    this.pokerTable = table;
  }

  public void endRound() {
    clearPlayerHands();
    resetDeck();
    clearTable();
  }

  public void resetDeck() {
    this.pokerTable.setDeck(new Deck());

    // Shuffle cards thrice, as they would in a casino;
    for (int i = 0; i < 3; i++) {
      shuffleCards();
    }
  }

  public void clearTable() {
    this.pokerTable.clearBoardCards();
    this.pokerTable.resetPot();
  }

  public void clearPlayerHands() {
    for (Player player : pokerTable.getActivePlayers()) {
      player.getHand().clearHand();
    }
    pokerTable.clearActivePlayers();
  }

  public void shuffleCards() {
    this.pokerTable.getDeck().shuffleCards();
  }

  public void dealHoleCards() {
    // Deal 2 cards to each player
    try {
      for (int i = 0; i < 2; i++) {
        for (Player player : pokerTable.getActivePlayers()) {
          Card nextCard = pokerTable.getDeck().drawCard();
          player.getHand().addCard(nextCard);
        }
      }
    } catch (MisdealException e) {
      System.out.println(e.getMessage());
      resetDeck();
    }
  }

  public void dealBoardCards() {
    dealFlop();
    dealSingleBoardCard();
    dealSingleBoardCard();
  }

  public void dealFlop() {
    burnCard();
    for (int i = 0; i < 3; i++) {
      Card nextCard = this.pokerTable.getDeck().drawCard();
      this.pokerTable.addBoardCard(nextCard);
    }
  }

  public void dealSingleBoardCard() {
    burnCard();
    Card nextCard = this.pokerTable.getDeck().drawCard();
    this.pokerTable.addBoardCard(nextCard);
  }

  public void burnCard() {
    this.pokerTable.getDeck().drawCard();
  }

  public void collectBets(int betAmount) {
    for (Player player : pokerTable.getSeatedPlayers()) {
      collectBet(betAmount, player);
    }
  }

  public void collectBet(int betAmount, Player player) {
    try {
      player.bet(betAmount);
      this.pokerTable.addActivePlayer(player);
    } catch (InsufficientChipStackException e) {
      System.out.println(e.getMessage());
    }
  }
}
