import java.util.stream.IntStream;

public class BuildTower {

    // Iterative version: Builds the tower using a regular for loop
    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors]; // Create an array to hold each level of the tower
        int width = nFloors * 2 - 1; // Calculate the full width of the bottom floor (widest row)

        for (int i = 0; i < nFloors; i++) {
            int stars = 2 * i + 1; // Number of '*' characters increases by 2 each level
            int spaces = (width - stars) / 2; // Equal number of spaces on both sides to center the stars

            // Construct the current level with spaces and stars, then assign to the array
            String level = " ".repeat(spaces) + "*".repeat(stars) + " ".repeat(spaces);
            tower[i] = level;
        }

        return tower; // Return the completed tower as a string array
    }

    // Streams version: Builds the tower using Java streams
    public static String[] towerBuilderStream(int nFloors) {
        int width = nFloors * 2 - 1; // Same as before, calculate the max width

        // Use IntStream to map each floor index to its corresponding row string
        return IntStream.range(0, nFloors)
                .mapToObj(i -> {
                    int stars = 2 * i + 1; // Compute number of stars for this floor
                    int spaces = (width - stars) / 2; // Compute spaces to center the stars
                    return " ".repeat(spaces) + "*".repeat(stars) + " ".repeat(spaces); // Return formatted row
                })
                .toArray(String[]::new); // Collect the results into a String array
    }

    // Test method to print the tower using both implementations
    public static void main(String[] args) {

        // Test the regular loop-based implementation with 3 floors
        System.out.println("Loop-based implementation:");
        for (String row : towerBuilder(3)) {
            System.out.println("\"" + row + "\"");
        }

        System.out.println();

        // Test the stream-based implementation with 3 floors
        System.out.println("Stream-based implementation:");
        for (String row : towerBuilderStream(3)) {
            System.out.println("\"" + row + "\"");
        }
    }
}
