package pl.codecool.multithreading.exercises.pdf.zad5;

public class Iterator<T> {

    private volatile int index = 0;
    private T[] data;

    public Iterator(T[] data) {
        this.data = data;
    }

    public synchronized T next() {
        if (index < data.length - 1) {
            T element = data[index];
            index++;
            return element;
        }
        throw new IllegalArgumentException("Out of range");
    }

    public synchronized T prev() {
        if (index > 0 && index < data.length) {
            T element = data[index];
            index--;
            return element;
        }
        throw new IllegalArgumentException("Out of range");
    }
}
