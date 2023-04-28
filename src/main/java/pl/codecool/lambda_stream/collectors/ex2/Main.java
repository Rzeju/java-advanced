package pl.codecool.lambda_stream.collectors.ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("src/main/java/pl/codecool/lambda_stream/collectors/ex2/myBook.txt"));

        BookService bookService = new BookService();

        System.out.println(bookService.findExistingWords(lines));
        System.out.println(bookService.countWords(lines));

        System.out.println(bookService.countWords(lines).equals(bookService.countWordsFlatMap(lines)));
        System.out.println(bookService.countWords(lines).equals(bookService.countWordsFlatMap2(lines)));

        System.out.println(bookService.countWordsFlatMap2(lines));

    }
}
