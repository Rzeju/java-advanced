package pl.codecool.multithreading.examples.synchronization.examp1;

public class Main {

    public static void main(String[] args) {

        Lotto lotto = new Lotto();

        Runnable run_1 = () -> lotto.start(10);
        Thread thread_1 = new Thread(run_1);

        Runnable run_2 = () -> lotto.start(12);
        Thread thread_2 = new Thread(run_2);

        Runnable run_3 = () -> lotto.start(20);
        Thread thread_3 = new Thread(run_3);

        thread_1.start();
        thread_2.start();
        thread_3.start();
        lotto.start(15);
    }
}
