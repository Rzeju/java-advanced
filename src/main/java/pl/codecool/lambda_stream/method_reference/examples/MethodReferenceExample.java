package pl.codecool.lambda_stream.method_reference.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferenceExample {

    public static void main(String[] args) {

        BiFunction<Double, Double, Double> myFunc = Math::pow;

        myFunc = (x, y) -> Math.pow(x, y);

        //obiekt::metodaEgzemplarza = x -> metodaEgzemplarza(x)
        //obiekt::metodaEgzemplarza = (x, y) -> metodaEgzemplarza(x, y)
        List<String> words = new ArrayList<>();
        words.add("Abbc");
        words.add("XYz");
        words.add("1234");

        Stream<String> myStream = words.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER::compare);

        //myStream.sorted(String.CASE_INSENSITIVE_ORDER::compare);


        words.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER::compare)
                .collect(Collectors.toList());

        //Klasa::metodaStatyczna = x -> metodaEgzemplarza(x)

        words.stream()
                .map(StringUtils::toUpper)
                .collect(Collectors.toList());

        myStream.map(StringUtils::toUpper)
                .collect(Collectors.toList());

        //Klasa::metodaEgzemplarza
        //x -> x.metodaEgzemplarza
        //(x, y) -> x.metodaEgzemplarza(y)

        words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        words.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        words.stream()
                        .sorted(String::compareTo);

        words.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());



        //OBJECT

        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "John", 30));
        people.add(new Person(2, "Andy", 35));

        people.stream()
                .map(Person::getFirstName);

        people.stream()
                .sorted()
                .findFirst();


        //CONSTRUCTOR

        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("John");
        names.add("Eva");

        List<Person> myPeople = names.stream()
                .map(Person::new)
                .collect(Collectors.toList());







    }
}
