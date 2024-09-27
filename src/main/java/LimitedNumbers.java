import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>(); // Create an ArrayList to store input words

        // Infinite loop to continuously read input until a negative number is entered
        while(true){
            String input = sc.nextLine(); // Read input from the user
            if(Integer.parseInt(input) < 0){ // If the input is a negative number, exit the loop
                break;
            }
            else {
                words.add(input); // Add the input to the ArrayList if it's not negative
            }
        }

        // Stream operations to filter words within a specified range and print them
        words.stream()
                .mapToInt(word -> Integer.valueOf(word)) // Convert each word to an integer
                .filter(i -> i > 0 && i < 6) // Filter integers within the range (1, 5)
                .forEach(item -> System.out.println(item)); // Print each filtered integer
    }
}
