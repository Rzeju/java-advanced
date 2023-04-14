package pl.codecool.date_time.exercises.zad1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Friday13th {

    public static long daysUntilNextFriday13th(LocalDate date) {
        long daysUntilNextFriday13th = 0;
        LocalDate nextFriday13th = date;
        while (true) {
            nextFriday13th = nextFriday13th.withDayOfMonth(13);
            if (nextFriday13th.isAfter(date) && nextFriday13th.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                daysUntilNextFriday13th = date.until(nextFriday13th, ChronoUnit.DAYS);
                System.out.println(nextFriday13th + " " + nextFriday13th.getDayOfWeek());
                break;
            }
            nextFriday13th = nextFriday13th.plusMonths(1);
        }
        return daysUntilNextFriday13th;
    }
}
