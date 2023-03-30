package pl.codecool.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Integer> occurrences = new HashMap<>();
        
        occurrences.put(20, 30);
        occurrences.put(50, 20);

        for (Map.Entry<Integer, Integer> integerIntegerEntry : occurrences.entrySet()) {

        }

    }
}
