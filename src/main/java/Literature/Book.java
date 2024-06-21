package Literature;

//        Class Diagram
//        +------------------------------------+
//        |             <<class>>              |
//        |                Book                |
//        +------------------------------------+
//        | - name: String                     |
//        | - age: int                         |
//        +------------------------------------+
//        | + Book(name: String, age: int)     |
//        | + getName(): String                |
//        | + getAge(): int                    |
//        | + toString(): String               |
//        +------------------------------------+

// Book class representing a literary work
public class Book {
    // Fields to store book name and recommended age
    private String name;
    private int age;

    // Constructor to initialize book name and recommended age
    public Book(String name, int age) {
        this.name = name;  // Assigning name parameter to instance variable name
        this.age = age;    // Assigning age parameter to instance variable age
    }

    // Getter method to retrieve book name
    public String getName() {
        return name;
    }

    // Getter method to retrieve recommended age
    public int getAge() {
        return age;
    }

    // Overriding toString method to represent Book object as a string
    @Override
    public String toString() {
        // Returning book name along with recommended age
        return this.getName() + " (recommended for " + this.getAge() + " years-olds or older)";
    }
}


