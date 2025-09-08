import java.util.Arrays;
import java.util.stream.Collectors;

/*
ROT13 is a simple letter substitution cipher that replaces a letter with the letter
13 letters after it in the alphabet. ROT13 is an example of the Caesar cipher.

Create a function that takes a string and returns the string ciphered with Rot13.
If there are numbers or special characters included in the string, they should be
returned as they are. Only letters from the latin/english alphabet should be shifted,
like in the original Rot13 "implementation".


 */
public class ROT13 {
    public static String rot13(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c >= 'A' && c <= 'Z') {
                // Uppercase letters: wrap in range 'A'..'Z'
                chars[i] = (char) ('A' + (c - 'A' + 13) % 26);
            } else if (c >= 'a' && c <= 'z') {
                // Lowercase letters: wrap in range 'a'..'z'
                chars[i] = (char) ('a' + (c - 'a' + 13) % 26);
            }
            // Non-letters stay unchanged
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(rot13("grfg")); // test → "test"
        System.out.println(rot13("Grfg")); // Test → "Test"
    }
}



