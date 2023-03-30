package pl.codecool.collections.set.zad1;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

//        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
//        SortedSet<NotComparableObject> notComparableObjectSortedSet = new TreeSet<>(comparator);
//        notComparableObjectSortedSet.add(new NotComparableObject("Error"));

        SortedSet<MyObject> objectSortedSet = new TreeSet<>();
        objectSortedSet.add(new MyObject("Adam"));
        objectSortedSet.add(new MyObject("adam"));
        objectSortedSet.add(new MyObject("Hello"));
        objectSortedSet.add(new MyObject("Hello"));
        objectSortedSet.add(new MyObject("hello"));
        objectSortedSet.add(new MyObject("a"));
        objectSortedSet.add(new MyObject("Z"));
        objectSortedSet.add(new MyObject("z"));
        objectSortedSet.add(new MyObject("b"));
        objectSortedSet.add(new MyObject("C"));
        objectSortedSet.add(new MyObject("Tadeusz"));
        objectSortedSet.add(new MyObject("tadeusz"));
        objectSortedSet.add(new MyObject("tadeusz"));
        objectSortedSet.add(new MyObject("taDeusz"));

        objectSortedSet.forEach(System.out::println);
    }
}
