package FlightControl; // Define the package name

import FlightControl.logic.FlightControl; // Import the FlightControl class from the logic package
import FlightControl.ui.TextUI; // Import the TextUI class from the ui package

import java.util.Scanner; // Import the Scanner class from the java.util package

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
        FlightControl flightControl = new FlightControl(); // Create a FlightControl object to manage flight operations
        TextUI textUI = new TextUI(flightControl, scanner); // Create a TextUI object, passing the FlightControl and Scanner objects
        textUI.start(); // Start the text-based user interface
    }
}
