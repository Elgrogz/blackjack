package blackjack;
import java.util.*;

public class Player implements Cardable {

  String name;
  Hand hand;

  public Player(String name, Hand hand) {
    this.name = name;
    this.hand = hand;
  } 

  public String getName() {
    return this.name;
  }

  public Hand getHand() {
    return this.hand;
  }

  public int getSize() {
      return this.hand.cardCount();
    }

  public void addCardToHand(Card card) {
    hand.addCard(card);
  }

}