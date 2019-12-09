package com.loresch.deck_of_cards;

import org.junit.Assert;
import org.junit.Test;

public class PokerDeckTests {

	@Test
	public void new_deck_is_standard_poker_deck() {
		PokerDeck createdDeck = new PokerDeck();

		Assert.assertEquals("Must be 52 cards in the deck", 52, createdDeck.getCards().size());
		Assert.assertEquals("First card is Ace of Diamonds", "AD", createdDeck.getCards().get(0).toString());
		Assert.assertEquals("Last card is King of Spades", "KS", createdDeck.getCards().get(51).toString());

	}

	@Test
	public void shuffle_does_not_change_size_of_deck() {
		PokerDeck createdDeck = new PokerDeck();
		createdDeck.shuffle();

		Assert.assertEquals("Shuffle does not alter deck size", 52, createdDeck.getCards().size());
	}

	@Test
	public void dealing_card_removes_expected_card_from_deck() {
		PokerDeck createdDeck = new PokerDeck();
		Card myCard = createdDeck.deal_card();

		Assert.assertEquals("First card dealt without shuffle is Ace of Diamonds", "AD", myCard.toString());
		Assert.assertEquals("After dealing, deck has 51 cards", 51, createdDeck.getCards().size());
	}

	@Test
	public void after_all_cards_are_dealt_deal_method_returns_null() {
		PokerDeck createdDeck = new PokerDeck();
		for (int i = 0; i < 52; i++) {
			Card myCard = createdDeck.deal_card();
		}

		Assert.assertEquals("Deal card on empty deck returns null", null, createdDeck.deal_card());
	}

	@Test
	public void adding_cards_works_corrctly() {
		PokerDeck createdDeck = new PokerDeck();
		PokerDeck secondDeck = new PokerDeck();

		createdDeck.addManyCards(secondDeck.getCards());

		Assert.assertEquals("Both decks should be combined into one of 104", 104, createdDeck.getCards().size());

		createdDeck.addOneCard(new Card("5", "Diamonds"));

		Assert.assertEquals("Adding one more card to a double deck means 105 cards", 105,
				createdDeck.getCards().size());

	}
}
