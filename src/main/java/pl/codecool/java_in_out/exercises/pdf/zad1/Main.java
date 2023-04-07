package pl.codecool.java_in_out.exercises.pdf.zad1;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file = new File("src/main/java/pl/codecool");

        for (String s : file.list()) {
            System.out.println(s);
        }
    }
}
