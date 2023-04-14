package pl.codecool.exceptions.examples.finally_example;

import java.io.IOException;

public class CloseExample implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new Exception("Błąd podczas zamykania");
    }
}
