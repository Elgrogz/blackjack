import static org.junit.Assert.*;
import org.junit.*;

import blackjack.*;

public class CardTest {

  Card card;

  @Before 
  public void before() {
    card = new Card(ValueType.JACK, SuitType.CLUBS);
  }

  @Test 
  public void canGetValue() {
    assertEquals(ValueType.JACK, card.getValue());
  }

  @Test 
  public void canGetSuit() {
    assertEquals(SuitType.CLUBS, card.getSuit());
  }

}