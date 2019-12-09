package com.loresch.deck_of_cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokerDeck {
	private List<Card> cards = new ArrayList<Card>();

	public PokerDeck() {

		String[] suits = { "Diamonds", "Hearts", "Clubs", "Spades" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		for (String suit : suits) {
			for (String value : values) {
				Card card = new Card(suit, value);
				cards.add(card);
			}
		}
	}

	public Card deal_card() {
		if (cards.size() > 0) {
			return cards.remove(0);
		}
		return null;
	}

	public void shuffle() {

		if (cards.size() < 2) {
			return;
		}

		List<Card> currentDeck = this.cards;
		Random r = new Random();
		int timesToShuffle = r.nextInt(40) + 20;

		while (timesToShuffle > 0) {

			List<Card> leftHand = new ArrayList<Card>();
			for (int i = 0; i < currentDeck.size() / 2; i++) {
				leftHand.add(currentDeck.remove(0));
			}

			List<Card> rightHand = new ArrayList<Card>();
			for (int i = 0; i < currentDeck.size(); i++) {
				rightHand.add(currentDeck.remove(0));
			}

			while (rightHand.size() > 0) {

				currentDeck.add(rightHand.remove(0));

				// When deck is odd-sized, left will be smaller
				if (leftHand.size() > 0) {
					currentDeck.add(leftHand.remove(0));
				}
			}

			for (int i = 0; i < r.nextInt(20) + 20; i++) {
				Card c = currentDeck.remove(r.nextInt(currentDeck.size()));
				currentDeck.add(c);
			}

			timesToShuffle--;

		}
	}

	public List<Card> getCards() {
		return cards;
	}

	public void addManyCards(List<Card> addedCards) {
		this.cards.addAll(addedCards);
	}

	public void addOneCard(Card newCard) {
		this.cards.add(newCard);
	}

}
