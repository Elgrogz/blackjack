package blackjack;

public interface Cardable {
  void addCardToHand(Card card);
  int getSize();
  int getValueOfHand();
  String getName();
}