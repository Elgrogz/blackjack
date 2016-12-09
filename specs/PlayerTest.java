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



}