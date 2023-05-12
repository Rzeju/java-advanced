package pl.codecool.multithreading.examples.synchronization.examp2.preparing_thread;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Restaurant restaurant = new Restaurant();

        Runnable r = restaurant::orderMeal;
        Runnable chef = restaurant::prepareMealThread;
        Thread chefThread = new Thread(chef);
        chefThread.setDaemon(true);
        chefThread.start();

        Thread thread1 = new Thread(r);
        thread1.setName("thread1");

        Thread thread2 = new Thread(r);
        thread2.setName("thread2");

        Thread thread3 = new Thread(r);
        thread3.setName("thread3");

        Thread thread4 = new Thread(r);
        thread4.setName("thread4");

        System.out.println(thread1.getState());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.println(thread1.getState());

        Thread.sleep(1000);
        System.out.println(thread1.getState());

        //restaurant.prepareMeal();
    }
}
