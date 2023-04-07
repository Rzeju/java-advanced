package pl.codecool.java_in_out.file_class;

import java.io.File;

public class FileClassExample {

    public static void main(String[] args) {

        File file = new File("src/main/resources/file_class/file_class.txt");

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.toString());

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println(File.separator);
        System.out.println(File.separatorChar);
        System.out.println(System.getProperty("file.separator"));

        System.out.println(File.pathSeparator);
        System.out.println(File.pathSeparatorChar);

        System.out.println(file.getParent());
        System.out.println(file.getParentFile());

        System.out.println(file.list());
        System.out.println(file.listFiles());

        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());

    }
}
