package pl.codecool.lambda_stream.collectors.zad14;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Integer> test = List.of(1, 2, 3, 4, 5, 5, 1, 1, 2, 7, 3, 4, 10, 10, 13, 5, 1, 20);
        List<Integer> myNumbers = NumberUtils.getRandom100_000();

        System.out.println("Uniques");
        System.out.println(NumberUtils.findUniques(myNumbers));

        System.out.println("More Than One");
        System.out.println(NumberUtils.findOccurrencesMoreThanOne(myNumbers));

        System.out.println("25 most occur");
        System.out.println(NumberUtils.findThe25MostCommonNumbers(myNumbers));

        System.out.println("deduplicate");
        List<Integer> deduplicate = NumberUtils.deduplicate(myNumbers);
        System.out.println(myNumbers.size());
        System.out.println(deduplicate.size());
        System.out.println(NumberUtils.findOccurrencesMoreThanOne(deduplicate));

        System.out.println("deduplicateEasy");
        List<Integer> deduplicateEasy = NumberUtils.deduplicateEasy(myNumbers);
        System.out.println(myNumbers.size());
        System.out.println(deduplicateEasy.size());
        System.out.println(NumberUtils.findOccurrencesMoreThanOne(deduplicateEasy));

        System.out.println("deduplicateStream");
        Set<Integer> deduplicateStream = NumberUtils.deduplicateStream(myNumbers);
        System.out.println(myNumbers.size());
        System.out.println(deduplicateEasy.size());
        System.out.println(NumberUtils.findOccurrencesMoreThanOne(new ArrayList<>(deduplicateStream)));
    }
}
