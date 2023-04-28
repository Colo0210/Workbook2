public class Book {
    // Private instance variables for the book's ID, ISBN, title, and checkout information
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkOutTo;


    // Constructor to initialize the book with its ID, ISBN, title, and checkout information
    public Book(int id, String isbn, String title, boolean isCheckedout, String checkOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        isCheckedOut = false;
        checkOutTo = "";
    }
    // Getter methods to retrieve the book's ID, ISBN, and title
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
    // Method to check if the book is checked out
    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    // Getter method to retrieve the name of the person who has checked out the book
    public String getCheckOutTo() {
        return checkOutTo;
    }

    // Method to check out the book to a person
    public void checkOut(String name) {
        isCheckedOut = true;
        checkOutTo = name;
    }

    // Method to check in the book, setting its checkout information to default values
    public void checkIn() {
        isCheckedOut = false;
        checkOutTo = "";
    }
    // Another method to check if the book is checked out, used in LibraryApp class
    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }
}