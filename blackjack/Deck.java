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

  public ArrayList<Card> getDeck() {
    return this.deck;
  }

  public void addCard(Card card) {
    this.deck.add(card);
  }

  public void buildDeck() {
    for ( SuitType suit: SuitType.values() ) {
      for( ValueType value: ValueType.values()){
        int number = value.ordinal() + 1;
          if (number > 10) {
            number = 10;
          }
        Card cardToAdd = new Card(value, suit, number);
        addCard(cardToAdd);
      }
    }
  }

  public void shuffle() {
    Collections.shuffle(deck);
  }

  public void dealCard(Cardable person) {
      Card cardToDeal = deck.get(0);
      person.addCardToHand(cardToDeal);
      deck.remove(0);
  }
}