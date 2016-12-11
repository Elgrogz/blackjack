import static org.junit.Assert.*;
import org.junit.*;

import blackjack.*;

public class DealerTest {

  Deck deck;
  Card card;
  Dealer dealer;

  @Before
  public void before() {
    deck = new Deck();
    card = new Card(ValueType.JACK, SuitType.CLUBS, 10);
    dealer = new Dealer(new Hand());
  }

  @Test 
  public void canGetName() {
    assertEquals("Dealer", dealer.getName());
  }

  // @Test
  // public void canCountHand() {
  //   assertEquals(0, dealer.cardCount());
  // }

  @Test
  public void canAddCardToHand() {
    dealer.addCardToHand(card);
    assertEquals(1, dealer.getSize());
  }

}