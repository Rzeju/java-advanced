package pl.codecool.regular_expressions.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApiExample {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("([abc])(x)");

        Matcher matcher = pattern.matcher("ax a  xyz a");

        System.out.println(matcher.matches());

        System.out.println(matcher.find());
        System.out.println(matcher.start());
        System.out.println(matcher.end());
        System.out.println(matcher.group());
        System.out.println(matcher.group(1));
        System.out.println(matcher.group(2));

        System.out.println(matcher.find());
        System.out.println(matcher.start());
        System.out.println(matcher.end());
        System.out.println(matcher.group());

        System.out.println(matcher.find());
        System.out.println(matcher.find());

    }
}
