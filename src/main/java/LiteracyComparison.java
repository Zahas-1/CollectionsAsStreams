import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class LiteracyComparison {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> lines = new ArrayList<>(); // ArrayList to store lines from the CSV file

        try {
            // Read lines from the CSV file, split each line into an array of strings, and filter lines with at least 6 parts
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(",")) // Split each row by commas
                    .filter(parts -> parts.length >= 6) // Filter rows with at least 6 parts
                    .sorted((p1, p2) -> {
                        return p1[5].compareTo(p2[5]); // Sort rows based on the literacy rate (column index 5)
                    })
                    // Print the country, gender, literacy rate (sorted by literacy rate)
                    .forEach(p -> System.out.println(p[3] + " (" + p[4] + "), " + String.format(p[2].trim().split("\\s+")[0]) + ", " + p[5]));
        } catch (Exception e) { // Catch any exceptions that occur during file reading
            System.out.println(e); // Print the exception message
        }
    }
}
