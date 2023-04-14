package pl.codecool.regular_expressions.excercises.zad1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaChecker {
    public static void main(String[] args) {

        String regex = "\\bjava\\b";

        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("The input contains the word java!");
        } else {
            System.out.println("The input does not contain the word java");
        }

    }
}
