package pl.codecool.generics.examples;

public class Cup<T> {

    private T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }

    public <T> void fillCup(T liquid) {
        System.out.println(liquid.getClass().getName());
        System.out.println(this.liquid.getClass().getName());
        //this.liquid = liquid;
    }

    public T getLiquid() {
        return liquid;
    }
}
