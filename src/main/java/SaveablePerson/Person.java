package SaveablePerson; // Define the package name

public class Person implements Saveable { // Person class implementing Saveable interface

    private String name; // Private field to store the name of the person
    private String address; // Private field to store the address of the person

    // Constructor to initialize a Person object with name and address
    public Person(String name, String address) {
        this.name = name; // Initialize the name
        this.address = address; // Initialize the address
    }

    // Save method to save the person's data (implementation from Saveable interface)
    public void save() {
        // Implementation details for saving data
        // (Method body not provided in the original code snippet)
    }

    // Delete method to delete the person's data (implementation from Saveable interface)
    public void delete() {
        // Implementation details for deleting data
        // (Method body not provided in the original code snippet)
    }

    // Load method to load the person's data (implementation from Saveable interface)
    public void load() {
        // Implementation details for loading data
        // (Method body not provided in the original code snippet)
    }
}
