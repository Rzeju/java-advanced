package pl.codecool.lambda_stream.method_reference.ex1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(-100, 10, 17, 20 ,11, -21, 4, 2, 5);
        List<String> words = List.of("Hello", "Abba", "ZZ Top", "The Mars Volta");

        System.out.println(MethodReferenceExercises.findEven(numbers));

        System.out.println(MethodReferenceExercises.sortDescendingByLength(words));

        System.out.println(MethodReferenceExercises.sum(numbers));

        System.out.println(MethodReferenceExercises.findMax(numbers));

        System.out.println(MethodReferenceExercises.countStartingWith(words, "Th"));


    }
}
