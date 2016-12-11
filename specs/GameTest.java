import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

import blackjack.*;

public class GameTest {

  Game game;
  Deck deck;

  @Before
  public void before() {
    Dealer dealer = new Dealer(new Hand());
    Player player1 = new Player("Gregor", new Hand());
    Player player2 = new Player("Jimmy Jojo", new Hand());
    Cardable[] players = {dealer, player1, player2};
    game = new Game(players);
  }

  @Test
  public void canAddPlayersToArray() {
    assertEquals(3, game.players.length);
  }


}