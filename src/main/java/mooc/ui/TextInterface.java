package mooc.ui; // Define the package name

// Class TextInterface implementing the UserInterface interface
public class TextInterface implements UserInterface {

    // Method required by the UserInterface interface
    public void update() {
        System.out.println("Updating UI"); // Print a message indicating UI update
    }
}
