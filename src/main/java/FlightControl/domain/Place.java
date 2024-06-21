package FlightControl.domain; // Define the package name

// Class representing a Place (such as an airport)
public class Place {

    private String ID; // Private field to store the ID of the place

    // Constructor to initialize the Place with an ID
    public Place(String ID) {
        this.ID = ID; // Initialize the ID of the place
    }

    // Override the toString method to provide a string representation of the Place
    @Override
    public String toString() {
        return this.ID; // Return the ID of the place as a string representation
    }
}
