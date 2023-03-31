package pl.codecool.collections.map.zad4;

public class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();

        storage.addToStorage("key1", "1");
        storage.addToStorage("key1", "2");
        storage.addToStorage("key1", "3");
        storage.addToStorage("key1", "4");
        storage.addToStorage("key1", "5");

        storage.printValues("key1");
        storage.printValues("key2");

        storage.addToStorage("key2", "1");
        storage.addToStorage("key2", "2");
        storage.addToStorage("key2", "3");

        storage.addToStorage("key3", "1");
        storage.addToStorage("key3", "2");
        storage.addToStorage("key3", "3");
        storage.addToStorage("key3", "4");

        storage.findValues("3");
        storage.findValues("4");
        storage.findValues("5");
        storage.findValues("10");
    }
}
