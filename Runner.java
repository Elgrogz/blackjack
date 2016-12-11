import blackjack.*;
import java.util.*;

public class Runner {

  public static void main(String[] args) {
    
    Deck deck = new Deck();
    deck.buildDeck();
    Dealer dealer = new Dealer(new Hand());
    Player player = new Player("Gregor", new Hand());

      for (Card card : deck.getDeck()) {
        System.out.println(card.toString());
      }

    System.out.println();

    deck.dealCard(dealer);
    deck.dealCard(player);
    deck.dealCard(dealer);
    deck.dealCard(player);

    for (Card card : dealer.getPlayerHand()) {
      System.out.println(card.toString());
    }

    for (Card card : player.getPlayerHand()) {
      System.out.println(card.toString());
    }

  }

}