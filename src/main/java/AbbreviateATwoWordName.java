import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateATwoWordName {

    // Method to abbreviate a two-word name using direct character access
    public static String abbrevName(String name) {
        // Split the input string into two parts based on the space delimiter
        String[] splitString = name.split(" ");

        // Convert the first and second parts of the name into character arrays
        char[] first = splitString[0].toCharArray();
        char[] second = splitString[1].toCharArray();

        // Return the first character of each part concatenated with a period and converted to uppercase
        return (first[0] + "." + second[0]).toUpperCase();
    }

    // Method to abbreviate a two-word name using Java Streams
    public static String abbrevNameStream(String name) {
        return Arrays.stream(name.split(" ")) // Split the input string into a stream of words
                .map(i -> i.substring(0, 1).toUpperCase()) // Extract the first character of each word and convert it to uppercase
                .collect(Collectors.joining(".")); // Join the uppercase initials with a period
    }
}

