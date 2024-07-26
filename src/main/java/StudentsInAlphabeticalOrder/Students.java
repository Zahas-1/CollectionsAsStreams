package StudentsInAlphabeticalOrder;  // Define the package name

//        +------------------------------------+
//        |            <<class>>               |
//        |             Students               |
//        +------------------------------------+
//        | - name: String                     |
//        +------------------------------------+
//        | + Students(name: String)           |
//        | + getName(): String                |
//        | + toString(): String               |
//        | + compareTo(o: Students): int      |
//        | + main(args: String[]): void       |
//        +------------------------------------+


// Define the Students class which implements the Comparable interface for Students objects
public class Students implements Comparable<Students> {
    // Private field to store the name of the student
    private String name;

    // Constructor to initialize the name of the student
    public Students(String name) {
        this.name = name;
    }

    // Getter method for the name field
    public String getName() {
        return name;
    }

    // Override the toString() method to return a string representation of the student
    @Override
    public String toString() {
        return name;
    }

    // Override the compareTo() method to compare students by their names alphabetically
    @Override
    public int compareTo(Students o) {
        return this.getName().compareTo(o.getName());  // Compare names for sorting in alphabetical order
    }

    // Main method to demonstrate the functionality of the Students class
    public static void main(String[] args) {
        // Create two Students objects with different names
        Students first = new Students("jamo");
        Students second = new Students("jamo1");

        // Compare the two Students objects and print the result
        System.out.println(first.compareTo(second));  // Output will show the comparison result
    }
}
