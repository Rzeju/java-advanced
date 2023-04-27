package pl.codecool.lambda_stream.optionals.examples;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<Integer> integerOptional = Optional.ofNullable(null);

        System.out.println("No value");

        System.out.println(integerOptional.isPresent());
        System.out.println(integerOptional.isEmpty());

        System.out.println(integerOptional.orElse(100));

        integerOptional.ifPresent(i -> System.out.println(i));

        System.out.println("Value is present");

        integerOptional = Optional.ofNullable(17);

        System.out.println(integerOptional.isPresent());
        System.out.println(integerOptional.isEmpty());

        System.out.println(integerOptional.orElse(100));

        integerOptional.ifPresent(i -> System.out.println(i));
    }
}
