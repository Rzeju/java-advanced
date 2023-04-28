package pl.codecool.lambda_stream.collectors.ex2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BookService {

    public Set<String> findExistingWords(List<String> text) {

        List<String> words = new ArrayList<>();
        for (String s : text) {
            words.addAll(Arrays.asList(s.split("\\PL+")));
        }

        return new HashSet<>(words);
    }

    public Map<String, Integer> countWords(List<String> text) {

        List<String> words = new ArrayList<>();
        for (String s : text) {
            words.addAll(Arrays.asList(s.split("\\PL+")));
        }

        return words.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        (i) -> 1,
                        (a, b) -> a + 1));
    }

    public Set<String> findExistingWordsFlatMap(List<String> text) {
        return text.stream()
                .flatMap(s -> Arrays.stream(s.split("\\PL+")))
                .collect(Collectors.toSet());
    }

    public Map<String, Integer> countWordsFlatMap(List<String> text) {

        return text.stream()
                .flatMap(s -> Arrays.stream(s.split("\\PL+")))
                .collect(Collectors.toMap(
                        Function.identity(),
                        (i) -> 1,
                        (a, b) -> a + 1)
                );
    }

    public Map<String, Long> countWordsFlatMap2(List<String> text) {

        return text.stream()
                .flatMap(s -> Arrays.stream(s.split("\\PL+")))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting())
                ).entrySet().stream()
                .sorted((e1, e2) -> (int) (e2.getValue() - e1.getValue()))
                .collect(Collectors.toMap(
                        e -> e.getKey(),
                        e -> e.getValue(),
                        (e1, e2) -> e1,
                        LinkedHashMap::new));
    }
}
