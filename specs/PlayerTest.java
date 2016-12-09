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
    card = new Card(ValueType.JACK, SuitType.CLUBS);
    player = new Player("Gregor");
  }

  @Test 
  public void canGetName() {
    assertEquals("Gregor", player.getName());
  }

  @Test
  public void canCountHand() {
    assertEquals(0, player.cardCount());
  }

  @Test
  public void canAddCardToHand() {
    player.addCardToHand(card);
    assertEquals(1, player.cardCount());
  }





}