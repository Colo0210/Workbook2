import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        // create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // create an array of 5 Book objects
        Book[] books = new Book[5];
        // initialize the array with some books
        books[0] = new Book(1, "9780140328721", "Matilda", false,"No one");
        books[1] = new Book(2, "9780545010221", "Harry Potter and the Sorcerer's Stone", false,"Bo one");
        books[2] = new Book(3, "9780064404990", "Where the Red Fern Grows", false, "No one");
        books[3] = new Book(4, "9780316183653", "The Martian", false, "No one");
        books[4] = new Book(5, "9780441172719", "Dune", false, "No One");
        // a boolean flag to keep track of whether the program should continue running or not
        boolean running = true;
        // loop until the user chooses to exit the program
        while (running) {
            // display the main menu
            System.out.println("Welcome to the Neighborhood Library! What would you like to do?");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");

            // read the user's choice
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // display the available books
                    System.out.println("Available Books:");
                    for (Book book : books) {
                        if (!book.getIsCheckedOut()) {
                            System.out.println("ID: " + book.getId() + " ISBN: " + book.getIsbn() + " Title: " + book.getTitle());
                        }
                    }
                    // ask the user to check out a book
                    System.out.println("Enter ID of the book you want to check out, or 0 to go back to the home screen:");
                    int bookId = scanner.nextInt();
                    if (bookId == 0) {
                        break;
                    }
                    // ask the user for their name
                    System.out.println("Enter your name:");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    // try to check out the selected book
                    for (Book book : books) {
                        if (book.getId() == bookId) {
                            book.checkOut(name);
                            System.out.println("Book checked out successfully!");
                            break;
                        }
                    }
                    break;
                case 2:
                    // display the checked out books
                    System.out.println("Checked Out Books:");
                    for (Book book : books) {
                        if (book.getIsCheckedOut()) {
                            System.out.println("ID: " + book.getId() + " ISBN: " + book.getIsbn() + " Title: " + book.getTitle() + " Checked Out To: " + book.getCheckOutTo());
                        }
                    }
                    // ask the user if they want to check in a book or go back to the home screen
                    System.out.println("Enter C to check in a book, or X to go back to the home screen:");
                    scanner.nextLine();
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("C")) {
                        System.out.println("Enter ID of the book you want to check in:");
                        int bookIdToCheckIn = scanner.nextInt();
                        for (Book book : books) {
                            if (book.getId() == bookIdToCheckIn) {
                                book.checkIn();
                                System.out.println("Book checked in successfully!");
                                break;
                            }
                        }
                    } else if (input.equalsIgnoreCase("X")) {
                        break;
                    }
                    break;
                case 3:
                    running = false;
                    System.out.println("Thanks for using the Neighborhood Library! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}