package pl.codecool.multithreading.exercises.prezentacja.zad36;

public class ThreadPlaygroundRunnable implements Runnable {

    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 1; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + " name=" + name + " - " + i);
        }
    }
}
