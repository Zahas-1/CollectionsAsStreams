import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
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

        // Calculate the average of the numbers using streams
        double average = num.stream()
                .mapToInt(t -> Integer.valueOf(t)) // Convert each string to an integer
                .average() // Calculate the average
                .getAsDouble(); // Get the average as a double

        // Print the average to the console
        System.out.println(average);
    }

    // Main method to execute the input method
    public static void main(String[] args) {
        input(); // Call the input method
    }
}
