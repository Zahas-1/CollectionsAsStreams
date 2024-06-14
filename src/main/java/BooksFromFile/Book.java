package BooksFromFile;

// Class representing a book
public class Book {
    private String name; // Name of the book
    private int publishingYear; // Year the book was published
    private int pageCount; // Number of pages in the book
    private String author; // Author of the book

    // Constructor to initialize the book with its attributes
    public Book(String name, int ReleaseYear, int pages, String author) {
        this.name = name; // Set the name of the book
        this.publishingYear = ReleaseYear; // Set the publishing year of the book
        this.pageCount = pages; // Set the number of pages of the book
        this.author = author; // Set the author of the book
    }

    // Getter method to retrieve the name of the book
    public String getName() {
        return name;
    }

    // Getter method to retrieve the publishing year of the book
    public int getPublishingYear() {
        return publishingYear;
    }

    // Getter method to retrieve the author of the book
    public String getAuthor() {
        return author;
    }

    // Getter method to retrieve the number of pages of the book
    public int getPagecount() {
        return pageCount;
    }

    // Method to represent the book as a string
    public String toString() {
        return getName() + ", " + getPublishingYear() + ", " + getPagecount() + ", " + getAuthor(); // Return a string representation of the book
    }
}
