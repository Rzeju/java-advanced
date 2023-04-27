package pl.codecool.lambda_stream.stream.ex10_13;

import java.time.LocalDate;

public class OrderService {

    public double calculateFinalPrice(Basket basket) {
        return basket.getProducts().entrySet().stream()
                //.filter(e -> e.getKey().isAvailable(LocalDate.now()))
                .mapToDouble(e -> e.getKey().getPrice() * e.getValue())
                .sum();
    }
}
