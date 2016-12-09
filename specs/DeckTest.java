import static org.junit.Assert.*;
import org.junit.*;

import blackjack.*;

public class DeckTest {

  Deck deck;
  Card card;
  Cardable player;
  Cardable dealer;

  @Before
  public void before() {
    deck = new Deck();
    card = new Card(ValueType.JACK, SuitType.CLUBS);
    player = new Player("Gregor");
    dealer = new Dealer();
    }

  @Test 
  public void canGetDeckSize() {
    assertEquals(0, deck.getSize());
  }

  @Test
  public void canAddCardToDeck() {
    deck.addCard(card);
    deck.addCard(card);
    assertEquals(2, deck.getSize());
  }

  @Test
  public void canBuildDeck() {
    deck.buildDeck();
    assertEquals(52, deck.getSize());
  }

  // @Test
  // public void firstCardIsHearts() {
  //   deck.buildDeck();
  //   ArrayList<Card> cards = deck.getDeck();
  //   Card card = cards[1];
  //   assertEquals(SuitType.HEARTS, card.getSuit());
  // }

  @Test
  public void canDealCardToPlayer() {
    deck.buildDeck();
    deck.dealCard(player);
    assertEquals(1, player.cardCount());
  } 

  @Test
  public void canDealCardToDealer() {
    deck.buildDeck();
    deck.dealCard(dealer);
    assertEquals(1, dealer.cardCount());
  }

}