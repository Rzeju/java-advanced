package pl.codecool.generics.zad2_zad3;

import pl.codecool.generics.zad1.Pair;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Pair<String, Double> pair = new Pair<>("DOUBLE", 20.0d);

        String[] words = {"Hello", "Tomorrow", "Daleko", "jutro", "praca", "wolne"};
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 7;
            }
        };
        int countIfResult = GenericMethods.countIf(words, predicate);
        System.out.println(countIfResult);

        boolean swapResult = GenericMethods.swap("Hello", "wolne", words);
        System.out.println(swapResult);
        System.out.println(Arrays.toString(words));

        swapResult = GenericMethods.swap("Hello", "kgkgkg", words);
        System.out.println(swapResult);
        System.out.println(Arrays.toString(words));

        swapResult = GenericMethods.swap("khkjhkjhHello", "wolne", words);
        System.out.println(swapResult);
        System.out.println(Arrays.toString(words));

        swapResult = GenericMethods.swap("khkjhkjhHello", "hgfhjghgf", words);
        System.out.println(swapResult);
        System.out.println(Arrays.toString(words));

        swapResult = GenericMethods.swap(null, null, words);
        System.out.println(swapResult);
        System.out.println(Arrays.toString(words));

        swapResult = GenericMethods.swap("Hello", "wolne", words);
        System.out.println(swapResult);
        System.out.println(Arrays.toString(words));

        
       GenericMethods.<String>swap("55", "666", words);

    }
}
