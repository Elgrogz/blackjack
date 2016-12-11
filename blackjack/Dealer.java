package blackjack;
import java.util.*;

public class Dealer implements Cardable {

  String name;
  Hand hand;

  public Dealer(Hand hand) {
    this.name = "Dealer";
    this.hand = hand;
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Card> getPlayerHand() {
    return this.hand.getHand();
  }

  public int getSize() {
    return this.hand.cardCount();
  }

  public void addCardToHand(Card card) {
    hand.addCard(card);
  }

  public int getValueOfHand() {
    return hand.getTotalValue();
  }



}