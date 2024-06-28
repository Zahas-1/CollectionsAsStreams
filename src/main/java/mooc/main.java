package mooc; // Define the package name

import mooc.logic.ApplicationLogic; // Import the ApplicationLogic class from the mooc.logic package
import mooc.ui.UserInterface; // Import the UserInterface interface from the mooc.ui package
import mooc.ui.TextInterface; // Import the TextInterface class from the mooc.ui package

public class main {

    public static void main(String[] args) {
        UserInterface ui = new TextInterface(); // Create an instance of TextInterface and assign it to ui
        new ApplicationLogic(ui).execute(3); // Create an instance of ApplicationLogic with ui and call execute(3)
    }
}
