package FlightControl.domain; // Define the package name

// Class representing an Airplane
public class Airplane {

    // Private fields to store the ID and capacity of the airplane
    private String id; // ID of the airplane
    private int capacity; // Capacity of the airplane

    // Constructor to initialize the Airplane with an ID and capacity
    public Airplane(String id, int capacity) {
        this.id = id; // Initialize the ID of the airplane
        this.capacity = capacity; // Initialize the capacity of the airplane
    }

    // Getter method to retrieve the ID of the airplane
    public String getID() {
        return this.id; // Return the ID of the airplane
    }

    // Getter method to retrieve the capacity of the airplane
    public int getCapacity() {
        return this.capacity; // Return the capacity of the airplane
    }

    // Override the toString method to provide a string representation of the airplane
    @Override
    public String toString() {
        return this.id + " (" + this.capacity + " capacity)"; // Return the ID and capacity of the airplane
    }
}
