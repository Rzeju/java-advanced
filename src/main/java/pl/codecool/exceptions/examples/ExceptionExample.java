package pl.codecool.exceptions.examples;

import java.util.ArrayList;
import java.util.List;

public class ExceptionExample {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Hello");

        try {
            System.out.printf("Value at index 3: %s%n", myList.get(3));
            System.out.println("Ten kod nie wykona");
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Block catch");
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }

        ThrowExceptionExample.throwException(new int[10], 15);

        System.out.println("Koniec metody");
    }
}
