import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean isIsogram(String str) {
        // Convert the string to lowercase to make the check case-insensitive
        str = str.toLowerCase();

        // Use a Set to track seen characters
        Set<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (seen.contains(c)) {
                return false; // Found a repeated character
            }
            seen.add(c); // Add character to the set
        }

        return true; // No repeats found
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics")); // true
        System.out.println(isIsogram("aba"));              // false
        System.out.println(isIsogram("moOse"));            // false
        System.out.println(isIsogram(""));                 // true (empty string is an isogram)
    }
}