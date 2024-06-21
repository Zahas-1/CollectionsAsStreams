package FlightControl.ui; // Define the package name

import FlightControl.domain.Flight; // Import the Flight class from the domain package
import FlightControl.domain.Airplane; // Import the Airplane class from the domain package
import java.util.Scanner; // Import the Scanner class for reading user input
import FlightControl.logic.FlightControl; // Import the FlightControl class for managing flight operations

public class TextUI {

    private FlightControl flightControl; // Instance variable for managing flight control logic
    private Scanner scanner; // Instance variable for reading user input

    // Constructor to initialize the TextUI with a FlightControl and Scanner
    public TextUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    // Method to start the user interface
    public void start() {
        startAssetControl(); // Start the asset control section
        System.out.println();
        startFlightControl(); // Start the flight control section
        System.out.println();
    }

    // Method to handle asset control operations
    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        // Loop to continuously prompt user for asset control actions
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String answer = scanner.nextLine();

            // Handle user input for different actions
            if (answer.equals("1")) {
                addAirplane(scanner);
            } else if (answer.equals("2")) {
                addFlight(scanner);
            } else if (answer.equals("x")) {
                break;
            }
        }
    }

    // Method to add an airplane
    private void addAirplane(Scanner scanner) {
        System.out.print("Give the airplane id: ");
        String id = this.scanner.nextLine(); // Read airplane ID from user
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(this.scanner.nextLine()); // Read airplane capacity from user

        this.flightControl.addAirplane(id, capacity); // Add the airplane to flight control
    }

    // Method to add a flight
    private void addFlight(Scanner scanner) {
        System.out.print("Give the airplane id: ");
        Airplane airplane = askForAirplane(this.scanner); // Get the airplane object
        System.out.print("Give the departure airport id: ");
        String departureID = this.scanner.nextLine(); // Read departure airport ID from user
        System.out.print("Give the target airport id: ");
        String destinationID = this.scanner.nextLine(); // Read destination airport ID from user

        this.flightControl.addFlight(airplane, departureID, destinationID); // Add the flight to flight control
    }

    // Method to handle flight control operations
    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        // Loop to continuously prompt user for flight control actions
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String answer = scanner.nextLine();

            // Handle user input for different actions
            if (answer.equals("1")) {
                printAirplanes();
            } else if (answer.equals("2")) {
                printFlights();
            } else if (answer.equals("3")) {
                printAirplaneDetails();
            } else if (answer.equals("x")) {
                break;
            }
        }
    }

    // Method to print all airplanes
    private void printAirplanes() {
        for (Airplane plane : flightControl.getAirplanes()) {
            System.out.println(plane); // Print each airplane
        }
    }

    // Method to print all flights
    private void printFlights() {
        for (Flight flight : flightControl.getFlights()) {
            System.out.println(flight); // Print each flight
            System.out.println("");
        }
    }

    // Method to print details of a specific airplane
    private void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        Airplane plane = askForAirplane(scanner); // Get the airplane object
        System.out.println(plane); // Print the airplane details
        System.out.println();
    }

    // Method to get an airplane object based on user input
    private Airplane askForAirplane(Scanner scanner) {
        Airplane airplane = null;
        while (airplane == null) {
            String id = scanner.nextLine(); // Read airplane ID from user
            airplane = flightControl.getAirplane(id); // Get the airplane object

            if (airplane == null) {
                System.out.println("No airplane with the id " + id + "."); // Print error message if airplane not found
            }
        }

        return airplane; // Return the airplane object
    }
}
