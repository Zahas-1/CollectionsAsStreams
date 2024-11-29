import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("Indivisibilities")); // Output: 2
        System.out.println(duplicateCount("abcde"));           // Output: 0
        System.out.println(duplicateCount("aA11"));            // Output: 2
        System.out.println(duplicateCount("ABBA"));            // Output: 2

        System.out.println(duplicateCountStream("Indivisibilities")); // Output: 2
        System.out.println(duplicateCountStream("abcde"));           // Output: 0
        System.out.println(duplicateCountStream("aA11"));            // Output: 2
        System.out.println(duplicateCountStream("ABBA"));            // Output: 2
    }

    public static int duplicateCount(String text) {
        // Convert the text to lowercase for case-insensitivity
        text = text.toLowerCase();

        // Create a HashMap to count occurrences of each character
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Iterate over each character in the text
        for (char c : text.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Count characters that occur more than once
        int duplicateCount = 0;
        for (int count : charCount.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }

        return duplicateCount;
    }
    public static long duplicateCountStream(String text){
        // Convert to lowercase, group by characters, and count duplicates
        return text.toLowerCase()
                .chars() // Stream of characters as int
                .mapToObj(c -> (char) c) // Convert int stream to Character stream
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Count occurrences
                .values() // Get counts of each character
                .stream() // Stream of counts
                .filter(count -> count > 1) // Keep counts greater than 1
                .count(); // Count how many characters have duplicates
    }
}
