import static org.junit.Assert.*;
import org.junit.*;

import blackjack.*;

public class PlayerTest {

  Deck deck;
  Card card;
  Hand hand;

  @Before
  public void before() {
    deck = new Deck();
    hand = new Hand();
  }