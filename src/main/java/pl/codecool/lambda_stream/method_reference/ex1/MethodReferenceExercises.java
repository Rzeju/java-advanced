package pl.codecool.lambda_stream.method_reference.ex1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceExercises {

    private static String prefix = "";

    public static List<Integer> findEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(MethodReferenceExercises::isEven)
                .collect(Collectors.toList());
    }

    private static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    public static List<String> sortDescendingByLength(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }

    public static Integer findMax(List<Integer> numbers) {
        return numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);
    }

    public static long countStartingWith(List<String> words, String prefix) {
        MethodReferenceExercises.prefix = prefix;
        return words.stream()
                .filter(MethodReferenceExercises::isStartingWith)
                .count();
    }

    private static boolean isStartingWith(String word) {
        return word.startsWith(prefix);
    }
}
