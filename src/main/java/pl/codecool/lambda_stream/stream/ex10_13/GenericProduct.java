package pl.codecool.lambda_stream.stream.ex10_13;

import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class GenericProduct implements Product {

    private Supplier<Double> price;
    private Function<LocalDate, Boolean> isAvailableFunction;

    @EqualsAndHashCode.Include
    private String productId;

    public GenericProduct(String productId, Supplier<Double> price, Function<LocalDate, Boolean> isAvailableFunction) {
        this.price = price;
        this.isAvailableFunction = isAvailableFunction;
        this.productId = productId;
    }

    @Override
    public double getPrice() {
        return price.get();
    }

    @Override
    public boolean isAvailable(LocalDate date) {
        return isAvailableFunction.apply(date);
    }
}
