package blackjack;
import java.util.*;

public class Player implements Cardable {

  String name;
  ArrayList<Card> hand;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<Card>();
  } 

  public String getName() {
    return this.name;
  }

  public ArrayList<Card> getHand() {
    return this.hand;
  }

  // public int cardCount() {
  //   count = 0
  //     for (Card card : hand) {
  //       count++;
  //     }
  //   return count;
  // }

  public int cardCount() {
    return hand.size();
  }

  public void addCardToHand(Card card) {
    hand.add(card);
  }


}