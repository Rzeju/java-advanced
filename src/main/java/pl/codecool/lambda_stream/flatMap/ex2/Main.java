package pl.codecool.lambda_stream.flatMap.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<MyList> objects = new ArrayList<>();
        objects.add(new MyList(Arrays.asList("cytryna", "banana", "mango")));
        objects.add(new MyList(Arrays.asList("masło", "kiwi", "ogór")));
        objects.add(new MyList(Arrays.asList("banana", "orange", "kiwi")));

        List<String> distinctWords = objects.stream()
                .flatMap(sublist -> sublist.getList().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct words: " + distinctWords);
    }
}
