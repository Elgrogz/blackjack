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
    Cardable[] players = {dealer, player1};
    game = new Game(players);
  }

  @Test
  public void canAddPlayersToArray() {
    assertEquals(2, game.players.length);
  }

  @Test
  public void playerHasTwoCards() {
    game.dealFirstTwoCards();
    Cardable player = game.players[1];
    assertEquals(2, player.getSize());
  }


}