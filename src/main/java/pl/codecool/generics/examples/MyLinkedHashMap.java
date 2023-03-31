package pl.codecool.generics.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap<T, U> extends LinkedHashMap<T, U> {

    private static final int size = 5;

    public MyLinkedHashMap(int capacity, float loadFactor, boolean accessOrder) {
        super(capacity, loadFactor, accessOrder);
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<T, U> entry) {
        return this.size() > 5;
    }


}
