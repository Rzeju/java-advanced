package pl.codecool.multithreading.exercises.pdf.zad5;

public class Main {

    public static void main(String[] args) {

        Integer[] elements = {1, 10, -17, 100, 5, -4, 10, 5, 11, 99, -156, 1257, 3366, 24, 136, 476};

        Iterator<Integer> iterator = new Iterator<>(elements);

        Runnable next = () -> {
            while (true) {
                int value = iterator.next();
                System.out.println(Thread.currentThread().getName() + " - " + value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable prev = () -> {
            while (true) {
                int value = iterator.prev();
                System.out.println(Thread.currentThread().getName() + " - " + value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread1 = new Thread(next, "NEXT-1");
        Thread thread2 = new Thread(next, "NEXT-2");
        Thread thread3 = new Thread(next, "NEXT-3");
        Thread thread4 = new Thread(prev, "PREV-1");
        Thread thread5 = new Thread(prev, "PREV-2");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
