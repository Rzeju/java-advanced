package pl.codecool.collections.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

    public static void main(String[] args) {

        SortedSet<String> sortedSet = new TreeSet<>();

        sortedSet.add("Aaaa");
        sortedSet.add("aaa");
        sortedSet.add("bok");
        sortedSet.add("Bbbbb");
        sortedSet.add("ZZzzz");
        sortedSet.add("Xxxx");
        sortedSet.add("yyy");
        sortedSet.add("gggG");

        sortedSet.forEach(System.out::println);

        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        SortedSet<String> caseInsensitiveSortedSet = new TreeSet<>(comparator);
        caseInsensitiveSortedSet.addAll(sortedSet);
        System.out.println("Case insensitive");
        caseInsensitiveSortedSet.forEach(System.out::println);
    }
}
