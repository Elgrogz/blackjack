import static org.junit.Assert.*;
import org.junit.*;

import blackjack.*;

public class HandTest {

  Hand hand;
  Card card;

  @Before
  public void before() {
    hand = new Hand();
    card = new Card(ValueType.JACK, SuitType.CLUBS, 10);
  }

  @Test
  public void canCountZero() {
    assertEquals(0, hand.cardCount());
  }

  @Test
  public void canAddCard() {
    hand.addCard(card);
    assertEquals(1, hand.cardCount());
  }

}