package Weighting;

//        +------------------------------------+
//        |            <<class>>               |
//        |               Item                 |
//        +------------------------------------+
//        | - name: String                     |
//        | - weight: int                      |
//        +------------------------------------+
//        | + Item(name: String, weight: int)  |
//        | + getName(): String                |
//        | + getWeight(): int                 |
//        | + toString(): String               |
//        +------------------------------------+


// Class representing an item with a name and weight
public class Item {
    private String name; // Name of the item
    private int weight; // Weight of the item

    // Constructor to initialize the item with a name and weight
    public Item(String name, int weight) {
        this.name = name; // Initialize the name
        this.weight = weight; // Initialize the weight
    }

    // Getter method to retrieve the name of the item
    public String getName() {
        return this.name;
    }

    // Getter method to retrieve the weight of the item
    public int getWeight() {
        return this.weight;
    }

    // Override the toString method to provide a string representation of the item
    @Override
    public String toString() {
        return getName() + " (" + getWeight() + "kg)";
    }

    // Main method for testing the Item class
    public static void main(String[] args) {
        // Create items
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);

        // Print the name and weight of the book
        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());

        // Print the string representation of the book and phone
        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);
    }
}
