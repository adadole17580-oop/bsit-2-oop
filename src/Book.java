public class Book {
    public static void main(String[] ars) {
        BookInfo book1 = new BookInfo("He's Into Her S1", "MaxineJiji", 91);
        BookInfo book2 = new BookInfo("Amorous Agreement", "Cecelib",78);
        BookInfo book3 = new BookInfo("Tell Me Where It Hurts", "Marco Jose", 73);


        System.out.println();
        book1.displayInfo();
        book1.borrowBook();
        System.out.println();
        book1.displayInfo();
        book1.returnBook();

        System.out.println();
        book2.displayInfo();
        book2.borrowBook();
        System.out.println();
        book2.displayInfo();
        book2.returnBook();

        System.out.println();
        book3.displayInfo();
        book3.borrowBook();
        System.out.println();
        book3.displayInfo();
        book3.returnBook();
    }
}