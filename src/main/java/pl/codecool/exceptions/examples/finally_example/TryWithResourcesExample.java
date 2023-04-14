package pl.codecool.exceptions.examples.finally_example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesExample {

    public static void main(String[] args) {

        File sourceFile = new File("src/main/resources/exceptions/finally");
        File outputFile = new File("src/main/resources/exceptions");

        try (MyAutoCloseable myAutoCloseable = new MyAutoCloseable();
             CloseExample closeExample = new CloseExample();
             FileReader fileReader = new FileReader(sourceFile);
             FileWriter fileWriter = new FileWriter(outputFile)) {
            fileWriter.close();
            int nextChar;
            while ((nextChar = fileReader.read()) != -1) {
                fileWriter.write(nextChar);
            }
        } catch (IOException e) {
            System.out.println("Catch");
            System.out.println("Original");
            e.printStackTrace(System.out);
            for (Throwable throwable : e.getSuppressed()) {
                System.out.println("Suppressed");
                throwable.printStackTrace(System.out);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
