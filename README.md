# Neighborhood Library App
This is a command-line Java application that simulates a neighborhood library system. The program allows users to view a list of available books, check out a book, and check in a book.

# LibraryApp
This is the main class that contains the main method. It is responsible for handling user input and displaying output to the console.

The LibraryApp class uses an array of Book objects to represent the library's collection of books. It provides two options to the user: displaying a list of available books and displaying a list of checked-out books.

If the user chooses to view the list of available books, the program displays the ID, ISBN, and title of each book that is not checked out. The user can then enter the ID of the book they want to check out, as well as their name. If the book is available, the program marks it as checked out and assigns it to the user.

If the user chooses to view the list of checked-out books, the program displays the ID, ISBN, title, and the name of the person who checked out each book. The user can then choose to check in a book by entering its ID, or return to the main menu.

# Book
This class represents a book in the library's collection. It has the following properties:


* id: The ID number of the book.
* isbn: The ISBN number of the book.
* title: The title of the book.
* isCheckedOut: A boolean flag that indicates whether the book is checked out or not.
* checkOutTo: The name of the person who checked out the book.

The Book class also provides two methods:

* checkOut(String name): This method marks the book as checked out and assigns it to the specified user.
* checkIn(): This method marks the book as checked in and clears the user assignment.

# Snapshots
![bibliohomescreen](https://user-images.githubusercontent.com/130699665/235062928-ed8eb4cd-a874-4a94-9460-2b5f529e1974.png)
![librosScreen](https://user-images.githubusercontent.com/130699665/235062931-a699df7e-5525-48bb-bdde-56cebd29635f.png)

I found the for books loop to be interesting, because it demonstrates how object-oriented programming can be used to create reusable code. By defining a Book class, the code can easily manage book objects and their properties. The for loop also shows how iteration can be used to access and manipulate each object in an array.
