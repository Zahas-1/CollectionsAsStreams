import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Class for reading files line by line
public class ReadingFilesPerLine {
    public static void main(String[] args) {
        // Read the file and print each line
        read("data.txt").stream().forEach(System.out::println);
    }

    // Method to read a file line by line and return a list of lines
    public static List<String> read(String file){
        List<String> rows = new ArrayList<>(); // Create a list to store lines from the file
        try{
            // Read each line from the file and add it to the list
            Files.lines(Paths.get(file)).forEach(row -> rows.add(row));
        } catch (Exception e){
            // If an error occurs, print a message
            System.out.println("Error: File not found");
        }
        return rows; // Return the list of lines read from the file
    }
}
