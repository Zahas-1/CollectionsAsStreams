package EnumAndIterator;

// Class representing a person with a name and education level
public class Person {
    private String name; // Person's name
    private Education edu; // Person's education level

    // Constructor to initialize name and education
    public Person(String name, Education edu){
        this.name = name;
        this.edu = edu;
    }

    // Getter method to retrieve the person's education level
    public Education getEdu(){
        return this.edu;
    }

    // Override the toString method to provide a string representation of the person
    @Override
    public String toString(){
        return name + ", " + getEdu();
    }
}
