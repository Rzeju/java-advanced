package pl.codecool.collections.map.zad23;

import java.util.*;

public class Zoo {

    private final List<String> animals = new ArrayList<>();

    public int getNumberOfAllAnimals() {
        return animals.size();
    }

    public void addAnimals(String animal, int number) {
        for (int i = 0; i < number; i++) {
            animals.add(animal);
        }
    }

    public Map<String, Integer> getAnimalsCount() {
        Map<String, Integer> result = new HashMap<>();
        for (String animal : animals) {
            if (result.containsKey(animal)) {
                int nextNumber = result.get(animal) + 1;
                result.put(animal, nextNumber);
            } else {
                result.put(animal, 1);
            }
        }

        return result;
    }

    public List getAnimalsCountSorted() {
        Map<String, Integer> animalsCount = getAnimalsCount();

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(animalsCount.entrySet());
        entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        return entries;
    }

    public List<String> getAnimals() {
        return animals;
    }

    public Map<String, Integer> treeMapSorting() {
        Map<String, Integer> animalsCount = getAnimalsCount();

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return animalsCount.get(o2).compareTo(animalsCount.get(o1));
            }
        };
        Map<String, Integer> result = new TreeMap<>(comparator);
        result.putAll(animalsCount);

        return result;
    }
}


