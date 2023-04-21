package pl.codecool.lambda_stream.ex1;

import java.util.Random;
import java.util.function.*;

public class LambdaUsageExample {

    public static void main(String[] args) {

        Predicate<String> myPredicate = s -> s.length() > 5;

        Supplier<Integer> mySupplier = () -> new Random().nextInt(100 + 1);

        Consumer<String> myConsumer = (s) -> System.out.println(s);

        Function<Integer, Double> myFunction = (i) -> Double.valueOf(i);

        UnaryOperator<Integer> myUnaryOperator = (i) -> i * i;

        BinaryOperator<String> myBinaryOperator = (s1, s2) -> s1.concat(s2);

        BiConsumer<String, Integer> myBiConsumer = (s, i) -> System.out.println(s + " " + i);

        BiFunction<String, String, Integer> myBiFunction = (s1, s2) -> Integer.parseInt(s1) + Integer.parseInt(s2);

        BiPredicate<String, String> myBiPredicate = (s1, s2) -> s1.equals(s2);

        System.out.println("Predicate");
        System.out.println(myPredicate.test("Hello"));

        System.out.println("Supplier");
        System.out.println(mySupplier.get());

        System.out.println("Consumer");
        myConsumer.accept("my consumer");

        System.out.println("Function");
        System.out.println(myFunction.apply(10));

        System.out.println("UnaryOperator");
        System.out.println(myUnaryOperator.apply(15));

        System.out.println("BinaryOperator");
        System.out.println(myBinaryOperator.apply("FirstString", "SecondString"));

        System.out.println("BiConsumer");
        myBiConsumer.accept("This is number:", 1);

        System.out.println("BiFuntion");
        System.out.println(myBiFunction.apply("100", "11"));

        System.out.println("BiPredicate");
        System.out.println(myBiPredicate.test("Hello", "Hi"));



    }
}
