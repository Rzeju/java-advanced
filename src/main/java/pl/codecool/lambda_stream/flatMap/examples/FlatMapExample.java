package pl.codecool.lambda_stream.flatMap.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        List<String> letters = words.stream()
                .flatMap(w -> Arrays.stream(w.split("")))
                .collect(Collectors.toList());

        List<String> letters2 = words.stream()
                .flatMap(FlatMapExample::letters)
                .collect(Collectors.toList());
    }

    public static Stream<String> letters(String s) {
        //return Arrays.stream(s.split(""));
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            result.add(s.substring(i, i + 1));
        }

        return result.stream();
    }
}
