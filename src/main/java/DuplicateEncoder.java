/*
The goal of this exercise is to convert a string to a new string where
each character in the new string is "(" if that character appears only
once in the original string, or ")" if that character appears more than
once in the original string. Ignore capitalization when determining if
a character is a duplicate.

        "din"      =>  "((("
        "recede"   =>  "()()()"
        "Success"  =>  ")())())"
        "(( @"     =>  "))(("
*/

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    public static String encode(String word) {
        // Convert the word to lowercase to ignore capitalization
        String lowerCaseWord = word.toLowerCase();

        // Create a map to store character frequencies
        Map<Character, Integer> charCount = new HashMap<>();

        // First pass: Count occurrences of each character
        for (char ch : lowerCaseWord.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Second pass: Construct encoded string
        StringBuilder encodedWord = new StringBuilder();
        for (char ch : lowerCaseWord.toCharArray()) {
            if (charCount.get(ch) > 1) {
                encodedWord.append(")");
            } else {
                encodedWord.append("(");
            }
        }

        return encodedWord.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(encode("din"));      // "((("
        System.out.println(encode("recede"));   // "()()()"
        System.out.println(encode("Success"));  // ")())())"
        System.out.println(encode("(( @"));     // "))(("
    }
}