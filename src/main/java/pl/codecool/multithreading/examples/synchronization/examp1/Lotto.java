package pl.codecool.multithreading.examples.synchronization.examp1;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lotto {

    private Lock myLock = new ReentrantLock();

    public void start(int numberOfElement) {
        myLock.lock();
        try {
            Random random = new Random();
            for (int i = 0; i < numberOfElement; i++) {
                int number = random.nextInt(50) + 1;
                System.out.println(Thread.currentThread().getName() + " -> number " + (i + 1) + " is: " + number);
                String string = String.format("%s -> number %d is %d\n", Thread.currentThread().getName(), i + 1, number);
                System.out.println(string);
            }
        } finally {
            myLock.unlock();
        }
    }
}
