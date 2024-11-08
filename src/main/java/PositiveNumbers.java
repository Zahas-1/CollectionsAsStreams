import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>(); // Create an ArrayList to store test numbers
        test.add(1);  // Add test numbers to the ArrayList
        test.add(-2);
        test.add(3);
        test.add(-4);
        test.add(5);
        test.add(1);
        test.add(-2);
        test.add(3);
        test.add(-4);
        test.add(5);

        // Call the positive method to filter positive numbers and print the result
        System.out.println(positive(test));
    }

    // Method to filter positive numbers from a list of integers
    public static List<Integer> positive(List<Integer> numbers){
        // Use Java streams to filter positive numbers and collect them into a list
        return numbers.stream()
                .filter(number -> number > 0) // Filter positive numbers
                .collect(Collectors.toList()); // Collect filtered numbers into a list
    }
}
