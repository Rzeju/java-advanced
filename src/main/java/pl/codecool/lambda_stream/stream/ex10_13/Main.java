package pl.codecool.lambda_stream.stream.ex10_13;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Basket basket = new Basket();

        GenericProduct genericProduct1 = new GenericProduct("Bread", () -> 10.0, (date) -> date.getMonth().equals(LocalDate.now().getMonth()));

        basket.addProduct(genericProduct1, 10);
        basket.addProduct(genericProduct1, 5);

        OrderService orderService = new OrderService();
        System.out.println(orderService.calculateFinalPrice(basket));
    }
}
