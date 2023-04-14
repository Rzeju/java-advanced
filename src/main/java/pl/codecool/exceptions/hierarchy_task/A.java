package pl.codecool.exceptions.hierarchy_task;

public class A {

    public void throwException() throws AException {
        throw new AException("AException from A class");
    }
}
