package pl.codecool.lambda_stream.stream.ex10_13;

import java.time.LocalDate;

public interface Product {

    double getPrice();

    boolean isAvailable(LocalDate date);

}
