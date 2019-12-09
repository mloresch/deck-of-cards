package com.loresch.deck_of_cards;

public class ManualPokerDeckTests {

	public static void main(String[] args) {
		PokerDeck deck = new PokerDeck();

		for (Card card : deck.getCards()) {
			System.out.println(card);
		}

		System.out.println("\nNow Shuffled:");

		deck.shuffle();

		for (Card card : deck.getCards()) {
			System.out.println(card);
		}

		System.out.println("\nOne More Time:");

		deck.shuffle();

		for (Card card : deck.getCards()) {
			System.out.println(card);
		}

		// Test smaller numbers
		for (int i = 0; i < 47; i++) {
			deck.deal_card();
		}
		System.out.println("\nOnly 5 cards");
		for (Card card : deck.getCards()) {
			System.out.print(card + " ");
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println("\nShuffle:");
			deck.shuffle();
			for (Card card : deck.getCards()) {
				System.out.print(card + " ");
			}
		}
		
		deck.deal_card();
		System.out.println("\n\nOnly 4 cards");
		for (Card card : deck.getCards()) {
			System.out.print(card + " ");
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println("\nShuffle:");
			deck.shuffle();
			for (Card card : deck.getCards()) {
				System.out.print(card + " ");
			}
		}
		
		deck.deal_card();
		System.out.println("\n\nOnly 3 cards");
		for (Card card : deck.getCards()) {
			System.out.print(card + " ");
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println("\nShuffle:");
			deck.shuffle();
			for (Card card : deck.getCards()) {
				System.out.print(card + " ");
			}
		}

		
	}

}
