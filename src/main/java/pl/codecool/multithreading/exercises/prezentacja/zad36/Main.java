package pl.codecool.multithreading.exercises.prezentacja.zad36;

public class Main {

    private static Thread thread1;
    private static Thread thread2;

    public static void main(String[] args) {
        thread1 = new Thread(new ThreadPlaygroundRunnable("My_Thread_1"));
        thread2 = new Thread(new ThreadPlaygroundRunnable("My_Thread_2"));

        thread1.start();
        thread2.start();
    }
}
