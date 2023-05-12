package pl.codecool.multithreading.examples.synchronization.examp2.preparing_thread;

public class Restaurant {

    private boolean isMealReady = false;

    public synchronized void orderMeal() {
        System.out.println("After lock");
        while (!isMealReady) {
            System.out.println(Thread.currentThread().getName() + " is waiting for meal");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Enjoy Your meal! " + Thread.currentThread().getName());
        isMealReady = false;
        notifyAll();
    }

    public synchronized void prepareMeal() {
        System.out.println("Meal is preparing");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isMealReady = true;
        notifyAll();
    }

    public synchronized void prepareMealThread() {
        while (true) {
            while (isMealReady) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Meal is preparing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isMealReady = true;
            notifyAll();
        }
    }

}
