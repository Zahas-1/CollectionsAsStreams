import java.util.Arrays;

public class SumTwoSmallestNumbers {

    // This method returns the sum of the two smallest numbers in a long array
    public static long sumTwoSmallestNumbers(long[] numbers) {
        return Arrays.stream(numbers)     // Convert the array to a LongStream
                .sorted()                 // Sort the stream in ascending order
                .limit(2)                 // Take only the first two elements (smallest numbers)
                .sum();                   // Sum those two numbers and return the result
    }

    public static void main(String[] args) {
        // Testing the function with example inputs
        System.out.println(sumTwoSmallestNumbers(new long[]{19, 5, 42, 2, 77}));
        // Expected output: 7 (2 + 5)

        System.out.println(sumTwoSmallestNumbers(new long[]{10, 343445353, 3453445, 3453545353453L}));
        // Expected output: 3453455 (10 + 3453445)
    }
}
