package pl.codecool.regular_expressions.excercises.zad2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReplaceJavaWithPython {
    public static void main(String[] args) {
        System.out.print("Enter a string to replace all occurrences of Java: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\bJava\\b", Pattern.CASE_INSENSITIVE);

        String output1 = input.replaceAll("\\bJava\\b", "Python");
        String output2 = pattern.matcher(input).replaceAll("Python");

        System.out.println("Updated string: " + output1);
        System.out.println("Updated string: " + output2);
    }
}
