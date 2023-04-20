package pl.codecool.date_time.exercises.zad3;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        CalendarCard.printCalendarCard(LocalDate.now());



        CalendarCard.printCalendarCard(LocalDate.of(2023, 2, 5));


        CalendarCard.printCalendarCard(LocalDate.of(2023, 5, 1));


    }
}
