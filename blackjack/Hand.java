package blackjack;
import java.util.*;

public class Hand {

  ArrayList<Card> hand;

  public Hand() {
    this.hand = new ArrayList<Card>();
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


}