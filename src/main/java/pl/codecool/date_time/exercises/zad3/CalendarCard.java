package pl.codecool.date_time.exercises.zad3;

import java.time.LocalDate;

public class CalendarCard {

    public static void printCalendarCard(LocalDate date) {


        String[] days = {"Po", "Wt", "Śr", "Cz", "Pt", "So", "Nd"};

        for (int i = 0; i < 7; i++) {
            System.out.print(days[i] + "  ");
        }

        int dayOfWeek = date.getDayOfWeek().getValue();
        boolean isContinue = dayOfWeek == 7;
        int day = 1;

        System.out.print("\n");

        for (int i = 0; i < 7; i++) {
            if (isContinue) {
                break;
            }
            if (i < dayOfWeek) {
                System.out.print("    ");
            } else {
                System.out.print(" " + day + "  ");
                day++;
            }
        }

        if (!isContinue) {
            System.out.print("\n");
        }


        int weekCounter = 0;
        for (int i = day; i <= date.getMonth().maxLength(); i++) {
            if (weekCounter == 7) {
                System.out.print("\n");
                weekCounter = 0;
            }
            if (i < 10) {
                System.out.print(" " + i + "  ");
            } else {
                System.out.print(i + "  ");
            }

            weekCounter++;
        }

        System.out.print("\n\n");
    }
}
