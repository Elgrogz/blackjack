package blackjack;

public class Game {

  public Cardable[] players;
  Deck deck;

  public Game(Cardable[] players) {
    this.players = players;
    this.deck = new Deck();
    deck.buildDeck();
  }

  public void dealFirstTwoCards() {

    for (Cardable  player : players) {
      deck.dealCard(player);
      deck.dealCard(player);
      System.out.println(player.getName() + "'s hand total: " + player.getValueOfHand());
    }
  }

  public void play() {

  }

}