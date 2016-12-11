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

    for (Cardable  person : players) {
      deck.dealCard(person);
      deck.dealCard(person);
      
    }
  }

  public void play() {

  }

}