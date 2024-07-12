package SortThemCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//        +----------------------------------------+
//        |            <<class>>                    |
//        |                Hand                    |
//        +----------------------------------------+
//        | - cardsInHand: List<Card>              |
//        +----------------------------------------+
//        | + Hand()                               |
//        | + add(card: Card): void                |
//        | + print(): void                        |
//        | + handTotal(): int                     |
//        | + sortBySuit(): void                   |
//        | + compareTo(otherHand: Hand): int      |
//        | + main(args: String[]): void           |
//        +----------------------------------------+
//

// Class representing a hand of cards
public class Hand implements Comparable<Hand> {
    private List<Card> cardsInHand; // List to store cards in the hand

    // Constructor to initialize the hand with an empty list of cards
    public Hand() {
        this.cardsInHand = new ArrayList<>();
    }

    // Method to add a card to the hand
    public void add(Card card) {
        cardsInHand.add(card);
    }

    // Method to print the cards in the hand
    public void print() {
        cardsInHand.forEach(card -> System.out.println(card)); // Using lambda expression to print each card
    }

    // Method to calculate the total value of the hand
    public int handTotal() {
        int total = 0;
        for (Card card : cardsInHand) {
            total += card.getValue(); // Summing up the values of all cards in the hand
        }
        return total;
    }

    // Comparator for sorting cards by suit
    Comparator<Card> comp1 = Comparator.comparing(Card::getSuit);

    // Method to sort the cards in the hand by suit
    public void sortBySuit() {
        Collections.sort(cardsInHand, (c1, c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal());
    }

    // Method required by the Comparable interface to compare hands based on total value
    @Override
    public int compareTo(Hand otherHand) {
        return this.handTotal() - otherHand.handTotal();
    }

    // Main method to test the Hand class
    public static void main(String[] args) {
        Hand hand = new Hand();

        // Adding some cards to the hand
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(4, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(7, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        // Sorting the hand by suit
        hand.sortBySuit();

        // Printing the cards in the hand
        hand.print();
    }
}
