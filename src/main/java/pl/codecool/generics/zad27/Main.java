package pl.codecool.generics.zad27;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Joiner<String> stringJoiner = new Joiner<>();

        List<String> stringList = new ArrayList<>();

        stringList.add("abc");
        stringList.add("yhz");
        stringList.add("hello");
        stringList.add("ghjt");

        System.out.println(stringJoiner.joinOnClassGeneric(stringList, "--"));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(100);
        integerList.add(199);
        integerList.add(1717);
        integerList.add(112);

        System.out.println(stringJoiner.joinOnMethodGeneric(integerList, "-+-"));



        System.out.println(stringJoiner.joinVarArgsOnMethod(">-<", "dsds", "jskjs", 100, new Object()));

        System.out.println(stringJoiner.joinVarArgsOnClass(">-<", "dsds", "jskjs", "new Object()"));
    }
}
