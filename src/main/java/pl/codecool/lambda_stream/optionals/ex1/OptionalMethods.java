package pl.codecool.lambda_stream.optionals.ex1;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalMethods {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.ofNullable("my value");

        System.out.println("WITH VALUE\n");

        System.out.println("get() - " + stringOptional.get());

        System.out.println("isPresent() - " + stringOptional.isPresent());

        System.out.println("isEmpty() - " + stringOptional.isEmpty());

        stringOptional.ifPresentOrElse(s -> System.out.println("ifPresentOrElse() - " + s), () -> System.out.println("ifPresentOrElse() - BRAK-WARTOŚCI"));

        System.out.println(stringOptional.filter(s -> s.length() > 3));

        System.out.println("map() - " + stringOptional.map(s -> Arrays.stream(s.split("")).collect(Collectors.joining("-"))));

        System.out.println("or() - " + stringOptional.or(() -> Optional.of("BRAK-WARTOŚCI")));

        System.out.println("orElse() - " + stringOptional.orElse("BRAK-WARTOŚCI"));

        System.out.println("orElseGet() - " + stringOptional.orElseGet(() -> "Brak-Wartości"));

        System.out.println("orElseThrow() - " + stringOptional.orElseThrow(() -> new RuntimeException("Brak-Wartości")));


        stringOptional = Optional.empty();

        System.out.println("\nNO VALUE\n");

        //System.out.println("get() - " + stringOptional.get());

        System.out.println("isPresent() - " + stringOptional.isPresent());

        System.out.println("isEmpty() - " + stringOptional.isEmpty());

        stringOptional.ifPresentOrElse(s -> System.out.println("ifPresentOrElse() - " + s), () -> System.out.println("ifPresentOrElse() - BRAK-WARTOŚCI"));

        System.out.println(stringOptional.filter(s -> s.length() > 3));

        System.out.println("map() - " + stringOptional.map(s -> Arrays.stream(s.split("")).collect(Collectors.joining("-"))));

        System.out.println("or() - " + stringOptional.or(() -> Optional.of("BRAK-WARTOŚCI")));

        System.out.println("orElse() - " + stringOptional.orElse("BRAK-WARTOŚCI"));

        System.out.println("orElseGet() - " + stringOptional.orElseGet(() -> "Brak-Wartości"));

        System.out.println("orElseThrow() - " + stringOptional.orElseThrow(() -> new RuntimeException("Brak-Wartości")));

    }
}
