package pl.codecool.multithreading.examples.examp1;

public class MultithreadExample {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());


        Thread myThread = new Thread();
        myThread.setPriority(10);
        System.out.println(myThread.getState());
        myThread.start();

        System.out.println(myThread.getName());
        System.out.println(myThread.getState());

        Thread.sleep(100);
        System.out.println(myThread.getState());

        myThread.start();
    }
}
