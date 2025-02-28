import java.util.stream.IntStream;

public class Summation {

    // Traditional method to calculate the sum of numbers from 1 to n
    public static int summation(int n) {
        int sum = 0; // Initialize sum variable
        for(int i = n; i > 0; i--) { // Loop from n down to 1
            sum = sum + i; // Add the current number to sum
        }
        return sum; // Return the final summation result
    }

    // Method using Java Streams to achieve the same result
    public static int summationStream(int n) {
        // Using IntStream to generate numbers from 1 to n and summing them
        return IntStream.rangeClosed(1, n).sum();
    }

    public static void main(String[] args) {
        // Testing the summation methods
        System.out.println("Summation using basic method: " + summation(20));
        System.out.println("Summation using a stream method: " + summationStream(20));
    }
}
