package FlightControl.logic; // Define the package name

import java.util.Collection; // Import Collection interface for handling collections
import FlightControl.domain.Flight; // Import the Flight class from the domain package
import FlightControl.domain.Airplane; // Import the Airplane class from the domain package
import java.util.HashMap; // Import the HashMap class for storing key-value pairs
import java.util.Map; // Import the Map interface
import FlightControl.domain.Place; // Import the Place class from the domain package

public class FlightControl {

    private HashMap<String, Airplane> airplanes = new HashMap<>(); // HashMap to store airplanes
    private HashMap<String, Flight> flights = new HashMap<>(); // HashMap to store flights
    private Map<String, Place> places; // Map to store places (airports)

    // Constructor to initialize the FlightControl with empty maps
    public FlightControl() {
        this.flights = new HashMap<>(); // Initialize the flights map
        this.airplanes = new HashMap<>(); // Initialize the airplanes map
        this.places = new HashMap<>(); // Initialize the places map
    }

    // Method to add an airplane
    public void addAirplane(String ID, int capacity) {
        Airplane plane = new Airplane(ID, capacity); // Create a new Airplane object
        this.airplanes.put(ID, plane); // Add the airplane to the airplanes map
    }

    // Method to add a flight
    public void addFlight(Airplane plane, String departureID, String destinationID) {
        this.places.putIfAbsent(departureID, new Place(departureID)); // Add the departure place if it doesn't exist
        this.places.putIfAbsent(destinationID, new Place(destinationID)); // Add the destination place if it doesn't exist

        Flight flight = new Flight(plane, this.places.get(departureID), this.places.get(destinationID)); // Create a new Flight object
        this.flights.put(flight.toString(), flight); // Add the flight to the flights map
    }

    // Method to get a collection of all airplanes
    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values(); // Return the values of the airplanes map
    }

    // Method to get a collection of all flights
    public Collection<Flight> getFlights() {
        return this.flights.values(); // Return the values of the flights map
    }

    // Method to get an airplane by its ID
    public Airplane getAirplane(String ID) {
        return this.airplanes.get(ID); // Return the airplane with the specified ID
    }
}
