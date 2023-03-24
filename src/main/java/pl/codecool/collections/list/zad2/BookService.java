package pl.codecool.collections.list.zad2;

import java.util.*;

public class BookService {

    private final List<Book> books = new ArrayList<>();

    public boolean add(Book book) {
        return books.add(book);
    }

    public boolean remove(Book book) {
        return books.remove(book);
    }

    public List<Book> getAll() {
        return new ArrayList<>(books);
    }

    public List<Book> findFantasyBooks() {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getGenre().equals(Genre.FANTASY)) {
                result.add(book);
            }
        }

        return result;
    }

    public List<Book> findPublishedBefore1999() {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getPublicationYear() < 1999) {
                result.add(book);
            }
        }

        return result;
    }

    public Book findTheMostExpensive() {
        Book book = books.get(0);
        for (int i = 1; i < books.size(); i++) {
            if (books.get(i).getPrice() > book.getPrice()) {
                book = books.get(i);
            }
        }
        return book;
    }

    public Book findTheCheapest() {
        Book book = books.get(0);
        for (int i = 1; i < books.size(); i++) {
            if (books.get(i).getPrice() < book.getPrice()) {
                book = books.get(i);
            }
        }
        return book;
    }

    public Book findWithThreeAuthors() {
        for (Book book : books) {
            if (book.getAuthors().size() >= 3) {
                return book;
            }
        }
        return null;
    }

    public boolean isPresent(Book book) {
        return books.contains(book);
    }

    public List<Book> findByAuthor(Author author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public Deque<Book> getStackByPriceDescending() {
        List<Book> copy = new ArrayList<>(books);

        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        };

        copy.sort(comparator);
        return new LinkedList<>(copy);
    }
}
