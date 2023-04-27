package pl.codecool.lambda_stream.optionals.ex2;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        System.out.println(OptionalUtils.square(Optional.of(10)));
        System.out.println(OptionalUtils.square(Optional.ofNullable(null)));

        System.out.println(OptionalUtils.length(Optional.of("Hello")));
        System.out.println(OptionalUtils.length(Optional.ofNullable(null)));

        System.out.println(OptionalUtils.concat(Optional.ofNullable(100), Optional.ofNullable("Hello")));
        System.out.println(OptionalUtils.concat(Optional.ofNullable(100), Optional.ofNullable(null)));
        System.out.println(OptionalUtils.concat(Optional.ofNullable(null), Optional.of("Hello")));
        System.out.println(OptionalUtils.concat(Optional.ofNullable(null), Optional.ofNullable(null)));

        System.out.println("concat2");

        System.out.println(OptionalUtils.concat2(Optional.ofNullable(100), Optional.ofNullable("Hello")));
        System.out.println(OptionalUtils.concat2(Optional.ofNullable(100), Optional.ofNullable(null)));
        System.out.println(OptionalUtils.concat2(Optional.ofNullable(null), Optional.ofNullable("Hello")));
        System.out.println(OptionalUtils.concat2(Optional.ofNullable(null), Optional.ofNullable(null)));
    }


}
