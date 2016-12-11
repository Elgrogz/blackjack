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

  public void checkWinner() {
    Cardable winner = players[0];
    for (int i = 1; i < players.length; i++) {
      if (players[i].getValueOfHand() > winner.getValueOfHand()) {
        winner = players[i];
        System.out.println(winner.getName() + " is the winner!");
      }
      else if (players[i].getValueOfHand() == winner.getValueOfHand()) {
        System.out.println(winner.getName() + " and " + players[1].getName() + " have tied! " + winner.getName() + " wins by default!");
      }
    }
  }
  

  public void play() {
    deck.shuffle();
    dealFirstTwoCards();
    checkWinner();
  }

}