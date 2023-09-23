package Task3;

public class Main {
    public static void main() {
        Book book1 = new Book();
        Book book2 = new Book("Me", "Life", 2004, 18);
        Book book3 = new Book();
        book3.setTitle("Harry Potter and the Philosopher's Stone");
        book3.setAuthor("J.K. Rowling");
        book3.setNumberOfPages(227);
        book3.setYearOfIssue(1997);
        book2.setYearOfIssue();
        book1.show();
        book2.showByTitle();
        book3.show();
    }
}
