package pl.codecool.date_time.examples;

import java.time.Duration;
import java.time.Instant;

public class InstanceExample {

    public static void main(String[] args) {

        Instant start = Instant.now();
        for (int i = 0; i < 1_000_000; i++) {
            int j = i + 1;
        }
        Instant stop = Instant.now();

        System.out.println(Duration.between(start, stop).toNanos());
        System.out.println(start);
    }
}
