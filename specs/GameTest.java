import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

import blackjack.*;

public class GameTest {

  Game game;

  @Before
  public void before() {
    Player player1 = new Player("Gregor", new Hand());
    Player player2 = new Player("Jimmy Jojo", new Hand());
    Player[] players = {player1, player2};
    game = new Game(players);
  }

  @Test
  public void canAddPlayersToArray() {
    assertEquals(2, game.players.length);
  }





}