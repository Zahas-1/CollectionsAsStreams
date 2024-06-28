package mooc.logic; // Define the package name

import mooc.ui.UserInterface; // Import the UserInterface class from the mooc.ui package

// Class representing the application logic
public class ApplicationLogic {

    private UserInterface ui; // Private field to store a UserInterface object

    // Constructor to initialize the ApplicationLogic with a UserInterface object
    public ApplicationLogic(UserInterface ui) {
        this.ui = ui; // Initialize the UserInterface field with the provided ui object
    }

    // Method to execute the application logic a specified number of times
    public void execute(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Application logic is working"); // Print a message indicating the application logic is working
            ui.update(); // Call the update method on the UserInterface object
        }
    }
}
