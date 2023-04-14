package pl.codecool.exceptions.hierarchy_task;

public class Main {

    public static void main(String[] args) {

        C myC = new C();
        try {
            ((A) myC).throwException();
        } catch (AException e) {
            e.printStackTrace();
        }

        try {
            ((B) myC).newException();
        } catch (BException e) {
            e.printStackTrace();
        }
    }
}
