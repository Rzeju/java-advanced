package pl.codecool.generics.zad27;

import java.util.List;

public class Joiner<T> {

    public <T> String joinOnMethodGeneric(List<T> elements, String separator) {
        StringBuilder stringBuilder = new StringBuilder();
        for (T element : elements) {
            stringBuilder.append(element.toString());
            stringBuilder.append(separator);
        }

        return stringBuilder.toString();
    }

    public String joinOnClassGeneric(List<T> elements, String separator) {
        StringBuilder stringBuilder = new StringBuilder();
        for (T element : elements) {
            stringBuilder.append(element.toString());
            stringBuilder.append(separator);
        }

        return stringBuilder.toString();
    }

    public  String joinVarArgsOnClass(String separator, T... elements) {
        StringBuilder stringBuilder = new StringBuilder();
        for (T element : elements) {
            stringBuilder.append(element.toString());
            stringBuilder.append(separator);
        }

        return stringBuilder.toString();
    }

    public <T> String joinVarArgsOnMethod(String separator, T... elements) {
        StringBuilder stringBuilder = new StringBuilder();
        for (T element : elements) {
            stringBuilder.append(element.toString());
            stringBuilder.append(separator);
        }

        return stringBuilder.toString();
    }
}
