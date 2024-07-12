package SortThemCards;

import java.util.Comparator;

//        +----------------------------------------+
//        |             <<class>>                   |
//        |         BySuitInValueOrder              |
//        +----------------------------------------+
//        | + compare(c1: Card, c2: Card): int     |
//        +----------------------------------------+


// Comparator implementation to compare cards by suit and then by value
public class BySuitInValueOrder implements Comparator<Card> {
    // Method to compare two cards by their values
    public int compare(Card c1, Card c2) {
        // Comparing the values of the two cards
        return c1.getValue() - c2.getValue();
    }
}
