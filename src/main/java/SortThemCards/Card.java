package SortThemCards;

import java.util.Comparator;

//        +------------------------------------+
//        |             <<class>>               |
//        |               Card                 |
//        +------------------------------------+
//        | - value: int                       |
//        | - suit: Suit                       |
//        +------------------------------------+
//        | + Card(value: int, suit: Suit)    |
//        | + toString(): String               |
//        | + getValue(): int                  |
//        | + getSuit(): Suit                  |
//        | + compareTo(o: Card): int          |
//        +------------------------------------+


// Class representing a playing card
public class Card implements Comparable<Card> {

    // Fields to store the value and suit of the card
    private int value;
    private Suit suit;

    // Constructor to initialize card with value and suit
    public Card(int value, Suit suit) {
        // Validate card value
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        // Assigning values to fields
        this.value = value;
        this.suit = suit;
    }

    // Method to represent the card as a string
    @Override
    public String toString() {
        String cardValue = "" + value;
        // Converting numeric card values to corresponding strings
        if (value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }

        // Combining suit and card value to form a string representation
        return suit + " " + cardValue;
    }

    // Getter method to retrieve card value
    public int getValue() {
        return value;
    }

    // Getter method to retrieve card suit
    public Suit getSuit() {
        return suit;
    }

    // Method to compare cards for sorting
    @Override
    public int compareTo(Card o) {
        // If card values are equal, compare suits
        if (this.getValue() == o.getValue()) {
            return this.getSuit().ordinal() - o.getSuit().ordinal();
        }
        // Otherwise, compare card values
        return this.getValue() - o.getValue();
    }
}
