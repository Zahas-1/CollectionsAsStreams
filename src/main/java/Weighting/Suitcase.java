package Weighting;

import java.util.ArrayList;

//        +------------------------------------+
//        |            <<class>>               |
//        |             Suitcase               |
//        +------------------------------------+
//        | - items: ArrayList<Item>           |
//        | - maxWeight: int                   |
//        +------------------------------------+
//        | + Suitcase(maxWeight: int)         |
//        | + toString(): String               |
//        | + addItem(item: Item): void        |
//        | + printItems(): void               |
//        | + totalWeight(): int               |
//        | + heaviestItem(): Item             |
//        | + main(args: String[]): void       |
//        +------------------------------------+


// Class representing a suitcase that can hold items
public class Suitcase {
    private ArrayList<Item> items; // List to store items in the suitcase
    private int maxWeight; // Maximum weight the suitcase can hold

    // Constructor to initialize the suitcase with a maximum weight
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight; // Initialize the maximum weight
        this.items = new ArrayList<>(); // Initialize an empty list for items
    }

    // Override the toString method to provide a string representation of the suitcase
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (" + totalWeight() + "kg)"; // Return if no items are in the suitcase
        } else if (this.items.size() == 1) {
            return this.items.size() + " item (" + totalWeight() + "kg)"; // Return if there is only one item
        }
        return this.items.size() + " items (" + totalWeight() + "kg)"; // Return for multiple items
    }

    // Method to add an item to the suitcase if it doesn't exceed the maximum weight
    public void addItem(Item item) {
        if ((totalWeight() + item.getWeight()) <= maxWeight) {
            this.items.add(item); // Add the item to the suitcase
        }
    }

    // Method to print all items in the suitcase
    public void printItems() {
        if (!(this.items.isEmpty())) {
            items.stream()
                    .forEach(item -> System.out.println(item)); // Print each item in the suitcase
        }
    }

    // Method to calculate the total weight of all items in the suitcase
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight(); // Add the weight of each item to the total weight
        }
        return totalWeight; // Return the total weight
    }

    // Method to find the heaviest item in the suitcase
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null; // Return null if the suitcase is empty
        }
        Item heaviest = items.get(0); // Assume the first item is the heaviest
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item; // Update the heaviest item if a heavier item is found
            }
        }
        return heaviest; // Return the heaviest item
    }

    // Main method for testing the Suitcase class
    public static void main(String[] args) {
        // Create items
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);

        // Create a suitcase with a maximum weight of 10
        Suitcase suitcase = new Suitcase(10);
        suitcase.addItem(book); // Add items to the suitcase
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        // Find and print the heaviest item in the suitcase
        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);

        // Print all items in the suitcase
        suitcase.printItems();
    }
}
