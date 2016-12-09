package blackjack;

public class Player {

  String name;
  Hand[] hand;

  public Player(String name) {
    this.name = name;
    this.hand = new Card[2];
  } 

  public void getName() {
    return this.name;
  }

  public void getHand() {
    return this.hand;
  }

  public int cardCount() {
    count = 0
      for (Card card : hand) {
        count++;
      }
    return count;
  }


  public void addCardToHand() {
    hand
  }


}