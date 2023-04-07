package pl.codecool.java_in_out.reader_writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterExample {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("src/main/resources/reader_writer/reader_writer.txt");
        FileWriter fileWriter = new FileWriter("src/main/resources/reader_writer/reader_writer.txt", true);

        int nextChar;

        while ((nextChar = fileReader.read()) != -1) {
            System.out.println(nextChar);
            System.out.println((char) nextChar);
        }

        fileWriter.write("Next content");
        fileWriter.write(20);

        fileReader.close();
        fileWriter.flush();
        fileWriter.close();
    }
}
