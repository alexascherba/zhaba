package Task3;

import java.util.Scanner;

public class Book {
    private String author, title;
    private int numberOfPages, yearOfIssue;

    public int getNumberOfPages() { return numberOfPages; }

    public int getYearOfIssue() { return yearOfIssue; }

    public String getAuthor() { return author; }

    public String getTitle() { return title; }

    public void setAuthor(String author) { this.author = author;}

    public void setNumberOfPages(int numberOfPages) { this.numberOfPages = numberOfPages; }

    public void setTitle(String title) { this.title = title; }

    public void setYearOfIssue(int yearOfIssue) { this.yearOfIssue = yearOfIssue; }

    public Book() {
        author = "Lois Lowry";
        title = "Number the star";
        yearOfIssue = 1989;
        numberOfPages = 150;
    }
    public Book(String author, String title, int yearOfIssue, int numberOfPages) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
        this.numberOfPages = numberOfPages;
    }
    public void showByTitle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String bookTitle = input.nextLine();
        if (bookTitle.equals(title)) {
            System.out.println("Author is " + author + ", year of issue is " + yearOfIssue + ", number og pages are " + numberOfPages);
        } else {
            System.out.println("Sorry, book not found.");
        }
    }
    public void setAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        this.author = author;
    }
    public void setNumberOfPages() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of pages: ");
        int numberOfPages = sc.nextInt();
        this.numberOfPages = numberOfPages;
    }
    public void setTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        this.title = title;

    }
    public void setYearOfIssue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year of issue: ");
        int yearOfIssue = sc.nextInt();
        this.yearOfIssue = yearOfIssue;
    }
    public void show() {
        System.out.println("Author is " + author + ", title is " + title +  ", year of issue is " + yearOfIssue + ", number og pages are " + numberOfPages);
    }
}
