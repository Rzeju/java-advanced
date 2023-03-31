package pl.codecool.generics.examples;

public class Cup<T extends Liquid> {

    private T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }

    public <E extends Liquid> Cup<E> fillCup(E liquid) {
        return new Cup<>(liquid);
    }

    public T getLiquid() {
        return liquid;
    }
}
