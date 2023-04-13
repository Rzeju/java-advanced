package pl.codecool.exceptions.prezentacja.zad24;

import java.util.Deque;
import java.util.LinkedList;

public class Basket {

    private final static int BASKET_MAX_SIZE = 10;

    private Deque<String> basket = new LinkedList<>();

    public void addToBasket(String element) throws BasketFullException {
        if (basket.size() == BASKET_MAX_SIZE) {
            throw new BasketFullException("Basket is full");
        }

        basket.add(element);
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (basket.isEmpty()) {
            throw new BasketEmptyException("Basket is empty");
        }

        basket.removeLast();
    }

    public Deque<String> getBasket() {
        return basket;
    }
}
