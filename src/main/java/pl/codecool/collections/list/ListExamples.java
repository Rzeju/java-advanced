package pl.codecool.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListExamples {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        System.out.println(stringList.isEmpty());

        stringList.add("Element1");

        System.out.println(stringList.isEmpty());

        stringList.add("Element2");

        System.out.println(stringList.remove("Element3"));
        System.out.println(stringList.remove("Element2"));

        stringList.add("Element4");
        stringList.add("Element5");
        stringList.add("Element6");
        stringList.add("Element7");
        stringList.add("Element8");
        stringList.add("Element9");

        for (int i = 0; i < stringList.size(); i++) {
            String box = stringList.get(i);
            System.out.println(box);
        }

        for (String s : stringList) {
            System.out.println(s);
        }

        UnaryOperator<String> function = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        stringList.replaceAll(function);

        Iterator<String> iterator = stringList.iterator();

        System.out.println("Interator");
        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        iterator.remove();
        Iterator<String> iterator2 = stringList.iterator();
        iterator2.next();
        iterator2.remove();
        System.out.println(stringList);






    }
}
