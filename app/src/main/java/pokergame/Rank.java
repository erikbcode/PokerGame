package pokergame;

public enum Rank {
  TWO("Two"),
  THREE("Three"),
  FOUR("Four"),
  FIVE("Five"),
  SIX("Six"),
  SEVEN("Seven"),
  EIGHT("Eight"),
  NINE("Nine"),
  TEN("Ten"),
  JACK("Jack"),
  QUEEN("Queen"),
  KING("King"),
  ACE("Ace");

  private String rankName;
  private Rank(String rankName) {
    this.rankName = rankName;
  }

  public String getRankName() {
    return rankName;
  }

}
