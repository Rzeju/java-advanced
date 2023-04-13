package pl.codecool.exceptions.prezentacja.zad24;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();

        try {
            //basket.removeFromBasket();
            basket.addToBasket("Element 1");
            basket.addToBasket("Element 2");
            basket.addToBasket("Element 3");
            basket.addToBasket("Element 4");
            basket.addToBasket("Element 5");
            basket.addToBasket("Element 6");
            basket.addToBasket("Element 7");
            basket.addToBasket("Element 8");
            basket.addToBasket("Element 9");
            basket.addToBasket("Element 10");

            basket.removeFromBasket();

            basket.addToBasket("Element 11");
            basket.addToBasket("Element 12");
        } catch (BasketEmptyException | BasketFullException e) {
            e.printStackTrace();
        }




    }
}
