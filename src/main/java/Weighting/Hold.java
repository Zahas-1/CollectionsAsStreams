package Weighting;

import java.util.ArrayList;

//        +---------------------------------------+
//        |            <<class>>                  |
//        |                Hold                   |
//        +---------------------------------------+
//        | - hold: ArrayList<Suitcase>           |
//        | - maxWeight: int                      |
//        | - currentWeight: int                  |
//        +---------------------------------------+
//        | + Hold(maxWeight: int)                |
//        | + addSuitcase(suitcase: Suitcase): void|
//        | + printItems(): void                  |
//        | + toString(): String                  |
//        +---------------------------------------+

// Class representing a hold for suitcases
public class Hold {
    private ArrayList<Suitcase> hold; // List to store suitcases in the hold
    private int maxWeight; // Maximum weight capacity of the hold
    private int currentWeight; // Current total weight of the hold

    // Constructor to initialize the hold with a maximum weight capacity
    public Hold(int maxWeight) {
        this.hold = new ArrayList<>(); // Initialize an empty ArrayList for suitcases
        this.maxWeight = maxWeight; // Set the maximum weight capacity
        this.currentWeight = 0; // Initialize the current weight to 0
    }

    // Method to add a suitcase to the hold
    public void addSuitcase(Suitcase suitcase) {
        int suitcasesWeight = 0; // Variable to store the total weight of suitcases in the hold

        // Calculate the total weight of suitcases currently in the hold
        for (Suitcase items : hold) {
            suitcasesWeight += items.totalWeight();
        }

        // Check if adding the new suitcase exceeds the maximum weight capacity
        if (suitcasesWeight <= maxWeight) {
            hold.add(suitcase); // Add the suitcase to the hold
            suitcasesWeight += suitcase.totalWeight(); // Update the total weight of suitcases
            currentWeight = suitcasesWeight; // Update the current weight of the hold
        }
    }

    // Method to print items in all suitcases in the hold
    public void printItems() {
        // Iterate through each suitcase in the hold and print its items
        hold.stream()
                .forEach(item -> item.printItems());
    }

    // Override the toString method to provide a string representation of the hold
    @Override
    public String toString() {
        return hold.size() + " suitcases (" + currentWeight + "kg)";
    }

    // Main method for testing the Hold class
    public static void main(String[] args) {
        // Create items
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        // Create suitcases and add items to them
        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        // Create a hold and add suitcases to it
        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        // Print the contents of the hold
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}
