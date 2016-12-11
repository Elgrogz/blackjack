package blackjack;

public class Card {

  ValueType value;
  SuitType suit;
  int number;

  public Card(ValueType value, SuitType suit, int number) {
    this.value = value;
    this.suit = suit;
    this.number = number;
  }

  public ValueType getValue() {
    return this.value;
  }

  public SuitType getSuit() {
    return this.suit;
  }

  public int getNumber() {
    return this.number;
  }

  @Override
  public String toString() {
    return value + " of " + suit;
  }

}