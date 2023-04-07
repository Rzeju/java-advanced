package pl.codecool.java_in_out.input_output_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStreamExample {

    public static void main(String[] args) throws IOException {


        FileInputStream fileInputStream = new FileInputStream("src/main/resources/input_output_stream/input_output_stream_data.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/input_output_stream/input_output_stream_saved.txt");

        int nextByte = fileInputStream.read();
        char nextChar = (char) nextByte;

        System.out.println(nextByte);
        System.out.println(nextChar);

        fileOutputStream.write(nextByte);

        while (nextByte != -1) {
            nextByte = fileInputStream.read();
            nextChar = (char) nextByte;
            System.out.println(nextChar);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
