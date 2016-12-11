import static org.junit.Assert.*;
import org.junit.*;

import blackjack.*;

public class PlayerTest {

  Deck deck;
  Card card;
  Player player;

  @Before
  public void before() {
    deck = new Deck();
    card = new Card(ValueType.JACK, SuitType.CLUBS, 10);
    player = new Player("Gregor", new Hand());
  }

  @Test 
  public void canGetName() {
    assertEquals("Gregor", player.getName());
  }

  @Test
  public void canAddCardToHand() {
    player.addCardToHand(card);
    assertEquals(1, player.getSize());
  }

}