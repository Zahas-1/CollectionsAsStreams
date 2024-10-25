import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOutStrings {

    // Method to filter out all String elements from the list
    public static List<Object> filterList(final List<Object> list) {
        // Create a stream from the list, filter out elements that are instances of String,
        // and collect the remaining elements into a new list
        return list.stream()
                .filter(i -> !(i instanceof String))  // Keep only non-String elements
                .collect(Collectors.toList());        // Collect the filtered elements back into a List
    }

    // Test code
    public static void main(String[] args) {
        // Create a list of mixed types (integers and strings)
        List<Object> items = new ArrayList<>();
        items.add(1);      // Integer
        items.add(2);      // Integer
        items.add("a");    // String
        items.add("b");    // String

        // Call filterList to remove Strings and print the filtered list
        System.out.println(filterList(items));  // Output will be [1, 2]
    }
}
