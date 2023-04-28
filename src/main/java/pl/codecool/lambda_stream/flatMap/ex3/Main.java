package pl.codecool.lambda_stream.flatMap.ex3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("src/main/java/pl/codecool/lambda_stream/flatMap/ex3/myBook.txt"));

        LettersService lettersService = new LettersService();

        System.out.println(lettersService.countLetters(lines));
        System.out.println(lettersService.calculateLettersOccurrences(lines));
    }
}
