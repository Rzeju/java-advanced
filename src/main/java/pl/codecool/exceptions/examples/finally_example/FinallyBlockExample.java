package pl.codecool.exceptions.examples.finally_example;

import java.io.*;

public class FinallyBlockExample {

    public static void main(String[] args) {

        File sourceFile = new File("src/main/resources/exceptions/finally.txt");
        File outputFile = new File("src/main/resources/exceptions/finally_output.txt");

        FileReader fileReader = null;
        FileWriter fileWriter = null;

        IOException ex = null;

        try {
            try {
                fileReader = new FileReader(sourceFile);
                fileWriter = new FileWriter(outputFile);

                int nextChar;
                while ((nextChar = fileReader.read()) != -1) {
                    fileWriter.write(nextChar);
                }
            } catch (IOException e) {
                ex = new IOException(e);
                throw ex;
            } finally {
                try {
                    System.out.println("Blok finally");
                    fileReader.close();
                    fileWriter.close();
                } catch (Exception e) {
                        if (ex == null) {
                            throw e;
                        }
                }
            }
        } catch (IOException e) {
            System.out.println("Blok końcowy catch");
            e.getCause().printStackTrace();
        }
    }
}
