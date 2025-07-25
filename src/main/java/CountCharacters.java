/*
The main idea is to count all the occurring characters in a string.
If you have a string like aba, then the result should be {'a': 2, 'b': 1}.

What if the string is empty? Then the result should be empty object literal, {}.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharacters {

    /**
     * Counts the occurrences of each character (case-insensitive) in the input string using a loop.
     *
     * @param str The input string.
     * @return A Map of character counts (Character -> Integer).
     */
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> lettersMap = new HashMap<>();

        // Convert the string to lowercase and to a char array, then count each character
        for (char c : str.toLowerCase().toCharArray()) {
            // merge() adds 1 if character is new, or adds 1 to the existing count
            lettersMap.merge(c, 1, Integer::sum);
        }

        return lettersMap;
    }

    /**
     * Counts character occurrences using Java Streams.
     *
     * @param str The input string.
     * @return A Map of character counts (Character -> Long).
     */
    public static Map<Character, Long> streamMethod(String str) {
        return str.toLowerCase()
                .chars()                        // Convert to IntStream of character codes
                .mapToObj(c -> (char) c)        // Convert to Character Stream
                .collect(Collectors.groupingBy( // Group by character
                        c -> c,
                        Collectors.counting()   // Count occurrences
                ));
    }

    public static void main(String[] args) {
        String testStr = "Hello World!";

        // Test loop-based method
        System.out.println("Loop method:");
        Map<Character, Integer> countResult = count(testStr);
        countResult.forEach((k, v) -> System.out.println("'" + k + "' -> " + v));

        System.out.println();

        // Test stream-based method
        System.out.println("Stream method:");
        Map<Character, Long> streamResult = streamMethod(testStr);
        streamResult.forEach((k, v) -> System.out.println("'" + k + "' -> " + v));
    }

}
