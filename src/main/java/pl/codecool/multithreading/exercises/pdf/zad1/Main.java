package pl.codecool.multithreading.exercises.pdf.zad1;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = () -> ListEvenNumber.findEvenNumbers(1000, 2000);
        Runnable r2 = () -> ListEvenNumber.findEvenNumbers(14300, 17800);

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(ListEvenNumber.getNumbers());
    }
}
