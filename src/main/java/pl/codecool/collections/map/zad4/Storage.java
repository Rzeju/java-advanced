package pl.codecool.collections.map.zad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

    private final Map<String, List<String>> storage = new HashMap<>();

    public Storage() {

    }

    public void addToStorage(String key, String value) {

        if (storage.containsKey(key)) {
            List<String> list = storage.get(key);
            list.add(value);
        } else {
            List<String> list = new ArrayList<>();
            list.add(value);
            storage.put(key, list);
        }
    }

    public void printValues(String key) {
        System.out.println(storage.get(key));
    }

    public void findValues(String value) {
        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : storage.entrySet()) {
            for (String element : entry.getValue()) {
                if (element.equals(value)) {
                    keys.add(entry.getKey());
                }
            }
        }

        System.out.println("Podana wartość value = " + value + " znajduje się pod kluczami -> " + keys);
    }
}
