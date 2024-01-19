package pokergame;

public enum Suit {
  CLUB("Club"),
  SPADE("Spade"),
  HEART("Heart"),
  DIAMOND("Diamond");

  private String suitName;

  private Suit(String suitName) {
    this.suitName = suitName;
  }

  public String getSuitName() {
    return suitName;
  }
  
}
