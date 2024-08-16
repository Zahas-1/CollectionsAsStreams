package UniqueLastNames;

//        +------------------------------------+
//        |            <<class>>               |
//        |              Person                |
//        +------------------------------------+
//        | - firstName: String                |
//        | - lastName: String                 |
//        | - birthYear: int                   |
//        +------------------------------------+
//        | + Person(firstName: String,        |
//        |           lastName: String,        |
//        |           birthYear: int           |
//        | + getFirstName(): String           |
//        | + getLastName(): String            |
//        | + getBirthYear(): int              |
//        +------------------------------------+


// Class representing a person with their first name, last name, and birth year
public class Person {

    // Fields to store first name, last name, and birth year
    private String firstName;
    private String lastName;
    private int birthYear;

    // Constructor to initialize a Person object with provided details
    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName; // Assigning provided first name to the instance variable
        this.lastName = lastName;   // Assigning provided last name to the instance variable
        this.birthYear = birthYear; // Assigning provided birth year to the instance variable
    }

    // Getter method to retrieve the first name of the person
    public String getFirstName() {
        return firstName;
    }

    // Getter method to retrieve the last name of the person
    public String getLastName() {
        return lastName;
    }

    // Getter method to retrieve the birth year of the person
    public int getBirthYear() {
        return birthYear;
    }
}
