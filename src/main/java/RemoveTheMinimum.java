/*
Given an array of integers, remove the smallest value. Do not mutate the original array/list.
If there are multiple elements with the same value, remove the one with the lowest index.
If you get an empty array/list, return an empty array/list.

Don't change the order of the elements that are left.

Examples
* Input: [1,2,3,4,5], output = [2,3,4,5]
* Input: [5,3,2,1,4], output = [5,3,2,4]
* Input: [2,2,1,2,1], output = [2,2,2,1]

 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveTheMinimum {

    public static int[] removeSmallest(int[] numbers) {
        // Handle null or empty input: return empty array
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        // Find the index of the first occurrence of the smallest number
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;  // Update index if a smaller value is found
            }
        }

        // Create a new array of length one less (excluding the min element)
        int[] result = new int[numbers.length - 1];

        // Copy all elements except the one at minIndex
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (i != minIndex) {
                result[j++] = numbers[i];  // Only copy non-minIndex elements
            }
        }

        return result;
    }


    public static int[] removeSmallestStream(int[] numbers) {
        // Handle null or empty array
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        // Convert array to List<Integer> for stream operations
        List<Integer> list = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());

        // Find index of the first occurrence of the minimum value
        int min = Collections.min(list);
        int minIndex = list.indexOf(min);

        // Use IntStream to filter out the element at minIndex
        return IntStream.range(0, list.size())
                .filter(i -> i != minIndex)  // Skip the smallest at its first occurrence
                .map(i -> list.get(i))       // Map back to int values
                .toArray();                  // Collect into int[]
    }


    // Testing the method
    public static void main(String[] args) {
        //Testing stream method
        System.out.println(Arrays.toString(removeSmallestStream(new int[]{1, 2, 3, 4, 5}))); // [2, 3, 4, 5]
        System.out.println(Arrays.toString(removeSmallestStream(new int[]{5, 3, 2, 1, 4}))); // [5, 3, 2, 4]
        System.out.println(Arrays.toString(removeSmallestStream(new int[]{2, 2, 1, 2, 1}))); // [2, 2, 2, 1]
        System.out.println(Arrays.toString(removeSmallestStream(new int[]{})));             // []

        //Testing non-stream method
        System.out.println(Arrays.toString(removeSmallest(new int[]{1, 2, 3, 4, 5}))); // [2, 3, 4, 5]
        System.out.println(Arrays.toString(removeSmallest(new int[]{5, 3, 2, 1, 4}))); // [5, 3, 2, 4]
        System.out.println(Arrays.toString(removeSmallest(new int[]{2, 2, 1, 2, 1}))); // [2, 2, 2, 1]
        System.out.println(Arrays.toString(removeSmallest(new int[]{})));             // []

    }


}

