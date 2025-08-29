/*
Take an array and remove every second element from the array.
Always keep the first element and start removing with the next element.

Example:
["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveElements {
    public static Object[] removeEveryOther(Object[] arr) {

        return IntStream.range(0, arr.length)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> arr[i])
                .toArray();
    }

    public static void main(String[] args) {
        Object[] result = removeEveryOther(new Object[]{"Keep", "Remove", "Keep", "Remove", "Keep"});
        System.out.println(Arrays.toString(result)); // Output: [Keep, Keep, Keep]
    }
}
