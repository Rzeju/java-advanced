package pl.codecool.generics.examples;

public class Main {

    public static void main(String[] args) {

        Cup<String> stringCup = new Cup<>("coffee");

        System.out.println(stringCup.getLiquid());

        stringCup.fillCup("tea");
        stringCup.fillCup(Integer.valueOf(20));
    }
}
