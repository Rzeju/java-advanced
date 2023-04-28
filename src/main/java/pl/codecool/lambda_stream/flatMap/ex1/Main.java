package pl.codecool.lambda_stream.flatMap.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> numbers = new ArrayList<>();
        numbers.add(Arrays.asList(1, 2, 3));
        numbers.add(Arrays.asList(4, 5, 6, 7));
        numbers.add(Arrays.asList(8, 9, 10));

        List<Integer> flattenedNumbers = numbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened list: " + flattenedNumbers);
    }
}
