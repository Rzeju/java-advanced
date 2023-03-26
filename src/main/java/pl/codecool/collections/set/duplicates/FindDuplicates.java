package pl.codecool.collections.set.duplicates;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

    public Set<Integer> findDuplicates(List<Integer> numbers) {
        Set<Integer> uniques = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer number : numbers) {
            if (uniques.contains(number)) {
                duplicates.add(number);
            } else {
                uniques.add(number);
            }
        }

        return duplicates;
    }

    public Set<Integer> findUniques(List<Integer> numbers) {
        Set<Integer> uniques = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer number : numbers) {
            if (uniques.contains(number)) {
                duplicates.add(number);
            } else {
                uniques.add(number);
            }
        }

        uniques.removeAll(duplicates);
        return uniques;
    }
}
