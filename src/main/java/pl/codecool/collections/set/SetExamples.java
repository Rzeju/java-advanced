package pl.codecool.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        Integer integer = Integer.valueOf(50);

        set.add(1);
        set.add(10);
        set.add(17);
        set.add(20);
        set.add(100);
        set.add(11);
        set.add(28);
        set.add(integer);

        set.forEach(System.out::println);

        System.out.println(set.add(11));
        System.out.println(set.add(10000000));

        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()) {
            System.out.println("I: " + iterator.next());
        }

        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(1);
        linkedSet.add(5);
        linkedSet.add(10);
        linkedSet.add(2);
        linkedSet.add(7);
        linkedSet.add(-100);
        linkedSet.add(20);
        linkedSet.forEach(System.out::println);


    }
}
