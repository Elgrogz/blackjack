package blackjack;
import java.util.*;

public class Hand {

  ArrayList<Card> hand;

  public Hand() {
    this.hand = new ArrayList<Card>();
  }

  public ArrayList<Card> getHand() {
    return this.hand;
  }

  public void addCard(Card card) {
    hand.add(card);
  }

  public int cardCount() {
    int count = 0;
      for (Card card : hand) {
        count++;
      }
    return count;
  }

  public int getTotalValue() {
    int value = 0;
      for (Card card : hand) {
        int numberToAdd = card.getNumber();
        value += numberToAdd;
      }
    return value;
  }

}