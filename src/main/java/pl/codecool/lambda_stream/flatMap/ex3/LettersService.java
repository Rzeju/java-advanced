package pl.codecool.lambda_stream.flatMap.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LettersService {

    public long countLetters(List<String> lines) {

        return lines.stream()
                .flatMap(line -> Arrays.stream(line.split("\\PL+")))
                .flatMap(word -> Arrays.stream(word.split("")))
                .count();

    }

    public Map<String, Long> calculateLettersOccurrences(List<String> lines) {
        return lines.stream()
                .flatMap(line -> Arrays.stream(line.split("\\PL+")))
                .flatMap(word -> Arrays.stream(word.split("")))
                .collect(Collectors.groupingBy(
                        s -> s,
                        Collectors.counting()
                ));
    }
}
