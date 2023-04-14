package pl.codecool.exceptions.hierarchy_task;

public class C extends B {

    @Override
    public void throwException() throws CException {
        throw new CException("CException from C class");
    }
}
