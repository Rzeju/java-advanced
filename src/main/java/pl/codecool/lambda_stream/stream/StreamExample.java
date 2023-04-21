package pl.codecool.lambda_stream.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("hello");
        myList.add("hjghgjhgjhkgHello");
        myList.add("Hellooiopipoipoip");
        myList.add("fagsafsdagasHello");
        myList.add("ZZZZZZZHello");
        myList.add("Hello");
        myList.add("Hellohgjkgjhg");

        //myList.add(null);


        List<String> box = new ArrayList<>();


        final int[] i = {0};

        List<String> myStrings = myList.stream()
                .filter(s -> s.length() > 10)
                .peek(s -> System.out.println(s))
                .map(s -> s.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(myStrings);



    }
}
