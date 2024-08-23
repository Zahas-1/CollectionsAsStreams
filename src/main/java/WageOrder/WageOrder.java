package WageOrder;  // Define the package name

import java.util.ArrayList;  // Import the ArrayList class from the java.util package
import java.util.Collections;  // Import the Collections class from the java.util package

//        +------------------------------------+
//        |            <<class>>               |
//        |            WageOrder               |
//        +------------------------------------+
//        | - main(args: String[]): void       |
//        +------------------------------------+


// Main class
public class WageOrder {
    public static void main(String[] args) {
        // Create an ArrayList to store Human objects
        ArrayList<Human> humans = new ArrayList<>();

        // Add Human objects to the ArrayList with names and wages
        humans.add(new Human("Matti", 150000));
        humans.add(new Human("Merja", 500));
        humans.add(new Human("Pertti", 80));

        // Print the list of humans before sorting
        System.out.println("Before sorting: " + humans);

        // Sort the list of humans based on their natural ordering (assumed to be by wage)
        Collections.sort(humans);

        // Print the list of humans after sorting
        System.out.println("After sorting: " + humans);
    }
}
