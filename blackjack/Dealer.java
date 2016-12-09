package blackjack;
import java.util.*;

public class Dealer implements Cardable {

  String name;
  ArrayList<Card> hand;

  public Dealer() {
    this.name = "Dealer";
    this.hand = new ArrayList<Card>();
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Card> getHand() {
    return this.hand;
  }

  public int cardCount() {
    return hand.size();
  }

  public void addCardToHand(Card card) {
    hand.add(card);
  }

}