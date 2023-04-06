package pl.codecool.generics.examples;

public class Cup<T extends Liquid> {

    private T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }

    public <T extends Liquid> Cup<T> fillCup(T liquid) {
        return new Cup<>(liquid);
    }

    public Cup<T> fillTheSameCup(T liquid) {
        this.liquid = liquid;
        return this;
    }

    public T getLiquid() {
        return liquid;
    }
}
