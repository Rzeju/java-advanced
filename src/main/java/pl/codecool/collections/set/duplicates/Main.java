package pl.codecool.collections.set.duplicates;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 3, 5, 6, 1, 3, 3, 90, 5, 2, 2);

        FindDuplicates findDuplicates = new FindDuplicates();

        System.out.println(findDuplicates.findDuplicates(numbers));
        System.out.println(findDuplicates.findUniques(numbers));
    }
}
