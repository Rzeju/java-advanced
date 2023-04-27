package pl.codecool.lambda_stream.stream.ex10_13;

import java.util.HashMap;
import java.util.Map;

public class Basket {

    private final Map<Product, Integer> products = new HashMap<>();

    public Basket() {
    }

    public Map<Product, Integer> getProducts() {
        return new HashMap<>(products);
    }

    public void addProduct(Product product, Integer amount) {
        products.computeIfPresent(product, (k, v) -> v + amount);
        products.putIfAbsent(product, amount);
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public void deleteProductAmount(Product product, Integer amount) {
        products.computeIfPresent(product, (k, v) -> Math.max(v - amount, 0));
    }
}
