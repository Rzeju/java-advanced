package pl.codecool.collections.set.zad3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Java", 8);
        map.put("Hello", 16);
        map.put("Python", 2000);
        map.put("C", 20);
        map.put("Assembler", 8051);
        map.put("Tomorrow", 80);
        map.put("Hi", 1);

        int size = 1;
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (size == map.size()) {
                System.out.printf("Klucz: %s, Wartość: %d.\n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
            } else {
                System.out.printf("Klucz: %s, Wartość: %d,\n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
            }

            size++;
        }
    }
}
