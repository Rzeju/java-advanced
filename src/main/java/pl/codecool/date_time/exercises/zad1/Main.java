package pl.codecool.date_time.exercises.zad1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        long days = Friday13th.daysUntilNextFriday13th(date);
        System.out.println("Days until the next Friday the 13th: " + days);
    }
}
