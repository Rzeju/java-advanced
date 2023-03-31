package pl.codecool.collections.map.linked_hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        Map<String, Integer> linkedMap = new LinkedHashMap<>();

        linkedMap.put("Elem1", 1);
        linkedMap.put("Elem2", 2);
        linkedMap.put("Elem3", 3);
        linkedMap.put("Elem4", 4);
        linkedMap.put("Elem5", 5);

        linkedMap.put("Elem1", 10);

        for (Map.Entry<String, Integer> entry : linkedMap.entrySet()) {
            System.out.printf("Key: %s, Value: %d\n", entry.getKey(), entry.getValue());
        }

        Map<String, Integer> accessOrderLinkedMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderLinkedMap.putAll(linkedMap);

        System.out.println("Access Order Map");
        for (Map.Entry<String, Integer> entry : accessOrderLinkedMap.entrySet()) {
            System.out.printf("Key: %s, Value: %d\n", entry.getKey(), entry.getValue());
        }

        Set<String> keys = accessOrderLinkedMap.keySet();

        System.out.println("After put/get");

        accessOrderLinkedMap.get("Elem1");
        accessOrderLinkedMap.get("Elem1");
        accessOrderLinkedMap.get("Elem1");
        accessOrderLinkedMap.put("Elem1", 100);
        accessOrderLinkedMap.get("Elem2");
        accessOrderLinkedMap.get("Elem2");
        accessOrderLinkedMap.get("Elem3");
        accessOrderLinkedMap.put("Elem10", 10);

        System.out.println(keys);

    }
}
