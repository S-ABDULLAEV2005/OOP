package problem5;

import java.util.Comparator;

public class PublicationYearComparator implements Comparator<Book> {
    s
    public int compare(Book book1, Book book2) {
        return Integer.compare(book1.getPublicationYear(), book2.getPublicationYear());
    }
}
