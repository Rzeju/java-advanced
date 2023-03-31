package pl.codecool.generics.zad2_zad3;

import java.util.function.Predicate;

public class GenericMethods {

    public static <T> int countIf(T[] elements, Predicate<T> condition) {
        int result = 0;
        for (T element : elements) {
            if (condition.test(element)) {
                result++;
            }
        }
        return result;
    }

    public static <T> boolean swap(T firstElem, T secondElem, T[] elements) {
        int firstIndex = -1;
        int secondIndex = -1;

        int counter = 0;
        for (T element : elements) {
            if (element.equals(firstElem)) {
                firstIndex = counter;
            } else if (element.equals(secondElem)) {
                secondIndex = counter;
            }
            counter++;
        }

        if (firstIndex < 0 || secondIndex < 0 || firstIndex == secondIndex) {
            return false;
        }

        T box = elements[firstIndex];
        elements[firstIndex] = elements[secondIndex];
        elements[secondIndex] = box;
        return true;
    }
}
