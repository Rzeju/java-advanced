package pl.codecool.exceptions.hierarchy_task;

public class B extends A implements IAException {

    @Override
    public void throwException() throws BException {
        throw new BException("BException from B class");
    }

    @Override
    public void newException() throws BException {
        throw new BException("Hello Interface");
    }
}
