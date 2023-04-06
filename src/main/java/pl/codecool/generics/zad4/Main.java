package pl.codecool.generics.zad4;

public class Main {

    public static void main(String[] args) {

        Library<Book> bookLibrary = new Library<>();

        Book book1 = new Book("Kowalski", "Ebook", "1234", 100);
        Book book2 = new Book("Nowak", "Empik", "xyz", 171);
        Book book3 = new Book("Miron", "Czytamy", "abcd", 200);
        Book book4 = new Book("Kwiatkowski", "Helion", "0986", 1000);

        bookLibrary.add(book1);
        bookLibrary.add(book2);
        bookLibrary.add(book3);
        bookLibrary.add(book4);

        System.out.println(bookLibrary.printAll());

        bookLibrary.remove(book1);
        System.out.println(bookLibrary.printAll());

        Movie movie1 = new Movie("Movie1", "Kieślowski", 1970, "Paramount");
        Movie movie2 = new Movie("Movie2", "Tarantino", 2000, "Worner Bros");
        Movie movie3 = new Movie("Movie3", "Spielberg", 2005, "Good Movies");

        Paper paper1 = new Paper("Paper content", "Gazeta-Wwa", 27);

        Library<Medium> mediumLibrary = new Library<>();

        mediumLibrary.add(book1);
        mediumLibrary.add(book2);
        mediumLibrary.add(book3);
        mediumLibrary.add(book4);

        mediumLibrary.add(movie1);
        mediumLibrary.add(movie2);
        mediumLibrary.add(movie3);

        mediumLibrary.add(paper1);

        System.out.println(mediumLibrary.printAll());

        mediumLibrary.remove(paper1);
        System.out.println(mediumLibrary.printAll());
    }
}
