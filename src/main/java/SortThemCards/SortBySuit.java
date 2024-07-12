package SortThemCards;

import java.util.Comparator;

//        +-------------------------------------+
//        |             <<class>>                |
//        |            SortBySuit                |
//        +-------------------------------------+
//        | + compare(c1: Card, c2: Card): int  |
//        +-------------------------------------+


// Comparator implementation to compare cards by suit
public class SortBySuit implements Comparator<Card> {
    // Method to compare two cards by their suits
    public int compare(Card c1, Card c2) {
        // Comparing the ordinal values of the suits of the two cards
        return c1.getSuit().ordinal() - c2.getSuit().ordinal();
    }
}
