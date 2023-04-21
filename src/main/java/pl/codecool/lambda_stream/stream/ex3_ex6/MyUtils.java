package pl.codecool.lambda_stream.stream.ex3_ex6;

import java.util.List;
import java.util.stream.Collectors;

public class MyUtils {

    public static double getAverageOptional(List<Integer> numbers) {

        return numbers.stream()
                .mapToDouble(i -> Double.valueOf(i))
                .average()
                .orElse(0);
    }

    public static double getAverageNumberStream(List<Integer> numbers) {

        return numbers.stream()
                .mapToInt(i -> Integer.valueOf(i))
                .average()
                .getAsDouble();
    }

    public static double getAverage(List<Integer> numbers) {

        return numbers.stream()
                .reduce(0, (i1, i2) -> i1 + i2) / (double) numbers.size();
    }

    public static List<String> toUpperCase(List<String> words) {
        return words.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
    }

    public static List<String> lengthMoreThanThreeAndStartsWithA(List<String> words) {
        return words.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());
    }

    public static String oddsAndEven(List<Integer> list) {
        return list.stream()
                .map(i -> {
                    if (i % 2 == 0) {
                        return "e" + i;
                    } else {
                        return "o" + i;
                    }
                })
                .collect(Collectors.joining(","));
    }
}
