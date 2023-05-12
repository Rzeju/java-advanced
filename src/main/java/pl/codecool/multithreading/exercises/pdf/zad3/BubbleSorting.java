package pl.codecool.multithreading.exercises.pdf.zad3;

public class BubbleSorting implements Runnable {

    private int[] numbers;

    public BubbleSorting(int[] numbers) {
        this.numbers = numbers;
    }

    public void bubbleSort() {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    @Override
    public void run() {
        bubbleSort();
        System.out.println("Bubble Sort Finished");
    }

    public int[] getNumbers() {
        return numbers;
    }
}
