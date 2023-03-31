package pl.codecool.generics.examples;

public class Main {

    public static void main(String[] args) {

        Cup<Tea> stringCup = new Cup<>(new Tea());

        System.out.println(stringCup.getLiquid());


        Cup<Coffee> coffee = stringCup.fillCup(new Coffee());
    }
}
