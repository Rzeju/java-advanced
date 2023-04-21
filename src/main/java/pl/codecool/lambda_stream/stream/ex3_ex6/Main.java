package pl.codecool.lambda_stream.stream.ex3_ex6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("ananas");
        words.add("herbata");
        words.add("arbuz");
        words.add("hello");
        words.add("jutro");
        words.add("mniej");

        System.out.println(MyUtils.toUpperCase(words));
        System.out.println(MyUtils.lengthMoreThanThreeAndStartsWithA(words));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(30);
        numbers.add(35);
        numbers.add(41);
        numbers.add(57);
        numbers.add(82);

        System.out.println(MyUtils.getAverage(numbers));
        System.out.println(MyUtils.getAverageOptional(numbers));
        System.out.println(MyUtils.getAverageNumberStream(numbers));

        System.out.println(MyUtils.oddsAndEven(numbers));

    }
}
