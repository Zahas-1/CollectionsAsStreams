/*
Write a function that takes an array of numbers (integers for the tests)
and a target number. It should find two different items in the array that,
when added together, give the target value. The indexes of these items
should then be returned in a tuple / list (depending on your language)
like so: (index1, index2).

For the purposes of this kata, some tests may have multiple answers;
any valid solutions will be accepted.

The input will always be valid (numbers will be an array of length 2 or greater,
and all of the items will be numbers; target will always be the sum of two
different items from that array).
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        // Map to store numbers and their indices
        Map<Integer, Integer> numToIndex = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            // If complement is already in the map, return the indices
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }

            // Store current number with its index
            numToIndex.put(numbers[i], i);
        }

        // Should never reach here if input guarantees a solution
        return new int[0];
    }
}

