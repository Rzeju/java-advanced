package pl.codecool.regular_expressions.excercises.zad5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExtractor {
        public static void main(String[] args) {
            //System.out.print("Enter a string to extract phone numbers from: ");
            Scanner scanner = new Scanner(System.in);
            //String input = scanner.nextLine();
            String input = "+48 154-234-124kk +123 123-567-938 +22 345678909 +90 123-1234-120";

            Pattern pattern = Pattern.compile("(\\+\\d{2,3})\\s(\\d{3})-?(\\d{3})-?(\\d{3})");

            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String countryCode = matcher.group(1);
                String areaCode = matcher.group(2);
                String firstPart = matcher.group(3);
                String secondPart = matcher.group(4);
                String phoneNumber = countryCode + " " + areaCode + "-" + firstPart + "-" + secondPart;
                System.out.println("Phone number found: " + phoneNumber);
            }
        }

}
