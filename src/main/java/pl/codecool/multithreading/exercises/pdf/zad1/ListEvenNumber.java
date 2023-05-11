package pl.codecool.multithreading.exercises.pdf.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEvenNumber {

    private static final List<Integer> numbers = Collections.synchronizedList(new ArrayList<>());

    public static void findEvenNumbers(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
    }

    public static List<Integer> getNumbers() {
        return numbers;
    }
}
