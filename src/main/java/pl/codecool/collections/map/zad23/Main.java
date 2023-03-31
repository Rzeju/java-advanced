package pl.codecool.collections.map.zad23;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.addAnimals("Lion", 5);
        zoo.addAnimals("Elephant", 2);
        zoo.addAnimals("Tiger", 4);
        zoo.addAnimals("Kakadu", 8);
        zoo.addAnimals("Lion", 2);
        zoo.addAnimals("Pies", 12);

        System.out.println(zoo.getAnimals());
        System.out.println(zoo.getAnimalsCount());
        System.out.println(zoo.getAnimalsCountSorted());

        System.out.println(zoo.treeMapSorting());
    }
}
