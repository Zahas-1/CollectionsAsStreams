import java.util.Set;
import java.util.TreeSet;

public class TwoToOne {

    // Method to return the longest string with unique characters, sorted, without using streams
    public static String longest(String s1, String s2) {
        // Create a TreeSet to store characters in sorted order and remove duplicates
        Set<Character> set = new TreeSet<>();

        // Combine both strings s1 and s2 into a single string
        String s = s1 + s2;

        // Convert the combined string to a character array and add each character to the set
        // TreeSet automatically removes duplicates and keeps characters sorted
        for (char item : s.toCharArray()) {
            set.add(item);
        }

        // Create a StringBuilder to construct the final result string
        StringBuilder result = new StringBuilder();

        // Iterate through the set (which is now sorted and unique) and append each character to the StringBuilder
        for (char items : set) {
            result.append(items);
        }

        // Convert the StringBuilder to a String and return the result
        return result.toString();
    }

    // Method to return the longest string with unique characters, sorted, using streams
    public static String longestStream(String s1, String s2) {
        // Combine both strings s1 and s2 into a single string
        String s = s1 + s2;

        // Use streams to process the string
        return s.chars()  // Convert the string to a stream of characters (as ASCII code points)
                .distinct()  // Remove duplicate characters
                .sorted()  // Sort the characters in ascending order
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                // Collect the sorted characters back into a StringBuilder
                .toString();  // Convert the StringBuilder to a String and return the result
    }

    // Main method to test the two methods above
    public static void main(String[] args) {
        String s1 = "aretheyhere";
        String s2 = "yestheyarehere";

        // Test the non-stream method
        System.out.println("Without streams : " + longest(s1, s2));

        // Test the stream-based method
        System.out.println("With streams: " + longestStream(s1, s2));
    }
}