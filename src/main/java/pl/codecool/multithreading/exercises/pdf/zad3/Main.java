package pl.codecool.multithreading.exercises.pdf.zad3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int size = 100000;

        int[] numbers1 = new int[size];
        int[] numbers2 = new int[size];
        int[] numbers3 = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int newNumber = random.nextInt(5 * size);
            numbers1[i] = newNumber;
            numbers2[i] = newNumber;
            numbers3[i] = newNumber;
        }

        BubbleSorting bubbleSorting = new BubbleSorting(numbers1);
        InsertionSorting insertionSorting = new InsertionSorting(numbers2);

        Thread thread1 = new Thread(bubbleSorting);
        Thread thread2 = new Thread(insertionSorting);
        Thread thread3 = new Thread(() -> {
            Arrays.sort(numbers3);
            System.out.println("Arrays sort done");
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
