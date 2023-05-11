package pl.codecool.multithreading.exercises.prezentacja.zad35;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
