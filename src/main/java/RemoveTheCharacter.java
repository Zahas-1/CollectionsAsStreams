//You are given a character string a (terminated with \0) and a character b.
// Print all characters of a that do not equal to b.
//
//Examples
//remove('\0a') -> ''
//remove('ssssss\0s') -> ''
//remove('abc\0o') -> 'abc'
//remove('asdffdsa\0f') -> 'asddsa'
//remove('Hello, World!\0l') -> 'Heo, Word!'

import java.util.stream.Collectors;

public class RemoveTheCharacter {
    public static String removeCharacter(String word) {
        // Find the index of the null terminator character (\0)
        int nullIndex = word.indexOf('\u0000');

        // If no null character is found or there's no character after it, return an empty string
        if (nullIndex == -1 || nullIndex == word.length() - 1) {
            return "";
        }

        //Extract the actual string (before \0)
        String mainString = word.substring(0, nullIndex);

        // Extract the character to remove (after \0)
        char removeChar = word.charAt(nullIndex + 1);

        // Use StringBuilder for efficient string modification
        StringBuilder result = new StringBuilder();
        for (char letter : mainString.toCharArray()) {
            if (letter != removeChar) {
                result.append(letter);  // Add only if it's not the character to remove
            }
        }

        return result.toString();
    }

    public static String removeStreams(String word) {
        // Find the index of the null terminator character (\0)
        int nullIndex = word.indexOf('\u0000');

        // If no null character is found or there's no character after it, return an empty string
        if (nullIndex == -1 || nullIndex == word.length() - 1) {
            return "";
        }

        // Extract the actual string (before \0)
        String mainString = word.substring(0, nullIndex);

        // Extract the character to remove (after \0)
        char removeChar = word.charAt(nullIndex + 1);

        // Use Stream to filter characters and remove the target character
        return mainString.chars() // Convert String to IntStream (characters)
                .filter(c -> c != removeChar) // Remove occurrences of the character
                .mapToObj(c -> String.valueOf((char) c)) // Convert back to String
                .collect(Collectors.joining()); // Join characters back into a single string
    }

    public static void main(String[] args) {
        System.out.println("Simple method: " + removeCharacter("\0a"));          // ""
        System.out.println("Simple method: " + removeCharacter("ssssss\0s"));     // ""
        System.out.println("Simple method: " + removeCharacter("abc\0o"));       // "abc"
        System.out.println("Simple method: " + removeCharacter("asdffdsa\0f"));  // "asddsa"
        System.out.println("Simple method: " + removeCharacter("Hello, World!\0l") ); // "Heo, Word!"

        System.out.println("\r\nStream method: " + removeStreams("\0a"));          // ""
        System.out.println("Stream method: " + removeStreams("ssssss\0s"));     // ""
        System.out.println("Stream method: " + removeStreams("abc\0o"));       // "abc"
        System.out.println("Stream method: " + removeStreams("asdffdsa\0f"));  // "asddsa"
        System.out.println("Stream method: " + removeStreams("Hello, World!\0l")); // "Heo, Word!"
    }
}
