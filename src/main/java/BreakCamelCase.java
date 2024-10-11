import java.util.stream.Collectors;

public class BreakCamelCase {

    public static String camelCase(String input) {
        return input.chars()  // Convert the input string to an IntStream of character codes
                .mapToObj(i ->  // Map each character code to a String
                        // If the character is uppercase, prepend a space to it
                        Character.isUpperCase(i) ? " " + (char) i : "" + (char) i  // Otherwise, just cast the character to a string
                )
                // Collect all mapped characters back into a single string
                .collect(Collectors.joining());  // Join all elements into a single string without delimiters
    }

    //Test cases
    public static void main(String[] args) {
        String input = "camelCaseExample";
        String result = camelCase(input);
        System.out.println(result);  // Output: "camel Case Example"
    }

}
