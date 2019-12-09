package com.loresch.deck_of_cards;

public class Card {
	private final String value;
	private final String suit;
	private boolean faceUp;

	public Card(String value, String suit) {
		this.value = value;
		this.suit = suit;
		this.faceUp = false;
	}

	@Override
	public String toString() {
		return suit.substring(0, 1) + value.substring(0, 1);
	}

	public String getColor() {
		if (suit.equals("Diamonds") || suit.equals("Hearts")) {
			return "red";
		} else {
			return "black";
		}
	}

	public boolean isFaceUp() {
		return faceUp;
	}

	public void flip() {
		faceUp = !faceUp;
	}

	public void setFaceUp(boolean faceUp) {
		this.faceUp = faceUp;
	}

	public String getValue() {
		return value;
	}

	public String getSuit() {
		return suit;
	}

}
