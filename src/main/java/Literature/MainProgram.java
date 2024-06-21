package Literature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//        Class Diagram
//        +---------------------+           +------------------------+
//        |     MainProgram     |           |         Book           |
//        +---------------------+           +------------------------+
//        |                     |           | - name: String         |
//        | - booksArray: ArrayList<Book>   | - age: int             |
//        | - s: Scanner        |           +------------------------+
//        | - comparator1: Comparator<Book> | + getAge(): int        |
//        +---------------------+           | + getName(): String    |
//        | + main(String[] args): void     | + Book(String, int)    |
//        +---------------------+           +------------------------+


// Main program to manage a collection of books
public class MainProgram {
    public static void main(String[] args) {

        // Create an ArrayList to store Book objects
        ArrayList<Book> booksArray = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        // Define a comparator to sort books by age rating and then by name
        Comparator<Book> comparator1 = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);

        // Loop to continuously accept user input until a blank space is entered
        while (true) {
            System.out.println("Input name (Blank space ends chat)");
            String user = s.nextLine();
            if (user.trim().isBlank()) {
                break;
            }
            System.out.println("Enter age rating: ");
            int age = Integer.valueOf(s.nextLine());
            booksArray.add(new Book(user, age)); // Add new Book object to the list
        }

        // Print the total number of books entered
        System.out.println(booksArray.size() + " books in total");

        // Sort the list of books and print each one
        booksArray.stream()
                .sorted(comparator1)
                .forEach(item -> System.out.println(item));
    }
}

