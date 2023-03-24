package pl.codecool.collections.list.zad1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringSorter {

    public List<String> sortReversed(List<String> words) {

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        words.sort(comparator);

        return words;
    }

    public List<String> sortReversedIgnoreCase(List<String> words) {

        List<String> result = new ArrayList<>(words);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareToIgnoreCase(o1);
            }
        };

        result.sort(comparator);

        return result;
    }
}
