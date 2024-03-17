package problem5;

import java.util.*;

public class BookSortingExample {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));

        Collections.sort(books);

        System.out.println("Books sorted by title (natural ordering):");
        for (Book book : books) {
            System.out.println(book);
        }
        Collections.sort(books, new PublicationYearComparator());

        System.out.println("\nBooks sorted by publication year:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
