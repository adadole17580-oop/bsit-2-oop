public class BookInfo {
    String title = "";
    String author = "";
    int pages = 0;
    boolean isAvailable = true;

    public BookInfo(String bookTitle, String bookAuthor, int bookPages) {
        this.title = bookTitle;
        this.author = bookAuthor;
        this.pages = bookPages;

        System.out.println("A new book " + title + " by " + author + " has been added to the library!");
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book " + title + " was borrowed successfully.");
        } else {
            System.out.println("The book " + title + " is currently unavailable.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("You have returned " + title + " to the library.");
    }

}
