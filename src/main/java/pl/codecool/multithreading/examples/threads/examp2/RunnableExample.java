package pl.codecool.multithreading.examples.threads.examp2;

public class RunnableExample {

    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = () -> System.out.println(Thread.currentThread().getName());
        Runnable r2 = () -> System.out.println(Thread.currentThread().getName());

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2, "My Thread 2");

        thread1.setPriority(10);
        thread2.setPriority(1);

        thread1.run();
        thread2.start();

        System.out.println(thread1.getState());
        System.out.println(thread2.getState());

        Thread.sleep(100);
        System.out.println(thread2.getState());
    }
}
