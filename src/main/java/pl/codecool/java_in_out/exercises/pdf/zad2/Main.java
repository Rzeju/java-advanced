package pl.codecool.java_in_out.exercises.pdf.zad2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("src/main/resources/exercises/pdf/zad2/zad2_file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String nextLine;
        while((nextLine = bufferedReader.readLine()) != null) {
            System.out.println(nextLine);
        }

        bufferedReader.close();

    }
}
