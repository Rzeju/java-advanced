package pl.codecool.collections.map.hashmap_example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 5, 6, 10, -17, 1, 1, 2, 3, 4, 7, 11, 10, 11};

        Map<Integer, Integer> occurrences = calculateOccurrences(numbers);

        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.printf("Key: %d, Value: %d\n", entry.getKey(), entry.getValue());
        }

        System.out.println("Lambdas");
        Map<Integer, Integer> occurrencesLambdas = calculateOccurrencesWithLambdas(numbers);
        occurrencesLambdas.forEach((k, v) -> System.out.printf("Key: %d, Value: %d\n", k, v));
    }

    public static Map<Integer, Integer> calculateOccurrences(int[] numbers) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int number : numbers) {
            if (result.containsKey(number)) {
                int actualValue = result.get(number);
                result.put(number, actualValue + 1);
            } else {
                result.put(number, 1);
            }
        }
        return result;
    }

    public static Map<Integer, Integer> calculateOccurrencesWithLambdas(int[] numbers) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int number : numbers) {
            result.computeIfPresent(number, (k, v) -> v + 1);
            result.putIfAbsent(number, 1);
        }
        return result;
    }
}
