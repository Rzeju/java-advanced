package pl.codecool.multithreading.exercises.pdf.zad2;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "X6");
        Car car2 = new Car("Polonez", "P");
        Car car3 = new Car("Subaru", "Impreza");

        Bridge bridge = new Bridge();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.driveThrough(car1);
            }
        });

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                bridge.driveThrough(car2);
            }
        };
        Thread thread2 = new Thread(runnable);

        Runnable runnableLambda = () -> bridge.driveThrough(car3);
        Thread thread3 = new Thread(runnableLambda);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
