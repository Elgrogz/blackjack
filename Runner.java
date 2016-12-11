import blackjack.*;
import java.util.*;

public class Runner {

  public static void main(String[] args) {
    
    Dealer dealer = new Dealer(new Hand());
    Player player1 = new Player("Gregor", new Hand());
    Cardable[] players = {dealer, player1};
    Game game = new Game(players);

    game.play();

  }

}