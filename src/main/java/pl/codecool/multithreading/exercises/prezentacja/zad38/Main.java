package pl.codecool.multithreading.exercises.prezentacja.zad38;

public class Main {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        Runnable water = () -> {
            while (true) {
                coffeeMachine.refillWater();
            }
        };
        Thread waterThread = new Thread(water, "WATER REFILL");
        waterThread.start();

        Runnable espresso = () -> {
            while (true) {
                coffeeMachine.prepareCoffee(1);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable doubleEspresso = () -> {
            while (true) {
                coffeeMachine.prepareCoffee(2);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable bigDark = () -> {
            while (true) {
                coffeeMachine.prepareCoffee(3);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable blackHole = () -> {
            while (true) {
                coffeeMachine.prepareCoffee(5);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread1 = new Thread(espresso, "ESPRESSO");
        Thread thread2 = new Thread(doubleEspresso, "DOUBLE-ESPRESSO");
        Thread thread3 = new Thread(bigDark, "BIG-DARK");
        Thread thread4 = new Thread(blackHole, "BLACK-HOLE");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
