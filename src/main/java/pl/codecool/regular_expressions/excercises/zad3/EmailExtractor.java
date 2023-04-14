package pl.codecool.regular_expressions.excercises.zad3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {


    public static void main(String[] args) {

        //System.out.print("Enter a string to extract email addresses from: ");
        Scanner scanner = new Scanner(System.in);
        String input = "piotr.andrzejak@gmail.com tadeusz123-kowalski@wp.pl hahaha@gege hello jonasz1234!@j.com";

        Pattern pattern = Pattern.compile("\\b[\\w.%-]+@[\\w.-]+\\.[A-Z]{2,4}\\b", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println("Email found: " + matcher.group());
        }
    }

}
