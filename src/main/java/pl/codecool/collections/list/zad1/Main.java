package pl.codecool.collections.list.zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("Aaa");
        words.add("Toporek");
        words.add("ZZzz");
        words.add("aaa");
        words.add("A");
        words.add("Babeczka");
        words.add("Kamyk");
        words.add("zzzz");
        words.add("kk");

        StringSorter stringSorter = new StringSorter();
        stringSorter.sortReversed(words);

        System.out.println(words);

        List<String> result = stringSorter.sortReversedIgnoreCase(words);
        System.out.println(result);
    }
}
