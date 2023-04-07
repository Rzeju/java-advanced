package pl.codecool.java_in_out.buffered_reader_writer;

import java.io.*;

public class BufferedExample {

    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/buffered_reader_writer/buffered_file.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String nextLine;
        while ((nextLine = bufferedReader.readLine()) != null) {
            System.out.println(nextLine);
        }

        bufferedWriter.newLine();
        bufferedWriter.write("Next Line");

        bufferedReader.close();

        bufferedWriter.flush();
        bufferedWriter.close();

        file = new File("src/main/resources/buffered_reader_writer/buffered_file.txt");
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);

        file = new File("src/main/resources/buffered_reader_writer/buffered_file_saved.txt");
        fileWriter = new FileWriter(file, true);
        bufferedWriter = new BufferedWriter(fileWriter);

        nextLine = "";
        while ((nextLine = bufferedReader.readLine()) != null) {
            bufferedWriter.write(nextLine);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();



    }
}
