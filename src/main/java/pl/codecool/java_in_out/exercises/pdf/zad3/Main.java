package pl.codecool.java_in_out.exercises.pdf.zad3;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        addLine("New Line");
        addLine("Next Line");
        addLine("12345");
        addLine("09876");
    }

    public static void addLine(String nextLine) throws IOException {
        String fileName = "src/main/resources/exercises/pdf/zad3/zad3_file.txt";
        FileWriter fileWriter = new FileWriter(fileName, true);
        fileWriter.write(System.lineSeparator());
        fileWriter.write(nextLine);
        fileWriter.flush();
        fileWriter.close();
    }
}
