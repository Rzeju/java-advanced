package pl.codecool.java_in_out.exercises.pdf.zad5;

public class UserParser {

    public User fromCSV(String line) {
        String[] data = line.split(",");
        return new User(data[0], data[1], Integer.parseInt(data[2]));
    }
}
