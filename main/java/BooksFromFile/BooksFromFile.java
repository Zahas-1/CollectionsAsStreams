package BooksFromFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Class to read books from a file
public class BooksFromFile {
    public static void main(String[] args) {
        // Read books from the file and print them
        readBooks("book.txt").forEach(System.out::println);
    }

    // Method to read books from a file and return a list of Book objects
    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>(); // List to store Book objects

        try {
            // Read lines from the file and process each line
            Files.lines(Paths.get(file))
                    .map(row -> row.split(",")) // Split each line by comma
                    .filter(parts -> parts.length >= 4) // Filter lines with at least four parts
                    .map(row -> new Book(row[0], Integer.valueOf(row[1]), Integer.valueOf(row[2]), row[3])) // Create Book objects from the parts
                    .forEach(row -> books.add(row)); // Add each Book object to the list
        } catch (IOException e) {
            throw new RuntimeException(e); // Throw a runtime exception if an IO error occurs
        }

        return books; // Return the list of Book objects
    }
}
