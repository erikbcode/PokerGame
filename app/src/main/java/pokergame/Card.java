package pokergame;

public class Card {
  private Suit suit;
  private Rank rank;

  public Card(Suit suit, Rank rank) {
    if (suit == null || rank == null) {
      throw new IllegalArgumentException("Suit and Rank cannot be null");
  }
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit() {
    return suit;
  }

  public Rank getRank() {
    return rank;
  }

  @Override
  public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;

      Card otherCard = (Card) obj;
      return suit == otherCard.suit && rank == otherCard.rank;
  }

  @Override
  public String toString() {
    return rank + " of " + suit;
  }
}
