package pl.codecool.multithreading.exercises.pdf.zad2;

public class Bridge {

    public synchronized void driveThrough(Car car) {
        System.out.println("Driving " + car);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished road " + car);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
