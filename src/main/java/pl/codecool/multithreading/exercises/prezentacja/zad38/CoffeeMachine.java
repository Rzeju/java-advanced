package pl.codecool.multithreading.exercises.prezentacja.zad38;

public class CoffeeMachine {

    private static int waterLevel = 10;
    private static boolean isEmpty = false;

    public synchronized void prepareCoffee(int waterAmount) {
        if (waterAmount > waterLevel) {
            isEmpty = true;
            notify();
        }
        while (waterAmount == 0 || waterAmount > waterLevel) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Water error");
            }
        }

        System.out.println("Preparing coffee - " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Machine error");
        }

        waterLevel -= waterAmount;
        if (waterLevel == 0) {
            isEmpty = true;
        }
        notify();
    }

    public synchronized void refillWater() {
        while(!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Flood!!!!");
            }
        }
        System.out.println("Water refill - " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("No more water");
        }
        waterLevel = 10;
        isEmpty = false;
        notify();
    }
}
