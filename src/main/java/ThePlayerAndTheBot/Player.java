package ThePlayerAndTheBot;

// Player class represents a player in the game
public class Player {
    private String name;  // Private field to store the player's name
    private Bot bot;      // Private field to reference a Bot object associated with the player (if any)

    // Method for the player to play the game
    public void play() {
        // This method can be overridden to define specific gameplay logic for the player
        // Currently, it does not have any implementation
    }

    // Method to print the player's name to the console
    public void printName() {
        System.out.println(name);  // Print the player's name
    }
}
