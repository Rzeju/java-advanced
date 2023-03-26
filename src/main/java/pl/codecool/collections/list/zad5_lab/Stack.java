package pl.codecool.collections.list.zad5_lab;

import java.util.Deque;
import java.util.LinkedList;

public class Stack<T> {

    private final Deque<T> elements = new LinkedList<>();

    public void push(T v) {
        elements.addFirst(v);
    }

    public T peek() {
        return elements.peekFirst();
    }

    public T pop() {
        return elements.pop();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

//    public void calculateExpression(String expression) {
//        String[] symbols = expression.split("");
//
//        for (String symbol : symbols) {
//            this.push(symbol);
//        }
//    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (T element : elements) {
            stringBuilder.append(element.toString());
            stringBuilder.append(", ");
        }
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(" "));
        stringBuilder.append("]");

        return stringBuilder.toString();
    }


}
