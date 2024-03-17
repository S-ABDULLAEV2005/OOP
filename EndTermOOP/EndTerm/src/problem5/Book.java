package problem5;
public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int publicationYear;

        public int compareTo(Book otherBook) {
        return this.title.compareTo(otherBook.title);
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
