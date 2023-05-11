package pl.codecool.multithreading.exercises.pdf.zad1;

public class EvenNumbers {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1000; i <= 2000; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + " " + i);
                    }
                }
            }
        });

        Runnable r = () -> {
            for (int i = 14300; i <= 17800; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };

        Thread thread2 = new Thread(r, "My Thread");

        thread1.start();
        thread2.start();

    }
}
