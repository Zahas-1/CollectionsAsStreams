import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read user input
        ArrayList<String> words = new ArrayList<>(); // Create an ArrayList to store user input

        // Infinite loop to continuously read input until a blank line is entered
        while(true){
            String input = sc.nextLine(); // Read input from the user
            if(input.isBlank()){ // If the input is blank, exit the loop
                break;
            }
            else {
                words.add(input); // Add the input to the ArrayList if it's not blank
            }
        }

        // Stream operations to print each item in the ArrayList
        words.stream()
                .forEach(item -> System.out.println(item)); // Print each item in the ArrayList
    }
}
