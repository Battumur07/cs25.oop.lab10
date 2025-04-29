
import java.util.*;
import java.util.stream.*;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    class BookShelf implements Iterable<Book> {
        private int minYear;

        public BookShelf(int minYear) {
            this.minYear = minYear;
        }

        @Override
        public Iterator<Book> iterator() {
            return books.stream()
                        .filter(book -> book.getYear() > minYear)
                        .iterator();
        }
    }
}
