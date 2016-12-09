package blackjack;
import java.util.*;

public class Deck {

  private ArrayList<Card> deck;

  public Deck() {
    this.deck = new ArrayList<Card>();
  }

  public int getSize() {
    return this.deck.size();
  }

  public void addCard(Card card) {
    this.deck.add(card);
  }

  public void buildDeck() {
    for ( SuitType suit: SuitType.values() ) {
      for( ValueType value: ValueType.values()){
        Card cardToAdd = new Card(value, suit);
        addCard(cardToAdd);
      }

    }




  }
}