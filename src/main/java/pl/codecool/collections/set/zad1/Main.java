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
        objectSortedSet.add(new MyObject("Adam", 1));
        objectSortedSet.add(new MyObject("adam", 20));
        objectSortedSet.add(new MyObject("Hello", 26));
        objectSortedSet.add(new MyObject("Hello", 19));
        objectSortedSet.add(new MyObject("hello", 5));
        objectSortedSet.add(new MyObject("a", 17));
        objectSortedSet.add(new MyObject("Z", -17));
        objectSortedSet.add(new MyObject("z", 10));
        objectSortedSet.add(new MyObject("b", 100));
        objectSortedSet.add(new MyObject("C", 123));
        objectSortedSet.add(new MyObject("Tadeusz", -123));
        objectSortedSet.add(new MyObject("tadeusz", 150));
        objectSortedSet.add(new MyObject("tadeusz", 170));
        objectSortedSet.add(new MyObject("taDeusz", 111));

        objectSortedSet.add(new MyObject("a", 10));
        objectSortedSet.add(new MyObject("Tadeusz", -50));


//        objectSortedSet.first().setName("b");
//        objectSortedSet.first().setNumber(100);

        objectSortedSet.forEach(System.out::println);

        Comparator<MyObject> nameFieldComparator = new Comparator<MyObject>() {
            @Override
            public int compare(MyObject o1, MyObject o2) {
                int lengthComparingResult = o1.getName().length() - o2.getName().length();
                if (lengthComparingResult == 0) {
                    return o1.getName().compareToIgnoreCase(o2.getName());
                }
                return lengthComparingResult;
            }
        };
        Comparator<MyObject> numberFieldComparator = new Comparator<MyObject>() {
            @Override
            public int compare(MyObject o1, MyObject o2) {
                return o1.getNumber().compareTo(o2.getNumber());
            }
        };

        Comparator<MyObject> finalComparator = nameFieldComparator.thenComparing(numberFieldComparator);

        SortedSet<MyObject> twoFieldSortedSet = new TreeSet<>(finalComparator);
        twoFieldSortedSet.addAll(objectSortedSet);

        twoFieldSortedSet.add(new MyObject("Adam", 1));
        twoFieldSortedSet.add(new MyObject("adam", 20));
        twoFieldSortedSet.add(new MyObject("Hello", 26));
        twoFieldSortedSet.add(new MyObject("Hello", 19));
        twoFieldSortedSet.add(new MyObject("hello", 5));
        twoFieldSortedSet.add(new MyObject("a", 17));
        twoFieldSortedSet.add(new MyObject("Z", -17));
        twoFieldSortedSet.add(new MyObject("z", 10));
        twoFieldSortedSet.add(new MyObject("b", 100));
        twoFieldSortedSet.add(new MyObject("C", 123));
        twoFieldSortedSet.add(new MyObject("Tadeusz", -123));
        twoFieldSortedSet.add(new MyObject("tadeusz", 150));
        twoFieldSortedSet.add(new MyObject("tadeusz", 170));
        twoFieldSortedSet.add(new MyObject("taDeusz", 111));

        objectSortedSet.add(new MyObject("a", 10));
        objectSortedSet.add(new MyObject("Tadeusz", -50));


        System.out.println(" ");
        System.out.println("Two field sorted set");
        twoFieldSortedSet.forEach(System.out::println);

        Comparator<MyObject> finalFieldComparator = new Comparator<MyObject>() {
            @Override
            public int compare(MyObject o1, MyObject o2) {
                int lengthComparingResult = o1.getName().length() - o2.getName().length();
                if (lengthComparingResult == 0) {
                    int caseComparingResult = o1.getName().compareToIgnoreCase(o2.getName());
                    if (caseComparingResult == 0) {
                        return o1.getNumber().compareTo(o2.getNumber());
                    }
                    return caseComparingResult;
                }
                return lengthComparingResult;
            }
        };

        SortedSet<MyObject> finalSet = new TreeSet<>(finalFieldComparator);
        finalSet.addAll(twoFieldSortedSet);
        System.out.println(" ");
        System.out.println("Final Sorted Set");
        twoFieldSortedSet.forEach(System.out::println);


    }
}
