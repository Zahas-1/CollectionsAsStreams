//Complete the function that
//
//accepts two integer arrays of equal length
//compares the value each member in one array to the corresponding member in the other
//squares the absolute value difference between those two values
//and returns the average of those squared absolute value difference between each member pair.
//Examples
// [1, 2, 3], [4, 5, 6]              -->   9   because (9 + 9 + 9) / 3
// [10, 20, 10, 2], [10, 25, 5, -2]  -->  16.5 because (0 + 25 + 25 + 16) / 4
// [-1, 0], [0, -1]                  -->   1   because (1 + 1) / 2

import java.util.stream.IntStream;

public class MeanSquareError {
    public static double Solution(int[] arr1, int[] arr2) {
        // Create an IntStream that iterates over the indices of the arrays (0 to arr1.length - 1)
        return IntStream.range(0, arr1.length)
                // Map each index to the squared difference of corresponding elements in arr1 and arr2
                .mapToDouble(i -> Math.pow(arr1[i] - arr2[i], 2))
                // Calculate the average of the squared differences
                .average()
                // If the array is empty (though this shouldn't happen for equal-length arrays), return 0
                .orElse(0);
    }

    public static void main(String[] args) {
        System.out.println("Expected: 9.0 - Actual: " + Solution(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        System.out.println("Expected: 16.5- Actual: " + Solution(new int[]{10, 20, 10, 2}, new int[]{10, 25, 5, -2}));
        System.out.println("Expected: 1.0 - Actual: " + Solution(new int[]{0, -1}, new int[]{-1, 0}));
        System.out.println("Expected: 0.0 - Actual: " + Solution(new int[]{10, 10}, new int[]{10, 10}));
    }
}