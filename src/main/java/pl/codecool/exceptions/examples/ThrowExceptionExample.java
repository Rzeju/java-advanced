package pl.codecool.exceptions.examples;

public class ThrowExceptionExample {

    public static int throwException(int[] array, int index) throws IndexOutOfBoundsException {

        int result = array[index];

        return result;
    }
}
