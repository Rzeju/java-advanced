package pl.codecool.date_time.examples;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        localDate = LocalDate.of(1900, 2, 20);
        System.out.println(localDate);

        localDate = LocalDate.of(1900, Month.JUNE, 20);
        System.out.println(localDate);

        System.out.println(localDate.withDayOfMonth(10).getDayOfWeek());

        System.out.println(localDate.with(DayOfWeek.MONDAY));

        LocalDate start = LocalDate.now();
        LocalDate end = start.plusDays(10);

        System.out.println("Hours by Chrono: " + ChronoUnit.HOURS.between(start.atStartOfDay(), end.atStartOfDay()));


        Duration timeDuration = Duration.between(start.atStartOfDay(), end.atStartOfDay());

        Period period = Period.between(start, end);



        System.out.println(timeDuration.toDays());

        System.out.println(period);


    }
}
