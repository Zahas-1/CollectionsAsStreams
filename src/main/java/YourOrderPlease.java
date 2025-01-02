import java.util.Arrays;
import java.util.Comparator;

public class YourOrderPlease {
    public static String orderStreams(String words) {
        // If the input is empty, return an empty string
        if (words.isEmpty()) {
            return "";
        }

        // Split the input into words, then sort based on the number in each word
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparingInt(s -> Integer.parseInt(s.replaceAll("\\D", ""))))  // Sort by the number
                .reduce((a, b) -> a + " " + b)  // Join the words with spaces
                .orElse("");  // Handle the case where the stream is empty
    }

    public static String order(String words) {
        // If the input is empty, return an empty string
        if (words.isEmpty()) {
            return "";
        }

        String[] StringHold = words.split(" ");
        String[] result = new String[StringHold.length];

        for (String item : StringHold) {
            for (char number : item.toCharArray()) {
                if (Character.isDigit(number)) {
                    // Place the word in the correct position based on the number
                    int position = Character.getNumericValue(number); // Convert char to int
                    result[position - 1] = item;  // Place in the correct position (1-based to 0-based)
                }
            }
        }

        // Join the result array into a single string, separated by spaces
        return String.join(" ", result);
    }
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));  // Output: "Thi1s is2 3a T4est"
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));  // Output: "Fo1r the2 g3ood 4of th5e pe6ople"
        System.out.println(order(""));  // Output: ""

        System.out.println(orderStreams("is2 Thi1s T4est 3a"));  // Output: "Thi1s is2 3a T4est"
        System.out.println(orderStreams("4of Fo1r pe6ople g3ood th5e the2"));  // Output: "Fo1r the2 g3ood 4of th5e pe6ople"
        System.out.println(orderStreams(""));  // Output: ""
    }
}
