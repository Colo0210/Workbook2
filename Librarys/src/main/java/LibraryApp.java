import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[5];
        books[0] = new Book(1, "9780140328721", "Matilda", false,"No one");
        books[1] = new Book(2, "9780545010221", "Harry Potter and the Sorcerer's Stone", false,"Bo one");
        books[2] = new Book(3, "9780064404990", "Where the Red Fern Grows", false, "No one");
        books[3] = new Book(4, "9780316183653", "The Martian", false, "No one");
        books[4] = new Book(5, "9780441172719", "Dune", false, "No One");
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the Neighborhood Library! What would you like to do?");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Available Books:");
                    for (Book book : books) {
                        if (!book.getIsCheckedOut()) {
                            System.out.println("ID: " + book.getId() + " ISBN: " + book.getIsbn() + " Title: " + book.getTitle());
                        }
                    }
                    System.out.println("Enter ID of the book you want to check out, or 0 to go back to the home screen:");
                    int bookId = scanner.nextInt();
                    if (bookId == 0) {
                        break;
                    }
                    System.out.println("Enter your name:");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    for (Book book : books) {
                        if (book.getId() == bookId) {
                            book.checkOut(name);
                            System.out.println("Book checked out successfully!");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Checked Out Books:");
                    for (Book book : books) {
                        if (book.getIsCheckedOut()) {
                            System.out.println("ID: " + book.getId() + " ISBN: " + book.getIsbn() + " Title: " + book.getTitle() + " Checked Out To: " + book.getCheckOutTo());
                        }
                    }
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