package pl.codecool.generics.zad4;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Library<T extends Medium> {

    private final List<T> repository = new ArrayList<>();

    public boolean add(T element) {
        return repository.add(element);
    }

    public boolean remove(T element) {
        return repository.remove(element);
    }

    public boolean isExist(T element) {

        return repository.contains(element);
    }

    public String printAll() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T element : repository) {
            stringBuilder.append(element.toString());
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }



}
