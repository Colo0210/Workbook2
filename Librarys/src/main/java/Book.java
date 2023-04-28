public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkOutTo;



    public Book(int id, String isbn, String title, boolean isCheckedout, String checkOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        isCheckedOut = false;
        checkOutTo = "";
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckOutTo() {
        return checkOutTo;
    }

    public void checkOut(String name) {
        isCheckedOut = true;
        checkOutTo = name;
    }

    public void checkIn() {
        isCheckedOut = false;
        checkOutTo = "";
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }
}