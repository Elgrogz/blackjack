package blackjack;

public class Game {

  Dealer dealer;
  public Player[] players;
  Deck deck;

  public Game(Player[] players) {
    this.dealer = new Dealer(new Hand());
    this.players = players;
    this.deck = new Deck();
  }

  

  public void play() {

  }

}