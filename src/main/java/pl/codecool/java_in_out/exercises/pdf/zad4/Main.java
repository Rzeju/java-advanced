package pl.codecool.java_in_out.exercises.pdf.zad4;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println(longestWordScanner());
        System.out.println(longestWordReader());

    }

    public static String longestWordScanner() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/main/resources/pdf/zad4/zad4_file.txt"));
        String longestWord = "";
        String currentWord;

        while (scanner.hasNext()) {
            currentWord = scanner.next();
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
        }
        return longestWord;
    }

    public static String longestWordReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/pdf/zad4/zad4_file.txt"));

        String line;
        String longest = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
        }
        return longest;
    }

}
