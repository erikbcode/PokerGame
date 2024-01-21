package pokergame;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

import pokergame.exceptions.TooManyPlayersException;

import java.util.ArrayList;

public class Table {
  private Deck deck;
  private Dealer dealer;
  private int pot;
  private Set<Player> seatedPlayers;
  private Set<Player> activePlayers;
  public final int MAX_PLAYERS = 9;
  public final int MAX_CHIPS = 300;
  private int smallBlindPosition;
  private int bigBlindPosition;
  private List<Card> boardCards;


  public Table() {
    this.deck = new Deck();
    this.pot = 0;
    this.dealer = null;
    this.seatedPlayers = new HashSet<Player>();
    this.activePlayers = new HashSet<Player>();
    this.smallBlindPosition = 0;
    this.bigBlindPosition = 1;
    this.boardCards = new ArrayList<Card>();
  }

  public void setDealer(Dealer dealer) {
    this.dealer = dealer;
  }

  public void addSeatedPlayer(Player player) {
    if (seatedPlayers.size() > MAX_PLAYERS) {
      // TODO add exception
      // throw new TooManyPlayersException("Table is full");
    }
    seatedPlayers.add(player);
  }

  public void addActivePlayer(Player player) {
    activePlayers.add(player);
  }

  public Deck getDeck() {
    return this.deck;
  }

  public void setDeck(Deck deck) {
    this.deck = deck;
  }

  public int getSmallBlindPosition() {
    return this.smallBlindPosition;
  }

  public int getBigBlindPosition() {
    return this.bigBlindPosition;
  }

  public void addToPot(int bet) {
    this.pot += bet;
  }

  public void resetPot() {
    this.pot = 0;
  }

  public Set<Player> getSeatedPlayers() {
    return this.seatedPlayers;
  }

  public Set<Player> getActivePlayers() {
    return this.activePlayers;
  }

  public void clearActivePlayers() {
    this.activePlayers.clear();
  }

  public List<Card> getBoardCards() {
    return this.boardCards;
  }

  public void addBoardCard(Card card) {
    this.boardCards.add(card);
  }

  public void clearBoardCards() {
    this.boardCards.clear();
  }


}
