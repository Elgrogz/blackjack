package blackjack;

public class Game {

  public Cardable[] players;
  Deck deck;

  public Game(Cardable[] players) {
    this.players = players;
    this.deck = new Deck();
  }

  // public void dealCards() {
  //   deck.buildDeck();

  //   for (Cardable  person : players)
  // }

  public void play() {

  }

}