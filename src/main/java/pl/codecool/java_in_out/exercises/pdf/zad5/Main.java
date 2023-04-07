package pl.codecool.java_in_out.exercises.pdf.zad5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        UserParser userParser = new UserParser();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/exercises/pdf/zad5/zad5_csv_file.txt"));

        String nextLine;

        List<User> users = new ArrayList<>();
        while ((nextLine = bufferedReader.readLine()) != null) {
            User user = userParser.fromCSV(nextLine);
            users.add(user);
        }

        System.out.println(users);
    }
}
