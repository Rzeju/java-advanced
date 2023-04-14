package pl.codecool.date_time.exercises.zad2;

import java.time.LocalDate;
import java.time.Period;

public class CalculatePeriod {

    public static void main(String[] args) {

        LocalDate start = LocalDate.now();

        LocalDate end = start.plusDays(15);
        Period dayPeriod = Period.between(start, end);
        System.out.println(dayPeriod);
        System.out.println(dayPeriod.getDays());

        end = start.plusDays(51);
        Period moreThan30days = Period.between(start, end);
        System.out.println(moreThan30days);
        System.out.println(moreThan30days.getDays());
        System.out.println(moreThan30days.getMonths());

        end = start.plusMonths(5).plusDays(12);
        Period monthsPeriod = Period.between(start, end);
        System.out.println(monthsPeriod);
        System.out.println(monthsPeriod.getYears());
        System.out.println(monthsPeriod.getMonths());
        System.out.println(monthsPeriod.getDays());

        end = start.plusYears(2).plusMonths(3).plusDays(2);
        Period yearsPeriod = Period.between(start, end);
        System.out.println(yearsPeriod);
        System.out.println(yearsPeriod.getYears());
        System.out.println(yearsPeriod.getMonths());
        System.out.println(yearsPeriod.getDays());

    }
}
