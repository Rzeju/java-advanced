package pl.codecool.multithreading.exercises.prezentacja.zad34;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
