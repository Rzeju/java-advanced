package pl.codecool.multithreading.examples.synchronization.examp2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Restaurant {

    private Lock myLock = new ReentrantLock();
    private Condition isMealPrepared = myLock.newCondition();

    private boolean isMealReady = false;

    public void orderMeal() {
        myLock.lock();
        System.out.println("After lock");
        try {
            while (!isMealReady) {
                System.out.println(Thread.currentThread().getName() + " is waiting for meal");
                try {
                    isMealPrepared.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Enjoy Your meal! " + Thread.currentThread().getName());
            isMealReady = false;
            prepareMeal();
        } finally {
            System.out.println("Finally block");
            myLock.unlock();
        }

    }

    public void prepareMeal() {
        myLock.lock();
        try {
            System.out.println("Meal is preparing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isMealReady = true;
            isMealPrepared.signalAll();
        } finally {
            myLock.unlock();
        }
    }

}
