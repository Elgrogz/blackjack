package blackjack;

public class Card {

  ValueType value;
  SuitType suit;

  public Card(ValueType value, SuitType suit) {
    this.value = value;
    this.suit = suit;
  }

  public ValueType getValue() {
    return this.value;
  }

  public SuitType getSuit() {
    return this.suit;
  }

}