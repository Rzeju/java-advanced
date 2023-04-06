package pl.codecool.generics.examples;

public class Main {

    public static void main(String[] args) {

        Cup<Tea> stringCup = new Cup<>(new Tea());

        System.out.println(stringCup.getLiquid());


        Cup<Coffee> coffee = stringCup.fillCup(new Coffee());
        System.out.println(coffee.getLiquid());


        System.out.println("Liquid Cup");
        Cup<Liquid> liquidCup = new Cup<>(new Tea());
        System.out.println(liquidCup.getLiquid());

        liquidCup.fillTheSameCup(new Coffee());
        System.out.println(liquidCup.getLiquid());
    }
}
