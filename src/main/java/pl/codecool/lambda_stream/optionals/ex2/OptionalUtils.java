package pl.codecool.lambda_stream.optionals.ex2;

import java.util.Optional;

public class OptionalUtils {

    public static int square(Optional<Integer> number) {

        return number.map(i -> i * i).orElse(0);
    }

    public static int length(Optional<String> word) {
        return word.map(s -> s.length()).orElse(-1);
    }

    public static String concat(Optional<Integer> number, Optional<String> word) {

        if (number.isPresent() && word.isPresent()) {
            return number.get() + word.get();
        }

        return "unknown";
    }

    public static String concat2(Optional<Integer> number, Optional<String> word) {

        return number.flatMap(
                i -> word.map(w -> i + w))
                .orElse("unknown");
    }
}
