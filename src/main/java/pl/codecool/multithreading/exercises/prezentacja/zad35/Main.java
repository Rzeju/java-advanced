package pl.codecool.multithreading.exercises.prezentacja.zad35;

public class Main {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable, "My Runnale Thread");
        myThread.start();
    }
}
