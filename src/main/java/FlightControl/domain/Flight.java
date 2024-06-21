package FlightControl.domain; // Define the package name

// Class representing a Flight
public class Flight {

    // Private fields to store the airplane, departure place, and target place of the flight
    private Airplane airplane; // The airplane assigned to the flight
    private Place departureAirport; // The departure airport for the flight
    private Place targetAirport; // The target (destination) airport for the flight

    // Constructor to initialize the Flight with an airplane, departure airport, and target airport
    public Flight(Airplane airplane, Place departureAirport, Place targetAirport) {
        this.airplane = airplane; // Initialize the airplane assigned to the flight
        this.departureAirport = departureAirport; // Initialize the departure airport
        this.targetAirport = targetAirport; // Initialize the target airport (destination)
    }

    // Getter method to retrieve the airplane assigned to the flight
    public Airplane getAirplane() {
        return this.airplane; // Return the airplane assigned to the flight
    }

    // Getter method to retrieve the departure airport for the flight
    public Place getDeparturePlace() {
        return this.departureAirport; // Return the departure airport
    }

    // Getter method to retrieve the target (destination) airport for the flight
    public Place getTargetPlace() {
        return this.targetAirport; // Return the target airport (destination)
    }

    // Override the toString method to provide a string representation of the flight
    @Override
    public String toString() {
        // Return a formatted string including airplane details and departure/target airports
        return this.airplane.toString() + " (" + this.departureAirport + "-" + this.targetAirport + ")";
    }
}
