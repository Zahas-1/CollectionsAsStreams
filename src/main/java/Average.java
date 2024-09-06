import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {
    // Method to input numbers from the user and calculate the average
    public static void input(){
        Scanner s = new Scanner(System.in);
        List<String> num = new ArrayList<>(); // Create a list to store the numbers

        // Continuously read input from the user until "end" is entered
        while(true){
            String word = s.nextLine(); // Read the next line of input
            if(word.equalsIgnoreCase("end")){
                break; // If "end" is entered, exit the loop
            }
            else {
                num.add(word); // Add the input to the list if it's not "end"
            }
        }

        // Ask the user whether to consider positive or negative numbers
        System.out.println("Positive or Negative?");
        String input = s.nextLine(); // Read the user's choice

        // Check the user's choice and calculate the average accordingly
        if(input.equalsIgnoreCase("p")){ // If the user chose positive numbers
            double average = num.stream()
                    .mapToInt(t -> Integer.valueOf(t)) // Convert each string to an integer
                    .filter(number -> number >= 0) // Filter out non-positive numbers
                    .average() // Calculate the average
                    .getAsDouble(); // Get the average as a double
            System.out.println(average); // Print the average to the console

        } else if (input.equalsIgnoreCase("n")){ // If the user chose negative numbers
            double average = num.stream()
                    .mapToInt(t -> Integer.valueOf(t)) // Convert each string to an integer
                    .filter(number -> number <= 0) // Filter out non-negative numbers
                    .average() // Calculate the average
                    .getAsDouble(); // Get the average as a double
            System.out.println(average); // Print the average to the console
        }
    }

    // Main method to execute the input method
    public static void main(String[] args) {
        input(); // Call the input method
    }
}
