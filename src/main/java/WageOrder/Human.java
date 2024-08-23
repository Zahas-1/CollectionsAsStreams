package WageOrder;  // Define the package name

//        +------------------------------------+
//        |            <<class>>               |
//        |              Human                 |
//        +------------------------------------+
//        | - wage: int                        |
//        | - name: String                     |
//        +------------------------------------+
//        | + Human(name: String, wage: int)   |
//        | + getName(): String                |
//        | + getWage(): int                   |
//        | + toString(): String               |
//        | + compareTo(Comp: Human): int      |
//        +------------------------------------+


// Define the Human class which implements the Comparable interface for Human objects
public class Human implements Comparable<Human> {

    // Private fields to store the wage and name of the human
    private int wage;
    private String name;

    // Constructor to initialize the name and wage of the human
    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    // Getter method for the name field
    public String getName() {
        return name;
    }

    // Getter method for the wage field
    public int getWage() {
        return wage;
    }

    // Override the toString() method to return a string representation of the human
    @Override
    public String toString() {
        return name + " " + wage;
    }

    // Override the compareTo() method to compare humans by their wage
    @Override
    public int compareTo(Human Comp) {
        return this.getWage() - Comp.getWage();  // Compare wages for sorting in ascending order
    }
}
