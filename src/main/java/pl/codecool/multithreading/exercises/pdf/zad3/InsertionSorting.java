package pl.codecool.multithreading.exercises.pdf.zad3;

public class InsertionSorting implements Runnable {

    private int[] numbers;

    public InsertionSorting(int[] numbers) {
        this.numbers = numbers;
    }

    public void insertionSort() {
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i - 1;
            while (j >= 0 && current < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = current;
        }
    }

    @Override
    public void run() {
        insertionSort();
        System.out.println("Insertion Sort Finished");
    }

    public int[] getNumbers() {
        return numbers;
    }
}
